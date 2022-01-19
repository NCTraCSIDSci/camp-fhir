/*global module require window document console navigator setInterval clearInterval*/
(function(){
var exec = eval;
(function(){"use strict";
	var util = require('./util'),
	    core = require('cornerstone'),
	    Widget = require('./Widget'),
	    Emitter = core.require('Emitter'),
	    Router = require('guide'),//core.require('Router'),
	    Class = core.require('Class');
	var App = Class.create('App', Widget, function (obj, supr, proto) {
		obj.options = Object.create(obj.options);
		util.assign(obj.options, {
			win: window,
			tick: 100,
			fswait: 3,
			scope: '',
			autoRedraw: false,
			fullscreen: true
		});
		obj.initApp = function () {
			var that = this;
			this.app = this;
			this.router = new Router();
			this.modules = util.modules();
			this.modules._require = this.modules.require;
			this.modules.require = function (path, from) {
				return that.require(path, from);
			};
			return this.initWidget();
		};
		obj.require = function (path, from) {
			from = from || window.location.pathname;
			var exports = this.modules._require(path, from);
			if (exports) return exports;
			path = this.modules.resolve(path, from);
			from = null;
			util.ajax(path + '.js', function (success, response) {
				if (success) {
					var factory = exec('(function ' +
						'(require, module, exports) {\n' +
						response +
					'\n})');
					exports = this.modules.
						provide(path, factory).
						_require(path);
				}
			}, this, {sync: true});
			return exports;
		};
		obj.start = function (cb) {
			this.modules.freeze();
			return this.load(function () {
				this.render().insert().redraw().watch();
				util.safeApply(cb, this);
			});
		};
		obj.stop = function () {
			return this.ignore.remove();
		};
		obj.watch = function () {
			var opts = this.options,
			    wait = opts.fswait,
			    that = this.ignore(),
			    win = this.options.win;
			if (this.hash) {
				win.location.hash = this.hash;
			} else {
				this.hash = win.location.hash;
			}
			this.timer = setInterval(function () {
				var hash = win.location.hash;
				if (wait <= 0) {
					that.fullscreen();
					wait = opts.fswait;
				}
				if (hash !== that.hash) {
					that.changeState(hash);
				}
				wait -= 1;
			}, opts.tick);
			this.changeState(this.hash);
			return this.fullscreen();
		};
		obj.ignore = function () {
			if (this.timer) {
				clearInterval(this.timer);
				delete this.hash;
				delete this.timer;
			}
			return this;
		};
		obj.ready = function (cb) {
			var that = this;
			App.on('dom ready', function () {
				util.safeApply(cb, that, arguments);
			});
			return this;
		};
		obj.fullscreen = function (win) {
			var size = util.dom.viewport(win);
			if (this.width !== size.width || this.height !== size.height) {
				this.config(size).resize();
			}
			return this;
		};
		obj.changeState = function (hash, noSync) {
			var win = this.options.win,
			    route = this.router.get(hash.substr(1));
			this.router.send(route, function (proc, info) {
				if (proc) {
					this.hash = hash;
					proc.call(this, info);
					if (this.options.autoRedraw) {
						this.redraw();
					}
				} else if (!noSync) {
					if (this.hash && win.location.hash !== this.hash) {
						win.location.hash = this.hash;
					} else {
						win.location.hash = '#/';
					}
				}
			}, this);
			return this;
		};
		obj.link = function (path) {
			return '#/' + this.options.scope + (path || '');
		};
		obj.goTo = function (hash) {
			this.options.win.location.hash = hash;
			return this;
		};
		obj.routes = function (routes) {
			this.router.def(routes);
			return this;
		};
	});
	module.exports = Emitter.create(App, []);
	util.dom.ready(function () {
		util.dom.removeWhite(document.body);
		App.forever('dom ready');
	});
}).call(this);
}).call(this);