package com.test.java.ch07;

public class Ex13CallByValueTest {
	public static void main(String[] args) {
		Book21 book = new Book21("자바문법", "엘컴퓨터학원", 10000) ; 
		System.out.println("원래 금액: " + book.price);
		
		
		book.price = Book21.modifyPrice(book.price);
		
		System.out.println(book.price);
	}

}

class Book21 {
	String title; 
	String author ; 
	int price ; 
	
	Book21(String title, String author, int price){
		this.title = title; 
		this.author = author; 
		this.price = price ; 
	}
	
	static int modifyPrice(int price) {
		price += 1000 ;
		return price ; 
	}
}