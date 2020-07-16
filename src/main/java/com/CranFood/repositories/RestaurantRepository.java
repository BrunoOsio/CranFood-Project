package com.CranFood.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.CranFood.domains.Restaurant;

public interface RestaurantRepository extends MongoRepository<Restaurant, String>{

}
