/*global module window require*/
(function(){"use strict";
	var util = require('./util'),
	    call = eval;
	function Class (name, supr, module) {return Class.create(name, supr, module);}
	Class.check = util.isClass;
	Class.create = function (name, supr, module) {
		if (!module && supr) {
			module = supr;
			supr = null;
		}
		if (typeof name !== 'string' || !name.length) {
			throw 'Class: \'name\' must be a string.';
		}
		if (!util.isFunction(supr)) {
			supr = null;
		}
		var klass = call('(function ' + name + '(){' +
			'return this.init' + name + '.apply(this, arguments);' + 
		'});');
		if (!klass.name) {
			klass.name = name;
		}
		if (supr) {
			util.inherits(klass, supr);
		}
		var proto = klass.prototype,
		    initName = 'init' + name,
		    initSupr = supr ? 'init' + supr.name : '';
		(klass._ = function () {return this;}).prototype = proto;
		klass.check = function (obj) {
			if (!obj || (supr && !supr.check(obj))) {
				return false;
			}
			return obj[initName] === proto[initName];
		};
		klass.create = function (obj, args) {
			obj = obj || new klass._();
			if (supr && supr.prototype) {
				if (Class.check(supr) && !supr.check(obj)) {
					obj = supr.create(obj);
				}
			}
			var a = [obj];
			if (supr && supr.prototype) {
				a.push(supr.prototype);
			}
			a.push(proto);
			util.safeApply(module, klass, a);
			if (proto[initName]) {
				obj[initName] = proto[initName];
			}
			if (!obj[initName]) {
				obj[initName] = proto[initName] =
					supr && supr.prototype ?
						function () {return this[initSupr].apply(this, arguments);} :
						function () {return this;};
			}
			if (args) obj[initName].apply(obj, args);
			return obj;
		};
		klass.extend = function (name, module) {
			return Class.create(name, klass, module);
		};
		klass.create(proto);
		proto.constructor = klass;
		return klass;
	};
	module.exports = Class;
}).call(this);