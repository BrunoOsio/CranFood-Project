package com.CranFood.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.CranFood.domains.User;

public interface UserRepository extends MongoRepository<User, String>{

}
