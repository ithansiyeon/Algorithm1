package com.test.java;

import java.io.IOException;
import java.util.Scanner;

public class Ex001 {
	
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		//m9();
		m10();
	}

	private static void m10() {
		
//		섭씨 온도를 입력받아서 화씨 온도로 변환하시오.
//
//		입력
//
//		섭씨(℃) : 29 
//		출력
//
//		섭씨 29℃는 화씨 84.2℉입니다.
//		도움
//
//		℉ = ℃ × 1.8 + 32
		
		System.out.print("섭씨(℃) : ");
		int n = scan.nextInt();
		System.out.printf("섭씨 %d℃는 화씨 %.1f℉입니다.",n,n*1.8+32);
		
	}

	private static void m9() {
		
//		요구사항.009
//		영문자 1개를 입력받아서 그 문자가 대문자인지 소문자인지 구분하시오.
//
//		입력
//
//		영문자 입력 : a 
//		영문자 입력 : E 
//		출력
//
//		입력한 문자 'a'는 소문자입니다.
//		입력한 문자 'E'는 대문자입니다.
		
		System.out.print("영문자 입력 : ");
		char c = scan.next().charAt(0);
		System.out.print("영문자 입력 : ");
		char c1 = scan.next().charAt(0);
		System.out.printf("입력한 문자 '%c'는 %s입니다.\r\n",c,(c >='a' && c <='z')?"소문자":"대문자");
		System.out.printf("입력한 문자 '%c'는 %s입니다.\r\n",c1,(c1 >='a' && c1 <='z')?"소문자":"대문자");
	}

	private static void m8() {
		
//		요구사항.008
//		2020년 4월 1일은 수요일이다. 2020년 4월 중 한 날짜를 입력받아서 무슨 요일인지 출력하시오.
//
//		입력
//
//		날짜 입력 : 20 
//		출력
//
//		입력하신 2020년 4월 20일은 '월요일'입니다.
		
		System.out.print("날짜 입력 : ");
		int date = scan.nextInt();
		System.out.printf("입력하신 2020년 4월 %d일은 '%s'입니다.",date,(date%7==5)?"일요일":((date%7==6)?"월요일":(date%7==0)?"화요일":(date%7==1)?"수요일":(date%7==2)?"목요일":(date%7==3)?"금요일":"토요일"));
		
	}

	private static void m7() {
		
//		숫자 2개를 입력받아서 둘 중 더 큰 숫자를 출력하시오.
//
//		입력
//
//		첫번째 숫자 : 5 
//		두번째 숫자 : 3 
//		출력
//
//		5와(과) 3 중에 더 큰 숫자는 5입니다.
//		조건
//
//		숫자 3개를 입력받아서 가장 큰 숫자를 출력하시오.
		System.out.print("첫번쨰 숫자 : ");
		int num1 = scan.nextInt();
		scan.nextLine();
		System.out.print("두번쨰 숫자 : ");
		int num2 = scan.nextInt();
		System.out.print("세번쨰 숫자 : ");
		scan.nextLine();
		int num3 = scan.nextInt();
		
		System.out.printf("%d,%d,%d 중에 더 큰 숫자는 %d입니다.",num1,num2,num3,(num1>num2)?((num1>num3)?num1:((num3>num2)?num3:num2)):(num2>num3)?num2:num3);
		
	}

	private static void m6() {
		
//		영문 소문자를 1자 입력받은 후 대문자로 변환해서 출력하시오.
//
//		입력
//
//		문자 입력 : a 
//		출력
//
//		소문자 'a'의 대문자는 'A'입니다.
//		도움
//
//		대문자와 소문자의 문자 코드값이 어떤 관계인가?
//		(int)'A' → 65
//		(char)65 → 'A'
		
		System.out.print("문자 입력 : ");
		char n = 0;
		try {
			n = (char) System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.printf("소문자 '%c'의 대문자는 '%c'입니다.",n,n-32);
		
		
	}

	private static void m5() {
		
//		요구사항.005
//		사용자의 한달 수입을 입력받아 세후 금액을 출력하시오.
//
//		입력
//
//		한달 수입 금액(원) : 1000000 
//		출력
//
//		세후 금액(원) : 967,000원
//		세금(원) : 33,000원
//		조건
//
//		세금 : 수입의 3.3%
		
		System.out.print("한달 수입 금액(원) : ");
		int num1 = Integer.parseInt(scan.nextLine());
		
		System.out.printf("세후 금액(원) : %,3d원\r\n",(int)(num1*(1-0.033)));
		System.out.printf("세금(원) : %,3d원",(int)(num1*0.033));
		
	}

	private static void m4() {
		
//		자전거가 있다. 자전거의 바퀴는 지름이 26인치이다. 사용자가 페달을 밟은 횟수를 입력하면 자전거가 총 몇 m를 달렸는지 출력하시오.
//
//		입력
//
//		사용자가 페달을 밟은 횟수 : 1000 
//		출력
//
//		사용자가 총 1,000회 페달을 밟아 자전거가 총 2,075m를 달렸습니다.
//		조건
//
//		기어비 1:1 → 페달 1회전 == 자전거 바퀴 1회전
//		모든 출력 숫자는 천단위 표기하시오.
//		추가 조건
//
//		기어비를 추가로 입력 받으시오.
//		1단 : 페달 1회전 == 자전거 바퀴 1회전
//		2단 : 페달 1회전 == 자전거 바퀴 2회전
//		3단 : 페달 1회전 == 자전거 바퀴 3회전
//		4단 : 페달 1회전 == 자전거 바퀴 4회전
		
		// 1인치 0.0254
		
		System.out.print("사용자가 페달을 밟은 횟수 : ");
		int cnt = scan.nextInt();
		int dis = (int)(1000*(0.0254*13)*3.14*2);
		System.out.printf("사용자가 총 %,3d회 페달을 밟아 자전거가 총 %,3dm를 달렸습니다.",cnt,dis);
		
	}

	private static void m3() {
		System.out.print("너비(cm) : ");
		int width = scan.nextInt();
		scan.nextLine();
		System.out.print("높이(cm) : ");
		int height = scan.nextInt();
		scan.nextLine();
		System.out.printf("사각형의 넓이는 %d㎠입니다.\r\n",width*height);
		System.out.printf("사각형의 넓이는 %d㎠입니다.\r\n",(width+height)*2);
	}

	private static void m2() {
		
//		숫자 2개를 입력받아 아래의 연산과정과 연산 결과를 출력하시오.
//
//		입력
//
//		첫번째 숫자 : 5 
//		두번째 숫자 : 3 
//		출력
//
//		5 + 3 = 8
//		5 - 3 = 2
//		5 * 3 = 15
//		5 / 3 = 1.7
//		5 % 3 = 2
//		조건
//
//		천단위 표기를 하시오.
//		나누기 결과는 소수이하 1자리까지만 출력하시오.
		
		System.out.print("첫번째 숫자 : ");
		int num1 = scan.nextInt();
		scan.nextLine();
		System.out.print("두번쨰 숫자 : ");
		int num2 = scan.nextInt();
		scan.nextLine();
		System.out.printf("%d + %d = %d\r\n",num1,num2,num1+num2);
		System.out.printf("%d - %d = %d\r\n",num1,num2,num1-num2);
		System.out.printf("%d * %d = %d\r\n",num1,num2,num1*num2);
		System.out.printf("%d / %d = %d\r\n",num1,num2,num1/num2);
		System.out.printf("%d %% %d = %d\r\n",num1,num2,num1%num2);
		
	}

	private static void m1() {
		
		
//		  태어난 년도를 입력받아 나이를 출력하시오.
//		  
//		  입력
//		  
//		  태어난 년도 : 1990 출력
//		  
//		  나이 : 25세 조건
//		  
//		  우리나라 나이로 출력하시오. 현재 시각은 2020년입니다.
		 
		System.out.print("태어난 년도 : ");
		int year = scan.nextInt();
		System.out.printf("나이 : %d세 조건",2020-year+1);
		
	}

	
}

