package com.test.java.ch08;

public class Ex04Super {

	public static void main(String[] args) {
		EBook4 eb = new EBook4();
		eb.setPrice(30000);
		
		System.out.println("e북 가격: " + eb.price);
		
		eb.title = "자바 기본 문법";
		System.out.println(eb.getTitle());
		
		eb.author = "엘컴퓨터학원";
		System.out.println(eb.getAuthor());
	
		
		
		System.out.println(eb.title);
	}

}

class Book4 {
	String title;
	String author;
	int price;
	
}

class EBook4 extends Book4 {
	int price;
	String fontColor;
	
	void setPrice(int price) {
		this.price = price;
		super.price = price + 10000;
		System.out.println("종이책 가격: " + super.price);
		System.out.println("e북 가격: " + this.price);
	}
	
	String getTitle() {
		return title;
	}
	
	String getAuthor() {
		return this.author;
	}
}