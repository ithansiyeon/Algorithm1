package com.test.java;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time() {
		this(0,0,0);
	}
	
	public Time(int hour,int minute,int second) {
		if(hour>=0 && minute >=0 && second >= 0) {
			int sum = hour*60*60+minute*60+second;
			this.hour = sum/(3600);
			this.minute = (sum-this.hour*60*60)/60;
			this.second = sum-sum/3600*60-((sum-sum/3600*60)/60)*60;
		}
	}
	
	public Time(int minute, int second) {
		this(0,minute,second);
	}
	
	public Time(int second) {
		this(0,0,second);
	}
	
	public String info() {
		return String.format("%d:%d:%d",hour,minute,second);
	}
}
