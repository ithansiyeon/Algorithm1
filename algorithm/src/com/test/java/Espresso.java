package com.test.java;

public class Espresso {
	private int bean;
	
	public void drink() {
		System.out.printf("���� %dg���� ������� ���������Ҹ� ���ʴϴ�.\n",bean);
	}

	public int getBean() {
		return bean;
	}

	public void setBean(int bean) {
		this.bean = bean;
	}
}
