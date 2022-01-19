(function(){"use strict";
	var global = this,
	    require = this.require,
	    modules = {};
	function resolveModule (path) {
		var slash = path.indexOf('/'),
		    name,
		    mod,
		    m;
		if (slash === -1) return path;
		name = path.substring(0, slash);
		path = path.substr(slash + 1);
		mod = modules[name];
		if (!mod) return path;
		for (m in modules) {
			if (modules[m] === mod && m !== name) {
				break;
			}
			m = null;
		}
		slash = m.lastIndexOf(name + '/');
		if (slash !== -1) {
			m = m.substr(0, slash + name.length);
		} else {
			m = '';
		}
		return (m ? m : name) + '/' + path;
	}
	function resolve (path, from) {
		if (path.charAt(0) === '/') return path;
		if (path.charAt(0) !== '.') {
			return resolveModule(path);
		}
		var names = path.split('/'),
		    clean = [],
		    len = names.length,
		    i = 0,
		    p;
		from = from || '';
		if (from.charAt(from.length - 1) === '/') {
			from = from.substring(0, from.length - 1);
		}
		for (; i < len; i += 1) {
			p = names[i];
			if (p === '..') {
				from = from.substring(0, from.lastIndexOf('/')) || '';
			} else if (p && p !== '.') {
				clean.push(p);
			}
		}
		if (from === '/') from = '';
		return from + '/' + clean.join('/');
	}
	function fetch (path) {
		return modules[path] ||
			modules[path + 'index'] ||
			modules[path + '/'] ||
			modules[path + '/index'];
	}
	return {
		require: function (path, from) {
			var module = fetch(path),
			    err = new Error('not found');
			if (!module) {
				path = resolve(path, from);
				module = fetch(path);
			}
			if (module) {
				if (module.install) {
					module.install();
				}
				return module.exports;
			}
			err.path = path;
			err.from = from;
			throw err;
		},
		provide: function (path, factory) {
			var that = this;
			modules[path] = {
				exports: {},
				require: function (p) {
					var from = path.substring(0, path.lastIndexOf('/'));
					return that.require(p, from);
				},
				install: function () {
					delete this.install;
					factory.call(global, this.require, this, this.exports);
					return this;
				}
			};
			var dir = '/node_modules/',
			    index = path.lastIndexOf(dir),
			    module = index === -1 ? null : path.substr(index + dir.length);
			if (module) {
				modules[module] = modules[module] || modules[path];
			}
			return this;
		},
		freeze: function (path) {
			var obj;
			delete this.provide;
			delete this.freeze;
			if (path) {
				obj = this.require(path);
				obj.require = this.require;
				obj.conflict = this.conflict;
				obj.noConflict = this.noConflict;
				return obj;
			}
			return this;
		}
	};
}).call(this);