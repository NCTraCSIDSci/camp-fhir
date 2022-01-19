# Modulator

Run Node.js modules in a non-CommonJS environment, say a web browser. Do this by providing a shallow representation of the filesystem, a dummy CommonJS module api.

Compiling everything into one source file. And optionally minimizing the output to a separate source file with uglify.

Be able to include big dependencies like jQuery without taking forever. Super simple easy direct use. No binaries, make your own.

### Installation.

	npm install modulator

## Documentation.

### How to use the build tool.

`example/build.js`

	var Modulator = require('modulator');
	module.exports = new Modulator({
		name: 'myBuild',
		main: './source',
		from: __dirname + '/',
		write: __dirname + '/output.js',
		uglify: __dirname + '/output-min.js',
		header: '//myBuild',
		footer: '//' + Date(),
		apiName: 'myBuild'
	});

`example/source.js`

	var moduleFoo = require('moduleFoo'),
	    scriptBar = require('./scriptBar');
	exports.foo = moduleFoo;
	exports.bar = scriptBar;

`./node_modules/moduleFoo/index.js`

	exports.name = 'moduleFoo';

`example/scriptBar.js`

	exports.name = 'scriptBar';

`example/output.js`

	//myBuild
	(function(){
	var myBuild = (function(){"use strict";
		...
	}).call(this);
	myBuild.provide("/source", function (require, module, exports) {
		...
	});
	myBuild.provide("/scriptBar", function (require, module, exports) {
		...
	});
	myBuild.provide("/node_modules/moduleFoo/index", function (require, module, exports) {
		...
	});
	(function(){"use strict";
		...
	}).call(this);
	}).call(this);
	//Fri Dec 09 2011 20:39:29 GMT-0800 (PST)

### How to use from the browser.

Now we're running `example/myBuild.js` in a web page.

	<script src="example/output.js" type="text/javascript" charset="utf-8"></script>

From another script on the page we can access our module's exports from `myBuild.js` from `this.myBuildName` or `window.myBuildName`.

	var myBuild = this.myBuildName;

Additionally we can require modules and files which `example/myBuild.js` required.

	var moduleFoo = myBuild.require('moduleFoo'),
	    scriptBar = myBuild.require('./scriptBar');

If you decide you don't want myBuild polluting your global namespace you can noConflict it like you would with jQuery.

	myBuild = this.myBuildName.noConflict();


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