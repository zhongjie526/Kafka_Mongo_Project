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
	
	@Override
	public String toString() {
		return String.format("{description='%s', price='%s'}", description, price);
	}
	
	@Override
    public boolean equals(Object o) { 
  
        if (o == this) { 
            return true; 
        } 
  
        if (!(o instanceof Item)) { 
            return false; 
        } 
          
        Item c = (Item) o; 
          
        return (description.equalsIgnoreCase(c.description) && (price - c.price)<0.01); 
    } 
	
	@Override
    public int hashCode(){
            return description.hashCode() + price.hashCode();
    }


}
