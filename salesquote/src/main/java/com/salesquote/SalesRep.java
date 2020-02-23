package com.salesquote;

public class SalesRep {
	
	private String firstName; 
	private String lastName;
	private int salesRepNumber;
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public int getSalesRepNumber() {
		return salesRepNumber;
	}
	
	public SalesRep(int repNumber){
		this.salesRepNumber = repNumber;
	}

	
}
