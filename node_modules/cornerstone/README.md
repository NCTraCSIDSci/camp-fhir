# cornerstone

Cross platform JavaScript utilities, event emitter and class constructor.

	var cornerstone = require('cornerstone').require('index');
	appCore.util.idle();

### util

Common utilities for type checking, invocation, enumeration, random, and assignment.

	var util = require('cornerstone').require('util');
	util.enumerate(obj, function (val, key) {
		if (val) array.push(val);
	});

### Class

Combines prototypal inheritance and module design patterns into a hybrid Class solution.

	var core = require('cornerstone'),
	    Class = core.require('Class'),
	    Emitter = core.require('Emitter');
	var Flight = new Class('Flight', function (obj, proto) {
		obj.fly = function () {
			this.isFlying = true;
			return this;
		};
		obj.land = function () {
			delete this.isFlying;
			return this;
		};
	});
	var Animal = new Class('Animal', Emitter, function (obj, supr, proto) {
		obj.initAnimal = function (name) {
			this.name = name;
			return this.initEmitter();
		};
	});
	var FlyingAnimal = Animal.extend('FlyingAnimal', function (obj, supr, proto) {
		if (!Flight.check(obj)) {
			Flight.create(obj);
		}
	});
	var bird = new FlyingAnimal('bird').fly().land();
	Flight.check(bird) && Animal.check(bird) && FlyingAnimal.check(bird); //true

### Emitter

Cross platform event emitter implementation plus some extras.

	var Emitter = require('cornerstone').require('Emitter');
	var events = new Emitter();
	events.on('apocalypse', function () {
		console.log('It\'s the end');
	});
	events.forever('apocalypse');

## Installation

	$ npm install cornerstone

## Running Tests

	$ node test

## MIT License 

Copyright (C) 2011 by Roland Poulter

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.