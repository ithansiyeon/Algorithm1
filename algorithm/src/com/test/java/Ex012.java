package com.test.java;

public class Ex012 {
	public static void main(String[] args) {
		//m1();
		m2();
	}

	private static void m2() {
		//�ٸ���Ÿ
		Barista barista = new Barista();

		//�մ� 1
		//���������� 1�� �ֹ� - ���� 30g
		Espresso e1 = barista.makeEspresso(30);
		e1.drink();

		//�մ� 2
		//���� 1�� �ֹ� - ���� 30g, ���� 250ml
		Latte l1 = barista.makeLatte(30, 250);
		l1.drink();

		//�մ� 3
		//�Ƹ޸�ī�� 1�� �ֹ� - ���� 30g, �� 300ml, ������ 20��
		Americano a1 = barista.makeAmericano(30, 300, 20);
		a1.drink();

		//�մ� 4
		//���������� 10�� �ֹ� - ���� 25g
		Espresso[] e2 = barista.makeEspressoes(25, 10);

		for (Espresso e : e2) {
		    e.drink();
		}

		//�մ� 5
		//���� 5�� �ֹ� - ���� 25g, ���� 300ml
		Latte[] l2 = barista.makeLattes(25, 300, 5);

		for (Latte l : l2) {
		    l.drink();
		}

		//�մ� 6
		//�Ƹ޸�ī�� 15�� �ֹ� - ���� 20g, �� 350ml, ������ 30��
		Americano[] a2 = barista.makeAmericanos(20, 350, 30, 15);

		for (Americano a : a2) {
		    a.drink();
		}

		//���
		barista.result();
	}

	private static void m1() {
		//�����ϴ� ����
		Packer packer = new Packer();

		//����
		Pencil p1 = new Pencil();
		p1.setHardness("HB");
		packer.packing(p1);

		Pencil p2 = new Pencil();
		p2.setHardness("4B");
		packer.packing(p2);

		//���찳
		Eraser e1 = new Eraser();
		e1.setSize("Large");
		packer.packing(e1);

		//����
		BallPointPen b1 = new BallPointPen();
		b1.setThickness(0.3);
		b1.setColor("black");
		packer.packing(b1);

		BallPointPen b2 = new BallPointPen();
		b2.setThickness(1.5);
		b2.setColor("red");
		packer.packing(b2);

		//��
		Ruler r1 = new Ruler();
		r1.setLength(30);
		r1.setShape("����");
		packer.packing(r1);

		//��� Ȯ��
		packer.countPacking(0);
		packer.countPacking(1);
		packer.countPacking(2);
		packer.countPacking(3);
		packer.countPacking(4);
	}
}
