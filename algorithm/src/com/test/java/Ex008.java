package com.test.java;

import java.util.Scanner;

public class Ex008 {
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
		m13();
	}
	private static void m13() {
//		������� �Է¹޾� ���� ������ �Ͻÿ�.
//
//		�Է�
//
//		10 + 2 
//		���
//
//		10 + 2 = 12
//		�Է�
//
//		2 * 7 
//		���
//
//		2 + 7 = 14
//		�Է�
//
//		2*7  //���� ����
//		���
//
//		2 + 7 = 14
//		�Է�
//
//		10 # 5 
//		���
//
//		�����ڰ� �ùٸ��� �ʽ��ϴ�.
//		�Է�
//
//		10 + 
//		���
//
//		�ǿ����ڰ� �����մϴ�.
//		����
//
//		��� �����ڸ� ����(+, -, *, /, %)
//		������� ������ �����ϰ�
//		��� �����ڰ� �ݵ�� �����ϴ��� üũ
//		�ǿ������� ������ 2������ üũ
		System.out.print("�Է� : ");
		String content = scan.nextLine();
		content = content.replace(" ", "");
		
		int index = 0;
	
		int num1 = 0;
		int num2 = 0;
		
		int count = 0;

		for(int i=0;i<content.length();i++) {
	
			switch(content.charAt(i)) {
			case '+':
				if(content.startsWith("+")) count++;
				if(content.endsWith("+")) count++;
				if(count!=2) {
					index = content.indexOf('+');
					num1 = Integer.parseInt(content.substring(0,index));
					num2 = Integer.parseInt(content.substring(index+1,content.length()));
					System.out.printf("%d + %d = %d",num1,num2,num1+num2);
				}
				break;
			case '-':
				if(content.startsWith("-")) count++;
				if(content.endsWith("-")) count++;
				if(count!=2)
				System.out.printf("%d - %d = %d",num1,num2,num1-num2);
				break;
			case '*':
				if(content.startsWith("*")) count++;
				if(content.endsWith("*")) count++;
				if(count!=2)
				System.out.printf("%d * %d = %d",num1,num2,num1*num2);
				break;
			case '/':
				if(content.startsWith("/")) count++;
				if(content.endsWith("/")) count++;
				if(count!=2)
				System.out.printf("%d - %d = %.1f",num1,num2,num1/num2);
				break;
			case '%':
				if(content.startsWith("%")) count++;
				if(content.endsWith("%")) count++;
				if(count!=2)
				System.out.printf("%d - %d = %d",num1,num2,num1%num2);
				break;
			default:
				if(!(content.charAt(i)-48 >=1 && content.charAt(i)-48 <10))
				System.out.printf("�����ڰ� �ùٸ��� �ʽ��ϴ�.\n");
			}
		}
		
		if(count==2) {
			System.out.println("�ǿ����ڰ� �����մϴ�.\n");
		} 
		
	}
	private static void m12() {
//		�Է¹��� ���忡�� ���ڵ��� ã�� �� ���� ���Ͻÿ�.
//
//		�Է�
//
//		���� ȫ�浿�Դϴ�. �� ���̴� 20���Դϴ�. �����Դ� 72kg�Դϴ�. ��ȭ��ȣ�� 010-2848-9372�Դϴ�. 
//		���
//
//		���忡 �����ϴ� ��� ������ ���� 55�Դϴ�.
		
		System.out.print("�Է� : ");
		String content = scan.nextLine();
		int sum = 0;
		for(int i=0;i<content.length();i++) {
			int num = (int)content.charAt(i)-48;
			if(num>=0 && num<=9) {
				sum+=num;
			}
		}
		System.out.printf("���忡 �����ϴ� ��� ������ ���� %d�Դϴ�.",sum);
	}
	private static void m11() {
		System.out.print("�ݾ�(��) : ");
		String money = scan.nextLine();
		money = String.format("%5d", Integer.parseInt(money));
		String result = "";
		for(int i = 0;i<money.length();i++) {
		
			switch(money.charAt(i)) {
			case '1':
				result+="��";
				break;
			case '2' :
				result+="��";
				break;
			case '3' :
				result+="��";
				break;
			case '4' :
				result+="��";
				break;
			case '5' :
				result+="��";
				break;
			case '6' :
				result+="��";
				break;
			case '7' :
				result+="ĥ";
				break;
			case '8' :
				result+="��";
				break;
			case '9' :
				result+="��";
				break;
			
			}
			if(money.charAt(i)!=' ') {
				if(i==0) {
					result+="��";
				} else if(i==1) {
					result+="õ";
				} else if(i==2) {
					result+="��";
				} else if(i==3) {
					result+="��";
				} else if(i==4) {
					result+="��";
				}
			}
		}
		System.out.printf("�ݾ�(��) : %s",result);
	}
	private static void m10() {
		System.out.print("�Է� : ");
		String content = scan.nextLine();
		String [] word = {"�ٺ�","��û��"};
		int index = -word[0].length();
		int index1= -word[1].length();
		int count = 0;
		while(true) {
			index = content.indexOf(word[0],index+word[0].length());
			index1 = content.indexOf(word[1],index+word[1].length());
			if(index>-1)
				content = content.substring(0,index)+"**"+content.substring(index+word[0].length(),content.length());
			if(index1>-1)
				content = content.substring(0,index1)+"***"+content.substring(index1+word[1].length(),content.length());
			
			if(index>-1) {
				count++;
			}
			if(index1>-1) {
				count++;
			}
			if(index==-1 && index1 == -1) {
				break;
			}
		}
		System.out.println(content);
		System.out.printf("����� %dȸ ����ŷ�߽��ϴ�.",count);
	}
	private static void m9() {
		System.out.print("�ֹε�Ϲ�ȣ : ");
		String ssn = scan.nextLine();
		ssn = ssn.replace("-", "");
		int sum = 0;
		int count = 2;
		for(int i=0;i<ssn.length()-1;i++) {
			sum+=(((int)(ssn.charAt(i))-48)*count);
			count++;
			if(count==10) {
				count=2;
			}
		}
		System.out.println(11-sum%11);
		System.out.println((int)ssn.charAt(ssn.length()-1)-48);
		if((11-sum%11)==((int)ssn.charAt(ssn.length()-1)-48)) {
			System.out.print("�ùٸ� �ֹε�Ϲ�ȣ�Դϴ�.");
		} else {
			System.out.print("�ùٸ��� ���� �ֹε�Ϲ�ȣ�Դϴ�.");
		}
	}
	private static void m8() {
		String content = "�ȳ�~ �浿��~ �߰�~ �浿��~";
		String word = "�浿";
		int count = 0;
		int index = -word.length();
		while(true) {
			index = content.indexOf(word,index+word.length());
			if(index>=0) {
				count+=1;
			} else {
				break;
			}
		}
		System.out.printf("'%s'�� �� %dȸ �߰��߽��ϴ�.",word,count);
	}
	private static void m7() {
		
		System.out.print("�ܾ� : ");
		String word = scan.nextLine();
		String result = "";
		int j = 0;
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)>='A' && word.charAt(i)<='Z') {
				result += word.substring(j,i)+ " ";
				j=0;
				j+=i;
			}
			if(i==word.length()-1) {
				result+=word.substring(j,word.length());
			}
		}
		System.out.printf("��� : %s",result);
	}
	private static void m4() {
		String[] txt = new String[10];
		for(int i=0; i<10 ;i++) {
			System.out.printf("���ϸ� : ");
			txt[i] = scan.nextLine();
			
		}
		
		int[] cnt = new int[5];
		for(int i=0;i<10;i++) {
			if(txt[i].endsWith("gif")) {
				cnt[0]+=1;
			} else if(txt[i].endsWith("jpg")) {
				cnt[1]+=1;
			} else if(txt[i].endsWith("png")) {
				cnt[2]+=1;
			} else if(txt[i].endsWith("hwp")) {
				cnt[3]+=1;
			} else if(txt[i].endsWith("doc")) {
				cnt[4]+=1;
			} 
		}
		System.out.printf("gif : %d��\n",cnt[0]);
		System.out.printf("jpg : %d��\n",cnt[1]);
		System.out.printf("png : %d��\n",cnt[2]);
		System.out.printf("hwp : %d��\n",cnt[3]);
		System.out.printf("doc : %d��\n",cnt[4]);
		
	}
	private static void m3() {
		
//		���ڸ� �Է¹޾� �� �ڸ����� ���� ���� ���Ͻÿ�.
//
//		�Է�
//
//		���� : 314 
//		���
//
//		��� : 3 + 1 + 4 = 8
//		����
//
//		��������ڷ� �ۼ����� ���ÿ�.(n % 10, n / 10 ��� ����) �� ���ڿ� ���� �޼ҵ� ���.
//		�ڸ����� ���̴� ���� ����.
//		����
//
//		String txt = "321" �� char c = (int)txt.charAt(0) �� c�� ���� 3�ΰ�??
		
		System.out.print("���� : ");
		int sum = 0;
		String txt = scan.nextLine();
		String result = "";
		for(int i=0;i<txt.length();i++) {
			result+=txt.charAt(i)+" + ";
			sum+=(int)txt.charAt(i)-48;
		}
		System.out.print("��� : ");
		System.out.printf("%s = %d",result,sum);
		
	}
	
	private static void m1() {
		
//		������ �Է¹޾� �������� ����Ͻÿ�.
//
//		�Է�
//
//		���� �Է� : �ȳ��ϼ���. ȫ�浿�Դϴ�. 
//		���
//
//		���� ��� : .�ٴ��Ե���ȫ .�似�ϳ��
//		����
//
//		���� ���� i�� ��� �����ϴ���?
//		txt.charAt(i)
//		txt.substring(i, i+1)
		
		System.out.print("���� �Է� : ");
		String line = scan.nextLine();
		System.out.print("���� ��� : ");
		for(int i=line.length()-1;i>=0;i--) {
			System.out.print(line.charAt(i));
		}
	}

	private static void m5() {
		System.out.print("���� : ");
		String num = scan.nextLine();
		for(int i=num.length()-3;i>=0;i-=3) {
			String temp = num.substring(i);
			String temp1 = num.substring(0,i);
			num = temp1+","+temp;
		}
		System.out.println(num);
	}

	private static void m2() {
		
		System.out.print("�̸��� : ");
		String email = scan.nextLine();
		
		System.out.printf("���̵� : %s\n",email.substring(0,email.indexOf("@")));
		System.out.printf("������ : %s",email.substring(email.indexOf("@")+1,email.length()));
		
	}

	private static void m6() {
		String before = "    �ϳ�    ��    ��    ";
		int i = 0;
		int lcount = 0;
		int rcount = 0;
		int j = before.length()-1;
		while(before.charAt(i) == ' ') {
			lcount++;
			i++;
		}
		
		while(before.charAt(j)== ' ') {
			rcount++;
			j--;
		}
		
		String after = before.replace(" ","");
		for(int k = 0 ;k <lcount;k++) {
			after=" "+after;
		}
		
		for(int k = 0 ;k <rcount;k++) {
			after=after+" ";
		}
		System.out.println(before);
		System.out.println(after);
	}
}
