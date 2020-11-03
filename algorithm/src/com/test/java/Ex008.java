package com.test.java;

import java.util.Scanner;

public class Ex008 {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		//m1();
		//m2();
		//m6();
		//m5();
	}
	private static void m1() {
		
//		문장을 입력받아 역순으로 출력하시오.
//
//		입력
//
//		문장 입력 : 안녕하세요. 홍길동입니다. 
//		출력
//
//		역순 결과 : .다니입동길홍 .요세하녕안
//		도움
//
//		루프 변수 i를 어떻게 제어하느냐?
//		txt.charAt(i)
//		txt.substring(i, i+1)
		
		System.out.print("문장 입력 : ");
		String line = scan.nextLine();
		System.out.print("역순 결과 : ");
		for(int i=line.length()-1;i>=0;i--) {
			System.out.print(line.charAt(i));
		}
	}

	private static void m5() {
		System.out.print("숫자 : ");
		String num = scan.nextLine();
		for(int i=num.length()-3;i>=0;i-=3) {
			String temp = num.substring(i);
			String temp1 = num.substring(0,i);
			num = temp1+","+temp;
		}
		System.out.println(num);
	}

	private static void m2() {
		
		System.out.print("이메일 : ");
		String email = scan.nextLine();
		
		System.out.printf("아이디 : %s\n",email.substring(0,email.indexOf("@")));
		System.out.printf("도메인 : %s",email.substring(email.indexOf("@")+1,email.length()));
		
	}

	private static void m6() {
		String before = "    하나    둘    셋    ";
		int i = 0;
		int lcount = 0;
		int rcount = 0;
		int j = before.length()-1;
		while(before.charAt(i) == ' ') {
			lcount++;
			i++;
		}
		
		while(before.charAt(j)== ' ') {
			rcount++;
			j--;
		}
		
		String after = before.replace(" ","");
		for(int k = 0 ;k <lcount;k++) {
			after=" "+after;
		}
		
		for(int k = 0 ;k <rcount;k++) {
			after=after+" ";
		}
		System.out.println(before);
		System.out.println(after);
	}
}
