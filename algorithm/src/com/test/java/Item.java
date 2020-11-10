package com.test.java;

import java.util.Calendar;

public class Item {
	private String name;
	Calendar expiration;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getExpiration() {
		
		return String.format("%tF", expiration);
	}
	
	public void setExpiration(String expiration) {
		String [] split = expiration.split("-");
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR,Integer.parseInt(split[0]));
		c.set(Calendar.MONTH,Integer.parseInt(split[1])-1);
		c.set(Calendar.DATE,Integer.parseInt(split[2]));
		this.expiration = c;
	}

	

}
