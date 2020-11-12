package com.test.java;

import java.util.Arrays;

public class MyArrayList {
	
	private int index=0;
	private String [] list;
	
	MyArrayList() {
		this(10);
	}
	
	MyArrayList (int capacity){
		list = new String[capacity];
	}

	public void add(String value) {
		checkLength();
		list[this.index] = value;
		this.index++;
	}

	public void checkLength() {
		if(list.length<=index) {
			String []list1 = new String[list.length*2];
			for(int i=0;i<list.length;i++) {
				list1[i]=list[i];
			}
			list=list1;
		}
	}

	public String get(int index) {
		return list[index];
	}

	public void remove(int index) {
		for(int i=index;i<this.index;i++) {
			list[i]=list[i+1];
		}
		list[this.index-1]=null;
		System.out.println(Arrays.toString(list));
		this.index--;
	}

	public int indexOf(String value) {
		for(int i=0;i<this.index;i++) {
			if(list[i].equals(value)) {
				return i;
			}
		}
		return -1;
	}

	public boolean contains(String value) {
		for(int i=0;i<this.index;i++) {
			if(list[i].contains(value)) {
				return true;
			}
		}
		return false;
	}

	public MyArrayList subList(int fromIndex, int toIndex) {
		MyArrayList list1 = new MyArrayList();
		for(int i=fromIndex;i<toIndex;i++) {
			list1.add(list[i]);
		}
		return list1;
	}

	public boolean isEmpty() {
		if(this.index==0) {
			return true;
		}
		return false;
	}

	public void clear() {
		this.index=0;
	}

	public int size() {
		return this.index;
	}

	public void set(int index, String value) {
		list[index] = value;
	}

	public void add(int index, String value) {

		checkLength();
		for(int i = index; i<this.index;i++) {
			list[index]=list[index];
		}
	}

}
