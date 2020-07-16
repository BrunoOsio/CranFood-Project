package com.CranFood.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.CranFood.domains.Food;

public interface FoodRepository extends MongoRepository<Food, String> {

}
