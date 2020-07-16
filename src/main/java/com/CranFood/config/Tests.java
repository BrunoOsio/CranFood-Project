package com.CranFood.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.CranFood.domains.User;
import com.CranFood.repositories.UserRepository;

@Configuration
public class Tests implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public void run(String... args) throws Exception {
		
		userRepo.deleteAll();
		
		User bruno = new User(null, "Bruno");
		User gabriel = new User(null, "Gabriel");
		
		userRepo.saveAll(Arrays.asList(bruno, gabriel));

	}

}
