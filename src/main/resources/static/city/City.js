define(function() {
	var City = Backbone.Model.extend({
		urlRoot: '/cities',
		defaults: {
			id: null,
			name: null,
			state: null
		}
	});
	return City;
});