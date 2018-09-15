package com.datateam.model;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Transaction {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");

	private List<Item> items;
	private String ts;

	public Transaction() {
		this.items = new ArrayList<Item>();
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		ts = sdf.format(timestamp);
	}

	public void addItem(Item item) {
		this.items.add(item);
	}

}
