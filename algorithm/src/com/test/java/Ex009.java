package com.test.java;

import java.util.Arrays;
import java.util.Scanner;

public class Ex009 {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		//m1();
		//m2();
		//m3();
		//m4();
		m5();
		//m8();
		//m9();
	}

	private static void m5() {
		int [] nums = new int[20];
		
		int max = -100;
		int min = 100;
		for(int i=0;i<nums.length;i++) {
			nums[i]=(int)(Math.random()*20)+1;
		}
		System.out.println("원본 : "+Arrays.toString(nums));
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>max) {
				max = nums[i];
			} 
		}
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<min) {
				min = nums[i];
			} 
		}
		System.out.printf("최댓값 : %d\n",max);
		System.out.printf("최소값 : %d",min);
	}

	private static void m4() {
		
//		난수로 채워진 배열에서 첫번째 방부터 연속으로 2개씩 더한 결과를 출력하시오.
//
//		입력
//
//		배열의 길이 : 10 
//		출력
//
//		nums = [ 1, 5, 3, 6, 2, 7, 8, 2, 2, 9 ]
//		result = [ 6, 9, 9, 10, 11 ]
//		조건
//
//		난수 범위 : 1 ~10이내
		
		System.out.print("배열의 길이 : ");
		int len = Integer.parseInt(scan.nextLine());
		int [] nums = new int[len];
		int [] result = new int[len/2];
		for(int i=0;i<len;i++) {
			nums[i]=(int)(Math.random()*10)+1;
		}
		for(int i=0;i<len/2;i++) {
			result[i]=nums[i]+nums[i+1];
		}
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(result));
	}

	private static void m3() {
//		학생의 이름을 N개 입력받아 아래와 같이 출력하시오.
//
//		입력
//
//		학생 수 : 6 
//		학생명 : 홍길동 
//		학생명 : 아무개 
//		학생명 : 하하하 
//		학생명 : 호호호 
//		학생명 : 후후후 
//		학생명 : 헤헤헤 
//		출력
//
//		입력한 학생은 총 6명입니다.
//		1. 헤헤헤
//		2. 후후후
//		3. 호호호
//		4. 하하하
//		5. 아무개
//		6. 홍길동
		
		System.out.print("학생 수 : ");
		int num = Integer.parseInt(scan.nextLine());
		String []names = new String[num];
		for(int i=0;i<names.length;i++) {
			System.out.print("학생명 : ");
			names[i]=scan.nextLine();
		}
		System.out.printf("입력한 학생은 총%d명입니다.\n",num);
		for(int i=0;i<names.length;i++) {
			System.out.printf("%d. %s\n",i+1,names[i]);
		}
	}

	private static void m2() {
		
//		숫자를 5개 입력받아 배열에 담은 뒤 역순으로 출력하시오.
//
//		입력
//
//		숫자 : 5 
//		숫자 : 1 
//		숫자 : 7 
//		숫자 : 2 
//		숫자 : 3 
//		출력
//
//		nums[4] = 3
//		nums[3] = 2
//		nums[2] = 7
//		nums[1] = 1
//		nums[0] = 5
		
		int []nums= new int[5];
		for(int i=0;i<5;i++) {
			System.out.print("숫자 : ");
			nums[i]=Integer.parseInt(scan.nextLine());
		}
		for(int i=nums.length-1;i>=0;i--) {
			System.out.printf("nums[%d] = %d\n",i,nums[i]);
		}
	}

	private static void m1() {
//		1차원 int 배열을 매개변수로 해서 내용을 문자열로 반환하는 dump 메소드를 구현하시오.
//
//		입력
//
//		없음
//		호출
//
//		int[] list = new int[4];
//		list[0] = 10;
//		list[1] = 20;
//		list[2] = 30;
//		list[3] = 40;
//		String result = dump(list);
//		System.out.printf("nums = %s\n", result);
//		출력
//
//		nums = [ 10, 20, 30, 40 ]
//		메소드 서명 String dump(int[] list)
		
		int[] list = new int[4];
		list[0] = 10;
		list[1] = 20;
		list[2] = 30;
		list[3] = 40;
		String result = dump(list);
		System.out.printf("nums = %s\n", result);
	}

	private static String dump(int[] list) {
		
		return Arrays.toString(list);
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
