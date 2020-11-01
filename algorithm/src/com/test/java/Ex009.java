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
		
//		배열에 요소를 삭제하시오.
//
//		입력
//
//		삭제 위치 : 2 
//		출력
//
//		원본 : [5, 6, 1, 3, 2]
//		결과 : [5, 6, 3, 2, 0]
//		조건
//
//		배열의 시작 길이 : 5
//		난수 대입
		
		System.out.print("삭제 위치 : ");
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
		
//		배열에 요소를 삽입하시오.
//
//		입력
//
//		삽입 위치 : 2 
//		값 : 100 
//		출력
//
//		원본 : [5, 6, 1, 3, 2, 0, 0, 0, 0, 0]
//		결과 : [5, 6, 100, 1, 3, 2, 0, 0, 0, 0]
//		조건
//
//		배열의 시작 길이 : 10
//		난수 대입
		System.out.print("삽입 위치 : ");
		int index = Integer.parseInt(scan.nextLine());
		System.out.print("값 : ");
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
