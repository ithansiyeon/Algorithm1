package com.test.java;

public class Refrigerator {
	private int cnt = 0;
	Item [] item = new Item[100];
	public void add(Item item1) {
		item[cnt] = item1;
		cnt++;
		System.out.printf("'%s'�� ����� �־����ϴ�.\n",item1.getName());
	}

	public Item get(String name) {
		for(int i=0;i<cnt;i++) {
			if(item[i].getName().equals(name)) {
				return item[i];
			}
		}
		return null;
	}

	public int count() {
		return cnt;
	}

	public void listItem() {
		for(int i=0;i<cnt;i++) {
			System.out.printf("%s(%s)\n",item[i].getName(),item[i].getExpiration());
		}
	}

}
