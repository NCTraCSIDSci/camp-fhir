/*global module require console*/
(function(){"use strict";
	var core = require('cornerstone'),
	    util = core.require('./util'),
	    Class = core.require('./Class'),
	    Router = core.require('./Router'),
	    Emitter = core.require('./Emitter');
	module.exports = Class.create('Controller', Emitter, function (obj, supr, proto) {
		obj.initController = function (name) {
			this.name = name;
			return this.initEmitter();
		};
		obj.install = function (module, factory) {
			var that = this;
			module.exports = function (app) {
				that.app = app;
				that.model = app.model;
				util.safeApply(factory, that, [app.model[that.name]]);
				return that;
			};
			this.install = function () {
				return this;
			};
			return this;
		};
		obj.routes = function (routes) {
			var name = this.name.toLowerCase(),
			    map = {client: {}};
			map[name] = routes;
			if (!this.app.production) {
				map.client[name] = routes;
			}
			this.app.routes(map);
			return this;
		};
	});
}).call(this);