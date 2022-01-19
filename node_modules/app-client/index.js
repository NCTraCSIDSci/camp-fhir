var fs = require('fs');
var client = module.exports = function (min) {
	return fs.readFileSync(__dirname + '/build/app-client' + (min ? '-min' : '') + '.js', 'utf8');
};
client.test = function () {
	return fs.readFileSync(__dirname + '/build/app-client-tests.js', 'utf8');
};
client.test.css = function () {
	return fs.readFileSync(__dirname + '/src/test.css', 'utf8');
};