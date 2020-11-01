package com.test.java;

import java.util.Calendar;
import java.util.Scanner;

public class Ex006 {
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
		//m11();
		//m12();
		//m13();
		//m14();
		//m15();
		//m16();
		//m17();
		//m18();
		m19();
		
	}

	private static void m19() {
		
//		숫자를 2개 입력받아 각각의 약수와 두 숫자의 공약수를 구하시오.
//
//		입력
//
//		첫번째 숫자 : 12 
//		두번째 숫자 : 8 
//		출력
//
//		12의 약수 : 1, 2, 3, 4, 6, 12
//		8의 약수 : 1, 2, 4, 8
//		12와 8의 공약수 : 1, 2, 4
//		도움
//
//		공약수 : 둘 이상의 정수에 공통된 약수
		
		System.out.print("첫번째 숫자 : ");
		int n1 = Integer.parseInt(scan.nextLine());
		System.out.print("두번째 숫자 : ");
		int n2 = Integer.parseInt(scan.nextLine());
		String result1 = "";
		String result2 = "";
		String result3 = "";
		
		for(int i=1;i<=n1;i++) {
			if(n1%i==0) {
				result1+=i+", ";
			}
		}
		
		for(int i=1;i<=n1;i++) {
			if(n2%i==0) {
				result2+=i+", ";
			}
		}
		
		int min = 0;
		if(n1>n2) {
			min = n2;
		} else {
			min = n1;
		}
		for(int i=1;i<=min;i++) {
			if(n1%i==0 && n2%i==0) {
				result3+=i+", ";
			}
		}
		System.out.printf("%d의 약수 : %s\n",n1,result1);
		System.out.printf("%d의 약수 : %s\n",n2,result2);
		System.out.printf("%d와 %d의 약수 : %s\n",n1,n2,result3);
	}

	private static void m18() {
		
//		1부터 100사이의 완전수를 구하시오.
//
//		입력
//
//		없음
//		출력
//
//		6 = [1, 2, 3]
//		28 = [1, 2, 4, 7, 14]
//		도움
//
//		약수 : 어떤 수나 식을 나누어 나머지가 없이 떨어지는 수
//		완전수 : 자기 자신을 제외한 나머지 약수들의 합이 자신과 동일한 수
		
		int sum = 0;
		String result = "";
		for(int i=1;i<=100;i++) {
			sum = 0;
			result="";
			for(int j=1;j<i;j++) {
				if(i%j==0) {
					result+=j+",";
					sum+=j;
				}
			}
			if(sum==i) {
				System.out.printf("%d = [%s]\n",i,result);
			}
		}
	}

	private static void m17() {
		
//		2부터 100사이의 소수를 구하시오.
//
//		입력
//
//		없음
//		출력
//
//		2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
//		도움
//
//		소수 : 1과 자기자신으로밖에 나눠지지 않는 수
		
		int cnt = 0;
		String result = "";
		for(int i=2;i<=100;i++) {
			cnt=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					cnt++;
					break;
				}
			}
			if(cnt==0) {
				result+=i+", ";
			}
		}
		System.out.println(result);
	}

	private static void m16() {
		
//		아래와 같이 출력하시오.
//
//		입력
//
//		없음
//		출력
//
//		1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 + 34 + 55 + 89 = 232
//		조건
//
//		N이 100이 넘기 전까지 출력하시오.
		
		int sum = 1;
		int a = 1;
		int b = 1;
		int c = 0;
		String result = sum+"";
		while(true) {
			result+=" + "+b;
			sum+=b;
			c=a+b;
			a=b;
			b=c;
			if(c>100) {
				break;
			}
		}
		System.out.printf("%s = %d",result,sum);
	}

	private static void m15() {
		
//		아래와 같이 출력하시오.
//
//		입력
//
//		없음
//		출력
//
//		1 + 2 + 4 + 7 + 11 + 16 + ... + N = 469
//		조건
//
//		N이 100이 넘기 전까지 출력하시오.
		
		
		int sum = 1;
		int cnt = 1;
		int num = 1;
		String result = sum+"";
		while(true) {
			
			num += cnt;
			result+=" + "+num;
			sum+=num;
			cnt++;
		
			if(sum>=469) {
				break;
			}
		}
		System.out.printf("%s = %d",result,sum);
	}

	private static void m14() {
		
//		최대 9자리 정수를 입력받아 각자리의 홀수 숫자합과 짝수 숫자합을 구하시오.
//
//		입력
//
//		9자리 숫자 입력 : 273645281 
//		출력
//
//		짝수의 합 : 22
//		홀수의 합 : 16
//		조건
//
//		9자리가 넘어가면 동작 금지
//		9자리 이하는 동작 가능
//		도움
//
//		Math.pow() 메소드 사용(제곱값 구하는 메소드)
//		Math.pow(10, 2) → 100
//		Math.pow(10, 3) → 1000
//		Math.pow(10, 4) → 10000
		int even = 0;
		int odd = 0;
		System.out.print("9자리 숫자 입력 : ");
		int num = Integer.parseInt(scan.nextLine());
		if(num > 0 && num < 1000000000) {
			for(int i=0;i<10;i++) {
				if((int)((num/Math.pow(10, i))%10)%2==0) {
					even+=(int)((num/Math.pow(10, i))%10);
				} else {
					odd+=(int)((num/Math.pow(10, i))%10);
					
				}
			}
			System.out.printf("짝수의 합 : %d\n",even);
			System.out.printf("홀수의 합 : %d\n",odd);
		}
	}

	private static void m13() {
//		컴퓨터가 1~10 사이의 숫자 1개를 생각하면 사용자가 맞추는 프로그램을 구현하시오.
//
//		입출력
//
//		컴퓨터가 1~10 사이의 숫자를 1개 생각했습니다.
//
//		숫자 : 1 
//		틀렸습니다.
//
//		숫자 : 3 
//		틀렸습니다.
//
//		숫자 : 7 
//		틀렸습니다.
//
//		숫자 : 2 
//		틀렸습니다.
//
//		숫자 : 5 
//		맞췄습니다.
//
//		컴퓨터가 생각한 숫자는 5입니다.
//		정답을 맞추는데 시도한 횟수는 5회입니다.
//
//		프로그램을 종료합니다.
		
		int cnum = (int)(Math.random()*10)+1;
		
		while(true) {
			System.out.print("숫자 : ");
			int num = Integer.parseInt(scan.nextLine());
			if(num==cnum) {
				System.out.println("맞췄습니다.");
				break;
			} else if(num!=cnum) {
				System.out.println("틀렸습니다.");
			}
			
		}
		
	}

	private static void m12() {
		
//		숫자를 10개 입력받아 한글로 변환 후 출력하시오.
//
//		입력
//
//		숫자 : 5 
//		숫자 : 7 
//		숫자 : 4 
//		숫자 : 3 
//		숫자 : 5 
//		숫자 : 7 
//		숫자 : 6 
//		숫자 : 2 
//		숫자 : 1 
//		숫자 : 3 
//		출력
//
//		결과 : 오칠사삼오칠육이일삼
//		조건
//
//		2자리 이상 숫자를 입력하면 결과없이 프로그램을 중지시키시오.
		
		String result = "";
		for(int i = 0 ; i < 10; i++) {
			System.out.print("숫자 : ");
			int num = Integer.parseInt(scan.nextLine());
			if(num > 0 && num < 1000) {
				switch(num) {
				case 1 :
					result += "일";
				break;
				case 2:
					result += "이";
				break;
				case 3:
					result += "삼";
				break;
				case 4:
					result += "사";
				break;
				case 5:
					result += "오";
				break;
				case 6:
					result += "육";
				break;
				case 7:
					result += "칠";
				break;
				case 8:
					result += "팔";
				break;
				case 9:
					result += "구";
				break;
					
				}
			}
		}
		System.out.println(result);
	}

	private static void m11() {
//		요구사항.011
//		사용자가 입력한 범위의 숫자까지 369 게임의 결과를 출력하시오.
//
//		입력
//
//		최대 숫자 : 100 
//		출력
//
//		1   2   짝   4   5   짝 .. 100
//		조건
//
//		최대 3자리까지만 입력하시오.
		System.out.print("최대 숫자 : ");
		int eenum = Integer.parseInt(scan.nextLine());
		String result = "";
	
		if(eenum>0 && eenum < 10000) {
				for(int i=1;i<=eenum;i++) {
					int cnt = 0;
					int one = i%10;
					int two = (i/10)%10;
					int three = (i/100)%10;
					String cc = "";
					if(one == 3 || one == 6 || one == 9) {
						cnt++;
					} 
					if(two == 3 || two == 6 || two == 9) {
						cnt++;
					} 
					if(three == 3 || three == 6 || three == 9) {
						cnt++;
					} 
					if(cnt!=0) {
						for(int j=0;j<cnt;j++) {
							System.out.print("짝");
						}
					}
					
					if(cnt==0) {
						System.out.print(i);
					}
					System.out.print(" ");
			}
			
		}
	
	}

	private static void m10() {
		
//		요구사항.010
//		서기 1년 1월 1일부터 오늘까지 며칠째인지 합을 구하시오.
//
//		입력
//
//		없음
//		출력
//
//		2019년 2월 12일은 4,567,890일째 되는 날입니다.
//		조건
//
//		Calendar, Date 사용 금지
//		추가조건
//
//		오늘이 무슨 요일인가?
		
		int year = 1;
		int month = 1;
		int day = 1;
		//int sday = year*365+1;
		//평년 28일
		//윤년 29일 
		//2월 달이아닌 나머지 달이 31일 
		//2019x12
		//2019 x 365
		//+1 366
//		a. 년도를 4로 나눈다.
//		떨어지면 b 검사
//		떨어지지 않으면 "평년"
//		b. 년도를 100으로 나눈다.
//		떨어지면 c 검사
//		떨어지지 않으면 "윤년"
//		c. 년도를 400으로 나눈다.
//		떨어지면 "윤년"
//		떨어지지 않으면 "평년"
		
		int sday = 0;
		
		for(year=1;year<=2019;year++){
			sday += 365;
			if (year % 4 == 0) {
				if (year % 100 == 0) {
					if (year % 400 == 0) {
						sday += 1;
					} else {
					}
				} else {
					sday += 1;
				}
			} 
		}
		
		for(month=1;month<10;month++) {
			switch (month) {
			case 2:
				if(year%4==0) {
					if(year%100==0) {
						if(year%400==0) {
							sday+=29;
						} else {
							sday+=28;
						}
					} else {
						sday+=29;
					}
				} else {
					sday+=28;
				}
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				sday += 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				sday += 30;
				break;
			}
		}
		
		sday+=31;
		
		System.out.printf("2020년 10월 31일은 %,d일째 되는 날입니다.\n",sday);
		System.out.println(sday%7);
		
		Calendar before = Calendar.getInstance();
		Calendar now = Calendar.getInstance();
		before.set(1,0,1);
		now.set(2020,9,31);
		System.out.println();
		System.out.printf("%,d\n",(now.getTimeInMillis()-before.getTimeInMillis())/1000/60/60/24);
		System.out.printf("%,d",((now.getTimeInMillis()-before.getTimeInMillis())/1000/60/60/24)%7);
		
	}

	private static void m9() {
		
//		숫자를 N개 입력받아 아래와 같이 출력하시오.
//
//		입력
//
//		숫자 : 4 
//		숫자 : 7 
//		..
//		숫자 : 15 
//		숫자 : 12 
//		출력
//
//		4 - 7 + .. - 15 + 12 = 1XX
//		조건
//
//		누적값이 100을 넘어가는 순간 루프를 종료하시오.
//		짝수는 더하고 홀수는 빼시오.
//		추가조건
//
//		루프를 종료할 누적값을 사용자가 입력할 수 있도록 하시오.
		
		System.out.print("종료 : ");
		int ennum = Integer.parseInt(scan.nextLine());
	
		System.out.print("숫자 : ");
		int num = Integer.parseInt(scan.nextLine());
		int sum = 0;
		sum = num;
		String result = sum+"";
		while(true) {
			if(sum>ennum) {
				break;
			} else {
			System.out.print("숫자 : ");
			int num1 = Integer.parseInt(scan.nextLine());
				if(num1%2==0) {
					result+=" + "+num1;
					sum+=num1;
				} else {
					result+=" - "+num1;
					sum-=num1;
				}
			}
		}
		
		System.out.printf("%s = %d",result,sum);
	}

	private static void m8() {
		
//		입력
//
//		없음
//		출력
//
//		1 + 2 + 3 + 4 + 5 + ... + XX = 10XX
//		조건
//
//		누적값이 1000을 넘어가는 순간 루프를 종료하시오.
//		추가조건
//
//		루프를 종료할 누적값을 사용자가 입력할 수 있도록 하시오.
		
		int num = 1;
		int sum = 0;
		String result = "";
		while(true) {
			if(sum>1000) {
				break;
			} else {
				result+=num+"+";
				sum+=num;
				num++;
			}
		}
		System.out.printf("%s = %d",result,sum);
	}

	private static void m7() {
//		문장을 입력받아 출력하시오. 이 행동을 반복하시오.
//
//		입력
//
//		아래에 입력하세요.
//		안녕하세요. 
//		저는 홍길동입니다. 
//		반갑습니다. 
//
//		출력
//
//		안녕하세요.
//		저는 홍길동입니다.
//		반갑습니다.
//		프로그램을 종료합니다.
//		조건
//
//		아무것도 입력하지 않고 엔터를 치면 입력 종료를 하시오.
		
	
		System.out.println("아래에 입력하세요.");
		while(true) {
			String line = scan.nextLine();
			if(line.equals("")) {
				break;
			}
		}
	}

	private static void m6() {
//		아래와 같이 출력하시오.
//
//		입력
//
//		없음
//		출력
//
//		1 - 2 + 3 - 4 + 5 - 6 + 7 - 8 + 9 - 10 = -5
//		추가조건
//
//		시작/종료 숫자를 사용자에게 입력받아 출력하시오.
		
		System.out.print("시작 : ");
		int sn = Integer.parseInt(scan.nextLine());
		System.out.print("종료 : ");
		int en = Integer.parseInt(scan.nextLine());
		String result = "";
		int sum = 0;
		int cnt = 0;
		for(int i=sn;i<=en;i++) {
			if(cnt%2==0) {
				sum+=i;
				result+=i+" - ";
			} else {
				sum-=i;
				result+=i+" + ";
			}
			cnt++;
		}
		System.out.printf("%s = %d",result,sum);
		
	}

	private static void m5() {
//		요구사항.005
//		아래와 같이 출력하시오.
//
//		입력
//
//		없음
//		출력
//
//		1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
//		추가조건
//
//		시작/종료 숫자를 사용자에게 입력받아 출력하시오.
		System.out.print("시작 : ");
		int sn = Integer.parseInt(scan.nextLine());
		System.out.print("종료 : ");
		int en = Integer.parseInt(scan.nextLine());
		String result = "";
		int sum = 0;
		for(int i=sn;i<=en;i++) {
			sum+=i;
			result+=i+" + ";
		}
		System.out.printf("%s = %d",result,sum);
	}

	private static void m4() {
//		숫자 10개를 입력받아 짝수의 합과 홀수의 합을 각각 출력하시오.
//
//		입력
//
//		숫자 : 5 
//		숫자 : 2 
//		숫자 : 12 
//		..
//		숫자 : 7 
//		숫자 : 24 
//		출력
//
//		짝수의 합 : 52
//		홀수의 합 : 42
//		조건
//
//		천단위 출력하시오.
//		추가조건
//
//		입력받을 숫자의 개수도 입력받으시오.
		int odd = 0;
		int even = 0;
		System.out.print("숫자 개수 : ");
		int cnt = Integer.parseInt(scan.nextLine());
		for(int i=0;i<cnt;i++) {
			System.out.print("숫자 : ");
			int n = Integer.parseInt(scan.nextLine());
			if(n % 2 == 0) {
				even+=n;
			} else {
				odd+=n;
			}
		}
		System.out.printf("짝수의 합 : %d\n",even);
		System.out.printf("홀수의 합 : %d",odd);
	}

	private static void m3() {
//		요구사항.003
//		숫자 1개를 입력받아 1부터 입력한 숫자까지의 합을 출력하시오.
//
//		입력
//
//		숫자 : 5 
//		출력
//
//		1 ~ 5 = 15
//		조건
//
//		천단위 출력하시오.
		System.out.print("숫자 : ");
		int num = Integer.parseInt(scan.nextLine());
		int sum = 0;
		for(int i=1;i<=num;i++) {
			sum+=i;
		}
		System.out.printf("1 ~ %d = %,3d",num,sum);
		
	}

	private static void m2() {
		
//		숫자 2개를 입력 받아 시작 숫자에서 종료 숫자까지 1씩 증가하며 출력하시오.
//
//		입력
//
//		시작 숫자 : 5 
//		종료 숫자 : 12 
//		출력
//
//		5
//		6
//		7
//		8
//		9
//		10
//		11
//		12
//		추가 조건
//
//		증가치도 입력받으시오.
		
		System.out.print("시작 숫자 : ");
		int sn = Integer.parseInt(scan.nextLine());
		System.out.print("종료 숫자 : ");
		int en = Integer.parseInt(scan.nextLine());
		
		for(int i=sn;i<=en;i++) {
			System.out.println(i);
		}
		
	}

	private static void m1() {
		
//		사용자의 이름과 인사할 횟수를 입력 받아 출력하시오.
//
//		입력
//
//		이름 : 홍길동 
//		횟수 : 3 
//		출력
//
//		홍길동님 안녕하세요~
//		홍길동님 안녕하세요~
//		홍길동님 안녕하세요~
		
		System.out.print("이름 : ");
		String name = scan.nextLine();
		System.out.print("횟수 : ");
		int cnt = Integer.parseInt(scan.nextLine());
		for(int i=0;i<cnt;i++) {
			System.out.printf("%s님 안녕하세요~\n",name);
		}
	}
}
