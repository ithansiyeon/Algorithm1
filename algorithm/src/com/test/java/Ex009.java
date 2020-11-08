package com.test.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex009 {
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
	}

	private static void m7() {
//		�ߺ����� �ʴ� ������ ���� 5���� ����ÿ�.
//
//		�Է�
//
//		����
//		���
//
//		[5, 6, 1, 3, 2]
//		����
//
//		������ ���� : 1 ~ 9
//		�߰�����
//
//		������ ������ �Է¹����ÿ�.
//		������ ������ �Է¹����ÿ�.
		
		System.out.print("�ּ� : ");
		int min = Integer.parseInt(scan.nextLine());
		System.out.print("�ִ� : ");
		int max = Integer.parseInt(scan.nextLine());
		System.out.print("������ ���� : ");
		int num = Integer.parseInt(scan.nextLine());
		Set<Integer> set = new HashSet<Integer>();
		while(set.size()!=num){
			set.add((int)(Math.random()*(max-min))+min);
		}
		int [] nums = new int[num];
		int j = 0;
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			nums[j]=it.next();
			j++;
		}
		System.out.println(Arrays.toString(nums));
	}

	private static void m6() {
//		1~20 ������ ������ 20�� ��� �ִ� �迭�� ������ �� �Ʒ��� ������ ������ ����Ͻÿ�.
//
//		�Է�
//
//		�ִ� ���� : 15 
//		�ּ� ���� : 5 
//		���
//
//		���� : 10, 2, 3, 20, 15, 9, 5, 1, 3, 11, 15, 18, 9, 14, 18, 5, 8, 2, 1, 17
//		��� : 10, 15, 9, 5, 11, 15, 9, 14, 5, 8
//		����
//
//		������ 20�� �߻� �� �迭�� �ִ´�.
//		������ 1 ~ 20 ����
//		�迭�� Ž���Ͽ� ������ �����ϴ� ���ڸ� ����Ѵ�.
		
		System.out.print("�ִ� ���� : ");
		int max = Integer.parseInt(scan.nextLine());
		System.out.print("�ּ� ���� : ");
		int min = Integer.parseInt(scan.nextLine());
		int [] nums = new int [20];
		int cnt = 0;
		for(int i=0;i<20;i++) {
			nums[i] = (int)(Math.random()*20)+1;
			if(nums[i]>=min && nums[i]<max) {
				cnt++;
			}
		}
		int [] num = new int[cnt];
		int j=0;
		for(int i=0;i<20;i++) {
			if(nums[i]>=min && nums[i]<max) {
				num[j]=nums[i];
				j++;
			}
		}
		System.out.println("���� : "+Arrays.toString(nums));
		System.out.println("��� : "+Arrays.toString(num));
	}

	private static void m5() {
//		1~20 ������ ������ ��� �ִ� �迭�� �����ϰ� �ִ밪�� �ּҰ��� ����Ͻÿ�.
//
//		�Է�
//
//		����
//		���
//
//		���� : 10, 9, 3, 18, 15, 9, 5, 4, 3, 11, 15, 18, 9, 14, 18, 5, 8, 7, 9, 17
//		�ִ밪 : 18
//		�ּҰ� : 3
//		����
//
//		������ 20�� �߻� �� �迭�� �ִ´�.
//		������ 1 ~ 20 ����
		
		int [] nums = new int[20];
		
		int max = -100;
		int min = 100;
		for(int i=0;i<nums.length;i++) {
			nums[i]=(int)(Math.random()*20)+1;
		}
		System.out.println("���� : "+Arrays.toString(nums));
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>max) {
				max = nums[i];
			} 
		}
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<min) {
				min = nums[i];
			} 
		}
		System.out.printf("�ִ� : %d\n",max);
		System.out.printf("�ּҰ� : %d",min);
	}

	private static void m4() {
		
//		������ ä���� �迭���� ù��° ����� �������� 2���� ���� ����� ����Ͻÿ�.
//
//		�Է�
//
//		�迭�� ���� : 10 
//		���
//
//		nums = [ 1, 5, 3, 6, 2, 7, 8, 2, 2, 9 ]
//		result = [ 6, 9, 9, 10, 11 ]
//		����
//
//		���� ���� : 1 ~10�̳�
		
		System.out.print("�迭�� ���� : ");
		int len = Integer.parseInt(scan.nextLine());
		int [] nums = new int[len];
		int [] result = new int[len/2];
		for(int i=0;i<len;i++) {
			nums[i]=(int)(Math.random()*10)+1;
		}
		for(int i=0;i<len/2;i++) {
			result[i]=nums[i]+nums[i+1];
		}
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(result));
	}

	private static void m3() {
//		�л��� �̸��� N�� �Է¹޾� �Ʒ��� ���� ����Ͻÿ�.
//
//		�Է�
//
//		�л� �� : 6 
//		�л��� : ȫ�浿 
//		�л��� : �ƹ��� 
//		�л��� : ������ 
//		�л��� : ȣȣȣ 
//		�л��� : ������ 
//		�л��� : ������ 
//		���
//
//		�Է��� �л��� �� 6���Դϴ�.
//		1. ������
//		2. ������
//		3. ȣȣȣ
//		4. ������
//		5. �ƹ���
//		6. ȫ�浿
		
		System.out.print("�л� �� : ");
		int num = Integer.parseInt(scan.nextLine());
		String []names = new String[num];
		for(int i=0;i<names.length;i++) {
			System.out.print("�л��� : ");
			names[i]=scan.nextLine();
		}
		System.out.printf("�Է��� �л��� ��%d���Դϴ�.\n",num);
		for(int i=0;i<names.length;i++) {
			System.out.printf("%d. %s\n",i+1,names[i]);
		}
	}

	private static void m2() {
		
//		���ڸ� 5�� �Է¹޾� �迭�� ���� �� �������� ����Ͻÿ�.
//
//		�Է�
//
//		���� : 5 
//		���� : 1 
//		���� : 7 
//		���� : 2 
//		���� : 3 
//		���
//
//		nums[4] = 3
//		nums[3] = 2
//		nums[2] = 7
//		nums[1] = 1
//		nums[0] = 5
		
		int []nums= new int[5];
		for(int i=0;i<5;i++) {
			System.out.print("���� : ");
			nums[i]=Integer.parseInt(scan.nextLine());
		}
		for(int i=nums.length-1;i>=0;i--) {
			System.out.printf("nums[%d] = %d\n",i,nums[i]);
		}
	}

	private static void m1() {
//		1���� int �迭�� �Ű������� �ؼ� ������ ���ڿ��� ��ȯ�ϴ� dump �޼ҵ带 �����Ͻÿ�.
//
//		�Է�
//
//		����
//		ȣ��
//
//		int[] list = new int[4];
//		list[0] = 10;
//		list[1] = 20;
//		list[2] = 30;
//		list[3] = 40;
//		String result = dump(list);
//		System.out.printf("nums = %s\n", result);
//		���
//
//		nums = [ 10, 20, 30, 40 ]
//		�޼ҵ� ���� String dump(int[] list)
		
		int[] list = new int[4];
		list[0] = 10;
		list[1] = 20;
		list[2] = 30;
		list[3] = 40;
		String result = dump(list);
		System.out.printf("nums = %s\n", result);
	}

	private static String dump(int[] list) {
		
		return Arrays.toString(list);
	}

	private static void m9() {
		
//		�迭�� ��Ҹ� �����Ͻÿ�.
//
//		�Է�
//
//		���� ��ġ : 2 
//		���
//
//		���� : [5, 6, 1, 3, 2]
//		��� : [5, 6, 3, 2, 0]
//		����
//
//		�迭�� ���� ���� : 5
//		���� ����
		
		System.out.print("���� ��ġ : ");
		int index = Integer.parseInt(scan.nextLine());
		
		int [] arr = new int[5];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*10);
		}
		System.out.println(Arrays.toString(arr));
		for(int i=index;i<=arr.length-2;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=0;
		System.out.println(Arrays.toString(arr));
	}

	private static void m8() {
		
//		�迭�� ��Ҹ� �����Ͻÿ�.
//
//		�Է�
//
//		���� ��ġ : 2 
//		�� : 100 
//		���
//
//		���� : [5, 6, 1, 3, 2, 0, 0, 0, 0, 0]
//		��� : [5, 6, 100, 1, 3, 2, 0, 0, 0, 0]
//		����
//
//		�迭�� ���� ���� : 10
//		���� ����
		System.out.print("���� ��ġ : ");
		int index = Integer.parseInt(scan.nextLine());
		System.out.print("�� : ");
		int value = Integer.parseInt(scan.nextLine());
		
		int [] arr = new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*10);
		}
		System.out.println(Arrays.toString(arr));
		for(int i=arr.length-1;i>=index;i--) {
			arr[i]=arr[i-1];
		}
		arr[index]=value;
		
		System.out.println(Arrays.toString(arr));
		
	}
	
}
