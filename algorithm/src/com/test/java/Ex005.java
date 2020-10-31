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
		
//		���ڸ� �Է��ϸ� �ڹ��� ���� �ڷ��� �� ����Ϳ� ���ϴ��� �˾Ƴ��ÿ�.
//
//		�Է�
//
//		���� �Է� : 10000 
//		���
//
//		int
//		long
//		����
//
//		�Է� ������ ���� : +-19�ڸ� �̳�(long ���̸� ����� �� ��) */
		
		System.out.print("���� �Է� : ");
		String sn = scan.nextLine();
		
		if(sn.length()<=19) {
			int n = Integer.parseInt(sn);
			if(n<=Byte.MAX_VALUE && n>=Byte.MIN_VALUE) {
				System.out.println("Byte��");
			} else if(n<=Short.MAX_VALUE && n>=Short.MIN_VALUE) {
				System.out.println("Short��");
			} else if(n<=Long.MAX_VALUE && n>=Long.MIN_VALUE) {
				System.out.println("Long��");
			} else if(n<=Integer.MAX_VALUE && n>=Integer.MIN_VALUE) {
				System.out.println("Integer��");
			} 
		} else {
			System.out.println("���ڰ� long���� ���̸� ����ϴ�.");
		}
		
	}

	private static void m10() {
		
//		�ٹ� ����� �Է¹޾� �Ʒ��� ���� ����Ͻÿ�.
//
//		�Է�
//
//		�ٹ� ��� : 5 
//		���
//
//		5���� �߱� �������Դϴ�.
//		����� 1�������� �ʱ� �����ڿ����ϴ�.
//		������ 5�� �� �ٹ��� �ϸ� ��� �����ڰ� �˴ϴ�. 
//		����
//
//		1 ~ 4���� : �ʱ� ������
//		5 ~ 9���� : �߱� ������
//		10���� �̻� : ��� ������
		
		String word = null;
		System.out.print("�ٹ� ��� : ");
		int year = Integer.parseInt(scan.nextLine());
		if(year >= 1 && year <= 4) {
			word = "�ʱ�";
			System.out.printf("%d���� %s �������Դϴ�.\n",year,word);
			System.out.printf("������ %d�� �� �ٹ��� �ϸ� %s �����ڰ� �˴ϴ�.\n",5-year,"�߱�");
		} else if(year >= 5 && year <= 9) {
			word = "�߱�";
			System.out.printf("%d���� %s �������Դϴ�.\n",year,word);
			System.out.printf("����� %d�������� %s �����ڿ����ϴ�.\n",year-4,word);
			System.out.printf("������ %d�� �� �ٹ��� �ϸ� %s �����ڰ� �˴ϴ�.\n",10-year,"���");
		} else if(year >= 10) {
			word = "���";
			System.out.printf("%d���� %s �������Դϴ�.\n",year,word);
			System.out.printf("����� %d�������� %s �����ڿ����ϴ�.\n",year-9,"�߱�");
		}
	}

	private static void m9() {
		
//		��¥�� �Է¹޾� �Ʒ��� ���ǿ� �°� ����� ����Ͻÿ�.
//
//		�Է�
//
//		�� : 2019 
//		�� : 2 
//		�� : 11 
//		���
//
//		�Է��Ͻ� ��¥�� '����'�Դϴ�.
//		�ش� ���� ����Ϸ� �̵��մϴ�.
//		�̵��� ��¥�� '2019-02-16' �Դϴ�.
//		�Է�
//
//		�� : 2019 
//		�� : 2 
//		�� : 17 
//		���
//
//		�Է��Ͻ� ��¥�� '����'�Դϴ�.
//		����� �����ϴ�.
//		����
//
//		�Է¹��� ��¥�� �����̸� �ش� ���� ������� �˾Ƴ���.
//		�Է¹��� ��¥�� �����̸� �ƹ��͵� ���Ѵ�.
		
		System.out.print("�� : ");
		int year = Integer.parseInt(scan.nextLine());
		System.out.print("�� : ");
		int month = Integer.parseInt(scan.nextLine());
		System.out.print("�� : ");
		int day = Integer.parseInt(scan.nextLine());
		
		//DAY_OF_WEEK // ����, (1(��)~7(��))
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month-1);
		c.set(Calendar.DATE, day);
		if(c.DAY_OF_WEEK!=1 || c.DAY_OF_WEEK!= 7) {
			c.add(Calendar.DATE, 7-c.get(Calendar.DAY_OF_WEEK));
			System.out.printf("�Է��Ͻ� ��¥�� '����'�Դϴ�.\n");
			System.out.printf("�ش����� ����Ϸ� �̵��մϴ�.\n");
			System.out.printf("�̵��� ��¥�� '%tF'�Դϴ�.\n",c);
		}
		
	}

	private static void m8() {
		
//		�⵵�� �Է¹޾� �ش� �⵵�� '���' ���� '����' ���� ����Ͻÿ�.
//
//		�Է�
//
//		�⵵ �Է� : 2019 
//		���
//
//		2019���� '���'�Դϴ�.
//		����
//
//		a. �⵵�� 4�� ������.
//		�������� b �˻�
//		�������� ������ "���"
//		b. �⵵�� 100���� ������.
//		�������� c �˻�
//		�������� ������ "����"
//		c. �⵵�� 400���� ������.
//		�������� "����"
//		�������� ������ "���"
//		Calendar, Date Ŭ���� ��� ����
		String word = null;
		System.out.print("�⵵ �Է� : ");
		int year = Integer.parseInt(scan.nextLine());
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					word = "����";
				} else {
					word = "���";
				}
			} else {
				word="����";
			}
		} else {
			word="���";
		}
		System.out.printf("%d���� '%s'�Դϴ�.",year,word);
	}

	private static void m7() {
		
//		���� ����� ����Ͻÿ�.
//
//		�Է�
//
//		[���� �ð�]
//		�� : 13 
//		�� : 30 
//		[���� �ð�]
//		�� : 14 
//		�� : 20 
//		���
//
//		���� ����� 4,000���Դϴ�.
//		����
//
//		���� ���� : 30��
//		�ʰ� 10�д� : 2,000��
//		Calendar�� ����ؼ� �ѹ� Ǯ��, ������� ���� �ѹ� Ǫ�ÿ�.
		
		System.out.print("[���� �ð�]\n");
		System.out.print("�� : ");
		int hour = Integer.parseInt(scan.nextLine());
		System.out.print("�� : ");
		int min = Integer.parseInt(scan.nextLine());
		
		System.out.print("[���� �ð�]\n");
		System.out.print("�� : ");
		int hour1 = Integer.parseInt(scan.nextLine());
		System.out.print("�� : ");
		int min1 = Integer.parseInt(scan.nextLine());
		int sum = hour*60+min;
		int sum1 = hour1*60+min1;
		System.out.printf("���� ����� %,3d���Դϴ�.\n",(sum1-sum-30)/10*2000);
		
		Calendar before = Calendar.getInstance();
		Calendar after = Calendar.getInstance();
		before.set(Calendar.HOUR, hour);
		before.set(Calendar.MINUTE, min);
		
		after.set(Calendar.HOUR, hour1);
		after.set(Calendar.MINUTE, min1);
		
		System.out.printf("���� ����� %,3d���Դϴ�.\n",((after.getTimeInMillis()-before.getTimeInMillis())/(1000*60)-30)/10*2000);
		
	}

	private static void m6() {
		
//		���� 5���� �Է¹޾� ¦���� Ȧ���� ������ ����Ͻÿ�.
//
//		�Է�
//
//		���� �Է� : 3 
//		���� �Է� : 2 
//		���� �Է� : 7 
//		���� �Է� : 1 
//		���� �Է� : 8 
//		���
//
//		¦���� 2�� Ȧ���� 3�� �Է��߽��ϴ�.
//		Ȧ���� ¦������ 1�� �� �����ϴ�.
//		����
//
//		1 ~ 10 ������ ������ �Է¹����ÿ�.
		
		int count = 0;
		int []index = {0,0,0,0,0}; 
		while(count<=4) {
			System.out.print("���� �Է� : ");
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
	
		System.out.printf("¦���� %d�� Ȧ���� %d�� �Է��߽��ϴ�.\n",even,odd);
		System.out.printf("%s�� %s���� %d�� �� �����ϴ�.\n",(even>odd)?"¦��":"Ȧ��",(even>odd)?"Ȧ��":"¦��",(even>odd)?even-odd:odd-even);
	}

	private static void m5() {
		
//		������ 1���� �Է¹޾� ��/�ҹ��� ��ȯ�� �� �� ����Ͻÿ�.
//
//		�Է�
//
//		���� : a 
//		���
//
//		��� : A
//		�Է�
//
//		���� : F 
//		���
//
//		��� : f
		
		System.out.print("���� : ");
		char c = scan.nextLine().charAt(0);
		System.out.printf("%c",c-32);
	}

	private static void m4() {
		
//		���� 1���� �Է¹޾� �Ʒ��� ���� ����Ͻÿ�.
//
//		�Է�
//
//		���� : f 
//		���
//
//		Father
//		����
//
//		f, F �� Father
//		m, M �� Mother
//		s, S �� Sister
//		b, B �� Brother
		
		System.out.print("���� : ");
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
		
//		���� 2���� ������ 1���� �Է¹޾� ���� ������ ����� ����Ͻÿ�.
//
//		�Է�
//
//		ù��° ���� : 5 
//		�ι�° ���� : 3 
//		������ : * 
//		���
//
//		5 * 3 = 15
//		����
//
//		������ �Է��Ͻÿ�.
//		���� ����� �Ҽ����ϰ� ����� ù°�ڸ����� ��� �Ͻÿ�.
//		�����ڴ� ��� �����ڸ� �Է��Ͻÿ�.
		
		System.out.print("ù��° ���� : ");
		int n1 = Integer.parseInt(scan.nextLine());
		System.out.print("�ι�° ���� : ");
		int n2 = Integer.parseInt(scan.nextLine());
		System.out.print("������ : ");
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
		
//		�л��� ���� ������ �Է¹޾� ������ ����Ͻÿ�.
//
//		�Է�
//
//		���� : 85 
//		���
//
//		�Է��� 85���� ���� B�Դϴ�.
//		����
//
//		90 ~ 100 : A
//		80 ~ 89 : B
//		70 ~ 79 : C
//		60 ~ 69 : D
//		0 ~ 59 : F
		
		System.out.print("���� : ");
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
		System.out.printf("�Է��� %d���� ���� %c�Դϴ�.",grade,c);
	}

	private static void m1() {
		
//		���� 2���� �Է¹޾� ū���� �������� ����Ͻÿ�.
//
//		�Է�
//
//		ù��° ���� : 5 
//		ù��° ���� : 3 
//		���
//
//		ū���� 5�̰�, �������� 3�Դϴ�.
//		�߰�����
//
//		�μ��ڰ� ���� ���̸� ���̴��� ����Ͻÿ�.
//		�Է��� �� ���ڴ� 2�� ���̳��ϴ�.
		
		System.out.print("ù��° ���� : ");
		int n1= Integer.parseInt(scan.nextLine());
		System.out.print("�ι�° ���� : ");
		int n2= Integer.parseInt(scan.nextLine());
		
		if(n1>n2) {
			System.out.printf("ū���� %d�̰�, �������� %d�Դϴ�.\n",n1,n2);
			System.out.printf("�Է��� �� ���ڴ� %d�� ���̳��ϴ�.\n",n1-n2);
			
		} else {
			System.out.printf("ū���� %d�̰�, �������� %d�Դϴ�.\n",n2,n1);
			System.out.printf("�Է��� �� ���ڴ� %d�� ���̳��ϴ�.\n",n2-n1);
		}
		
	}
	
}
