/**
 * 
 */
package me.hipoplar.backbone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.hipoplar.backbone.model.City;
import me.hipoplar.backbone.service.CityService;

/**
 * @author Vincent Yang
 *
 */
@RestController
public class CityController {
	
	@Autowired
	private CityService cityService;
	
	@RequestMapping("/cities/{id}")
	public City cities(@PathVariable Long id) {
		return cityService.find(id);
	}
}
