package com.test.java;

public class Latte {
	private int bean;
	private int milk;
	
	public void drink() {
		System.out.printf("���� %dg, ���� %dml���� ������� �󶼸� ���ʴϴ�.\n",bean,milk);
	}

	public int getBean() {
		return bean;
	}

	public void setBean(int bean) {
		this.bean = bean;
	}

	public int getMilk() {
		return milk;
	}

	public void setMilk(int milk) {
		this.milk = milk;
	}
	
}
