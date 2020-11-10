package com.test.java;

public class Macaron {
	private int size;
    private String color;
    private int thickness;
    
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		if(size>=5 && size <= 15)
			this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		String [] colors = {"red","blue","yellow","white","pink","purple","green","black"};
		for(int i=0;i<colors.length;i++) {
			if(color.equals(colors[i]))
			this.color = color;
		}
	}
	public int getThickness() {
		return thickness;
	}
	public void setThickness(int thickness) {
		if(thickness>=1 && thickness <=20)
			this.thickness = thickness;
	}
    
}
