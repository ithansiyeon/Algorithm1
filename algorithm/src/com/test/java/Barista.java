package com.test.java;

public class Barista {
	public Espresso makeEspresso(int bean) {
		Espresso e = new Espresso();
		e.setBean(bean);
		Coffee.bean+=bean;
		Coffee.espresso+=1;
		Coffee.beanTotalPrice+=bean*Coffee.beanUnitPrice;
		return e;
	}
	
	public Espresso[] makeEspressoes(int bean, int count) {
		Espresso[] e = new Espresso[count];
		for(int i=0;i<count;i++) {
			e[i] = new Espresso();
			e[i].setBean(bean);
		}
		Coffee.bean+=bean*count;
		Coffee.espresso+=count;
		Coffee.beanTotalPrice+=bean*Coffee.beanUnitPrice*count;
		return e;
	}
	
	public Latte makeLatte(int bean, int milk) {
		Latte l = new Latte();
		l.setBean(bean);
		l.setMilk(milk);
		Coffee.bean+=bean;
		Coffee.latte+=1;
		Coffee.beanTotalPrice+=bean*Coffee.beanUnitPrice;
		Coffee.milkTotalPrice+=milk*Coffee.milkUnitPrice;
		return l;
	}
	
	public Latte[] makeLattes(int bean, int milk, int count) {
		Latte[] l = new Latte[count];
		for(int i=0;i<count;i++) {
			l[i] = new Latte();
			l[i].setBean(bean);
			l[i].setMilk(milk);
		}
		Coffee.bean+=bean*count;
		Coffee.milk+=milk*count;
		Coffee.latte+=count;
		Coffee.beanTotalPrice+=bean*Coffee.beanUnitPrice*count;
		Coffee.milkTotalPrice+=milk*Coffee.milkUnitPrice*count;
		return l;
	}
	
	public Americano makeAmericano(int bean, int water, int ice) {
		Americano a = new Americano();
		a.setBean(bean);
		a.setIce(ice);
		a.setWater(water);
		Coffee.bean+=bean;
		Coffee.ice+=ice;
		Coffee.americano+=1;
		Coffee.beanTotalPrice+=bean*Coffee.beanUnitPrice;
		Coffee.waterTotalPrice+=water*Coffee.waterUnitPrice;
		Coffee.iceTotalPrice+=ice*Coffee.iceUnitPrice;
		return a;
	}
	
	public Americano[] makeAmericanos(int bean, int water, int ice, int count) {
		Americano[] a = new Americano[count];
		for(int i=0;i<count;i++) {
			a[i] = new Americano();
			a[i].setBean(bean);
			a[i].setWater(water);
		}
		Coffee.bean+=bean*count;
		Coffee.water+=water*count;
		Coffee.ice+=ice*count;
		Coffee.americano+=count;
		Coffee.beanTotalPrice+=bean*Coffee.beanUnitPrice*count;
		Coffee.waterTotalPrice+=water*Coffee.waterUnitPrice*count;
		Coffee.iceTotalPrice+=ice*Coffee.iceUnitPrice*count;
		return a;
	}
	
	public void result() {
		System.out.printf("---------------------------------\r\n"
				+ "음료 판매량\r\n"
				+ "---------------------------------\n");
		System.out.printf("에스프레소 : %d잔\n아메리카노 : %d잔\n라떼 : %d잔\n",Coffee.espresso,Coffee.americano,Coffee.latte);
		System.out.println("---------------------------------\r\n"
				+ "원자재 소비량\r\n"
				+ "---------------------------------");
		System.out.printf("원두 : %,dg \n물 : %,dml\n얼음 : %,d개\n우유 : %,dml\n",Coffee.bean,Coffee.water,Coffee.ice,Coffee.milk);
		System.out.println("---------------------------------\r\n"
				+ "매출액\r\n"
				+ "---------------------------------");
		System.out.printf("원두 : %,d원\n.물 : %,.0f원\n얼음 : %,d원\n우유 : %,d원\n",Coffee.beanTotalPrice,Coffee.waterTotalPrice,Coffee.iceTotalPrice,Coffee.milkTotalPrice);
	}
	
}
