package com.test.java;

public class Ex014 {
	public static void main(String[] args) {
		//�迭 ����
		MyArrayList list = new MyArrayList();

		//�߰�
		list.add("ȫ�浿");
		list.add("�ƹ���");
		list.add("������");

		//�б�
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
	
		//����
		System.out.println(list.size());
		System.out.println();
		//Ž�� + �б�
		for (int i=0; i<list.size(); i++) {
		    System.out.println(list.get(i));
		}
		System.out.println();
		//����
		list.set(0, "������");
		System.out.println(list.get(0));
		System.out.println();
		//����
		list.remove(1);
		for (int i=0; i<list.size(); i++) {
		    System.out.println(list.get(i));
		}
		System.out.println();
		//����
		list.add(1, "ȣȣȣ");
		for (int i=0; i<list.size(); i++) {
		    System.out.println(list.get(i));
		}	
		System.out.println();
		//�˻�(indexOf)
		if (list.indexOf("ȫ�浿") > -1) {
		    System.out.println("ȫ�浿 ����");
		} else {
		    System.out.println("ȫ�浿 ����");
		}

		//�ʱ�ȭ
		list.clear();
		System.out.println(list.size());

		//----------------------------------------

		//�ٽ� �߰�
		list.add("ȫ�浿");
		list.add("�ƹ���");
		list.add("������");

		//�˻�(contains)
		System.out.println(list.contains("ȫ�浿"));
		System.out.println(list.contains("ȣȣȣ"));

		//�� �迭 Ȯ��
		System.out.println(list.isEmpty());
		list.clear();
		System.out.println(list.isEmpty());

		//�ٽ� �߰�
		list.add("����");
		list.add("��Ȳ");
		list.add("���");
		list.add("�ʷ�");
		list.add("�Ķ�");
		list.add("����");
		list.add("����");

		//�κ� �迭 ����
		MyArrayList rainbow = list.subList(2, 5);

		for (int i=0; i<rainbow.size(); i++) {
		    System.out.println(rainbow.get(i));
		}
	}
}
