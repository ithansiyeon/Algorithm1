package com.test.java;

import java.util.Scanner;

public class Ex007 {
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
		
//		아래와 같이 출력하시오.
//
//		입력
//
//		없음
//		출력
//
//		1 ~  10 :   55
//		11 ~  20 : 155
//		..
//		81 ~  90 : 855
//		91 ~ 100 : 955
//		조건
//
//		단일 for문 풀이 가능
//		2중 for문 풀이 가능
		
		int sum = 0;
		
		for(int i=1;i<=100;i++) {
			if(i%10!=0) {
				sum+=i;
			} else if(i%10 == 0) {
				sum+=i;
				System.out.printf("%d ~ %d : %d\n",i-9,i,sum);
				sum=0;
			}
		}
		
	}

	private static void m9() {
		
//		아래와 같이 출력하시오.
//
//		입력
//
//		없음
//		출력
//
//		1 ~  10 :   55
//		1 ~  20 :  210
//		..
//		1 ~  90 : 4095
//		1 ~ 100 : 5050
//		조건
//
//		단일 for문 풀이 가능
//		2중 for문 풀이 가능
		int sum = 0;
		for(int i=1;i<=100;i++) {
			if(i%10!=0) {
				sum+=i;
			} else if(i%10 == 0) {
				sum+=i;
				System.out.printf("1 ~ %d : %d\n",i,sum);
			}
			
		}
		
	}

	private static void m8() {
		
//		입력
//
//		없음
//		출력
//
//		2 x 1 =  2  3 x 1 =  3  4 x 1 =  4  5 x 1 =  5
//		2 x 2 =  4  3 x 2 =  6  4 x 2 =  8  5 x 2 = 10
//		..
//		2 x 9 = 18  3 x 9 = 27  4 x 9 = 36  5 x 9 = 45
//
//		6 x 1 =  6  7 x 1 =  7  8 x 1 =  8  9 x 1 =  9
//		6 x 2 = 12  7 x 2 = 14  8 x 2 = 16  9 x 2 = 18
//		..
//		6 x 9 = 54  7 x 9 = 63  8 x 9 = 72  9 x 9 = 81
//		조건
//
//		2중 for문 x 2번 풀이 가능
//		3중 for문 x 1번 풀이 가능
		
		for(int i=2;i<=6;i++) {
			for(int j=1;j<=9;j++) {
				for(int k=i;k<=i+3;k++) {
					System.out.printf(" %d x %d = %d ",k,j,k*j);
				}
				System.out.println();
			}
		}
		
	}

	private static void m7() {
		
//		입력
//
//		없음
//		출력
//
//		    aa
//		   abba
//		  abccba
//		 abcddbca
//		abcdeedcba
//		추가조건
//
//		행의 갯수를 입력받으시오.
		
		System.out.print("행의 갯수 : ");
		int row = Integer.parseInt(scan.nextLine());
		
		for(int i=1;i<=row;i++) {
			for(int k=1;k<=row-i;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.printf("%c",97+j);
			}
			for(int j=i-1;j>=0;j--) {
				System.out.printf("%c",97+j);
			}
			System.out.println();
		}
	}

	private static void m6() {
		
//		아래와 같이 출력하시오..
//
//		입력
//
//		없음
//		출력
//
//		*
//		 *
//		  *
//		   *
//		    *
//		추가조건
//
//		행의 갯수를 입력받으시오.
//		도움
//
//		반복문 & 별찍기
		
		System.out.print("행의 갯수 : ");
		int row = Integer.parseInt(scan.nextLine());
		for(int i=0;i<row;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		
	}

	private static void m5() {
		
//		아래와 같이 출력하시오..
//
//		입력
//
//		없음
//		출력
//
//		    *
//		   ***
//		  *****
//		 *******
//		*********
//		추가조건
//
//		행의 갯수를 입력받으시오.
//		도움
//
//		반복문 & 별찍기
		
		System.out.print("행의 갯수 : ");
		int row = Integer.parseInt(scan.nextLine());
		
		for(int i=1; i<=row;i++) {
			for(int j=1;j<=row-i;j++) {
				System.out.print(" ");
			} 
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	private static void m4() {
//		아래와 같이 출력하시오..
//
//		입력
//
//		없음
//		출력
//
//		    *
//		   **
//		  ***
//		 ****
//		*****
//		추가조건
//
//		행의 갯수를 입력받으시오.
		
		System.out.print("행의 갯수 : ");
		int row = Integer.parseInt(scan.nextLine());
		
		String line = "";
		for(int i=1 ;i<=5 ; i++) {
			line = "";
			for(int k=1; k<=row-i;k++) {
				System.out.print(" ");
			}
		
			for(int j=1 ; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	private static void m3() {
		
//		아래와 같이 출력하시오..
//
//		입력
//
//		없음
//		출력
//
//		*****
//		 ****
//		  ***
//		   **
//		    *
//		추가조건
//
//		행의 갯수를 입력받으시오.
		System.out.print("행의 갯수 : ");
		int row = Integer.parseInt(scan.nextLine());
		String line = "";
		for(int i=row; i>= 1 ; i--) {
			line = "";
			for(int k=1; k<=row-i;k++) {
				System.out.print(" ");
			}
			for(int j=1 ; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	private static void m2() {
		
//		아래와 같이 출력하시오..
//
//		입력
//
//		없음
//		출력
//
//		i : 1, j : 5
//		i : 1, j : 4
//		i : 1, j : 3
//		i : 1, j : 2
//		i : 1, j : 1
//		i : 2, j : 5
//		i : 2, j : 4
//		i : 2, j : 3
//		i : 2, j : 2
//		i : 3, j : 5
//		i : 3, j : 4
//		i : 3, j : 3
//		i : 4, j : 5
//		i : 4, j : 4
//		i : 5, j : 5
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.printf("i : %d, j : %d\n",i,j);
			}
		}
		
	}

	private static void m1() {
		
//		아래와 같이 출력하시오..
//
//		입력
//
//		없음
//		출력
//
//		i : 1, j : 1
//		i : 1, j : 2
//		i : 1, j : 3
//		i : 1, j : 4
//		i : 1, j : 5
//		i : 2, j : 2
//		i : 2, j : 3
//		i : 2, j : 4
//		i : 2, j : 5
//		i : 3, j : 3
//		i : 3, j : 4
//		i : 3, j : 5
//		i : 4, j : 4
//		i : 4, j : 5
//		i : 5, j : 5
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.printf("i : %d, j : %d\n",i,j);
			}
		}
		
	}
}
