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
		
//		��� ������ �ִ�. ��� ���� ������ ���� ���κ��� Ư�� �ð��� �귶�� �� ��� �� ��� �������� ���ϴ� �޼ҵ带 �����Ͻÿ�. �޼ҵ� ���ڰ�/��ȯ��.
//
//		�Է�
//
//		���� �� : 20 
//		�帰 �� : 16 
//		���
//
//		����� �� 3�� ���Ƚ��ϴ�.
//		�޼ҵ� ����
//
//		int getApple(int, int)
//		����
//
//		��� ������ ó�� �ɾ��� �� ������ ���� : 0m
//		���� �� ��� ������ ����� : 5��
//		�帰 �� ��� ������ ���߷� : 2��
//		��� ������ ���̰� 1m �Ѵ� �������� ����� ������.
//		1m �Ѵ� �������� 10�� �ڶ� ������ ����� 1���� ������.
		
		System.out.print("���� �� : ");
		int clean = Integer.parseInt(scan.nextLine());
		System.out.print("�帰 �� : ");
		int cloudy = Integer.parseInt(scan.nextLine());
		System.out.printf("����� �� %d�� ���Ƚ��ϴ�.",getApple(clean,cloudy));
		
	}

	private static int getApple(int clean, int cloudy) {
		
		return ((cloudy*2+clean*5)-100)/10;
	}

	private static void m8() {
		
//		����ö ž�� �ҿ� �ð��� ���Ͻÿ�. �������� ���� ����, ȯ�¿��� Ƚ�� ���� ���� �޾� �� �ɸ��� �ð��� ��ȯ�ϴ� �޼ҵ带 �����ϰ� ȣ���Ͻÿ�. �޼ҵ� ���ڰ�/��ȯ��.
//
//		�Է�
//
//		���� ���� : 15 
//		ȯ�¿��� Ƚ�� : 1 
//		���
//
//		�� �ҿ� �ð��� 33���Դϴ�.
//		�޼ҵ� ����
//
//		int getTime(int, int)
//		����
//
//		�� ������ �ҿ� �ð� : 2��
//		ȯ�¿��� �ҿ� �ð� : 3��
//		�߰� ����
//
//		�ð��뿡 ���� ȯ�� �ҿ� �ð��� �޸��Ͻÿ�.
//		��� : 3��
//		��� : 4��
//		��� : 5��
		System.out.print("���� ���� : ");
		int n1 = Integer.parseInt(scan.nextLine());
		System.out.print("���� ���� : ");
		int n2 = Integer.parseInt(scan.nextLine());
		System.out.print("�ð��� : ");
		String time = scan.nextLine();
		System.out.printf("�� �ҿ� �ð��� %d���Դϴ�.",getTime(n1,n2,time));
		
	}

	private static int getTime(int n1, int n2, String time) {
		
		return time.equals("���")?n1*2+n2*3:(time.equals("���")?n1*2+n2*4:(time.equals("���")?n1*2+n2*5:-1));
	}

	private static void m7() {
		
//		����, ����, ���� ������ �����ϸ� '�հ�' Ȥ�� '���հ�'�̶�� �ܾ ��ȯ�ϴ� �޼ҵ带 �����ϰ� ȣ���Ͻÿ�. �޼ҵ� ���ڰ�/��ȯ��.
//
//		�Է�
//
//		���� : 80 
//		���� : 75 
//		���� : 60 
//		���
//
//		(��)�հ��Դϴ�.
//		�޼ҵ� ����
//
//		String test(int, int, int)
//		int, int, int : ����, ����, ����
//		return String : '�հ�' or '���հ�'
//		����
//
//		��� ���� 60�� �̻��� '�հ�'�̴�.
//		��� ���� 60�� �̸��� '���հ�'�̴�.
//		�߰� ����
//
//		���� ���� �� �� ���� �̻� 40�� �̸��̸� ���հ��̴�.
		
		System.out.print("���� : ");
		int kor = Integer.parseInt(scan.nextLine());
		System.out.print("���� : ");
		int eng = Integer.parseInt(scan.nextLine());
		System.out.print("���� : ");
		int math = Integer.parseInt(scan.nextLine());
		
		System.out.printf("%s�Դϴ�.",test(kor,eng,math));
		
	}

	private static String test(int kor, int eng, int math) {
		return (kor < 40 || eng < 40 || math <40)?"����":((kor+eng+math)/3 >= 60 && (kor >= 40 && eng >=40 && math >=40) ? "�հ�":"���հ�");
	}

	private static void m6() {
//		���ڸ� �����ϸ� '¦��' Ȥ�� 'Ȧ��' ��� �ܾ ��ȯ�ϴ� �޼ҵ带 �����ϰ� ȣ���Ͻÿ�. �޼ҵ� ���ڰ�/��ȯ��.
		System.out.print("���� : ");
		int n = Integer.parseInt(scan.nextLine());
		System.out.printf("�Է��Ͻ� ���� '%d'�� '%s'�Դϴ�.",n,(n%2==0)?"¦��":"Ȧ��");
		
	}

	private static void m5() {
//		���ڸ� 2�� �Է¹޾� ��� ����� ��ȯ�ϴ� �޼ҵ� 5���� �����ϰ� ȣ���Ͻÿ�. �޼ҵ� ���ڰ�/��ȯ��.
		System.out.print("ù���� ���� : ");
		int n1 = Integer.parseInt(scan.nextLine());
		System.out.print("�ι��� ���� : ");
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
//		�̸��� �����ϸ� �̸��ڿ� '��'�� �ٿ��� ��ȯ�ϴ� �޼ҵ带 �����ϰ� ȣ���Ͻÿ�. �޼ҵ� ���ڰ�/��ȯ��.
		System.out.print("�̸� : ");
		String name = scan.nextLine();
		name = getName(name);
		System.out.printf("�� : %s\n",name);
		
	}

	private static String getName(String name) {
		return name + "��";
	}

	private static void m3() {
		
//		���ڸ� 2�� �Է¹޾� ��� ������ �����ϴ� �޼ҵ� 5���� �����ϰ� ȣ���Ͻÿ�.
//
//		�Է�
//
//		ù��° ���� : 5 
//		�ι�° ���� : 3 
//		ȣ��
		
		System.out.print("ù���� ���� : ");
		int n1 = Integer.parseInt(scan.nextLine());
		System.out.print("�ι��� ���� : ");
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
//		���� 1���� �Է¹޾� 4�ڸ��� ����ϴ� �޼ҵ带 �����ϰ� ȣ���Ͻÿ�.
		System.out.print("���� �Է� : ");
		int num1 = Integer.parseInt(scan.nextLine());
		digit(num1);
	}

	private static void digit(int num1) {
		System.out.printf("%d -> %04d",num1,num1);
	}

	private static void m1() {
		
//		ȣ���ϸ� �λ縻�� ����ϴ� �޼ҵ� 3���� �����ϰ� ȣ���Ͻÿ�.
//
//		�Է�
//
//		����
//		ȣ��
//
//		hello();
//		introduce();
//		bye();
//		���
//
//		�ȳ��ϼ���. //hello()
//		���� ȫ�浿�Դϴ�. //introduce()
//		�ȳ���������. //bye()
//		�޼ҵ� ����
//
//		void hello()
//		void introduce()
//		void bye()
		
		hello();
		introduce();
		bye();
	}
	
	private static void bye() {
		System.out.println("�ȳ���������.");
	}

	private static void introduce() {
		System.out.println("���� ȫ�浿�Դϴ�.");
	}

	private static void hello() {
		System.out.println("�ȳ��ϼ���.");
	}
	
}
