package com.test.java;

import java.util.Scanner;

public class Ex002 {
	
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
		m9();
	}
	
	private static void m9() {
		
//		사과 나무가 있다. 사과 나무 씨앗을 심을 날로부터 특정 시간이 흘렀을 때 사과 총 몇개가 열리는지 구하는 메소드를 선언하시오. 메소드 인자값/반환값.
//
//		입력
//
//		맑은 날 : 20 
//		흐린 날 : 16 
//		출력
//
//		사과가 총 3개 열렸습니다.
//		메소드 서명
//
//		int getApple(int, int)
//		조건
//
//		사과 나무를 처음 심었을 때 나무의 길이 : 0m
//		맑은 날 사과 나무의 성장률 : 5㎝
//		흐린 날 사과 나무의 성잘률 : 2㎝
//		사과 나무는 길이가 1m 넘는 시점부터 사과가 열린다.
//		1m 넘는 시점부터 10㎝ 자랄 때마다 사과가 1개씩 열린다.
		
		System.out.print("맑은 날 : ");
		int clean = Integer.parseInt(scan.nextLine());
		System.out.print("흐린 날 : ");
		int cloudy = Integer.parseInt(scan.nextLine());
		System.out.printf("사과가 총 %d개 열렸습니다.",getApple(clean,cloudy));
		
	}

	private static int getApple(int clean, int cloudy) {
		
		return ((cloudy*2+clean*5)-100)/10;
	}

	private static void m8() {
		
//		지하철 탑승 소요 시간을 구하시오. 지나가는 역의 개수, 환승역의 횟수 등을 전달 받아 총 걸리는 시간을 반환하는 메소드를 선언하고 호출하시오. 메소드 인자값/반환값.
//
//		입력
//
//		역의 개수 : 15 
//		환승역의 횟수 : 1 
//		출력
//
//		총 소요 시간은 33분입니다.
//		메소드 서명
//
//		int getTime(int, int)
//		조건
//
//		각 역간의 소요 시간 : 2분
//		환승역의 소요 시간 : 3분
//		추가 조건
//
//		시간대에 따라 환승 소요 시간을 달리하시오.
//		평상 : 3분
//		출근 : 4분
//		퇴근 : 5분
		System.out.print("역의 개수 : ");
		int n1 = Integer.parseInt(scan.nextLine());
		System.out.print("역의 개수 : ");
		int n2 = Integer.parseInt(scan.nextLine());
		System.out.print("시간대 : ");
		String time = scan.nextLine();
		System.out.printf("총 소요 시간은 %d분입니다.",getTime(n1,n2,time));
		
	}

	private static int getTime(int n1, int n2, String time) {
		
		return time.equals("평상")?n1*2+n2*3:(time.equals("출근")?n1*2+n2*4:(time.equals("퇴근")?n1*2+n2*5:-1));
	}

	private static void m7() {
		
//		국어, 영어, 수학 점수를 전달하면 '합격' 혹은 '불합격'이라는 단어를 반환하는 메소드를 선언하고 호출하시오. 메소드 인자값/반환값.
//
//		입력
//
//		국어 : 80 
//		영어 : 75 
//		수학 : 60 
//		출력
//
//		(불)합격입니다.
//		메소드 서명
//
//		String test(int, int, int)
//		int, int, int : 국어, 영어, 수학
//		return String : '합격' or '불합격'
//		조건
//
//		평균 점수 60점 이상은 '합격'이다.
//		평균 점수 60점 미만은 '불합격'이다.
//		추가 조건
//
//		과락 있음 → 한 과목 이상 40점 미만이면 불합격이다.
		
		System.out.print("국어 : ");
		int kor = Integer.parseInt(scan.nextLine());
		System.out.print("영어 : ");
		int eng = Integer.parseInt(scan.nextLine());
		System.out.print("수학 : ");
		int math = Integer.parseInt(scan.nextLine());
		
		System.out.printf("%s입니다.",test(kor,eng,math));
		
	}

	private static String test(int kor, int eng, int math) {
		return (kor < 40 || eng < 40 || math <40)?"과락":((kor+eng+math)/3 >= 60 && (kor >= 40 && eng >=40 && math >=40) ? "합격":"불합격");
	}

	private static void m6() {
//		숫자를 전달하면 '짝수' 혹은 '홀수' 라는 단어를 반환하는 메소드를 선언하고 호출하시오. 메소드 인자값/반환값.
		System.out.print("숫자 : ");
		int n = Integer.parseInt(scan.nextLine());
		System.out.printf("입력하신 숫자 '%d'는 '%s'입니다.",n,(n%2==0)?"짝수":"홀수");
		
	}

	private static void m5() {
//		숫자를 2개 입력받아 산술 결과를 반환하는 메소드 5개를 선언하고 호출하시오. 메소드 인자값/반환값.
		System.out.print("첫번쨰 숫자 : ");
		int n1 = Integer.parseInt(scan.nextLine());
		System.out.print("두번쨰 숫자 : ");
		int n2 = Integer.parseInt(scan.nextLine());
		int result = 0;
		double result1 = 0;
		result = add(n1, n2); 
		System.out.println(result);
		result = add(n1, n1);
		System.out.println(result);

		result = substract(n1, n2);
		System.out.println(result);

		result = multiply(n1, n2);
		System.out.println(result);
		result = multiply(n1, n1);
		System.out.println(result);

		result1 = divide(n1, n2);
		System.out.println(result1);

		result = mod(n1, n2);
		System.out.println(result);
		
	}

	private static void m4() {
//		이름을 전달하면 이름뒤에 '님'을 붙여서 반환하는 메소드를 선언하고 호출하시오. 메소드 인자값/반환값.
		System.out.print("이름 : ");
		String name = scan.nextLine();
		name = getName(name);
		System.out.printf("고객 : %s\n",name);
		
	}

	private static String getName(String name) {
		return name + "님";
	}

	private static void m3() {
		
//		숫자를 2개 입력받아 산술 연산을 각각하는 메소드 5개를 선언하고 호출하시오.
//
//		입력
//
//		첫번째 숫자 : 5 
//		두번째 숫자 : 3 
//		호출
		
		System.out.print("첫번쨰 숫자 : ");
		int n1 = Integer.parseInt(scan.nextLine());
		System.out.print("두번쨰 숫자 : ");
		int n2 = Integer.parseInt(scan.nextLine());
		
		add(n1, n2);
		add(n1, n1);

		substract(n1, n2);

		multiply(n1, n2);
		multiply(n1, n1);

		divide(n1, n2);

		mod(n1, n2);
		
		System.out.printf("%d + %d = %d\r\n",n1,n2,add(n1,n2));
		System.out.printf("%d + %d = %d\r\n",n1,n2,add(n1,n1));
		System.out.printf("%d - %d = %d\r\n",n1,n2,substract(n1,n2));
		System.out.printf("%d * %d = %d\r\n",n1,n2,multiply(n1,n2));
		System.out.printf("%d * %d = %d\r\n",n1,n2,multiply(n1,n1));
		System.out.printf("%d / %d = %.1f\r\n",n1,n2,divide(n1,n2));
		System.out.printf("%d %% %d = %d\r\n",n1,n2,mod(n1,n2));
		
	}
	
	private static int add(int n1, int n2) {	
		return n1 + n2;
	}
	
	private static int substract(int n1, int n2) {	
		return n1 - n2;
	}
	
	private static int multiply(int n1, int n2) {	
		return n1 * n2;
	}
	
	private static double divide(int n1, int n2) {	
		return (double)Math.round((double)n1 / n2*10)/10;
	}
	
	private static int mod(int n1, int n2) {	
		return n1 % n2;
	}
	
	private static void m2() {
//		숫자 1개를 입력받아 4자리로 출력하는 메소드를 선언하고 호출하시오.
		System.out.print("숫자 입력 : ");
		int num1 = Integer.parseInt(scan.nextLine());
		digit(num1);
	}

	private static void digit(int num1) {
		System.out.printf("%d -> %04d",num1,num1);
	}

	private static void m1() {
		
//		호출하면 인사말을 출력하는 메소드 3개를 선언하고 호출하시오.
//
//		입력
//
//		없음
//		호출
//
//		hello();
//		introduce();
//		bye();
//		출력
//
//		안녕하세요. //hello()
//		저는 홍길동입니다. //introduce()
//		안녕히가세요. //bye()
//		메소드 서명
//
//		void hello()
//		void introduce()
//		void bye()
		
		hello();
		introduce();
		bye();
	}
	
	private static void bye() {
		System.out.println("안녕히가세요.");
	}

	private static void introduce() {
		System.out.println("저는 홍길동입니다.");
	}

	private static void hello() {
		System.out.println("안녕하세요.");
	}
	
}
