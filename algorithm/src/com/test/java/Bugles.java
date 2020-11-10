package com.test.java;

import java.util.Calendar;

public class Bugles {
	private int price;
    private int weight;
    private Calendar creationTime;
    private int expiration;
    public int getPrice() {
		return price;
	}

	public void setWeight(int weight) {
		if(weight == 300 || weight == 500 || weight == 850)
			this.weight = weight;
		if(weight == 300) price+=850;
		else if(weight == 500) price+=1200;
		else if(weight == 850) price+=1950;
	}

	public int getExpiration() {
		Calendar c = Calendar.getInstance();
		Calendar now = Calendar.getInstance();
		if(weight==300) {
			c.set(Calendar.YEAR, creationTime.get(Calendar.YEAR));
			c.set(Calendar.MONTH, creationTime.get(Calendar.MONTH));
			c.set(Calendar.DATE, creationTime.get(Calendar.DATE)+7);
		} else if(weight==500) {
			c.set(Calendar.YEAR, creationTime.get(Calendar.YEAR));
			c.set(Calendar.MONTH, creationTime.get(Calendar.MONTH));
			c.set(Calendar.DATE, creationTime.get(Calendar.DATE)+10);
		
		} else if(weight==850) {
			c.set(Calendar.YEAR, creationTime.get(Calendar.YEAR));
			c.set(Calendar.MONTH, creationTime.get(Calendar.MONTH));
			c.set(Calendar.DATE, creationTime.get(Calendar.DATE)+15);
		}
		System.out.printf("%tF\n",c);
		expiration = (int)((c.getTimeInMillis()-now.getTimeInMillis()-1000*(creationTime.get(Calendar.HOUR)*60*60+creationTime.get(Calendar.MINUTE)*60)+creationTime.get(Calendar.SECOND))/(1000*60*60*24));
		return expiration;
	}

    //getter, setter 구현

    public void eat() {
    	if(expiration >= 0) {
    		System.out.printf("유통 기한이 %d일 남았습니다.\n",expiration);
    	} else {
    		System.out.println("유통기한이 지나 먹을 수 없습니다.");
    	}
    }

	public void setCreationTime(String creationTime) {
		String [] split = creationTime.split("-");
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, Integer.parseInt(split[0]));
		c.set(Calendar.MONTH, Integer.parseInt(split[1])-1);
		c.set(Calendar.DATE, Integer.parseInt(split[2]));
		this.creationTime = c;
	}

	
}
