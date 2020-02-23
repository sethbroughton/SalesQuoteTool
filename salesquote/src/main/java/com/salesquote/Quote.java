package com.salesquote;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Quote {
	
	private String quoteNumber; //Create Date, adds 01 on date;
	private String salesTerms; //Net30 standard
	
	public String getQuoteNumber() {
		return quoteNumber;
	}
	public String getSalesTerms() {
		return salesTerms;
	}
	
	public Quote(Date date, int repNumber, int dailyCount) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyMMdd");
		this.quoteNumber = formatter.format(date) + "-" + repNumber + dailyCount;
	}
	
	@Override
	public String toString() {
		return quoteNumber;
	}
	
}
