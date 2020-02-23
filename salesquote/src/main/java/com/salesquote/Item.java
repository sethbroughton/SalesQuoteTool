package com.salesquote;

import java.math.BigDecimal;

public class Item {
	
	private BigDecimal price;
	private String name;
	private String itemID; 
	private String unitOfMeasure; 
	
	public BigDecimal getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
	
	public String getItemID() {
		return itemID;
	}
	
	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}
	
	//Constructor
	public Item(String itemID) {
		this.itemID = itemID;
	}
	
	//Method
	
	
	
	

}
