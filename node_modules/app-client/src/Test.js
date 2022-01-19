/*global module require window document*/
(function(){"use strict";
	var util = require('./util'),
	    core = require('cornerstone'),
	    Test = core.require('Test'),
	    Class = core.require('Class');
	module.exports = Class.create('TestClient', Test, function (obj, supr, proto) {
		obj.reportDom = function (parent, callback, showPassed, amount, timeout) {
			var html = '<div>unit tests</div>',
			    clean = this.cleanLeftSpace,
			    total = 0,
			    failed = 0,
			    elapsed = 0,
			    started = (+new Date());
			if (!isFinite(timeout)) timeout = 2500;
			return this.report(
				function (state) {
					if (!this.name) return this;
					var name = state.name = state.name ? this.joinName(state.name) : this.name,
					    tabs = state.tabs = state.tabs ? (state.tabs + '&nbsp;&nbsp;') : String.fromCharCode(0);
					function showProc (proc) {
						html += '<div class="assert">' + tabs + '&nbsp;&nbsp;' + clean(proc.toString()) + '</div>';
						html += '<div class="result">' + tabs + '&nbsp;&nbsp;&nbsp;&nbsp;' + proc.result + '</div>';
						html += '<div class="elapsed">' + tabs + '&nbsp;&nbsp;&nbsp;&nbsp;' + proc.elapsed + ' ms</div>';
					}
					if (this.results.failed.length) {
						html += '<div class="failed">' + tabs + 'failed "' + name + '"</div>';
						util.enumerate(this.results.failed, showProc);
					} else if (showPassed) {
						html += '<div class="passed">' + tabs + 'passed "' + name + '"</div>';
					}
					if (showPassed) {
						util.enumerate(this.results.passed, showProc);
					}
					elapsed += this.results.elapsed;
					failed += this.results.failed.length;
					total += this.results.total;
					util.safeApply(callback, this, [this]);
				},
				function () {
					if (failed) {
						html += '<div class="failed">' + failed + '/' + total + ' failed</div>';
					} else {
						html += '<div class="passed">' + (total - failed) + '/' + total + ' passed</div>';
					}
					html += '<div class="elapsed">' + elapsed + ' ms (assertion time)</div>';
					html += '<div class="elapsed">' + (this.results.ended - this.results.started) + ' ms (run time)</div>';
					html += '<div class="elapsed">' + ((+new Date()) - started) + ' ms (report time)</div>';
					parent.innerHTML = html;
				},
				null,
				function () {
					//parent.innerHTML += '.';
				},
				amount,
				timeout
			);
		};
	});
}).call(this);