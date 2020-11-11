package com.test.java;

public class Packer {
	
	static int pencilCount;
	static int eraserCount;
	static int ballPointPenCount;
	static int rulerCount;
	
	public void packing(Pencil pencil) {
		if(pencil.getHardness().equals("4B") || pencil.getHardness().equals("3B") || pencil.getHardness().equals("2B") 
				|| pencil.getHardness().equals("B") || pencil.getHardness().equals("HB") || pencil.getHardness().equals("H") ||
				pencil.getHardness().equals("2H") || pencil.getHardness().equals("3H") || pencil.getHardness().equals("4H")) {
			pencilCount++;
			System.out.printf("���� �� �˼� : %s ���ϱ� �����Դϴ�.\n",pencil.getHardness());
		}
	}
	
	public void packing(Eraser eraser) {
		if(eraser.getSize().equals("Large") || eraser.getSize().equals("Medium") || eraser.getSize().equals("Small")) {
			eraserCount++;
			System.out.printf("���� �� �˼� : %s ������ ���찳�Դϴ�.\n",eraser.getSize());
		}
	}
	
	public void packing(Ruler ruler) {
		if((ruler.getLength() == 30 || ruler.getLength() == 50 || ruler.getLength() == 100) && (ruler.getShape().equals("����") 
				|| ruler.getShape().equals("������") || ruler.getShape().equals("�ﰢ��"))) {
			rulerCount++;
			System.out.printf("���� �� �˼� : %dcm %s�Դϴ�.\n",ruler.getLength(),ruler.getShape());
		}
	}
	
	public void packing(BallPointPen ballPointPen) {
		if((ballPointPen.getColor().equals("red") || ballPointPen.getColor().equals("blue") || ballPointPen.getColor().equals("green") 
				|| ballPointPen.getColor().equals("black")) && (ballPointPen.getThickness() == 0.3 || ballPointPen.getThickness() == 0.5 
				|| ballPointPen.getThickness() == 0.7 || ballPointPen.getThickness() == 1 || ballPointPen.getThickness() == 1.5)) {
			ballPointPenCount++;
			System.out.printf("���� �� �˼� : %s���� %.1fmm �����Դϴ�.\n",ballPointPen.getColor(),ballPointPen.getThickness());
		}
	}
	
	public void countPacking(int type) {
		if(type == 0) {
			System.out.println("=====================\r\n"
					+ "���� ���\r\n"
					+ "=====================");
			System.out.printf("���� %dȸ\n���찳 %dȸ\n���� %dȸ\n�� %dȸ\n",pencilCount,eraserCount,ballPointPenCount,rulerCount);
		} else if(type == 1) {
			System.out.println("=====================\r\n"
					+ "���� ���\r\n"
					+ "=====================");
			System.out.printf("���� %dȸ\n",pencilCount);
		} else if(type == 2) {
			System.out.println("=====================\r\n"
					+ "���� ���\r\n"
					+ "=====================");
			System.out.printf("���� %dȸ\n",ballPointPenCount);
		} else if(type == 3) {
			System.out.println("=====================\r\n"
					+ "���� ���\r\n"
					+ "=====================");
			System.out.printf("�� %dȸ\n",rulerCount);
		}
	}

	
}
