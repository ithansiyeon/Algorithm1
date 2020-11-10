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
		item1.setName("김치");
		item1.setExpiration("2020-04-30");
		r.add(item1);//냉장고에 넣기

		Item item2 = new Item();
		item2.setName("깍두기");
		item2.setExpiration("2020-04-15");
		r.add(item2);//냉장고에 넣기

		Item item3 = new Item();
		item3.setName("멸치볶음");
		item3.setExpiration("2020-03-31");
		r.add(item3);//냉장고에 넣기

		Item item4 = r.get("깍두기");//냉장고에서 꺼내기
		System.out.printf("%s의 유통기한 : %s\n", item4.getName(), item4.getExpiration());

		System.out.printf("냉장고 안의 총 아이템 개수 : %d개\n", r.count());

		r.listItem();
	}

	private static void m4() {
		Box box1 = new Box();
		box1.cook();
		box1.check();
		box1.list();
	}

	private static void m3() {
		
//		Bugles 객체의 정보
//		가격, 용량, 생산일자, 유통기한
//		모든 멤버 변수의 접근 지정자는 private으로 한다.
//		멤버 접근을 위한 Setter와 Getter를 정의한다.
//		용량 : 쓰기 전용, 300g, 500g, 850g
//		가격 : 읽기 전용, 850원(300g), 1200원(500g), 1950원(850g)
//		생산일자 : 쓰기 전용(Calendar)
//		남은유통기한 : 읽기 전용, 생산된 제품의 유통기한 기준 : 7일(300g), 10일(500g), 15일(850g)
//		Bugles 객체 메소드
//		void eat() : 과자 먹기
		
		Bugles snack = new Bugles();
		snack.setWeight(500);
		snack.setCreationTime("2020-04-22");
		System.out.printf("가격 : %,d원\n", snack.getPrice());
		System.out.printf("유통 기한이 %d일 남았습니다.\n", snack.getExpiration());
		snack.eat();

		Bugles snack2 = new Bugles();
		snack2.setWeight(300);
		snack2.setCreationTime("2020-11-11");
		System.out.printf("가격 : %,d원\n", snack2.getPrice());
		System.out.printf("유통 기한이 %d일 남았습니다.\n", snack2.getExpiration());
		snack2.eat();   
	}

	private static void m2() {
		
//		조건
//
//		Note 객체의 정보
//		크기, 표지 색상, 페이지수, 소유자이름, 가격
//		모든 멤버 변수의 접근 지정자는 private으로 한다.
//		멤버 접근을 위한 Setter와 Getter를 정의한다.
//		크기 : 쓰기 전용, A3, A4, A5, B3, B4, B5
//		표지 색상 : 쓰기 전용, 검정색, 흰색, 노란색, 파란색
//		페이지수 : 쓰기 전용, 10 ~ 200페이지 이내
//		(+) 10~50(얇다), 51 ~ 100(보통), 101 ~ 200(두껍다)
//		소유자이름 : 쓰기 전용, 한글 2~5자이내. 필수값
//		가격 : Setter,Getter 구현 안함. 추후 info() 메소드에서 사용하기 위해 아래와 같은 규칙으로 계산
//		(+) 기본 노트 : A5 + 흰색 + 10페이지 = 가격(500원)
//		(+) 크기 변경 : A3(+400원), A4(+200원), B3(+500원), B4(+300원), B5(+100원)
//		(+) 색상 변경 : 검정색(+100원), 노란색(+200원), 파란색(+200원)
//		(+) 페이지수 변경 : 페이지 당 x 10원 추가
//		Note 객체의 정보를 확인하기 위한 메소드를 구현한다.
//		String info()
//		Note가 잘 설계되었는지 객체를 가지고 사용해본다.
//		Note 객체 생성 → 값 넣기 + 값 출력 등
		
		Note note = new Note();
		note.setSize("B4");
		note.setColor("노란색");
		note.setPage(25);
		note.setOwner("홍길동");
		System.out.println(note.info());

		Note note2 = new Note();
		note2.setSize("A4");
		note2.setColor("검정색");
		note2.setPage(100);
		System.out.println(note2.info());
		
	}

	private static void m1() {
		
//		Book 클래스를 설계하시오.
//
//		조건
//
//		Book 객체의 정보
//		제목, 가격, 저자, 출판사, 발행년도, ISBN, 페이지수
//		모든 멤버 변수의 접근 지정자는 private으로 한다.
//		멤버 접근을 위한 Setter와 Getter를 정의한다.
//		제목 : 읽기/쓰기, 최대 50자 이내(한글, 영어, 숫자)
//		가격 : 읽기/쓰기, 0 ~ 1000000원
//		저자 : 읽기/쓰기, 제한 없음
//		페이지수 : 읽기/쓰기, 1~무제한
//		출판사 : 쓰기 전용
//		발행년도 : 읽기 전용(2020년)
//		ISBN : 읽기/쓰기
//		Book 객체의 모든 정보를 문자열로 반환하는 메소드를 구현한다.
//		String info()
//		클래스가 잘 설계되었는지 객체를 가지고 사용해본다.
//		Book 객체 생성 → 값 넣기 + 값 출력 등
		
		Book b = new Book();
		b.setTitle("이것이 자바다");
		b.setPage(10000);
		b.setIsbn("9788968481475");
		b.setAuthor("신용권");
		b.setPrice(30000);
		b.setPublisher("한빛미디어");
		System.out.println(b.info());
	}
}
