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
		
		System.out.print("ù��° ���� : ");
		int n1 = Integer.parseInt(scan.nextLine());
		System.out.print("�ι�° ���� : ");
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
		System.out.printf("%d�� ��� : %s\n",n1,result1);
		System.out.printf("%d�� ��� : %s\n",n2,result2);
		System.out.printf("%d�� %d�� ��� : %s\n",n1,n2,result3);
	}

	private static void m18() {
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
		
//		�ִ� 9�ڸ� ������ �Է¹޾� ���ڸ��� Ȧ�� �����հ� ¦�� �������� ���Ͻÿ�.
//
//		�Է�
//
//		9�ڸ� ���� �Է� : 273645281 
//		���
//
//		¦���� �� : 22
//		Ȧ���� �� : 16
//		����
//
//		9�ڸ��� �Ѿ�� ���� ����
//		9�ڸ� ���ϴ� ���� ����
//		����
//
//		Math.pow() �޼ҵ� ���(������ ���ϴ� �޼ҵ�)
//		Math.pow(10, 2) �� 100
//		Math.pow(10, 3) �� 1000
//		Math.pow(10, 4) �� 10000
		int even = 0;
		int odd = 0;
		System.out.print("9�ڸ� ���� �Է� : ");
		int num = Integer.parseInt(scan.nextLine());
		if(num > 0 && num < 1000000000) {
			for(int i=0;i<10;i++) {
				if((int)((num/Math.pow(10, i))%10)%2==0) {
					even+=(int)((num/Math.pow(10, i))%10);
				} else {
					odd+=(int)((num/Math.pow(10, i))%10);
					
				}
			}
			System.out.printf("¦���� �� : %d\n",even);
			System.out.printf("Ȧ���� �� : %d\n",odd);
		}
	}

	private static void m13() {
//		��ǻ�Ͱ� 1~10 ������ ���� 1���� �����ϸ� ����ڰ� ���ߴ� ���α׷��� �����Ͻÿ�.
//
//		�����
//
//		��ǻ�Ͱ� 1~10 ������ ���ڸ� 1�� �����߽��ϴ�.
//
//		���� : 1 
//		Ʋ�Ƚ��ϴ�.
//
//		���� : 3 
//		Ʋ�Ƚ��ϴ�.
//
//		���� : 7 
//		Ʋ�Ƚ��ϴ�.
//
//		���� : 2 
//		Ʋ�Ƚ��ϴ�.
//
//		���� : 5 
//		������ϴ�.
//
//		��ǻ�Ͱ� ������ ���ڴ� 5�Դϴ�.
//		������ ���ߴµ� �õ��� Ƚ���� 5ȸ�Դϴ�.
//
//		���α׷��� �����մϴ�.
		
		int cnum = (int)(Math.random()*10)+1;
		
		while(true) {
			System.out.print("���� : ");
			int num = Integer.parseInt(scan.nextLine());
			if(num==cnum) {
				System.out.println("������ϴ�.");
				break;
			} else if(num!=cnum) {
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}
			
		}
		
	}

	private static void m12() {
		
//		���ڸ� 10�� �Է¹޾� �ѱ۷� ��ȯ �� ����Ͻÿ�.
//
//		�Է�
//
//		���� : 5 
//		���� : 7 
//		���� : 4 
//		���� : 3 
//		���� : 5 
//		���� : 7 
//		���� : 6 
//		���� : 2 
//		���� : 1 
//		���� : 3 
//		���
//
//		��� : ��ĥ����ĥ�����ϻ�
//		����
//
//		2�ڸ� �̻� ���ڸ� �Է��ϸ� ������� ���α׷��� ������Ű�ÿ�.
		
		String result = "";
		for(int i = 0 ; i < 10; i++) {
			System.out.print("���� : ");
			int num = Integer.parseInt(scan.nextLine());
			if(num > 0 && num < 1000) {
				switch(num) {
				case 1 :
					result += "��";
				break;
				case 2:
					result += "��";
				break;
				case 3:
					result += "��";
				break;
				case 4:
					result += "��";
				break;
				case 5:
					result += "��";
				break;
				case 6:
					result += "��";
				break;
				case 7:
					result += "ĥ";
				break;
				case 8:
					result += "��";
				break;
				case 9:
					result += "��";
				break;
					
				}
			}
		}
		System.out.println(result);
	}

	private static void m11() {
//		�䱸����.011
//		����ڰ� �Է��� ������ ���ڱ��� 369 ������ ����� ����Ͻÿ�.
//
//		�Է�
//
//		�ִ� ���� : 100 
//		���
//
//		1   2   ¦   4   5   ¦ .. 100
//		����
//
//		�ִ� 3�ڸ������� �Է��Ͻÿ�.
		System.out.print("�ִ� ���� : ");
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
							System.out.print("¦");
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
		
//		�䱸����.010
//		���� 1�� 1�� 1�Ϻ��� ���ñ��� ��ĥ°���� ���� ���Ͻÿ�.
//
//		�Է�
//
//		����
//		���
//
//		2019�� 2�� 12���� 4,567,890��° �Ǵ� ���Դϴ�.
//		����
//
//		Calendar, Date ��� ����
//		�߰�����
//
//		������ ���� �����ΰ�?
		
		int year = 1;
		int month = 1;
		int day = 1;
		//int sday = year*365+1;
		//��� 28��
		//���� 29�� 
		//2�� ���̾ƴ� ������ ���� 31�� 
		//2019x12
		//2019 x 365
		//+1 366
//		a. �⵵�� 4�� ������.
//		�������� b �˻�
//		�������� ������ "���"
//		b. �⵵�� 100���� ������.
//		�������� c �˻�
//		�������� ������ "����"
//		c. �⵵�� 400���� ������.
//		�������� "����"
//		�������� ������ "���"
		
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
		
		System.out.printf("2020�� 10�� 31���� %,d��° �Ǵ� ���Դϴ�.\n",sday);
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
		
//		���ڸ� N�� �Է¹޾� �Ʒ��� ���� ����Ͻÿ�.
//
//		�Է�
//
//		���� : 4 
//		���� : 7 
//		..
//		���� : 15 
//		���� : 12 
//		���
//
//		4 - 7 + .. - 15 + 12 = 1XX
//		����
//
//		�������� 100�� �Ѿ�� ���� ������ �����Ͻÿ�.
//		¦���� ���ϰ� Ȧ���� ���ÿ�.
//		�߰�����
//
//		������ ������ �������� ����ڰ� �Է��� �� �ֵ��� �Ͻÿ�.
		
		System.out.print("���� : ");
		int ennum = Integer.parseInt(scan.nextLine());
	
		System.out.print("���� : ");
		int num = Integer.parseInt(scan.nextLine());
		int sum = 0;
		sum = num;
		String result = sum+"";
		while(true) {
			if(sum>ennum) {
				break;
			} else {
			System.out.print("���� : ");
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
		
//		�Է�
//
//		����
//		���
//
//		1 + 2 + 3 + 4 + 5 + ... + XX = 10XX
//		����
//
//		�������� 1000�� �Ѿ�� ���� ������ �����Ͻÿ�.
//		�߰�����
//
//		������ ������ �������� ����ڰ� �Է��� �� �ֵ��� �Ͻÿ�.
		
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
//		������ �Է¹޾� ����Ͻÿ�. �� �ൿ�� �ݺ��Ͻÿ�.
//
//		�Է�
//
//		�Ʒ��� �Է��ϼ���.
//		�ȳ��ϼ���. 
//		���� ȫ�浿�Դϴ�. 
//		�ݰ����ϴ�. 
//
//		���
//
//		�ȳ��ϼ���.
//		���� ȫ�浿�Դϴ�.
//		�ݰ����ϴ�.
//		���α׷��� �����մϴ�.
//		����
//
//		�ƹ��͵� �Է����� �ʰ� ���͸� ġ�� �Է� ���Ḧ �Ͻÿ�.
		
	
		System.out.println("�Ʒ��� �Է��ϼ���.");
		while(true) {
			String line = scan.nextLine();
			if(line.equals("")) {
				break;
			}
		}
	}

	private static void m6() {
//		�Ʒ��� ���� ����Ͻÿ�.
//
//		�Է�
//
//		����
//		���
//
//		1 - 2 + 3 - 4 + 5 - 6 + 7 - 8 + 9 - 10 = -5
//		�߰�����
//
//		����/���� ���ڸ� ����ڿ��� �Է¹޾� ����Ͻÿ�.
		
		System.out.print("���� : ");
		int sn = Integer.parseInt(scan.nextLine());
		System.out.print("���� : ");
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
//		�䱸����.005
//		�Ʒ��� ���� ����Ͻÿ�.
//
//		�Է�
//
//		����
//		���
//
//		1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
//		�߰�����
//
//		����/���� ���ڸ� ����ڿ��� �Է¹޾� ����Ͻÿ�.
		System.out.print("���� : ");
		int sn = Integer.parseInt(scan.nextLine());
		System.out.print("���� : ");
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
//		���� 10���� �Է¹޾� ¦���� �հ� Ȧ���� ���� ���� ����Ͻÿ�.
//
//		�Է�
//
//		���� : 5 
//		���� : 2 
//		���� : 12 
//		..
//		���� : 7 
//		���� : 24 
//		���
//
//		¦���� �� : 52
//		Ȧ���� �� : 42
//		����
//
//		õ���� ����Ͻÿ�.
//		�߰�����
//
//		�Է¹��� ������ ������ �Է¹����ÿ�.
		int odd = 0;
		int even = 0;
		System.out.print("���� ���� : ");
		int cnt = Integer.parseInt(scan.nextLine());
		for(int i=0;i<cnt;i++) {
			System.out.print("���� : ");
			int n = Integer.parseInt(scan.nextLine());
			if(n % 2 == 0) {
				even+=n;
			} else {
				odd+=n;
			}
		}
		System.out.printf("¦���� �� : %d\n",even);
		System.out.printf("Ȧ���� �� : %d",odd);
	}

	private static void m3() {
//		�䱸����.003
//		���� 1���� �Է¹޾� 1���� �Է��� ���ڱ����� ���� ����Ͻÿ�.
//
//		�Է�
//
//		���� : 5 
//		���
//
//		1 ~ 5 = 15
//		����
//
//		õ���� ����Ͻÿ�.
		System.out.print("���� : ");
		int num = Integer.parseInt(scan.nextLine());
		int sum = 0;
		for(int i=1;i<=num;i++) {
			sum+=i;
		}
		System.out.printf("1 ~ %d = %,3d",num,sum);
		
	}

	private static void m2() {
		
//		���� 2���� �Է� �޾� ���� ���ڿ��� ���� ���ڱ��� 1�� �����ϸ� ����Ͻÿ�.
//
//		�Է�
//
//		���� ���� : 5 
//		���� ���� : 12 
//		���
//
//		5
//		6
//		7
//		8
//		9
//		10
//		11
//		12
//		�߰� ����
//
//		����ġ�� �Է¹����ÿ�.
		
		System.out.print("���� ���� : ");
		int sn = Integer.parseInt(scan.nextLine());
		System.out.print("���� ���� : ");
		int en = Integer.parseInt(scan.nextLine());
		
		for(int i=sn;i<=en;i++) {
			System.out.println(i);
		}
		
	}

	private static void m1() {
		
//		������� �̸��� �λ��� Ƚ���� �Է� �޾� ����Ͻÿ�.
//
//		�Է�
//
//		�̸� : ȫ�浿 
//		Ƚ�� : 3 
//		���
//
//		ȫ�浿�� �ȳ��ϼ���~
//		ȫ�浿�� �ȳ��ϼ���~
//		ȫ�浿�� �ȳ��ϼ���~
		
		System.out.print("�̸� : ");
		String name = scan.nextLine();
		System.out.print("Ƚ�� : ");
		int cnt = Integer.parseInt(scan.nextLine());
		for(int i=0;i<cnt;i++) {
			System.out.printf("%s�� �ȳ��ϼ���~\n",name);
		}
	}
}
