package com.test.java;

public class Ex003 {
	public static void main(String[] args) {
		//m1();
		//m2();
		m3();
	}

	private static void m3() {
//		인자로 받은 숫자들 중 양수의 갯수를 반환하는 메소드를 선언하고 호출하시오. 메소드 오버로딩.
//
//		입력
//
//		없음
//		호출
//
		int count = positive(10);
		System.out.println(count);
//		출력
//
//		양수 : 1개
//		호출
//
		count = positive(10, 20);
		System.out.println(count);
//		출력
//
//		양수 : 2개
//		호출
//
		count = positive(10, 20, -30);
		System.out.println(count);
//		출력
//
//		양수 : 2개
//		호출
//
		count = positive(10, 20, -30, 40);
		System.out.println(count);
//		출력
//
//		양수 : 3개
//		호출
//
		count = positive(10, 20, -30, 40, 50);
		System.out.println(count);
//		출력
//
//		양수 : 4개
	}

	private static int positive(int i, int j, int k, int l, int m) {
		return (i>0 ? 1:0)+(j>0 ? 1:0)+(k>0?1:0)+(l>0?1:0)+(m>0?1:0);
	}

	private static int positive(int i, int j, int k, int l) {
		return (i>0 ? 1:0)+(j>0 ? 1:0)+(k>0?1:0)+(l>0?1:0);
	}

	private static int positive(int i, int j, int k) {
		return  (i>0 ? 1:0)+(j>0 ? 1:0)+(k>0?1:0);
	}

	private static int positive(int i, int j) {
		return (i>0 ? 1:0)+(j>0 ? 1:0);
	}

	private static int positive(int i) {
		return i>0?1:0;
	}

	private static void m2() {
//		인자로 받은 이름들을 직급 순으로 출력하는 메소드를 선언하고 호출하시오. 메소드 오버로딩.
//
//		입력
//
//		없음
//		호출
//
		position("홍길동");
//		출력
//
//		사원 : 홍길동
//		호출
//
		position("홍길동", "유재석");
//		출력
//
//		사원 : 홍길동
//		대리 : 유재석
//		호출
//
		position("홍길동", "유재석", "박명수");
//		출력
//
//		사원 : 홍길동
//		대리 : 유재석
//		과장 : 박명수
//		호출
//
		position("홍길동", "유재석", "박명수", "정형돈");
//		출력
//
//		사원 : 홍길동
//		대리 : 유재석
//		과장 : 박명수
//		부장 : 정형돈
		
	}

	private static void position(String name, String name1, String name2, String name3) {
		System.out.printf("사원 : %s\n",name);
		System.out.printf("대리 : %s\n",name1);
		System.out.printf("과장 : %s\n",name2);
		System.out.printf("부장 : %s\n",name3);
	}

	private static void position(String name, String name1, String name2) {
		System.out.printf("사원 : %s\n",name);
		System.out.printf("대리 : %s\n",name1);
		System.out.printf("과장 : %s\n",name2);
	}

	private static void position(String name, String name1) {
		System.out.printf("사원 : %s\n",name);
		System.out.printf("대리 : %s\n",name1);
	}

	private static void position(String name) {
		System.out.printf("사원 : %s\n",name);
	}

	private static void m1() {
//		인자로 받은 숫자들의 합을 구하는 메소드를 선언하고 호출하시오. 메소드 오버로딩.
//
//		입력
//
//		없음
//		호출
//
//		sum(10);
//		출력
//
//		10 = 10
//		호출
//
//		sum(10, 20);
//		출력
//
//		10 + 20 = 10
//		호출
//
//		sum(10, 20, 30);
//		출력
//
//		10 + 20 + 30 = 10
//		메소드 서명
//
		
		sum(10);
		sum(10, 20);
		sum(10, 20, 30);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
	}
	
	private static void sum(int n1, int n2, int n3) {
		System.out.printf("%d + %d + %d = %d\n",n1,n2,n3,n1+n2+n3);
		
	}

	private static void sum(int n1, int n2) {
		System.out.printf("%d + %d = %d\n",n1,n2,n1+n2);
	}

	private static void sum(int n1) {
		System.out.printf("%d = %d\n",n1,n1);
	}
}
