package com.test.java;

import java.util.Calendar;
import java.util.Scanner;

public class Ex005 {
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
		//m10();
		m11();
	}

	private static void m11() {
		
//		숫자를 입력하면 자바의 숫자 자료형 중 어느것에 속하는지 알아내시오.
//
//		입력
//
//		숫자 입력 : 10000 
//		출력
//
//		int
//		long
//		조건
//
//		입력 숫자의 범위 : +-19자리 이내(long 길이를 벗어나지 말 것) */
		
		System.out.print("숫자 입력 : ");
		String sn = scan.nextLine();
		
		if(sn.length()<=19) {
			int n = Integer.parseInt(sn);
			if(n<=Byte.MAX_VALUE && n>=Byte.MIN_VALUE) {
				System.out.println("Byte형");
			} else if(n<=Short.MAX_VALUE && n>=Short.MIN_VALUE) {
				System.out.println("Short형");
			} else if(n<=Long.MAX_VALUE && n>=Long.MIN_VALUE) {
				System.out.println("Long형");
			} else if(n<=Integer.MAX_VALUE && n>=Integer.MIN_VALUE) {
				System.out.println("Integer형");
			} 
		} else {
			System.out.println("숫자가 long형의 길이를 벗어납니다.");
		}
		
	}

	private static void m10() {
		
//		근무 년수를 입력받아 아래와 같이 출력하시오.
//
//		입력
//
//		근무 년수 : 5 
//		출력
//
//		5년차 중급 개발자입니다.
//		당신은 1년전까지 초급 개발자였습니다.
//		앞으로 5년 더 근무를 하면 고급 개발자가 됩니다. 
//		조건
//
//		1 ~ 4년차 : 초급 개발자
//		5 ~ 9년차 : 중급 개발자
//		10년차 이상 : 고급 개발자
		
		String word = null;
		System.out.print("근무 년수 : ");
		int year = Integer.parseInt(scan.nextLine());
		if(year >= 1 && year <= 4) {
			word = "초급";
			System.out.printf("%d년차 %s 개발자입니다.\n",year,word);
			System.out.printf("앞으로 %d년 더 근무를 하면 %s 개발자가 됩니다.\n",5-year,"중급");
		} else if(year >= 5 && year <= 9) {
			word = "중급";
			System.out.printf("%d년차 %s 개발자입니다.\n",year,word);
			System.out.printf("당신은 %d년전까지 %s 개발자였습니다.\n",year-4,word);
			System.out.printf("앞으로 %d년 더 근무를 하면 %s 개발자가 됩니다.\n",10-year,"고급");
		} else if(year >= 10) {
			word = "고급";
			System.out.printf("%d년차 %s 개발자입니다.\n",year,word);
			System.out.printf("당신은 %d년전까지 %s 개발자였습니다.\n",year-9,"중급");
		}
	}

	private static void m9() {
		
//		날짜를 입력받아 아래의 조건에 맞게 결과를 출력하시오.
//
//		입력
//
//		년 : 2019 
//		월 : 2 
//		일 : 11 
//		출력
//
//		입력하신 날짜는 '평일'입니다.
//		해당 주의 토요일로 이동합니다.
//		이동한 날짜는 '2019-02-16' 입니다.
//		입력
//
//		년 : 2019 
//		월 : 2 
//		일 : 17 
//		출력
//
//		입력하신 날짜는 '휴일'입니다.
//		결과가 없습니다.
//		조건
//
//		입력받은 날짜가 평일이면 해당 주의 토요일을 알아낸다.
//		입력받은 날짜가 휴일이면 아무것도 안한다.
		
		System.out.print("년 : ");
		int year = Integer.parseInt(scan.nextLine());
		System.out.print("월 : ");
		int month = Integer.parseInt(scan.nextLine());
		System.out.print("일 : ");
		int day = Integer.parseInt(scan.nextLine());
		
		//DAY_OF_WEEK // 요일, (1(일)~7(토))
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month-1);
		c.set(Calendar.DATE, day);
		if(c.DAY_OF_WEEK!=1 || c.DAY_OF_WEEK!= 7) {
			c.add(Calendar.DATE, 7-c.get(Calendar.DAY_OF_WEEK));
			System.out.printf("입력하신 날짜는 '평일'입니다.\n");
			System.out.printf("해당주의 토요일로 이동합니다.\n");
			System.out.printf("이동한 날짜는 '%tF'입니다.\n",c);
		}
		
	}

	private static void m8() {
		
//		년도를 입력받아 해당 년도가 '평년' 인지 '윤년' 인지 출력하시오.
//
//		입력
//
//		년도 입력 : 2019 
//		출력
//
//		2019년은 '평년'입니다.
//		조건
//
//		a. 년도를 4로 나눈다.
//		떨어지면 b 검사
//		떨어지지 않으면 "평년"
//		b. 년도를 100으로 나눈다.
//		떨어지면 c 검사
//		떨어지지 않으면 "윤년"
//		c. 년도를 400으로 나눈다.
//		떨어지면 "윤년"
//		떨어지지 않으면 "평년"
//		Calendar, Date 클래스 사용 금지
		String word = null;
		System.out.print("년도 입력 : ");
		int year = Integer.parseInt(scan.nextLine());
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					word = "윤년";
				} else {
					word = "평년";
				}
			} else {
				word="윤년";
			}
		} else {
			word="평년";
		}
		System.out.printf("%d년은 '%s'입니다.",year,word);
	}

	private static void m7() {
		
//		주차 요금을 계산하시오.
//
//		입력
//
//		[들어온 시간]
//		시 : 13 
//		분 : 30 
//		[나간 시간]
//		시 : 14 
//		분 : 20 
//		출력
//
//		주차 요금은 4,000원입니다.
//		조건
//
//		무료 주차 : 30분
//		초과 10분당 : 2,000원
//		Calendar를 사용해서 한번 풀고, 사용하지 말고 한번 푸시오.
		
		System.out.print("[들어온 시간]\n");
		System.out.print("시 : ");
		int hour = Integer.parseInt(scan.nextLine());
		System.out.print("분 : ");
		int min = Integer.parseInt(scan.nextLine());
		
		System.out.print("[나간 시간]\n");
		System.out.print("시 : ");
		int hour1 = Integer.parseInt(scan.nextLine());
		System.out.print("분 : ");
		int min1 = Integer.parseInt(scan.nextLine());
		int sum = hour*60+min;
		int sum1 = hour1*60+min1;
		System.out.printf("주차 요금은 %,3d원입니다.\n",(sum1-sum-30)/10*2000);
		
		Calendar before = Calendar.getInstance();
		Calendar after = Calendar.getInstance();
		before.set(Calendar.HOUR, hour);
		before.set(Calendar.MINUTE, min);
		
		after.set(Calendar.HOUR, hour1);
		after.set(Calendar.MINUTE, min1);
		
		System.out.printf("주차 요금은 %,3d원입니다.\n",((after.getTimeInMillis()-before.getTimeInMillis())/(1000*60)-30)/10*2000);
		
	}

	private static void m6() {
		
//		숫자 5개를 입력받아 짝수와 홀수의 개수를 출력하시오.
//
//		입력
//
//		숫자 입력 : 3 
//		숫자 입력 : 2 
//		숫자 입력 : 7 
//		숫자 입력 : 1 
//		숫자 입력 : 8 
//		출력
//
//		짝수는 2개 홀수는 3개 입력했습니다.
//		홀수가 짝수보다 1개 더 많습니다.
//		조건
//
//		1 ~ 10 사이의 정수만 입력받으시오.
		
		int count = 0;
		int []index = {0,0,0,0,0}; 
		while(count<=4) {
			System.out.print("숫자 입력 : ");
			int num = Integer.parseInt(scan.nextLine());
			if(num>=1 && num <= 10) {
				index[count] = num;
				count++;
			} 
		}
		int odd = 0;
		int even = 0;
		for(int i=0;i<index.length;i++) {
			if(index[i]%2==0) {
				even+=1;
			} else {
				odd+=1;
			}
		}
	
		System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.\n",even,odd);
		System.out.printf("%s가 %s보다 %d개 더 많습니다.\n",(even>odd)?"짝수":"홀수",(even>odd)?"홀수":"짝수",(even>odd)?even-odd:odd-even);
	}

	private static void m5() {
		
//		영문자 1개를 입력받아 대/소문자 변환을 한 뒤 출력하시오.
//
//		입력
//
//		문자 : a 
//		출력
//
//		결과 : A
//		입력
//
//		문자 : F 
//		출력
//
//		결과 : f
		
		System.out.print("문자 : ");
		char c = scan.nextLine().charAt(0);
		System.out.printf("%c",c-32);
	}

	private static void m4() {
		
//		문자 1개를 입력받아 아래와 같이 출력하시오.
//
//		입력
//
//		문자 : f 
//		출력
//
//		Father
//		조건
//
//		f, F → Father
//		m, M → Mother
//		s, S → Sister
//		b, B → Brother
		
		System.out.print("문자 : ");
		char c = scan.nextLine().charAt(0);
		String word = null;
		if(c=='f' || c=='F') {
			word="Father";
		} else if(c=='m' || c=='M') {
			word="Mother";
		} else if(c=='b' || c=='B') {
			word="Brother";
		}
		System.out.println(word);
	}

	private static void m3() {
		
//		숫자 2개와 연산자 1개를 입력받아 연산 과정과 결과를 출력하시오.
//
//		입력
//
//		첫번째 숫자 : 5 
//		두번째 숫자 : 3 
//		연산자 : * 
//		출력
//
//		5 * 3 = 15
//		조건
//
//		정수만 입력하시오.
//		연산 결과는 소수이하가 생기면 첫째자리까지 출력 하시오.
//		연산자는 산술 연산자만 입력하시오.
		
		System.out.print("첫번째 숫자 : ");
		int n1 = Integer.parseInt(scan.nextLine());
		System.out.print("두번째 숫자 : ");
		int n2 = Integer.parseInt(scan.nextLine());
		System.out.print("연산자 : ");
		char opp = scan.nextLine().charAt(0);
		if(opp=='*') {
			System.out.printf("%d %c %d = %d",n1,opp,n2,n1*n2);
		} else if(opp=='/') {
			System.out.printf("%d %c %d = %.1f",n1,opp,n2,(double)n1/n2);
		} else if(opp=='-') {
			System.out.printf("%d %c %d = %d",n1,opp,n2,n1-n2);
		} else if(opp=='%') {
			System.out.printf("%d %c %d = %d",n1,opp,n2,n1%n2);
		}
	}

	private static void m2() {
		
//		학생의 국어 점수를 입력받아 성적을 출력하시오.
//
//		입력
//
//		점수 : 85 
//		출력
//
//		입력한 85점은 성적 B입니다.
//		조건
//
//		90 ~ 100 : A
//		80 ~ 89 : B
//		70 ~ 79 : C
//		60 ~ 69 : D
//		0 ~ 59 : F
		
		System.out.print("점수 : ");
		int grade = Integer.parseInt(scan.nextLine());
		char c = 0;
		if(grade>= 90 && grade <= 100) {
			c='A';
		} else if(grade>=80 && grade<=89) {
			c='B';
		} else if(grade>=70 && grade<=79) {
			c='C';
		} else if(grade>=60 && grade<=69) {
			c='D';
		} else {
			c='F';
		}
		System.out.printf("입력한 %d점은 성적 %c입니다.",grade,c);
	}

	private static void m1() {
		
//		숫자 2개를 입력받아 큰수와 작은수를 출력하시오.
//
//		입력
//
//		첫번째 숫자 : 5 
//		첫번째 숫자 : 3 
//		출력
//
//		큰수는 5이고, 작은수는 3입니다.
//		추가조건
//
//		두숫자가 얼마의 차이를 보이는지 출력하시오.
//		입력한 두 숫자는 2가 차이납니다.
		
		System.out.print("첫번째 숫자 : ");
		int n1= Integer.parseInt(scan.nextLine());
		System.out.print("두번째 숫자 : ");
		int n2= Integer.parseInt(scan.nextLine());
		
		if(n1>n2) {
			System.out.printf("큰수는 %d이고, 작은수는 %d입니다.\n",n1,n2);
			System.out.printf("입력한 두 숫자는 %d가 차이납니다.\n",n1-n2);
			
		} else {
			System.out.printf("큰수는 %d이고, 작은수는 %d입니다.\n",n2,n1);
			System.out.printf("입력한 두 숫자는 %d가 차이납니다.\n",n2-n1);
		}
		
	}
	
}
