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
		
//		���� ��� ������ ���� �ð��� �ޱ⸦ ���ϴ� ���� �ִ�. ���� ������ ���忡 ��ÿ� ��ȭ�� �ؾ� ��� ������ ���� �ð��� ���� �� �ִ��� �˷��ֽÿ�.
//
//		�Է�
//
//		������ �ޱ� ���ϴ� �ð�
//		�� : 14 
//		�� : 0 
//		���
//
//		¥��� : 13�� 50��
//		ġŲ : 13�� 42��
//		���� : 13�� 35��
//		����
//
//		��ȭ�� �ɸ� ¥����� 10�� �ڿ� �����մϴ�.
//		��ȭ�� �ɸ� ġŲ�� 18�� �� �����մϴ�.
//		��ȭ�� �ɸ� ���ڴ� 25�� �� �����մϴ�.
//		��¥�� �ٲ�� ���� ó������ �ʽ��ϴ�.
		
		System.out.println("������ �ޱ� ���ϴ� �ð�");
		System.out.print("�� : ");
		int hour = Integer.parseInt(scan.nextLine());
		System.out.print("�� : ");
		int min = Integer.parseInt(scan.nextLine());
		int sum = hour*60+min;
		System.out.printf("¥��� : %d�� %d��\n",(sum-10)/60,(sum-10)%60);
		System.out.printf("ġŲ : %d�� %d��\n",(sum-18)/60,(sum-18)%60);
		System.out.printf("���� : %d�� %d��\n",(sum-25)/60,(sum-25)%60);
	}

	private static void m4() {
		
//		�ƺ��� ���� ������ �Է¹޾� �ƺ��� ������ ��ĥ�� �� ��Ҵ��� ����Ͻÿ�.
//
//		�Է�
//
//		�ƺ� ����(��) : 1960 
//		�ƺ� ����(��) : 5 
//		�ƺ� ����(��) : 10 
//		�� ����(��) : 1995 
//		�� ����(��) : 7 
//		�� ����(��) : 22 
//		���
//
//		�ƺ��� ������ �� 12,856���� �� ��ҽ��ϴ�.
		
		System.out.print("�ƺ� ����(��) : ");
		int year = Integer.parseInt(scan.nextLine());
		System.out.print("�ƺ� ����(��) : ");
		int month = Integer.parseInt(scan.nextLine());
		System.out.print("�ƺ� ����(��) : ");
		int day = Integer.parseInt(scan.nextLine());
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month);
		c.set(Calendar.DATE, day);
		
		Calendar c1 = Calendar.getInstance();
		System.out.print("�� ����(��) : ");
		int year1 = Integer.parseInt(scan.nextLine());
		System.out.print("�� ����(��) : ");
		int month1 = Integer.parseInt(scan.nextLine());
		System.out.print("�� ����(��) : ");
		int day1 = Integer.parseInt(scan.nextLine());
		c1.set(Calendar.YEAR, year1);
		c1.set(Calendar.MONTH, month1);
		c1.set(Calendar.DATE, day1);
		
		System.out.printf("�ƺ��� ������ �� %,3d���� �� ��ҽ��ϴ�.",(c1.getTimeInMillis()-c.getTimeInMillis())/(1000*60*60*24));
		
	}

	private static void m3() {
		
//		���� Ŀ���� �̸��� �������� �Է¹޾� ������� ����Ͻÿ�.
//
//		�Է�
//
//		���� �̸� : ȫ�浿 
//		���� �̸� : ȣȣȣ 
//		������(��) : 2019 
//		������(��) : 2 
//		������(��) : 1 
//		���
//
//		'ȫ�浿'��(��) 'ȣȣȣ'�� �����
//		 100�� : 2020-XX-XX
//		 200�� : 2020-XX-XX
//		 300�� : 2020-XX-XX
//		 500�� : XXXX-XX-XX
//		1000�� : XXXX-XX-XX
		
		System.out.print("���� �̸� : ");
		String name = scan.nextLine();
		System.out.print("���� �̸� : ");
		String name1 = scan.nextLine();
		System.out.print("������(��) : ");
		int year = Integer.parseInt(scan.nextLine());
		System.out.print("������(��) : ");
		int month = Integer.parseInt(scan.nextLine());
		System.out.print("������(��) : ");
		int day = Integer.parseInt(scan.nextLine());
		
		Calendar now = Calendar.getInstance();
		now.set(Calendar.YEAR, year);
		now.set(Calendar.MONTH, month);
		now.set(Calendar.DATE, day);
		System.out.printf("'%s'�� '%s'�� �����\n",name,name1);
		now.add(Calendar.DATE, 100);
		System.out.printf("100�� : %tF\n",now);
		now.add(Calendar.DATE, 100);
		System.out.printf("200�� : %tF\n",now);
		now.add(Calendar.DATE, 100);
		System.out.printf("300�� : %tF\n",now);
		now.add(Calendar.DATE, 100);
		System.out.printf("500�� : %tF\n",now);
		now.add(Calendar.DATE, 100);
		System.out.printf("1000�� :%tF\n",now);
		
	}

	private static void m2() {
		
//		�¾ �⵵�� �Է��ϸ� ���̸� ����Ͻÿ�.
//
//		�Է�
//
//		�¾ �⵵ : 1995 
//		���
//
//		���� : 25��
//		����
//
//		�����ϴ� ���� �⵵�� �������� �Ͻÿ�.
//		�츮���� ���̷� ����Ͻÿ�.
		
		System.out.print("�¾ �⵵ : ");
		int year = scan.nextInt();
		Calendar now = Calendar.getInstance();
		
		System.out.printf("���� : %s",now.get(Calendar.YEAR)-year+1);
		
	}

	private static void m1() {
		
//		���� �¾ ������ ���ϰ� ù���� �������� ����Ͻÿ�.
//
//		�Է�
//
//		����
//		���
//
//		���� : 2019-05-07
//		ù�� : 2020-02-06
		
		Calendar c = Calendar.getInstance();
		Calendar c1 = Calendar.getInstance();
		c.add(Calendar.DATE, 100);
		System.out.printf("���� : %tF\n",c);
		c1.add(Calendar.MONTH, 12);
		System.out.printf("ù�� : %tF\n",c1);
	}

	private static void nowTime() {
		
//		�Ʒ��� �ڵ带 �����ؼ� ���� �ð��� ����ϴ� �޼ҵ� �����ϰ� ȣ���Ͻÿ�.
//
//		�Է�
//
//		����
//		ȣ��
//
//		nowTime();
//		���
//
//		���� �ð� : 10�� 30�� 25��
//		�޼ҵ� ����
//
//		void nowTime()
//		�߰� ����
//
//		���� �ð��� ����/���ķ� ����Ͻÿ�.
//		void nowTime_AMPM()
//		14�� 30�� 25�� �� ���� 2�� 30�� 25��
		
		Calendar now = Calendar.getInstance();
		System.out.printf("���� �ð� : %s %s�� %s�� %s��\n",now.get(Calendar.AM_PM)==0?"����":"����",now.get(Calendar.HOUR_OF_DAY)-12,now.get(Calendar.MINUTE),now.get(Calendar.SECOND));
	}
	
	
}
