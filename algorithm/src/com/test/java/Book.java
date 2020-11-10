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
			System.out.println("ÇÑ±Û, ¿µ¾î, ¼ıÀÚ¸¸ °¡´ÉÇÕ´Ï´Ù.");
		}
	}
	
	private boolean checkTitle(String title) {
		if(title.length()>50) {
			return false;
		} 
		for(int i=0;i<title.length();i++) {
			if((title.charAt(i) < '°¡' || title.charAt(i) >'ÆR') && (title.charAt(i) <'a' || title.charAt(i) >'z') && (title.charAt(i) < 'A' || title.charAt(i) >'Z') && (title.charAt(i) <'0' || title.charAt(i)>'9') && (title.charAt(i)!=' ')) {
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
			System.out.println("0ºÎÅÍ 100¸¸ÀÌÇÏ¸¸ °¡´ÉÇÕ´Ï´Ù.");
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
			System.out.println("1ºÎÅÍ ¹«Á¦ÇÑ±îÁö¸¸ °¡´ÉÇÕ´Ï´Ù.");
		}
	}
	public String info() {
        return "Ã¥ Á¦¸ñ : "+title+", °¡°İ : "+price+", ÀúÀÚ : "+author+", ÃâÆÇ»ç : "+publisher+", ¹ßÇà³âµµ : "+pubYear+", ISBN : "+isbn+", ÆäÀÌÁö¼ö : "+page; 
    }	    
}
