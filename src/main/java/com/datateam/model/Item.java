package com.datateam.model;

public class Item {

	private String description;

	private Double price;

	public Item() {
		this.description = "";
		this.price = 0.0;
	}

	public Item(String description, Double price) {
		this.description = description;
		this.price = price;
	}

}
