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
		if(color.equals("검정색") || color.equals("흰색") || color.equals("노란색") || color.equals("파란색"))
		this.color = color;
		
		if(color.equals("검정색")) {
			price+=100;
		} else if(color.equals("노란색")) {
			price+=200;
		} else if(color.equals("파란색")) {
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
			if(owner.charAt(i) < '가' || owner.charAt(i) > '힣') {
				return false;
			}
		}
		
		return true;
	}

	public String info() {
		
		String shape = "";
		if(page>=10 && page<=50) {
			shape = "얇다";
		} else if(page>=51 && page<=100) {
			shape="보통";
		} else if(page>=101 && page<=200) {
			shape="두껍다";
		}
		if (owner == null) {
			return "■■■■■■ 노트 정보 ■■■■■■\r\n"
					+ "주인 없는 노트\r\n"
					+ "■■■■■■■■■■■■■■■■■■■■■■";
		} else {
			return "■■■■■■ 노트 정보 ■■■■■■\n" + "소유자 : " + owner + "\n특성 : " + color + " " + shape + " " + size + "노트"
					+ "\n가격 : " + String.format("%,d원", price) + "\n■■■■■■■■■■■■■■■■■■■■■■";

		}
		
	}

	
	
	
}
