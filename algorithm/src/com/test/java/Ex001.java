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
		
//		���� �µ��� �Է¹޾Ƽ� ȭ�� �µ��� ��ȯ�Ͻÿ�.
//
//		�Է�
//
//		����(��) : 29 
//		���
//
//		���� 29�ɴ� ȭ�� 84.2���Դϴ�.
//		����
//
//		�� = �� �� 1.8 + 32
		
		System.out.print("����(��) : ");
		int n = scan.nextInt();
		System.out.printf("���� %d�ɴ� ȭ�� %.1f���Դϴ�.",n,n*1.8+32);
		
	}

	private static void m9() {
		
//		�䱸����.009
//		������ 1���� �Է¹޾Ƽ� �� ���ڰ� �빮������ �ҹ������� �����Ͻÿ�.
//
//		�Է�
//
//		������ �Է� : a 
//		������ �Է� : E 
//		���
//
//		�Է��� ���� 'a'�� �ҹ����Դϴ�.
//		�Է��� ���� 'E'�� �빮���Դϴ�.
		
		System.out.print("������ �Է� : ");
		char c = scan.next().charAt(0);
		System.out.print("������ �Է� : ");
		char c1 = scan.next().charAt(0);
		System.out.printf("�Է��� ���� '%c'�� %s�Դϴ�.\r\n",c,(c >='a' && c <='z')?"�ҹ���":"�빮��");
		System.out.printf("�Է��� ���� '%c'�� %s�Դϴ�.\r\n",c1,(c1 >='a' && c1 <='z')?"�ҹ���":"�빮��");
	}

	private static void m8() {
		
//		�䱸����.008
//		2020�� 4�� 1���� �������̴�. 2020�� 4�� �� �� ��¥�� �Է¹޾Ƽ� ���� �������� ����Ͻÿ�.
//
//		�Է�
//
//		��¥ �Է� : 20 
//		���
//
//		�Է��Ͻ� 2020�� 4�� 20���� '������'�Դϴ�.
		
		System.out.print("��¥ �Է� : ");
		int date = scan.nextInt();
		System.out.printf("�Է��Ͻ� 2020�� 4�� %d���� '%s'�Դϴ�.",date,(date%7==5)?"�Ͽ���":((date%7==6)?"������":(date%7==0)?"ȭ����":(date%7==1)?"������":(date%7==2)?"�����":(date%7==3)?"�ݿ���":"�����"));
		
	}

	private static void m7() {
		
//		���� 2���� �Է¹޾Ƽ� �� �� �� ū ���ڸ� ����Ͻÿ�.
//
//		�Է�
//
//		ù��° ���� : 5 
//		�ι�° ���� : 3 
//		���
//
//		5��(��) 3 �߿� �� ū ���ڴ� 5�Դϴ�.
//		����
//
//		���� 3���� �Է¹޾Ƽ� ���� ū ���ڸ� ����Ͻÿ�.
		System.out.print("ù���� ���� : ");
		int num1 = scan.nextInt();
		scan.nextLine();
		System.out.print("�ι��� ���� : ");
		int num2 = scan.nextInt();
		System.out.print("������ ���� : ");
		scan.nextLine();
		int num3 = scan.nextInt();
		
		System.out.printf("%d,%d,%d �߿� �� ū ���ڴ� %d�Դϴ�.",num1,num2,num3,(num1>num2)?((num1>num3)?num1:((num3>num2)?num3:num2)):(num2>num3)?num2:num3);
		
	}

	private static void m6() {
		
//		���� �ҹ��ڸ� 1�� �Է¹��� �� �빮�ڷ� ��ȯ�ؼ� ����Ͻÿ�.
//
//		�Է�
//
//		���� �Է� : a 
//		���
//
//		�ҹ��� 'a'�� �빮�ڴ� 'A'�Դϴ�.
//		����
//
//		�빮�ڿ� �ҹ����� ���� �ڵ尪�� � �����ΰ�?
//		(int)'A' �� 65
//		(char)65 �� 'A'
		
		System.out.print("���� �Է� : ");
		char n = 0;
		try {
			n = (char) System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.printf("�ҹ��� '%c'�� �빮�ڴ� '%c'�Դϴ�.",n,n-32);
		
		
	}

	private static void m5() {
		
//		�䱸����.005
//		������� �Ѵ� ������ �Է¹޾� ���� �ݾ��� ����Ͻÿ�.
//
//		�Է�
//
//		�Ѵ� ���� �ݾ�(��) : 1000000 
//		���
//
//		���� �ݾ�(��) : 967,000��
//		����(��) : 33,000��
//		����
//
//		���� : ������ 3.3%
		
		System.out.print("�Ѵ� ���� �ݾ�(��) : ");
		int num1 = Integer.parseInt(scan.nextLine());
		
		System.out.printf("���� �ݾ�(��) : %,3d��\r\n",(int)(num1*(1-0.033)));
		System.out.printf("����(��) : %,3d��",(int)(num1*0.033));
		
	}

	private static void m4() {
		
//		�����Ű� �ִ�. �������� ������ ������ 26��ġ�̴�. ����ڰ� ����� ���� Ƚ���� �Է��ϸ� �����Ű� �� �� m�� �޷ȴ��� ����Ͻÿ�.
//
//		�Է�
//
//		����ڰ� ����� ���� Ƚ�� : 1000 
//		���
//
//		����ڰ� �� 1,000ȸ ����� ��� �����Ű� �� 2,075m�� �޷Ƚ��ϴ�.
//		����
//
//		���� 1:1 �� ��� 1ȸ�� == ������ ���� 1ȸ��
//		��� ��� ���ڴ� õ���� ǥ���Ͻÿ�.
//		�߰� ����
//
//		���� �߰��� �Է� �����ÿ�.
//		1�� : ��� 1ȸ�� == ������ ���� 1ȸ��
//		2�� : ��� 1ȸ�� == ������ ���� 2ȸ��
//		3�� : ��� 1ȸ�� == ������ ���� 3ȸ��
//		4�� : ��� 1ȸ�� == ������ ���� 4ȸ��
		
		// 1��ġ 0.0254
		
		System.out.print("����ڰ� ����� ���� Ƚ�� : ");
		int cnt = scan.nextInt();
		int dis = (int)(1000*(0.0254*13)*3.14*2);
		System.out.printf("����ڰ� �� %,3dȸ ����� ��� �����Ű� �� %,3dm�� �޷Ƚ��ϴ�.",cnt,dis);
		
	}

	private static void m3() {
		System.out.print("�ʺ�(cm) : ");
		int width = scan.nextInt();
		scan.nextLine();
		System.out.print("����(cm) : ");
		int height = scan.nextInt();
		scan.nextLine();
		System.out.printf("�簢���� ���̴� %d���Դϴ�.\r\n",width*height);
		System.out.printf("�簢���� ���̴� %d���Դϴ�.\r\n",(width+height)*2);
	}

	private static void m2() {
		
//		���� 2���� �Է¹޾� �Ʒ��� ��������� ���� ����� ����Ͻÿ�.
//
//		�Է�
//
//		ù��° ���� : 5 
//		�ι�° ���� : 3 
//		���
//
//		5 + 3 = 8
//		5 - 3 = 2
//		5 * 3 = 15
//		5 / 3 = 1.7
//		5 % 3 = 2
//		����
//
//		õ���� ǥ�⸦ �Ͻÿ�.
//		������ ����� �Ҽ����� 1�ڸ������� ����Ͻÿ�.
		
		System.out.print("ù��° ���� : ");
		int num1 = scan.nextInt();
		scan.nextLine();
		System.out.print("�ι��� ���� : ");
		int num2 = scan.nextInt();
		scan.nextLine();
		System.out.printf("%d + %d = %d\r\n",num1,num2,num1+num2);
		System.out.printf("%d - %d = %d\r\n",num1,num2,num1-num2);
		System.out.printf("%d * %d = %d\r\n",num1,num2,num1*num2);
		System.out.printf("%d / %d = %d\r\n",num1,num2,num1/num2);
		System.out.printf("%d %% %d = %d\r\n",num1,num2,num1%num2);
		
	}

	private static void m1() {
		
		
//		  �¾ �⵵�� �Է¹޾� ���̸� ����Ͻÿ�.
//		  
//		  �Է�
//		  
//		  �¾ �⵵ : 1990 ���
//		  
//		  ���� : 25�� ����
//		  
//		  �츮���� ���̷� ����Ͻÿ�. ���� �ð��� 2020���Դϴ�.
		 
		System.out.print("�¾ �⵵ : ");
		int year = scan.nextInt();
		System.out.printf("���� : %d�� ����",2020-year+1);
		
	}

	
}

