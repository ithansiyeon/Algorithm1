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
//		연산식을 입력받아 실제 연산을 하시오.
//
//		입력
//
//		10 + 2 
//		출력
//
//		10 + 2 = 12
//		입력
//
//		2 * 7 
//		출력
//
//		2 + 7 = 14
//		입력
//
//		2*7  //띄어쓰기 무관
//		출력
//
//		2 + 7 = 14
//		입력
//
//		10 # 5 
//		출력
//
//		연산자가 올바르지 않습니다.
//		입력
//
//		10 + 
//		출력
//
//		피연산자가 부족합니다.
//		조건
//
//		산술 연산자만 구현(+, -, *, /, %)
//		연산식의 공백은 무관하게
//		산술 연산자가 반드시 존재하는지 체크
//		피연산자의 갯수가 2개인지 체크
		System.out.print("입력 : ");
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
				System.out.printf("연산자가 올바르지 않습니다.\n");
			}
		}
		
		if(count==2) {
			System.out.println("피연산자가 부족합니다.\n");
		} 
		
	}
	private static void m12() {
//		입력받은 문장에서 숫자들을 찾아 그 합을 구하시오.
//
//		입력
//
//		저는 홍길동입니다. 제 나이는 20살입니다. 몸무게는 72kg입니다. 전화번호는 010-2848-9372입니다. 
//		출력
//
//		문장에 존재하는 모든 숫자의 합은 55입니다.
		
		System.out.print("입력 : ");
		String content = scan.nextLine();
		int sum = 0;
		for(int i=0;i<content.length();i++) {
			int num = (int)content.charAt(i)-48;
			if(num>=0 && num<=9) {
				sum+=num;
			}
		}
		System.out.printf("문장에 존재하는 모든 숫자의 합은 %d입니다.",sum);
	}
	private static void m11() {
		System.out.print("금액(원) : ");
		String money = scan.nextLine();
		money = String.format("%5d", Integer.parseInt(money));
		String result = "";
		for(int i = 0;i<money.length();i++) {
		
			switch(money.charAt(i)) {
			case '1':
				result+="일";
				break;
			case '2' :
				result+="이";
				break;
			case '3' :
				result+="삼";
				break;
			case '4' :
				result+="사";
				break;
			case '5' :
				result+="오";
				break;
			case '6' :
				result+="육";
				break;
			case '7' :
				result+="칠";
				break;
			case '8' :
				result+="팔";
				break;
			case '9' :
				result+="구";
				break;
			
			}
			if(money.charAt(i)!=' ') {
				if(i==0) {
					result+="만";
				} else if(i==1) {
					result+="천";
				} else if(i==2) {
					result+="백";
				} else if(i==3) {
					result+="십";
				} else if(i==4) {
					result+="원";
				}
			}
		}
		System.out.printf("금액(원) : %s",result);
	}
	private static void m10() {
		System.out.print("입력 : ");
		String content = scan.nextLine();
		String [] word = {"바보","멍청이"};
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
		System.out.printf("금지어를 %d회 마스킹했습니다.",count);
	}
	private static void m9() {
		System.out.print("주민등록번호 : ");
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
			System.out.print("올바른 주민등록번호입니다.");
		} else {
			System.out.print("올바르지 않은 주민등록번호입니다.");
		}
	}
	private static void m8() {
		String content = "안녕~ 길동아~ 잘가~ 길동아~";
		String word = "길동";
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
		System.out.printf("'%s'을 총 %d회 발견했습니다.",word,count);
	}
	private static void m7() {
		
		System.out.print("단어 : ");
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
		System.out.printf("결과 : %s",result);
	}
	private static void m4() {
		String[] txt = new String[10];
		for(int i=0; i<10 ;i++) {
			System.out.printf("파일명 : ");
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
		System.out.printf("gif : %d개\n",cnt[0]);
		System.out.printf("jpg : %d개\n",cnt[1]);
		System.out.printf("png : %d개\n",cnt[2]);
		System.out.printf("hwp : %d개\n",cnt[3]);
		System.out.printf("doc : %d개\n",cnt[4]);
		
	}
	private static void m3() {
		
//		숫자를 입력받아 각 자릿수의 수의 합을 구하시오.
//
//		입력
//
//		숫자 : 314 
//		출력
//
//		결과 : 3 + 1 + 4 = 8
//		조건
//
//		산술연산자로 작성하지 마시오.(n % 10, n / 10 사용 금지) → 문자열 추출 메소드 사용.
//		자릿수의 길이는 제한 없음.
//		도움
//
//		String txt = "321" → char c = (int)txt.charAt(0) → c의 값이 3인가??
		
		System.out.print("숫자 : ");
		int sum = 0;
		String txt = scan.nextLine();
		String result = "";
		for(int i=0;i<txt.length();i++) {
			result+=txt.charAt(i)+" + ";
			sum+=(int)txt.charAt(i)-48;
		}
		System.out.print("결과 : ");
		System.out.printf("%s = %d",result,sum);
		
	}
	
	private static void m1() {
		
//		문장을 입력받아 역순으로 출력하시오.
//
//		입력
//
//		문장 입력 : 안녕하세요. 홍길동입니다. 
//		출력
//
//		역순 결과 : .다니입동길홍 .요세하녕안
//		도움
//
//		루프 변수 i를 어떻게 제어하느냐?
//		txt.charAt(i)
//		txt.substring(i, i+1)
		
		System.out.print("문장 입력 : ");
		String line = scan.nextLine();
		System.out.print("역순 결과 : ");
		for(int i=line.length()-1;i>=0;i--) {
			System.out.print(line.charAt(i));
		}
	}

	private static void m5() {
		System.out.print("숫자 : ");
		String num = scan.nextLine();
		for(int i=num.length()-3;i>=0;i-=3) {
			String temp = num.substring(i);
			String temp1 = num.substring(0,i);
			num = temp1+","+temp;
		}
		System.out.println(num);
	}

	private static void m2() {
		
		System.out.print("이메일 : ");
		String email = scan.nextLine();
		
		System.out.printf("아이디 : %s\n",email.substring(0,email.indexOf("@")));
		System.out.printf("도메인 : %s",email.substring(email.indexOf("@")+1,email.length()));
		
	}

	private static void m6() {
		String before = "    하나    둘    셋    ";
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
