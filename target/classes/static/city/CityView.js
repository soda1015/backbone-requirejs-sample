define(['City'], function(City) {
	var CityView = Backbone.View.extend({
		el: $("#main"),
		template: _.template('<p><%- name %></p>'),
		initialize: function() {
			this.model = new City({id: 1});
		    this.listenTo(this.model, "change", this.render);
		    this.model.fetch();
		},
		render: function() {
			this.$el.html(this.template(this.model.toJSON()));
		}
	});
	return CityView;
});