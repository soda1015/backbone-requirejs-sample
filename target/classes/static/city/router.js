define(['CityView'],function(CityView) {
	var Workspace = Backbone.Router.extend({
		routes: {
			"": "home"
		},
		home: function() {
			var cityView = new CityView;
		}
	});
	return Workspace;
});