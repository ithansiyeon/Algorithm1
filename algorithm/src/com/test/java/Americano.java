package com.test.java;

public class Americano {
	private int bean;
	private int water;
	private int ice;
	
	public void drink() {
		System.out.printf("���� %d, �� %dml, ���� %d���� ���巷�� �Ƹ޸�ī�븦 ���ʴϴ�.\n",bean,water,ice);
	}

	public int getBean() {
		return bean;
	}

	public void setBean(int bean) {
		this.bean = bean;
	}

	public int getWater() {
		return water;
	}

	public void setWater(int water) {
		this.water = water;
	}

	public int getIce() {
		return ice;
	}

	public void setIce(int ice) {
		this.ice = ice;
	}
}
