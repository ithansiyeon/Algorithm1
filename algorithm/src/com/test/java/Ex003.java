package com.test.java;

public class Ex003 {
	public static void main(String[] args) {
		//m1();
		//m2();
		m3();
	}

	private static void m3() {
//		���ڷ� ���� ���ڵ� �� ����� ������ ��ȯ�ϴ� �޼ҵ带 �����ϰ� ȣ���Ͻÿ�. �޼ҵ� �����ε�.
//
//		�Է�
//
//		����
//		ȣ��
//
		int count = positive(10);
		System.out.println(count);
//		���
//
//		��� : 1��
//		ȣ��
//
		count = positive(10, 20);
		System.out.println(count);
//		���
//
//		��� : 2��
//		ȣ��
//
		count = positive(10, 20, -30);
		System.out.println(count);
//		���
//
//		��� : 2��
//		ȣ��
//
		count = positive(10, 20, -30, 40);
		System.out.println(count);
//		���
//
//		��� : 3��
//		ȣ��
//
		count = positive(10, 20, -30, 40, 50);
		System.out.println(count);
//		���
//
//		��� : 4��
	}

	private static int positive(int i, int j, int k, int l, int m) {
		return (i>0 ? 1:0)+(j>0 ? 1:0)+(k>0?1:0)+(l>0?1:0)+(m>0?1:0);
	}

	private static int positive(int i, int j, int k, int l) {
		return (i>0 ? 1:0)+(j>0 ? 1:0)+(k>0?1:0)+(l>0?1:0);
	}

	private static int positive(int i, int j, int k) {
		return  (i>0 ? 1:0)+(j>0 ? 1:0)+(k>0?1:0);
	}

	private static int positive(int i, int j) {
		return (i>0 ? 1:0)+(j>0 ? 1:0);
	}

	private static int positive(int i) {
		return i>0?1:0;
	}

	private static void m2() {
//		���ڷ� ���� �̸����� ���� ������ ����ϴ� �޼ҵ带 �����ϰ� ȣ���Ͻÿ�. �޼ҵ� �����ε�.
//
//		�Է�
//
//		����
//		ȣ��
//
		position("ȫ�浿");
//		���
//
//		��� : ȫ�浿
//		ȣ��
//
		position("ȫ�浿", "���缮");
//		���
//
//		��� : ȫ�浿
//		�븮 : ���缮
//		ȣ��
//
		position("ȫ�浿", "���缮", "�ڸ��");
//		���
//
//		��� : ȫ�浿
//		�븮 : ���缮
//		���� : �ڸ��
//		ȣ��
//
		position("ȫ�浿", "���缮", "�ڸ��", "������");
//		���
//
//		��� : ȫ�浿
//		�븮 : ���缮
//		���� : �ڸ��
//		���� : ������
		
	}

	private static void position(String name, String name1, String name2, String name3) {
		System.out.printf("��� : %s\n",name);
		System.out.printf("�븮 : %s\n",name1);
		System.out.printf("���� : %s\n",name2);
		System.out.printf("���� : %s\n",name3);
	}

	private static void position(String name, String name1, String name2) {
		System.out.printf("��� : %s\n",name);
		System.out.printf("�븮 : %s\n",name1);
		System.out.printf("���� : %s\n",name2);
	}

	private static void position(String name, String name1) {
		System.out.printf("��� : %s\n",name);
		System.out.printf("�븮 : %s\n",name1);
	}

	private static void position(String name) {
		System.out.printf("��� : %s\n",name);
	}

	private static void m1() {
//		���ڷ� ���� ���ڵ��� ���� ���ϴ� �޼ҵ带 �����ϰ� ȣ���Ͻÿ�. �޼ҵ� �����ε�.
//
//		�Է�
//
//		����
//		ȣ��
//
//		sum(10);
//		���
//
//		10 = 10
//		ȣ��
//
//		sum(10, 20);
//		���
//
//		10 + 20 = 10
//		ȣ��
//
//		sum(10, 20, 30);
//		���
//
//		10 + 20 + 30 = 10
//		�޼ҵ� ����
//
		
		sum(10);
		sum(10, 20);
		sum(10, 20, 30);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
	}
	
	private static void sum(int n1, int n2, int n3) {
		System.out.printf("%d + %d + %d = %d\n",n1,n2,n3,n1+n2+n3);
		
	}

	private static void sum(int n1, int n2) {
		System.out.printf("%d + %d = %d\n",n1,n2,n1+n2);
	}

	private static void sum(int n1) {
		System.out.printf("%d = %d\n",n1,n1);
	}
}
