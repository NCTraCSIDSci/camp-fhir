/*global module require window document console navigator
setInterval clearInterval XMLHttpRequest ActiveXObject*/
(function(){"use strict";
	var global = this,
	    util = require('cornerstone').require('util'),
	    dom = util.dom = {};
	util.xhr = function () {
		if (typeof XMLHttpRequest === 'function') {
			return new XMLHttpRequest();
		}
		try {
			return new ActiveXObject('Msxml2.XMLHTTP.6.0');
		} catch (e0) {}
		try {
			return new ActiveXObject('Msxml2.XMLHTTP.3.0');
		} catch (e1) {}
		try {
			return new ActiveXObject('Microsoft.XMLHTTP');
		} catch (e2) {}
	};
	util.ajax = function (url, cb, that, opts) {
		var xhr = util.xhr();
		that = that || xhr;
		opts = opts || {};
		if (typeof opts.method === 'string') {
			opts.method = opts.method.toUpperCase();
		}
		opts.method = opts.method === 'POST' ? 'POST' : 'GET';
		opts.data = opts.data || null;
		xhr.onreadystatechange = function () {
			var success;
			if (xhr.readyState === 4) {
				success = xhr.status >= 200 && xhr.status <= 300;
				util.safeApply(cb, that, [success, xhr.responseText, xhr]);
			}
		};
		xhr.open(opts.method, url, !opts.sync);
		xhr.setRequestHeader('Content-Type', 'application/json');
		xhr.send(opts.data);
		return xhr;
	};
	util.jsonp = function (url, cb, that) {
		var request = document.createElement('script');
		request.callback = 'jsonp_' + (+new Date());
		while (window[request.callback]) {
			request.callback += '_';
		}
		window[request.callback] = function (data) {
			util.safeApply(cb, that || request, [request, data]);
			request.parentNode.removeChild(request);
			delete window[request.callback];
		};
		request.src = url + '?callback=' + request.callback;
		document.getElementsByTagName('head')[0].appendChild(request);
		return request;
	};
	util.isDOMNode = dom.isNode = function (el) {
		return el && util.isInteger(el.nodeType) &&
			(el.nodeType > 0 && el.nodeType < 13);
	};
	dom.ready = function (cb, that) {
		var finished = false;
		if (dom.ready.finished) {
			util.safeApply(cb, that);
			return;
		}
		function end () {
			if (!finished) {
				util.safeApply(cb, that);
				finished = dom.ready.finished = true;
			}
		}
		// Internet Explorer
		/*@cc_on
		@if (@_win32 || @_win64)
			document.write('<script id="ieScriptLoad" defer src="//:"><\/script>');
			document.getElementById('ieScriptLoad').onreadystatechange = function() {
			if (this.readyState == 'complete') {
			cb();
			}
		};
		@end @*/
		// Mozilla, Chrome, Opera
		if (document.addEventListener) {
			document.addEventListener('DOMContentLoaded', end, false);
		}
		// Safari, iCab, Konqueror
		if (/KHTML|WebKit|iCab/i.test(navigator.userAgent)) {
			var DOMLoadTimer = setInterval(function () {
				if (/loaded|complete/i.test(document.readyState)) {
					end();
					clearInterval(DOMLoadTimer);
				}
			}, 10);
		}
		// Other web browsers
		window.onload = end;
	};
	dom.viewport = function (win, offsetW, offsetH) {
		win = win || window;
		var doc = win.document,
		    w,
		    h;
		if (!isFinite(offsetW)) offsetW = 0;
		if (!isFinite(offsetH)) offsetH = offsetW;
		if (isFinite(win.innerWidth)) {
			w = win.innerWidth;
			h = win.innerHeight;
		} else if (doc.documentElement && isFinite(doc.documentElement.clientWidth)) {
			doc = doc.documentElement;
			w = doc.clientWidth;
			h = doc.clientHeight;
		} else {
			doc = doc.body || doc.getElementsByTagName('body')[0];
			w = doc.clientWidth;
			h = doc.clientHeight;
		}
		return {width: w + offsetW, height: h + offsetH};
	};
	dom.classNameExpr = function (name) {
		return new RegExp('(^|\\s+)' + name + '($|\\s+)');
	};
	dom.hasClass = function (node, name, className, nameExpr) {
		nameExpr = nameExpr || dom.classNameExpr(name);
		className = className || node.className;
		return nameExpr.test(className);
	};
	dom.addClass = function (node, name, className, nameExpr) {
		nameExpr = nameExpr || dom.classNameExpr(name);
		className = className || node.className;
		if (!dom.hasClass(node, name, className, nameExpr)) {
			node.className += (className.length ? ' ' : '') + name;
		}
		return node;
	};
	dom.removeClass = function (node, name, className, nameExpr) {
		nameExpr = nameExpr || dom.classNameExpr(name);
		className = className || node.className;
		if (dom.hasClass(node, name, className, nameExpr)) {
			node.className = className.replace(nameExpr, function (m, g1, g2) {
				return (/\s/).test(g1 + g2) ? ' ' : '';
			});
		}
		return node;
	};
	dom.toggleClass = function (node, name, className, nameExpr) {
		nameExpr = nameExpr || dom.classNameExpr(name);
		className = className || node.className;
		if (dom.hasClass(node, name, className, nameExpr)) {
			util.removeClassName(node, name, className, nameExpr);
		} else {
			util.addClassName(node, name, className, nameExpr);
		}
		return node;
	};
	dom.remove = function (node) {
		node.parentNode.removeChild(node);
		return node;
	};
	dom.insertTop = function (child, parent) {
		parent.insertBefore(child, parent.firstChild);
		return parent;
	};
	dom.insertBefore = function (child, sibling) {
		sibling.parentNode.insertBefore(child, sibling);
		return child;
	};
	dom.addEvent = function (node, event, listener) {
		if (node.addEventListener) {
			node.addEventListener(event, listener, false);
		} else if (node.dettachListener) {
			node.attachListener('on' + event, listener);
		}
		return node;
	};
	dom.removeEvent = function (node, event, listener) {
		if (node.removeEventListener) {
			node.removeEventListener(event, listener);
		} else if (node.dettachListener) {
			node.dettachListener('on' + event, listener);
		}
		return node;
	};
	dom.stopEvent = function (event) {
		event.returnValue = false;
		event.stopPropagation();
		event.preventDefault();
	};
	dom.removeWhite = function (node, depth) {
		depth = isFinite(depth) ? depth : Infinity;
		var children = node.childNodes,
		    i = 0, l = children.length,
		    removal = [],
		    child;
		for (; i < l; i += 1) {
			child = children[i];
			if (child.nodeType === 3) {
				if (!(/\S/).test(child.nodeValue)) {
					removal.push(child);
				}
			} else if (depth > 0) {
				if (child.nodeType === 1 || child.nodeType === 9) {
					dom.removeWhite(child, depth - 1);
				}
			}
		}
		removal.forEach(function (white) {
			node.removeChild(white);
		});
		return node;
	};
	dom.formJSON = function (form) {
		var nameExpr = /\]\[|\]|\[/,
		    inputs = form.getElementsByTagName('input'),
		    json = {};
		util.enumerate(inputs, function (input) {
			if (!util.isDOMNode(input)) return;
			var names = input.getAttribute('name').split(nameExpr),
			    last,
			    obj = json;
			while (!names[names.length - 1]) {
				names.pop();
			}
			last = names.pop();
			util.enumerate(names, function (name) {
				if (name) {
					obj = obj[name] || (obj[name] = {});
				}
			});
			obj[last] = input.value;
		});
		return JSON.stringify(json);
	};
	util.modules = function (glbl) {
		glbl = glbl || global;
		var modules = {};
		return {
			modules: function () {
				return modules;
			},
			resolve: function (path, from) {
				from = from || '/';
				var c = path.charAt(0);
				function rel () {
					if (from.charAt(from.length - 1) !== '/') {
						from += '/';
					}
					path = from + path;
				}
				function back () {
					if (from.charAt(from.length - 1) === '/') {
						from = from.substring(0, from.length - 1);
					}
					from = from.substring(0, from.lastIndexOf('/'));
				}
				if (c === '.') {
					c = path.charAt(1);
					if (c === '.' && path.charAt(2) === '/') {
						back();
						path = from + path.substr(2);
					} else if (c === '/') {
						path = from + path.substr(2);
					} else {
						rel();
					}
				} else if (c !== '/') {
					rel();
				}
				if (path.charAt(0) !== '/') {
					path = '/' + path;
				}
				while ((c = path.lastIndexOf('../')) > 1) {
					from = path.substring(0, c);
					path = path.substr(c + 2);
					back();
					path = from + path;
				}
				return path.replace(/(\.?\/)+/g, '/');
			},
			require: function (path, from) {
				path = this.resolve(path, from);
				var module = modules[path];
				if (!module) {
					path += '/index';
					module = modules[path];
				}
				return module && module.install && module.install();
			},
			provide: function (path, factory) {
				var require = this.require,
				    that = this;
				modules[path] = {
					exports: {},
					factory: factory,
					require: function (p) {
						var f = path.substring(0, path.lastIndexOf('/'));
						return require.call(that, p, f + '/');
					},
					install: function () {
						var original = this.install;
						this.install = function (reset) {
							if (reset) return original.call(this);
							return this.exports;
						};
						this.factory.call(glbl, this.require, this, this.exports);
						return this.install();
					}
				};
				return this;
			},
			freeze: function (name, context) {
				delete this.modules;
				delete this.provide;
				return this;
			}
		};
	};
	module.exports = util;
}).call(this);
