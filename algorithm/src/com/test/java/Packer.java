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
			System.out.printf("포장 전 검수 : %s 진하기 연필입니다.\n",pencil.getHardness());
		}
	}
	
	public void packing(Eraser eraser) {
		if(eraser.getSize().equals("Large") || eraser.getSize().equals("Medium") || eraser.getSize().equals("Small")) {
			eraserCount++;
			System.out.printf("포장 전 검수 : %s 사이즈 지우개입니다.\n",eraser.getSize());
		}
	}
	
	public void packing(Ruler ruler) {
		if((ruler.getLength() == 30 || ruler.getLength() == 50 || ruler.getLength() == 100) && (ruler.getShape().equals("줄자") 
				|| ruler.getShape().equals("운형자") || ruler.getShape().equals("삼각자"))) {
			rulerCount++;
			System.out.printf("포장 전 검수 : %dcm %s입니다.\n",ruler.getLength(),ruler.getShape());
		}
	}
	
	public void packing(BallPointPen ballPointPen) {
		if((ballPointPen.getColor().equals("red") || ballPointPen.getColor().equals("blue") || ballPointPen.getColor().equals("green") 
				|| ballPointPen.getColor().equals("black")) && (ballPointPen.getThickness() == 0.3 || ballPointPen.getThickness() == 0.5 
				|| ballPointPen.getThickness() == 0.7 || ballPointPen.getThickness() == 1 || ballPointPen.getThickness() == 1.5)) {
			ballPointPenCount++;
			System.out.printf("포장 전 검수 : %s색상 %.1fmm 볼펜입니다.\n",ballPointPen.getColor(),ballPointPen.getThickness());
		}
	}
	
	public void countPacking(int type) {
		if(type == 0) {
			System.out.println("=====================\r\n"
					+ "포장 결과\r\n"
					+ "=====================");
			System.out.printf("연필 %d회\n지우개 %d회\n볼펜 %d회\n자 %d회\n",pencilCount,eraserCount,ballPointPenCount,rulerCount);
		} else if(type == 1) {
			System.out.println("=====================\r\n"
					+ "포장 결과\r\n"
					+ "=====================");
			System.out.printf("연필 %d회\n",pencilCount);
		} else if(type == 2) {
			System.out.println("=====================\r\n"
					+ "포장 결과\r\n"
					+ "=====================");
			System.out.printf("볼펜 %d회\n",ballPointPenCount);
		} else if(type == 3) {
			System.out.println("=====================\r\n"
					+ "포장 결과\r\n"
					+ "=====================");
			System.out.printf("자 %d회\n",rulerCount);
		}
	}

	
}
