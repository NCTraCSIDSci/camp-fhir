/*global module require window document*/
(function(){"use strict";
	var util = require('./util'),
	    core = require('cornerstone'),
	    Class = core.require('Class'),
	    Emitter = core.require('Emitter');
	var Widget = module.exports = Class.create('Widget', Emitter, function (obj, supr, proto) {
		var App;
		obj.options = {
			id: '',
			doc: document,
			tag: 'div',
			html: '',
			names: '',
			width: null,
			height: null,
			parent: null
		};
		obj.initWidget = function (parent) {
			this.children = [];
			this.newOptions().initEmitter();
			if (parent) parent.appendChild(this);
			return this;
		};
		obj.newOptions = function () {
			this.options = Object.create(this.options);
			return this;
		};
		obj.validateApp = function () {
			App = App || require('./App');
			if (!App.check(this.app)) {
				throw 'Unable to render Widget object without a valid App root.';
			}
			return this;
		};
		obj.config = function () {
			util.enumerate(arguments, function (opts) {
				util.mixin(this.options, opts);
			}, this);
			return this;
		};
		obj.routes = function (routes) {
			var node = this,
			    section;
			while (node && node !== this.app) {
				section = {};
				section[node.constructor.name.toLowerCase()] = routes;
				routes = section;
				node = node.parent;
			}
			return this.app.routes(routes);
		};
		obj.uid = function (refresh) {
			var charCode = util.randomCharCode;
			if (refresh) delete this._uid;
			return (this._uid = this._uid || String.fromCharCode(
				charCode(), charCode(), charCode(), charCode()
			) + (+new Date()));
		};
		obj.add = obj.appendChild = function () {
			util.enumerate(arguments, function (obj) {
				if (Widget.check(obj) && obj !== this) {
					if (obj.parent) {
						if (obj.parent === this) {
							return this;
						}
						obj.parent.remove(obj);
					}
					obj.index = this.children.length;
					this.children.push(obj);
					obj.root(this).parent = this;
					obj.forever('parented');
				}
			}, this);
			return this;
		};
		obj.del = obj.deleteChild = function () {
			util.enumerate(arguments, function (obj) {
				var index;
				if (!obj || obj.parent !== this) return this;
				if (obj.index && this.children[obj.index] === obj) {
					index = obj.index;
				} else {
					index = this.children.indexOf(obj);
				}
				this.children.splice(index, 1);
				delete obj.app;
				delete obj.index;
				delete obj.parent;
				util.enumerate(this.children, function (obj, ind) {
					if (ind >= index) {
						obj.index = ind;
					}
				});
				obj.unroot();
				obj.unforever('parented');
			}, this);
			return this;
		};
		obj.enumChildren = function (fn) {
			util.enumerate(this.children, fn, this);
			return this;
		};
		obj.enumChildrenAsync = function (fn, cb) {
			var that = this,
			    clone = this.children.slice(0),
			    count = clone.length;
			function end () {
				count -= 1;
				if (count === 0) {
					cb.call(that, arguments);
				}
			}
			if (count === 0) {
				cb.call(this);
				return this;
			}
			util.enumerate(clone, function (val, ind, obj) {
				fn.call(this, end, val, ind, obj);
			});
			return this;
		};
		obj.enumChildrenAndInvoke = function (name, args) {
			return this.enumChildren(function (obj) {
				obj[name].apply(obj, args);
			});
		};
		obj.enumChildrenAndInvokeAsync = function (name, cb, args) {
			args = args || [];
			args.unshift(null);
			return this.enumChildrenAsync(function (end, obj) {
				args[0] = end;
				obj[name].apply(obj, args);
				args[0] = null;
			}, cb);
		};
		obj.unroot = function () {
			return this.root(this);
		};
		obj.root = function (root) {
			this.app = root.app;
			this.enumChildren(function (child) {
				child.root(root);
			});
			return this;
		};
		obj.load = function (cb) {
			return this.enumChildrenAndInvokeAsync('load', cb);
		};
		obj.render = function (cb) {
			this.validateApp();
			var opts = this.options,
			    root = document.getElementById(opts.id),
			    doc = opts.doc,
			    dom = this.dom,
			    v;
			if (!dom) {
				this.dom = dom = {root: root || (root = doc.createElement(opts.tag))};
				if (opts.id) {
					root.setAttribute('id', root.id = opts.id);
				}
				if (opts.html) {
					root.innerHTML = opts.html;
				}
				if (opts.names) {
					root.className = opts.names;
				}
				if (isFinite(opts.width)) {
					root.style.width = opts.width + 'px';
				}
				if (isFinite(opts.height)) {
					root.style.height = opts.height + 'px';
				}
				util.safeApply(cb, this, [dom, opts]);
				this.emit('render');
			}
			return this.enumChildrenAndInvoke('render');
		};
		obj.insert = function (cb) {
			var opts = this.options,
			    dom = this.dom;
			if (this.dom && !this.inserted && opts.parent) {
				this.inserted = true;
				util.safeApply(cb, this, [dom, opts]);
				opts.parent.appendChild(dom.root);
				this.emit('insert');
			}
			return this.enumChildrenAndInvoke('insert');
		};
		obj.remove = function (cb) {
			var dom = this.dom;
			if (dom && this.inserted) {
				dom.root.parentNode.removeChild(dom.root);
				delete this.inserted;
				util.safeApply(cb, this, [dom, this.options]);
				this.emit('remove');
			}
			return this.enumChildrenAndInvoke('remove');
		};
		obj.resize = function (cb) {
			var opts = this.options,
			    dom = this.dom;
			if (this.width !== opts.width || this.height !== opts.height) {
				this.width = opts.width;
				this.height = opts.height;
				this.emit('before resize');
			}
			if (dom) {
				dom.root.style.width = this.width + 'px';
				dom.root.style.height = this.height + 'px';
				util.safeApply(cb, this, [dom, opts]);
				this.emit('resize');
			}
			return this.enumChildrenAndInvoke('resize');
		};
		obj.redraw = function (cb) {
			var dom = this.dom;
			if (dom) {
				util.safeApply(cb, this, [dom, this.options]);
				this.emit('redraw');
			}
			return this.enumChildrenAndInvoke('redraw');
		};
		obj.destroy = function (cb) {
			var dom = this.dom;
			if (dom) {
				this.remove();
				util.safeApply(cb, this, [dom, this.options]);
				this.emit('destroy');
			}
			return this.enumChildrenAndInvoke('destroy');
		};
	});
}).call(this);