package com.test.java;

public class Ex013 {
	public static void main(String[] args) {
		//m1();
		m2();
	}

	private static void m2() {
		//�ð� 1
		Time t1 = new Time(); //�⺻ ������ ȣ��
		System.out.println(t1.info());

		//�ð� 2
		Time t2 = new Time(2, 30, 45); //�����ε� ������ ȣ��
		System.out.println(t2.info());

		//�ð� 3
		Time t3 = new Time(1, 70, 30); //�����ε� ������ ȣ��
		System.out.println(t3.info());

		//�ð� 4
		Time t4 = new Time(30, 10); //�����ε� ������ ȣ��
		System.out.println(t4.info());

		//�ð� 5
		Time t5 = new Time(90, 10); //�����ε� ������ ȣ��
		System.out.println(t5.info());

		//�ð� 6
		Time t6 = new Time(50); //�����ε� ������ ȣ��
		System.out.println(t6.info());

		//�ð� 7
		Time t7 = new Time(10000); //�����ε� ������ ȣ��
		System.out.println(t7.info());
	}

	private static void m1() {
		//�л� 1
		Student s1 = new Student(); //�⺻ ������ ȣ��
		System.out.println(s1.info());

		//�л� 2
		Student s2= new Student("ȫ�浿", 13); //�����ε� ������ ȣ��
		System.out.println(s2.info());

		//�л� 3
		Student s3= new Student(3, 10, 30); //�����ε� ������ ȣ��
		System.out.println(s3.info());

		//�л� 4
		Student s4= new Student("�ƹ���", 12, 1, 5, 11); //�����ε� ������ ȣ��
		System.out.println(s4.info());
	}
}
