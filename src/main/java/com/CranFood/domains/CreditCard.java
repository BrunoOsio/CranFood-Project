package com.CranFood.domains;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class CreditCard {
	@DBRef
	private User owner;
	@Id
	private String id;
	private String numbers;
	private String date;
	private String cvv;
	private Long money = null;
	
	
	public CreditCard() {
		super();
	}
	
	
	public CreditCard(User owner, String id, String numbers, String date, String cvv) {
		super();
		this.owner = owner;
		this.id = id;
		this.numbers = numbers;
		this.date = date;
		this.cvv = cvv;
	}


	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNumbers() {
		return numbers;
	}
	public void setNumbers(String numbers) {
		this.numbers = numbers;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	
	
	
	

}
