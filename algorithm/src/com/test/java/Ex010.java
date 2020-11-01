package com.test.java;

import java.util.Scanner;

public class Ex010 {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		m9();
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
				System.out.printf("%3d",list[i][j]);
			}
			System.out.println();
		}
		
	}

	
}
