package com.CranFood.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.CranFood.domains.Restaurant;
import com.CranFood.services.RestaurantService;

@RestController
@RequestMapping(value = "/restaurants")
public class RestaurantResource {
	
	@Autowired
	private RestaurantService service;
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Restaurant>> findAll(){
		List<Restaurant> restaurants = service.findAll();
		return ResponseEntity.ok().body(restaurants);
	}

}
