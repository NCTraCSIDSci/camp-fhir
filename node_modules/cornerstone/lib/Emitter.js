/*global module require*/
(function(){"use strict";
	function Emitter () {return this.initEmitter();}
	function Emitter_ () {return this;}
	var emitter = Emitter_.prototype = Emitter.prototype;
	Emitter.check = function (obj) {
		return obj && obj.initEmitter === emitter.initEmitter;
	};
	Emitter.extend = function (name, module) {
		return require(('./Class')).create(name, this, module);
	};
	Emitter.create = function (obj, args) {
		obj = obj || new Emitter_();
		var slice = Array.prototype.slice;
		obj.initEmitter = emitter.initEmitter || function () {
			this.listeners_ = {};
			return this;
		};
		obj.listeners = function (name) {
			var list = this.listeners_;
			if (!name) return list;
			if (!list[name]) list[name] = [];
			return list[name];
		};
		obj.addListener =
		obj.on = function (name, cb) {
			this.listeners(name).push(cb);
			return this.emit('newListener', name, cb);
		};
		obj.send =
		obj.emit = function (name) {
			var list = this.listeners(name),
			    args = slice.call(arguments, 1),
			    l = list.length, i = 0;
			for (; i < l; i += 1) list[i].apply(this, args);
			return this;
		};
		obj.once = function (name, listener) {
			return this.addListener(name, function emitter_once_closure () {
				listener.apply(this, arguments);
				this.removeListener(name, listener);
			});
		};
		obj.forever = function (name) {
			var that = this,
			    list = this.listeners(name),
			    args = slice.call(arguments);
			if (list.emitForever) this.unforever(name);
			function emitter_forever_closure (nm) {
				if (nm === name) {
					that.emit.apply(that, args).removeAllListeners(nm);
				}
			}
			emitter_forever_closure.emitterName = name;
			list.emitForever = emitter_forever_closure;
			return this.addListener('newListener', emitter_forever_closure).
				emit.apply(that, args).removeAllListeners(name);
		};
		obj.unforever = function (name) {
			var that = this,
			    list = this.listeners(name);
			if (!list.emitForever) return this;
			this.removeListener('newListener', list.emitForever);
			delete list.emitForever;
			return this;
		};
		function listenerIndex (list, listener) {
			if (list.indexOf) return list.indexOf(listener);
			var i = 0, l = list.length;
			for (; i < l; i += 1) {
				if (list[i] === list) return i;
			}
			return -1;
		}
		obj.removeListener =
		obj.off = function (name, listener) {
			var list = this.listeners(name),
			    index = listenerIndex(list, listener);
			if (~index) list.splice(index, 1);
			return this;
		};
		obj.removeAllListeners =
		obj.allOff = function (name) {
			this.listeners()[name] = [];
			return this;
		};
		obj.sendAsync =
		obj.emitAsync = function (name, cb) {
			var that = this,
			    done = false,
			    list = this.listeners(name).slice(0),
			    args = slice.call(arguments, 2),
			    l = list.length,
			    i = 0;
			function next (err) {
				if (done) return;
				if (i >= l) {
					done = true;
					cb.call(that, arguments);
				}
				if (err) {
					done = true;
					cb.call(that, arguments);
				}
				list[i].apply(that, args);
				i += 1;
			}
			args.push(next);
			next();
			return this;
		};
		if (args) obj.initEmitter.apply(obj, args);
		return obj;
	};
	(module.exports = Emitter).create(emitter);
}).call(this);