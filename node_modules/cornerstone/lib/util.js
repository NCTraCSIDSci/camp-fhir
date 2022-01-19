/*global require module window exports console*/
(function(){"use strict";
	var util = module.exports = {that: {}};
	var isArray = util.isArray = Array.isArray,
	    funcStr = util.that.funcStr = Function.toString,
	    objStr = util.that.objStr = ({}).toString,
	    hasOwn = util.that.hasOwn = ({}).hasOwnProperty,
	    slice = util.that.slice = ([]).slice,
	    bind = util.that.bind = Function.bind;
	var isFunction = util.isFunction = function (func) {
		return func && objStr.call(func) === '[object Function]';
	};
	var isObject = util.isObject = function (obj) {
		return obj && objStr.call(obj) === '[object Object]';
	};
	var isObjectLike = util.isObjectLike = function (obj) {
		return obj && typeof obj === 'object';
	};
	var isArrayLike = util.isArrayLike = function (obj) {
		return obj && isFinite(obj.length);
	};
	var isMutable = util.isMutable = function (obj) {
		return isObjectLike(obj) || isFunction(obj);
	};
	var isInteger = util.isInteger = function (num) {
		return isFinite(num) && (num << 0 === num);
	};
	var enumerate = util.that.enumerate = function (iterator, bind) {
		if (this === null || !isFunction(iterator)) return this;
		bind = bind || this;
		var k, l;
		if (this && this.forEach) this.forEach(iterator, bind);
		else if (isArray(this)) {
			for (k = 0, l = this.length; k < l; k += 1) iterator.call(bind, this[k], k, this);
		} else {
			for (k in this) iterator.call(bind, this[k], k, this);
		}
		return this;
	};
	var keyOf = util.that.keyOf = function (val, eq, bind) {
		if (this && this.indexOf) return this.indexOf(val);
		var done = false,
		    key = -1;
		if (!isFunction(eq)) eq = function (val, targ) {
			return val == targ;
		};
		bind = bind || this;
		enumerate.call(this, function (v, k) {
			if (!done && eq.call(bind, v, val, k, this)) {
				key = k;
				done = true;
			}
		});
		return key;
	};
	var assign = util.that.assign = function (obj, mover, bind) {
		if (!isMutable(this) || !isMutable(obj)) return this;
		if (!isFunction(mover)) mover = function (k, i, o) {
			i[k] = o[k];
		};
		bind = bind || this;
		enumerate.call(obj, function (v, k, o) {
			mover.call(bind, k, this, o);
		}, this);
		return this;
	};
	var mixin = util.that.mixin = function (obj, filter, bind) {
		bind = bind || this;
		if (!isFunction(filter)) filter = function (k, i, o) {
			return true;
		};
		return assign.call(this, obj, function (k, i, o) {
			if (filter.call(this, k, i, o)) {
				if (isObjectLike(i[k]) && isObjectLike(o[k])) {
					mixin.call(i[k], o[k]);
				} else {
					i[k] = o[k];
				}
			}
		});
	};
	util.idle = function () {};
	util.lamda = function (val, force) {
		return !force && isFunction(val) ? val : function () {
			return val;
		};
	};
	util.safeApply = function (fn, bind, args) {
		if (isFunction(fn)) return fn.apply(bind, args);
	};
	util.assign = function (obj, from, mover, bind) {
		return assign.call(obj, from, mover, bind);
	};
	util.mixin = function (obj, from, filter, bind) {
		return mixin.call(obj, from, filter, bind);
	};
	util.funcStr = function (fn) {
		return funcStr.call(fn);
	};
	util.objStr = function (obj) {
		return objStr.call(obj);
	};
	util.slice = function (obj, begin, end) {
		return slice.call(obj, begin, end);
	};
	util.bind = function (fn) {
		var args = slice.call(arguments, 1);
		return bind.apply(fn, args);
	};
	util.enumerate = function (obj, iterator, bind) {
		return enumerate.call(obj, iterator, bind);
	};
	util.keyOf = function (obj, value, eq, bind) {
		return keyOf.call(obj, value, eq, bind);
	};
	util.random = function (min, max) {
		if (!isFinite(min)) min = 0;
		else min = Math.abs(min);
		if (!isFinite(max)) {
			max = min || 1;
			min = 0;
		}
		else max = Math.abs(max);
		max -= min;
		return Math.random() * max + min;
	};
	util.randomCharCode = function () {
		return util.random(25) + 65;
	};
	util.isClass = function (obj) {
		return isFunction(obj) &&
		       isFunction(obj.check) &&
		       isFunction(obj.create);
	};
	util.inherits = function (ctor, supr) {
		var proto = Object.create(supr.prototype);
		ctor.supr = supr;
		proto.constructor = ctor;
		ctor.prototype = proto;
		return ctor;
	};
}).call(this);