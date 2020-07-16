package com.CranFood.dtos;

import java.io.Serializable;

import com.CranFood.domains.Food;

public class FoodDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private Double price;

	public FoodDTO() {
		super();
	}

	public FoodDTO(Food food) {
		super();
		this.id = food.getId();
		this.name = food.getName();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
