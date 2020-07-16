package com.CranFood.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.CranFood.domains.CreditCard;

public interface CreditCardRepository extends MongoRepository<CreditCard, String> {

}
