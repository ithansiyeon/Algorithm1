package com.test.java;

import java.util.Arrays;
import java.util.Scanner;

public class Ex009 {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		//m8();
		m9();
	}

	private static void m9() {
		
//		�迭�� ��Ҹ� �����Ͻÿ�.
//
//		�Է�
//
//		���� ��ġ : 2 
//		���
//
//		���� : [5, 6, 1, 3, 2]
//		��� : [5, 6, 3, 2, 0]
//		����
//
//		�迭�� ���� ���� : 5
//		���� ����
		
		System.out.print("���� ��ġ : ");
		int index = Integer.parseInt(scan.nextLine());
		
		int [] arr = new int[5];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*10);
		}
		System.out.println(Arrays.toString(arr));
		for(int i=index;i<=arr.length-2;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=0;
		System.out.println(Arrays.toString(arr));
	}

	private static void m8() {
		
//		�迭�� ��Ҹ� �����Ͻÿ�.
//
//		�Է�
//
//		���� ��ġ : 2 
//		�� : 100 
//		���
//
//		���� : [5, 6, 1, 3, 2, 0, 0, 0, 0, 0]
//		��� : [5, 6, 100, 1, 3, 2, 0, 0, 0, 0]
//		����
//
//		�迭�� ���� ���� : 10
//		���� ����
		System.out.print("���� ��ġ : ");
		int index = Integer.parseInt(scan.nextLine());
		System.out.print("�� : ");
		int value = Integer.parseInt(scan.nextLine());
		
		int [] arr = new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*10);
		}
		System.out.println(Arrays.toString(arr));
		for(int i=arr.length-1;i>=index;i--) {
			arr[i]=arr[i-1];
		}
		arr[index]=value;
		
		System.out.println(Arrays.toString(arr));
		
	}
	
}
