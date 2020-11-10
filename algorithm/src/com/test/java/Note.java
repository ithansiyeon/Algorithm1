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
		if(color.equals("������") || color.equals("���") || color.equals("�����") || color.equals("�Ķ���"))
		this.color = color;
		
		if(color.equals("������")) {
			price+=100;
		} else if(color.equals("�����")) {
			price+=200;
		} else if(color.equals("�Ķ���")) {
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
			if(owner.charAt(i) < '��' || owner.charAt(i) > '�R') {
				return false;
			}
		}
		
		return true;
	}

	public String info() {
		
		String shape = "";
		if(page>=10 && page<=50) {
			shape = "���";
		} else if(page>=51 && page<=100) {
			shape="����";
		} else if(page>=101 && page<=200) {
			shape="�β���";
		}
		if (owner == null) {
			return "������� ��Ʈ ���� �������\r\n"
					+ "���� ���� ��Ʈ\r\n"
					+ "�����������������������";
		} else {
			return "������� ��Ʈ ���� �������\n" + "������ : " + owner + "\nƯ�� : " + color + " " + shape + " " + size + "��Ʈ"
					+ "\n���� : " + String.format("%,d��", price) + "\n�����������������������";

		}
		
	}

	
	
	
}
