package com.datateam.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

public class Customer {

	@Id
	public String id;

	private String firstName;
	private String lastName;

	private List<Transaction> transactions = new ArrayList<Transaction>();

	public Customer() {
	}

	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void addTransaction(Transaction trans) {
		this.transactions.add(trans);

	}

	@Override
	public String toString() {
		return String.format("Customer[id=%s, firstName='%s', lastName='%s']", id, firstName, lastName);
	}

}
