package com.test.java;

public class Book {
 	private String title;
    private int price;
    private String author;
    private String publisher;
    private String pubYear = "2020";
    private String isbn;
    private int page;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		if(checkTitle(title)) {
			this.title = title;
		} else {
			System.out.println("한글, 영어, 숫자만 가능합니다.");
		}
	}
	
	private boolean checkTitle(String title) {
		if(title.length()>50) {
			return false;
		} 
		for(int i=0;i<title.length();i++) {
			if((title.charAt(i) < '가' || title.charAt(i) >'힣') && (title.charAt(i) <'a' || title.charAt(i) >'z') && (title.charAt(i) < 'A' || title.charAt(i) >'Z') && (title.charAt(i) <'0' || title.charAt(i)>'9') && (title.charAt(i)!=' ')) {
				return false;
			}
		}
		return true;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price>=0 && price <=1000000) {
			this.price = price;
		}
		else {
			System.out.println("0부터 100만이하만 가능합니다.");
		}
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPubYear() {
		return pubYear;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		if(page>=1) {
			this.page = page;
		}
		else {
			System.out.println("1부터 무제한까지만 가능합니다.");
		}
	}
	public String info() {
        return "책 제목 : "+title+", 가격 : "+price+", 저자 : "+author+", 출판사 : "+publisher+", 발행년도 : "+pubYear+", ISBN : "+isbn+", 페이지수 : "+page; 
    }	    
}
