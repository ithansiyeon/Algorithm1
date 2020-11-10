package com.test.java;

public class Ex011 {
	public static void main(String[] args) {
		//m1();
		//m2();
		//m3();
		//m4();
		m5();
	}

	private static void m5() {
		Refrigerator r = new Refrigerator();

		Item item1 = new Item();
		item1.setName("��ġ");
		item1.setExpiration("2020-04-30");
		r.add(item1);//����� �ֱ�

		Item item2 = new Item();
		item2.setName("��α�");
		item2.setExpiration("2020-04-15");
		r.add(item2);//����� �ֱ�

		Item item3 = new Item();
		item3.setName("��ġ����");
		item3.setExpiration("2020-03-31");
		r.add(item3);//����� �ֱ�

		Item item4 = r.get("��α�");//������� ������
		System.out.printf("%s�� ������� : %s\n", item4.getName(), item4.getExpiration());

		System.out.printf("����� ���� �� ������ ���� : %d��\n", r.count());

		r.listItem();
	}

	private static void m4() {
		Box box1 = new Box();
		box1.cook();
		box1.check();
		box1.list();
	}

	private static void m3() {
		
//		Bugles ��ü�� ����
//		����, �뷮, ��������, �������
//		��� ��� ������ ���� �����ڴ� private���� �Ѵ�.
//		��� ������ ���� Setter�� Getter�� �����Ѵ�.
//		�뷮 : ���� ����, 300g, 500g, 850g
//		���� : �б� ����, 850��(300g), 1200��(500g), 1950��(850g)
//		�������� : ���� ����(Calendar)
//		����������� : �б� ����, ����� ��ǰ�� ������� ���� : 7��(300g), 10��(500g), 15��(850g)
//		Bugles ��ü �޼ҵ�
//		void eat() : ���� �Ա�
		
		Bugles snack = new Bugles();
		snack.setWeight(500);
		snack.setCreationTime("2020-04-22");
		System.out.printf("���� : %,d��\n", snack.getPrice());
		System.out.printf("���� ������ %d�� ���ҽ��ϴ�.\n", snack.getExpiration());
		snack.eat();

		Bugles snack2 = new Bugles();
		snack2.setWeight(300);
		snack2.setCreationTime("2020-11-11");
		System.out.printf("���� : %,d��\n", snack2.getPrice());
		System.out.printf("���� ������ %d�� ���ҽ��ϴ�.\n", snack2.getExpiration());
		snack2.eat();   
	}

	private static void m2() {
		
//		����
//
//		Note ��ü�� ����
//		ũ��, ǥ�� ����, ��������, �������̸�, ����
//		��� ��� ������ ���� �����ڴ� private���� �Ѵ�.
//		��� ������ ���� Setter�� Getter�� �����Ѵ�.
//		ũ�� : ���� ����, A3, A4, A5, B3, B4, B5
//		ǥ�� ���� : ���� ����, ������, ���, �����, �Ķ���
//		�������� : ���� ����, 10 ~ 200������ �̳�
//		(+) 10~50(���), 51 ~ 100(����), 101 ~ 200(�β���)
//		�������̸� : ���� ����, �ѱ� 2~5���̳�. �ʼ���
//		���� : Setter,Getter ���� ����. ���� info() �޼ҵ忡�� ����ϱ� ���� �Ʒ��� ���� ��Ģ���� ���
//		(+) �⺻ ��Ʈ : A5 + ��� + 10������ = ����(500��)
//		(+) ũ�� ���� : A3(+400��), A4(+200��), B3(+500��), B4(+300��), B5(+100��)
//		(+) ���� ���� : ������(+100��), �����(+200��), �Ķ���(+200��)
//		(+) �������� ���� : ������ �� x 10�� �߰�
//		Note ��ü�� ������ Ȯ���ϱ� ���� �޼ҵ带 �����Ѵ�.
//		String info()
//		Note�� �� ����Ǿ����� ��ü�� ������ ����غ���.
//		Note ��ü ���� �� �� �ֱ� + �� ��� ��
		
		Note note = new Note();
		note.setSize("B4");
		note.setColor("�����");
		note.setPage(25);
		note.setOwner("ȫ�浿");
		System.out.println(note.info());

		Note note2 = new Note();
		note2.setSize("A4");
		note2.setColor("������");
		note2.setPage(100);
		System.out.println(note2.info());
		
	}

	private static void m1() {
		
//		Book Ŭ������ �����Ͻÿ�.
//
//		����
//
//		Book ��ü�� ����
//		����, ����, ����, ���ǻ�, ����⵵, ISBN, ��������
//		��� ��� ������ ���� �����ڴ� private���� �Ѵ�.
//		��� ������ ���� Setter�� Getter�� �����Ѵ�.
//		���� : �б�/����, �ִ� 50�� �̳�(�ѱ�, ����, ����)
//		���� : �б�/����, 0 ~ 1000000��
//		���� : �б�/����, ���� ����
//		�������� : �б�/����, 1~������
//		���ǻ� : ���� ����
//		����⵵ : �б� ����(2020��)
//		ISBN : �б�/����
//		Book ��ü�� ��� ������ ���ڿ��� ��ȯ�ϴ� �޼ҵ带 �����Ѵ�.
//		String info()
//		Ŭ������ �� ����Ǿ����� ��ü�� ������ ����غ���.
//		Book ��ü ���� �� �� �ֱ� + �� ��� ��
		
		Book b = new Book();
		b.setTitle("�̰��� �ڹٴ�");
		b.setPage(10000);
		b.setIsbn("9788968481475");
		b.setAuthor("�ſ��");
		b.setPrice(30000);
		b.setPublisher("�Ѻ��̵��");
		System.out.println(b.info());
	}
}
