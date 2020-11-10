package com.test.java;

public class Box {
	private Macaron[] list = new Macaron[10];
	String [] list1 = new String[10];
	String [] colors = {"red","blue","yellow","white","pink","purple","green","black"};
    public void cook() {
    	for(int i=0;i<list.length;i++) {
    		list[i] = new Macaron();
    		list[i].setSize((int)(Math.random()*10)+5);
    		list[i].setColor(colors[(int)(Math.random()*colors.length)]);
    		list[i].setThickness((int)(Math.random()*15)+3);
    	}
    }
    public void check() {
    	int pass = 0;
    	int fail = 0;
    	for(int i=0;i<list.length;i++) { 
    		if((list[i].getSize() >=8 && list[i].getSize()<=14) && (list[i].getThickness() >= 3 && list[i].getThickness() <= 18) && !list[i].getColor().equals("black")) {
    			pass++;
    			list1[i]="합격";
    		} else {
    			fail++;
    			list1[i]="불합격";
    		}
    	}
    	System.out.printf("QC 합격 개수 : %d개\n",pass);
    	System.out.printf("QC 불합격 개수 : %d개\n",fail);
    }
    public void list() {
    	for(int i=0;i<list.length;i++) {
    		System.out.printf("%d번 마카롱 : %dcm(%s,%dmm)\n",i+1,list[i].getSize(),list[i].getColor(),list[i].getThickness());
    	}
    }
}
