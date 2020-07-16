package com.CranFood.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CranFood.domains.Restaurant;
import com.CranFood.repositories.RestaurantRepository;

@Service
public class RestaurantService {
	@Autowired
	private RestaurantRepository repo;

	public List<Restaurant> findAll() {

		return repo.findAll();
	}

}
