package com.test.java;

import java.util.Arrays;
import java.util.Scanner;

public class Ex010 {
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
		
//	요구사항] 아래와 같이 출력하시오.
//
//	출력
//
//	2	7	6
//	9	5	1
//	4	3	8
//
//	추가조건
//
//	테이블의 행/열을 입력받아 출력한다. (행/열 동일한 값, 홀수만 입력)
		
	System.out.print("행 : ");
	int row = Integer.parseInt(scan.nextLine());
	System.out.print("열 : ");
	int col = Integer.parseInt(scan.nextLine());
	int [][] nums = new int[row][col];
	int cnt = 1;
	
	int r = row/2;
	int c = col-1;
	int r1 = 0;
	int c1 = 0;
	while(cnt<=row*col) {
		
		if(nums[r][c]!=0) {
			r=r1;
			c=c1-1;
			nums[r][c] = cnt++;
		} else {			
			nums[r][c] = cnt++;
		}
		r1=r;
		c1=c;
		r--;
		c++;
		if(r<0) {
			r=row-1;
		}
		if(c>col-1) {
			c=0;
		}
		
	}
		print(nums);
	}



	private static void m8() {
		
//	요구사항] 아래와 같이 출력하시오.
//
//	출력
//
//	1	2	4	7	11
//	3	5	8	12	16
//	6	9	13	17	20
//	10	14	18	21	23
//	15	19	22	24	25
//
//	추가조건
//
//	테이블의 행/열을 입력받아 출력한다.
	
		System.out.print("행 : ");
		int row = Integer.parseInt(scan.nextLine());
		System.out.print("열 : ");
		int col = Integer.parseInt(scan.nextLine());
		int [][] nums = new int[row][col];
		int cnt = 1;
		int k = 0;
		int spin = (row>=col)?row*2-2:col*2;
		for (int i = 0; i <= spin; i++) { // 행
			for(int j=0;j<row;j++) {
				k=i-j;
				if(k<col && k>=0) {
					nums[j][k] = cnt++;
				}
			}
		}

		print(nums);
	
	}



	private static void m7() {
//		성적을 입력받아 아래와 같이 출력하시오.
//
//		입력
//
//		국어 점수 : 80 
//		영어 점수 : 50 
//		수학 점수 : 70 
//		출력
//
//		 	 	 
//		 	 	 
//		■		
//		■		■
//		■		■
//		■	■	■
//		■	■	■
//		■	■	■
//		■	■	■
//		■	■	■
//		국어	영어	수학
//
//		조건
//
//		String[][] score = new String[10][3];
		
		System.out.print("국어 점수 : ");
		int kor = Integer.parseInt(scan.nextLine());
		System.out.print("영어 점수 : ");
		int eng = Integer.parseInt(scan.nextLine());
		System.out.print("수학 점수 : ");
		int math = Integer.parseInt(scan.nextLine());
		int [] nums = {kor/10,eng/10,math/10};
		String[][] score = new String[10][3];
		int cnt = 0;
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[0].length;j++) {
				if(i<10-nums[cnt]) {
					score[i][j]=" ";
				} else {
					score[i][j]="■";
				}
				cnt++;
			}
			cnt=0;
		}
		print(score);
	}



	private static void print(String[][] list) {
		for(int i=0;i<list.length;i++) {
			for(int j=0;j<list[i].length;j++) {
				System.out.printf("%s",list[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}



	private static void m6() {
		
//	요구사항] 아래와 같이 출력하시오.
//
//	출력
//
//	1	2	3	4	10
//	5	6	7	8	26
//	9	10	11	12	42
//	13	14	15	16	58
//	28	32	26	40	136
//
//	추가조건
//
//	테이블의 행/열을 입력받아 출력한다.
		
	System.out.print("행 : ");
	int row = Integer.parseInt(scan.nextLine());
	System.out.print("열 : ");
	int col = Integer.parseInt(scan.nextLine());
	int [][] nums = new int[row][col];
	int cnt = 1;
	int sum = 0;
	
	for(int i=0;i<row-1;i++) {
		for(int j=0;j<col;j++) {
			if(j<col-1) {
				nums[i][j]=cnt;
				sum+=cnt;
				cnt++;
			}
			if(j==col-1) {
				nums[i][j]=sum;
			}
		}
		sum=0;
	}
	sum=0;
	for(int i=0;i<col;i++) {
		for(int j=0;j<row;j++) {
			if(j<row-1) {
				sum+=nums[j][i];
			} else {
				nums[j][i]=sum;
			}
		}
		sum=0;
	}
	
		print(nums);
		
	}



	private static void m5() {
		
//	요구사항] 아래와 같이 출력하시오.
//
//	출력
//
//	0	0	1	0	0
//	0	2	3	4	0
//	5	6	7	8	9
//	0	10	11	12	0
//	0	0	13	0	0
//
//	추가조건
//
//	테이블의 행/열을 입력받아 출력한다. (홀수만)
	
		
		System.out.print("행 : ");
		int row = Integer.parseInt(scan.nextLine());
		System.out.print("열 : ");
		int col = Integer.parseInt(scan.nextLine());
		int [][] nums = new int[row][col];
		int cnt = 1;
		int start = col/2;
		int end = col/2;
		if (row % 2 == 1 && col % 2 == 1) {
			for (int i = 0; i < row; i++) {
				for (int j = start; j <= end; j++) {
					// System.out.printf("%d %d\n",i,j);
					nums[i][j] = cnt;
					cnt++;
				}
				if (i < col / 2) {
					start--;
					end++;
				} else {
					start++;
					end--;
				}

			}
			print(nums);
		} else {
			System.out.println("홀수만 입력하세요.");
		}
	}



	private static void m4() {
		
		System.out.print("행 : ");
		int row = Integer.parseInt(scan.nextLine());
		System.out.print("열 : ");
		int col = Integer.parseInt(scan.nextLine());
		int [][] nums = new int[row][col];
		int cnt = 1;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				nums[i][j]=cnt;
				cnt++;
			}
			col--;
		}
		print(nums);
	}



	private static void m3() {
		
		System.out.print("행 : ");
		int row = Integer.parseInt(scan.nextLine());
		System.out.print("열 : ");
		int col = Integer.parseInt(scan.nextLine());
		int [][] nums = new int[row][col];
		int cnt = 1;
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++) {
				nums[j][i]=cnt;
				cnt++;
			}
		}
		print(nums);
	}



	private static void m2() {
		
		System.out.print("행 : ");
		int row = Integer.parseInt(scan.nextLine());
		
		System.out.print("열 : ");
		int col = Integer.parseInt(scan.nextLine());
		
		int [][] nums = new int[row][col];
		int cnt = 1;
		for(int i = row-1;i>=0;i--) {
			for(int j=col-1;j>=0;j--) {
				nums[i][j] = cnt;
				cnt++;
			}
		}
		print(nums);
	}



	private static void m1() {
		System.out.print("행 : ");
		int row = Integer.parseInt(scan.nextLine());
		
		System.out.print("열 : ");
		int col = Integer.parseInt(scan.nextLine());
		
		int [][] nums = new int[row][col];
		int cnt = 0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				cnt++;
				nums[i][j]=cnt;
			}
		}
		print(nums);
	}
	
	


	private static void m9() {
		
//	요구사항] 아래와 같이 출력하시오.
//
//	출력
//
//	1	2	3	4	5
//	16	17	18	19	6
//	15	24	25	20	7
//	14	23	22	21	8
//	13	12	11	10	9
//
//	추가조건
//
//	테이블의 행/열을 입력받아 출력한다.
	
		System.out.print("행 : ");
		int row = Integer.parseInt(scan.nextLine());
		System.out.print("열 : ");
		int col = Integer.parseInt(scan.nextLine());
		int [][] list = new int[row][col];
		int garo = -1;
		int sero = 0;
		int direction = 1;
		int size1 = list.length;
		int size = list[0].length;
		int cnt = 1;
		int max = 0;
		if(size>size1) {
			max = size1;
		} else {
			max = size;
		}
		while(0<=size1 && size >0) {
			for(int i=0;i<size;i++) {
				garo+=direction;
//				System.out.print(garo);
				list[sero][garo] = cnt;
				cnt++;
			}
			size--;
			size1--;
			for(int i=0;i<size1;i++) {
				sero+=direction;
				list[sero][garo]=cnt;
				cnt++;
			}
			direction*=(-1);
		}
		
		print(list);
	}

	private static void print(int[][] list) {
		
		for(int i=0;i<list.length;i++) {
			for(int j=0;j<list[i].length;j++) {
				System.out.printf("%4d",list[i][j]);
			}
			System.out.println();
		}
		
	}

	
}
