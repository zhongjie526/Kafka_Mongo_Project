package com.datateam.model;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;

public class Transaction {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");

	private Set<Item> items;
	private String ts;

	public Transaction() {
		this.items = new HashSet<>();
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		ts = sdf.format(timestamp);
	}

	public void addItem(Item item) {
		this.items.add(item);
	}
	

	public Set<Item> getItems() {
		return items;
	}

	public Boolean equivalent(Transaction that) {
		return this.items.containsAll(that.items) && that.items.containsAll(this.items) ;
		
	}
	
	@Override
	public String toString() {
		return String.format("%s", items);
	}

}
