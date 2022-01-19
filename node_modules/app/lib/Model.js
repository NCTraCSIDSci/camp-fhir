/*global module require console*/
(function(){"use strict";
	var core = require('cornerstone'),
	    util = core.require('./util'),
	    Class = core.require('./Class'),
	    Emitter = core.require('./Emitter'),
	    mongoose = require('mongoose');
	module.exports = Class.create('Model', Emitter, function (obj, supr, proto) {
		obj.initModel = function (name) {
			this.name = name;
			return this.initEmitter();
		};
		obj.install = function (module, factory) {
			var that = this;
			module.exports = function (app) {
				that.app = app;
				that.schema = util.safeApply(factory, that) || that.schema;
				that.model = mongoose.model(that.name, that.schema);
				return that.forever('installed');
			};
			this.install = function () {
				return this;
			};
			return this;
		};
		obj.mongoose = mongoose;
		obj.Schema = mongoose.Schema;
		obj.ObjId = obj.Schema.ObjectId;
		obj.getById = function (id, cb) {
			return this.on('installed', function () {
				var that = this;
				this.model.findById(id, function (err, user) {
					cb.call(that, err, user);
				});
			});
		};
		obj.find = function (username, cb) {
			return this.on('installed', function () {
				var that = this;
				this.model.findOne({username: username}, function (err, user) {
					cb.call(that, err, user);
				});
			});
		};
		obj.list = function (params, cb) {
			return this.on('installed', function () {
				var that = this;
				this.model.find(params, function (err, users) {
					cb.call(that, err, users);
				});
			});
		};
		obj.read = function (data, cb) {
			return this.getById(data._id, function (err, user) {
				cb.call(this, err, user);
			});
		};
		obj.save = function (data, cb) {
			if (!data._id) {
				return this.on('installed', function () {
					var that = this,
					    user = new this.model(data);
					user.save(function (err) {
						cb.call(that, err, err ? null : user);
					});
				});
			}
			return this.getById(data._id, function (err, user) {
				if (err) {
					cb.call(this, err);
				} else {
					if (!user) {
						user = new this.model(data);
					}
					var that = this;
					user.save(function (err) {
						cb.call(that, err, user);
					});
				}
			});
		};
		obj.destroy = function (data, cb) {
			return this.getById(data._id, function (err, user) {
				if (!err && user) {
					var that = this;
					user.remove(function (err) {
						cb.call(that, err, user);
					});
				} else {
					cb.call(this);
				}
			});
		};
	});
}).call(this);