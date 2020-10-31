package com.test.java;

import java.util.Calendar;
import java.util.Scanner;

public class Ex004 {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		//nowTime();
		//m1();
		//m2();
		//m3();
		//m4();
		m5();
	}

	private static void m5() {
		
//		여러 배달 음식을 같은 시간에 받기를 원하는 고객이 있다. 고객이 각각의 매장에 몇시에 전화를 해야 모든 음식을 같은 시간에 받을 수 있는지 알려주시오.
//
//		입력
//
//		음식을 받기 원하는 시각
//		시 : 14 
//		분 : 0 
//		출력
//
//		짜장면 : 13시 50분
//		치킨 : 13시 42분
//		피자 : 13시 35분
//		조건
//
//		전화를 걸면 짜장면은 10분 뒤에 도착합니다.
//		전화를 걸면 치킨은 18분 뒤 도착합니다.
//		전화를 걸면 피자는 25분 뒤 도착합니다.
//		날짜가 바뀌는 경우는 처리하지 않습니다.
		
		System.out.println("음식을 받기 원하는 시각");
		System.out.print("시 : ");
		int hour = Integer.parseInt(scan.nextLine());
		System.out.print("분 : ");
		int min = Integer.parseInt(scan.nextLine());
		int sum = hour*60+min;
		System.out.printf("짜장면 : %d시 %d분\n",(sum-10)/60,(sum-10)%60);
		System.out.printf("치킨 : %d시 %d분\n",(sum-18)/60,(sum-18)%60);
		System.out.printf("피자 : %d시 %d분\n",(sum-25)/60,(sum-25)%60);
	}

	private static void m4() {
		
//		아빠와 딸의 생일을 입력받아 아빠가 딸보다 며칠을 더 살았는지 출력하시오.
//
//		입력
//
//		아빠 생일(년) : 1960 
//		아빠 생일(월) : 5 
//		아빠 생일(일) : 10 
//		딸 생일(년) : 1995 
//		딸 생일(월) : 7 
//		딸 생일(일) : 22 
//		출력
//
//		아빠는 딸보다 총 12,856일을 더 살았습니다.
		
		System.out.print("아빠 생일(년) : ");
		int year = Integer.parseInt(scan.nextLine());
		System.out.print("아빠 생일(월) : ");
		int month = Integer.parseInt(scan.nextLine());
		System.out.print("아빠 생일(일) : ");
		int day = Integer.parseInt(scan.nextLine());
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month);
		c.set(Calendar.DATE, day);
		
		Calendar c1 = Calendar.getInstance();
		System.out.print("딸 생일(년) : ");
		int year1 = Integer.parseInt(scan.nextLine());
		System.out.print("딸 생일(월) : ");
		int month1 = Integer.parseInt(scan.nextLine());
		System.out.print("딸 생일(일) : ");
		int day1 = Integer.parseInt(scan.nextLine());
		c1.set(Calendar.YEAR, year1);
		c1.set(Calendar.MONTH, month1);
		c1.set(Calendar.DATE, day1);
		
		System.out.printf("아빠는 딸보다 총 %,3d일을 더 살았습니다.",(c1.getTimeInMillis()-c.getTimeInMillis())/(1000*60*60*24));
		
	}

	private static void m3() {
		
//		남녀 커플의 이름과 만난날을 입력받아 기념일을 출력하시오.
//
//		입력
//
//		남자 이름 : 홍길동 
//		여자 이름 : 호호호 
//		만난날(년) : 2019 
//		만난날(월) : 2 
//		만난날(일) : 1 
//		출력
//
//		'홍길동'과(와) '호호호'의 기념일
//		 100일 : 2020-XX-XX
//		 200일 : 2020-XX-XX
//		 300일 : 2020-XX-XX
//		 500일 : XXXX-XX-XX
//		1000일 : XXXX-XX-XX
		
		System.out.print("남자 이름 : ");
		String name = scan.nextLine();
		System.out.print("여자 이름 : ");
		String name1 = scan.nextLine();
		System.out.print("만난날(년) : ");
		int year = Integer.parseInt(scan.nextLine());
		System.out.print("만난날(월) : ");
		int month = Integer.parseInt(scan.nextLine());
		System.out.print("만난날(일) : ");
		int day = Integer.parseInt(scan.nextLine());
		
		Calendar now = Calendar.getInstance();
		now.set(Calendar.YEAR, year);
		now.set(Calendar.MONTH, month);
		now.set(Calendar.DATE, day);
		System.out.printf("'%s'와 '%s'의 기념일\n",name,name1);
		now.add(Calendar.DATE, 100);
		System.out.printf("100일 : %tF\n",now);
		now.add(Calendar.DATE, 100);
		System.out.printf("200일 : %tF\n",now);
		now.add(Calendar.DATE, 100);
		System.out.printf("300일 : %tF\n",now);
		now.add(Calendar.DATE, 100);
		System.out.printf("500일 : %tF\n",now);
		now.add(Calendar.DATE, 100);
		System.out.printf("1000일 :%tF\n",now);
		
	}

	private static void m2() {
		
//		태어난 년도를 입력하면 나이를 출력하시오.
//
//		입력
//
//		태어난 년도 : 1995 
//		출력
//
//		나이 : 25세
//		조건
//
//		실행하는 현재 년도를 기준으로 하시오.
//		우리나라 나이로 출력하시오.
		
		System.out.print("태어난 년도 : ");
		int year = scan.nextInt();
		Calendar now = Calendar.getInstance();
		
		System.out.printf("나이 : %s",now.get(Calendar.YEAR)-year+1);
		
	}

	private static void m1() {
		
//		오늘 태어난 아이의 백일과 첫돌이 언제인지 출력하시오.
//
//		입력
//
//		없음
//		출력
//
//		백일 : 2019-05-07
//		첫돌 : 2020-02-06
		
		Calendar c = Calendar.getInstance();
		Calendar c1 = Calendar.getInstance();
		c.add(Calendar.DATE, 100);
		System.out.printf("백일 : %tF\n",c);
		c1.add(Calendar.MONTH, 12);
		System.out.printf("첫돌 : %tF\n",c1);
	}

	private static void nowTime() {
		
//		아래의 코드를 참고해서 현재 시간을 출력하는 메소드 선언하고 호출하시오.
//
//		입력
//
//		없음
//		호출
//
//		nowTime();
//		출력
//
//		현재 시간 : 10시 30분 25초
//		메소드 서명
//
//		void nowTime()
//		추가 조건
//
//		현재 시간을 오전/오후로 출력하시오.
//		void nowTime_AMPM()
//		14시 30분 25초 → 오후 2시 30분 25초
		
		Calendar now = Calendar.getInstance();
		System.out.printf("현재 시간 : %s %s시 %s분 %s초\n",now.get(Calendar.AM_PM)==0?"오전":"오후",now.get(Calendar.HOUR_OF_DAY)-12,now.get(Calendar.MINUTE),now.get(Calendar.SECOND));
	}
	
	
}
