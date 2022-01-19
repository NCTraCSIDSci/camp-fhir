/*global require module console*/
(function(){"use strict";
	var fs = require('fs'),
	    qs = require('querystring'),
	    url = require('url'),
	    sys = require('util'),
	    path = require('path'),
	    mime = require('mime'),
	    core = require('cornerstone'),
	    util = core.require('util'),
	    Model = require('./Model'),
	    Router = core.require('Router'),
	    Emitter = core.require('Emitter'),
	    connect = require('connect'),
	    mongoose = require('mongoose'),
	    Controller = require('./Controller');
	function App () {return this.initApp();}
	util.inherits(App, Emitter);
	var app = App.prototype;
	App.check = function (obj) {
		return Emitter.check(obj) && obj.initApp === App.prototype.initApp;
	};
	App.create = function (obj, args) {
		obj = obj || {};
		if (!Emitter.check(obj)) Emitter.create(obj);
		obj.initApp = app.initApp || function () {
			this.initEmitter();
			this.options = Object.create(this.options);
			this.helpers = {};
			this.router = new Router();
			this.cache = Object.create(this.cache);
			this.model = {};
			return this;
		};
		obj.options = {
			log: true,
			root: null,
			port: 1337,
			host: '127.0.0.1',
			maxAge: 86400000,
			dbhost: '127.0.0.1',
			dbport: '27017',
			dbname: 'test',
			hotCode: true,
			watchInterval: 500,
			sessionSecret: 'nosecret',
			requestLimit: '50mb'
		};
		obj.cache = {};
		(function(){
			var appClient = require('app-client'),
			    clientSrc = appClient(),
			    modified = new Date(),
			    utils = connect.utils;
			obj.cache['/app/client.js'] = function (req, res, next) {
				var head = req.method === 'HEAD',
				    src = clientSrc;
				if (req.method !== 'GET' && !head) return next();
				res.setHeader('Content-Type', 'text/javascript; charset=UTF-8');
				res.setHeader('Content-Length', src.length);
				res.setHeader('Vary', 'Accept-Encoding');
				res.setHeader('Cache-Control', 'public, max-age=86400');
				res.setHeader('Last-Modified', modified.toUTCString());
				res.setHeader('ETag', '"' + src.length + '-' + modified.getTime() + '"');
				if (utils.conditionalGET(req) && !utils.modified(req, res)) {
					utils.notModified(res);
				}
				else if (head) res.end();
				else {
					res.writeHead(200);
					res.end(src, 'utf8');
				}
				return null;
			};
		})();
		obj.config = function (opts) {
			util.assign(this.options, opts);
			return this;
		};
		obj.setup = function () {
			var log = this.options.log,
			    root = this.options.root,
			    maxAge = this.options.maxAge,
			    publc = path.join(root, 'public');
			this.log('Setup application server.');
			this.server = connect.createServer();
			if (log) this.server.
				use(connect.profiler()).
				use(connect.logger());
			this.server.
				use(connect.limit(this.options.requestLimit)).
				use(connect.bodyParser()).
				use(connect.cookieParser()).
				use(connect.session({secret: this.options.sessionSecret})).
				use(connect.favicon(path.join(publc, 'favicon.ico'))).
				use(/*'/client', */connect['static'](path.join(root, 'client', {maxAge: maxAge}))).
				use(this.onRequest()).
				use(connect['static'](publc, {maxAge: maxAge})).
				use(this.respond404());
			if (log) this.server.
				use(connect.responseTime());
			this.log('Application server ready.');
			return this.forever('setup server');
		};
		obj.connectDB = function () {
			if (this.db) return this;
			this.db = mongoose.connect(
				this.options.dbhost,
				this.options.dbname,
				this.options.dbport
			);
			return this;
		};
		obj.log = function () {
			if (this.options.log) console.log.apply(console, arguments);
			return this;
		};
		obj.listen = function (cb) {
			var that = this,
			    port = this.options.port,
			    host = this.options.host;
			this.log('Building and caching http://' + host + ':' + port + '.');
			return this.buildModel(function () {
				that.buildApp(function () {
					that.log('Listening http://' + host + ':' + port + '.');
					that.server.listen(port, host, function () {
						that.watchHotCode().buildClient(function () {
							that.log('Finished http://' + host + ':' + port + '.');
							cb.call(that);
						});
					});
				});
			});
		};
		obj.close = function () {
			this.server.close();
			if (this.options.hotCode) {
				this.unwatchHotCode();
			}
			return this;
		};
		obj.routes = function (routes) {
			this.router.def(routes);
			return this;
		};
		obj.onRequest = function () {
			var that = this;
			return function (req, res, next) {
				var uri = url.parse(req.url),
				    pth = uri.pathname,
				    route;
				if (that.cache[pth]) {
					that.log('app cache - ' + pth);
					that.cache[pth].call(that, req, res, next);
				} else {
					route = that.router.get(pth);
					if (route && route['']) {
						that.log('app route - ' + pth);
						that.router.send(route, function (r, info) {
							req.routeInfo = info;
							req.query = qs.parse(uri.query);
							req.app = res.app = that;
							r.call(that, req, res, next);
						}, that);
					} else next();
				}
			};
		};
		obj.respond404 = function () {
			var that = this;
			return function (req, res, next) {
				if (util.isFunction(that.custom404)) {
					that.custom404(req, res, next);
				} else {
					res.writeHead(404, {'Content-Type': 'text/plain'});
					res.end('404');
				}
			};
		};
		obj.buildModel = function (cb) {
			this.log('Building models.');
			var that = this;
			return this.scanFiles(
				path.join(this.options.root, 'model'), 1,
				function (dir, file, stats, end) {
					if (file && stats.ext === 'js') {
						var modelName = path.basename(file, '.js');
						that.model[modelName] = require(file)(that);
					}
					end();
				},
				function () {
					that.log('Finished building models.');
					this.connectDB();
					cb.apply(this, arguments);
					that.forever('setup models');
				}
			);
		};
		obj.buildApp = function (cb) {
			this.log('Building app.');
			var that = this;
			this.on('setup models', function () {
				/*
				that.io.sockets.on('connection', function (socket) {
					that.socket = socket;
					that.forever('socket ready', socket);
				});
				*/
				that.scanFiles(
					path.join(this.options.root, 'app'), 1,
					function (dir, file, stats, end) {
						if (file && stats.ext === 'js') {
							var helperName = path.basename(file, '.js');
							that.helpers[helperName] = require(file)(that);
						}
						end();
					},
					function () {
						that.log('Finished building app.');
						cb.apply(this, arguments);
						that.emit('setup app');
					}
				);
			});
			return this;
		};
		obj.buildClient = function (cb) {
			cb.call(this);
			return this;
		};
		obj.buildTest = function (cb) {
			cb.call(this);
			return this;
		};
		obj.watchHotCode = function () {
			if (!this.options.hotCode) return this;
			var that = this,
			    opts = {interval: this.options.watchInterval};
			this.log('Creating model hot code watchers.').scanFiles(
				path.join(this.options.root, 'model'), 1,
				function (dir, file, stats, end) {
					if (file && stats.ext === 'js') {
						var modelName = path.basename(file, '.js');
						fs.watchFile(file, opts, function (curr, prev) {
							if (curr.mtime > prev.mtime) {
								delete require.cache[require.resolve(file)];
								that.model[modelName] = require(file)(that);
							}
						});
					}
					end();
				},
				function () {
					that.log('Finished creating model hot code watchers.');
				}
			);
			this.log('Creating app hot code watchers.').scanFiles(
				path.join(this.options.root, 'app'), 1,
				function (dir, file, stats, end) {
					if (file && stats.ext === 'js') {
						var helperName = path.basename(file, '.js');
						fs.watchFile(file, opts, function (curr, prev) {
							if (curr.mtime > prev.mtime) {
								delete require.cache[require.resolve(file)];
								that.helpers[helperName] = require(file)(that);
							}
						});
					}
					end();
				},
				function () {
					that.log('Finished creating app hot code watchers.');
				}
			);
			return this;
		};
		obj.unwatchHotCode = function (cb) {
			if (!this.options.hotCode) return this;
			var that = this;
			function unwatch (dir, file, stats, end) {
				if (file && stats.ext === 'js') {
					fs.unwatchFile(file);
				}
				end();
			}
			this.scanFiles(
				path.join(this.options.root, 'model'), 1,
				unwatch,
				cb
			);
			this.scanFiles(
				path.join(this.options.root, 'app'), 1,
				unwatch,
				cb
			);
			return this;
		};
		obj.scanFiles = function (dir, depth, fn, cb, _mem) {
			var that = this;
			if (typeof fn !== 'function') return this;
			if (!_mem) _mem = {count: 1};
			if (!_mem.end) _mem.end = function end () {
				_mem.count -= 1;
				if (_mem.count <= 0 && !_mem.called) {
					_mem.called = true;
					cb.call(that);
				}
			};
			fs.readdir(dir, function  (err, files) {
				if (err) throw err;
				if (files.length === 0) {
					return _mem.end();
				}
				var i = 0,
				    end = files.length,
				    last = files[end - 1];
				function iterate (name) {
					var file = path.join(dir, name);
					fs.stat(file, function (err, stats) {
						if (err) throw err;
						function finish () {
							_mem.end();
							if (name === last) {
								_mem.end();
							}
						}
						if (stats.isDirectory() && depth > 0) {
							_mem.count += 1;
							fn.call(that, file, null, stats, function () {
								that.scanFiles(file, depth - 1, fn, null, _mem);
								if (name === last) {
									_mem.end();
								}
							});
						} else if (stats.isFile()) {
							_mem.count += 1;
							stats.ext = path.extname(file).substr(1);
							stats.encoding = mime.lookup(file);
							stats.charset = mime.charsets.lookup(stats.encoding);
							fn.call(that, dir, file, stats, finish);
						} else {
							finish();
						}
					});
				}
				for (; i < end; i += 1) iterate(files[i]);
				return null;
			});
			return this;
		};
		if (args) obj.initApp.apply(obj, args);
		return obj;
	};
	(module.exports = App).create(App.prototype);
}).call(this);