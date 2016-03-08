package me.hipoplar.backbone.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.hipoplar.backbone.model.City;

@Service
public class CityService {
	@Autowired
	private CityDao cityDao;
	
	public List<City> cities() {
		List<City> cities = new ArrayList<>();
		Iterator<City> iterator = cityDao.findAll().iterator();
		while (iterator.hasNext()) {
			cities.add(iterator.next());
		}
		return cities;
	}
	
	public City find(Long id) {
		return cityDao.findOne(id);
	}
}
