require.config({
	baseUrl: 'city',
	paths: {
		jquery: '//cdn.bootcss.com/jquery/1.12.1/jquery.min',
		backbone: '//cdn.bootcss.com/backbone.js/1.2.3/backbone-min',
		underscore: '//cdn.bootcss.com/underscore.js/1.8.3/underscore-min',
		router: 'router'
	},
	shim: {
		router: {
			deps: ['backbone']
		}
	}
});

require(['router'], function(Workspace) {
	new Workspace;
	Backbone.history.start()
});