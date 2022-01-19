(function(){"use strict";
	/*global module name api main global require*/
	var that = this;
	if (typeof module !== 'undefined') {
		module.exports = (api).freeze();
	} else {
		(api) = (api).freeze("(main)");
		(api).conflict = this(name);
		(api).noConflict = function () {
			if (require) that.require = that.require.conflict;
			return (that(name) = (this.conflict || this));
		};
		this(name) = (api);
	}
}).call(this);