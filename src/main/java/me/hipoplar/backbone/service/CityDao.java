/**
 * 
 */
package me.hipoplar.backbone.service;

import org.springframework.data.repository.CrudRepository;

import me.hipoplar.backbone.model.City;

/**
 * @author Vincent Yang
 *
 */
public interface CityDao extends CrudRepository<City, Long> {

}
