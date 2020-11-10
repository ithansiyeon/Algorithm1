package com.test.java;

public class Note {
	
	private String size;
	private String color;
	private int page;
	private String owner;
	private int price = 500;
	
	public void setSize(String size) {
		if(size.equals("A3") || size.equals("A4") || size.equals("A5") || size.equals("B3") || size.equals("B4") || size.equals("B5"))
		this.size = size;
		if(size.equals("A3")) {
			price+=400;
		} else if(size.equals("A4")) {
			price+=200;
		} else if(size.equals("B3")) {
			price+=500;
		} else if(size.equals("B4")) {
			price+=300;
		} else if(size.equals("B5")) {
			price+=100;
		}
	}
	
	public void setColor(String color) {
		if(color.equals("°ËÁ¤»ö") || color.equals("Èò»ö") || color.equals("³ë¶õ»ö") || color.equals("ÆÄ¶õ»ö"))
		this.color = color;
		
		if(color.equals("°ËÁ¤»ö")) {
			price+=100;
		} else if(color.equals("³ë¶õ»ö")) {
			price+=200;
		} else if(color.equals("ÆÄ¶õ»ö")) {
			price+=200;
		}
	}
	
	public void setPage(int page) {
		if(page >= 10 && page <=200)
		this.page = page;
		if(page>10) {
			price+=(page-10)*10;
		}
	}
	
	public void setOwner(String owner) {
		if(checkOwner(owner))
		this.owner = owner;
	}
	private boolean checkOwner(String owner) {
		if((owner.length()<2 && owner.length()>5)) {
			return false;
		}
		for(int i=0;i<owner.length();i++) {
			if(owner.charAt(i) < '°¡' || owner.charAt(i) > 'ÆR') {
				return false;
			}
		}
		
		return true;
	}

	public String info() {
		
		String shape = "";
		if(page>=10 && page<=50) {
			shape = "¾ã´Ù";
		} else if(page>=51 && page<=100) {
			shape="º¸Åë";
		} else if(page>=101 && page<=200) {
			shape="µÎ²®´Ù";
		}
		if (owner == null) {
			return "¡á¡á¡á¡á¡á¡á ³ëÆ® Á¤º¸ ¡á¡á¡á¡á¡á¡á\r\n"
					+ "ÁÖÀÎ ¾ø´Â ³ëÆ®\r\n"
					+ "¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á";
		} else {
			return "¡á¡á¡á¡á¡á¡á ³ëÆ® Á¤º¸ ¡á¡á¡á¡á¡á¡á\n" + "¼ÒÀ¯ÀÚ : " + owner + "\nÆ¯¼º : " + color + " " + shape + " " + size + "³ëÆ®"
					+ "\n°¡°Ý : " + String.format("%,d¿ø", price) + "\n¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á";

		}
		
	}

	
	
	
}
