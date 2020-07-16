package com.CranFood.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.CranFood.domains.CreditCard;
import com.CranFood.domains.Food;
import com.CranFood.domains.Restaurant;
import com.CranFood.domains.User;
import com.CranFood.repositories.CreditCardRepository;
import com.CranFood.repositories.FoodRepository;
import com.CranFood.repositories.RestaurantRepository;
import com.CranFood.repositories.UserRepository;

@Configuration
public class Tests implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private RestaurantRepository restRepo;
	
	@Autowired
	private FoodRepository foodRepo;
	
	@Autowired
	private CreditCardRepository cardRepo;

	@Override
	public void run(String... args) throws Exception {
		
		userRepo.deleteAll();
		restRepo.deleteAll();
		foodRepo.deleteAll();
		cardRepo.deleteAll();
		
		
		User bruno = new User(null, "Bruno", null);
		User gabriel = new User(null, "Gabriel", null);
		
		Food hamburguerCarne = new Food(null, "Hamburguer de carne", 14D);
		Food cachorroQuente = new Food(null, "Cachorro Quente", 11D);
		Food cocaCola = new Food(null, "Coca Cola", 6D);
		
		
		foodRepo.saveAll(Arrays.asList(hamburguerCarne, cachorroQuente, cocaCola));
		
		Restaurant cia68 = new Restaurant(null,
										  "Cia 68",
										  Arrays.asList(hamburguerCarne, cachorroQuente, cocaCola));
		
		userRepo.saveAll(Arrays.asList(bruno, gabriel));
		bruno.getOrder().addAll(Arrays.asList(hamburguerCarne, cocaCola));
		userRepo.saveAll(Arrays.asList(bruno, gabriel));
		
		
		CreditCard brunoCard = new CreditCard(bruno, null, "1234 1234 1234 12", "7/21", "999");
		cardRepo.saveAll(Arrays.asList(brunoCard));
		restRepo.saveAll(Arrays.asList(cia68));

	}

}
