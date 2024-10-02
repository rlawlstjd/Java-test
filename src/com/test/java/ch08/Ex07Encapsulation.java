package com.test.java.ch08;

public class Ex07Encapsulation {
	public static void main(String[] args) {
		Book6 book = new Book6(); 
		book.setTitle("자바 기본문법");
		book.setAuthor("엘컴퓨터학원");
		book.setPrice(120000);
		Book6.printInfo(book);
		
		Book6 book2 = new Book6(); 
		book2.setTitle("자바 자료구조");
		book2.setAuthor("엘컴퓨터학원");
		book2.setPrice(3000);
		Book6.printInfo(book2);
	
	}
}

class Book6 {
	private String title; 
	private String author; 
	private int price; 
	
	public void setTitle(String title) {
		this.title = "[종이책]" + title;
		
	}
	
	public String getTitle() {
		return title; 
	}
	
	public void setAuthor(String author) {
		this.author = author ; 
	}
	
	public String getAuthor() {
		return author; 
	}
	
	public void setPrice(int price) {
		if (price <0 || price > 60000)
			return ;
		
		this.price = price ; 
	}
	
	public int getPrice() {
		return price ;
	}
	
	public static void printInfo(Book6 boo) {
		System.out.println(boo.title + "," + boo.author + "," + boo.price + "원");
	}
}