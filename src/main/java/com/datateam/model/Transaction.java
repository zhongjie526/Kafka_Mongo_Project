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
		this.items = new HashSet<Item>();
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		ts = sdf.format(timestamp);
	}

	public void addItem(Item item) {
		this.items.add(item);
	}
	

	public Set<Item> getItems() {
		return items;
	}

	@Override
	public boolean equals(Object o) {
		
		if (o == this) { 
            return true; 
        } 
  
        if (!(o instanceof Transaction)) { 
            return false; 
        } 
          
        Transaction c = (Transaction) o;
        
        if(c.items.size() != items.size()) {
        	return false;
        }
        
		return  this.getItems().containsAll(c.getItems());
		
	}
	
	@Override
    public int hashCode(){
            return items.hashCode();
    }
	
	@Override
	public String toString() {
		return String.format("%s", items);
	}

}
