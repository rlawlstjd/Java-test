package com.test.java.ch07;

public class Ex14CallByReferenceTest1 {
	public static void main(String[] args) {
		Book20 book = new Book20 ("자바문법", "엘컴퓨터학원", 30000);
		System.out.println("현재 금액: " + book.price); 
		
		
	
		Book20.modifyPrice(book.price);
		System.out.println("수정된 금액: "  + book.price);
	
	
	}
}
class Book20 {
	String title ; 
	String author ; 
	int price ; 
	
	Book20(String title, String author, int price){
		this.title = title ; 
		this.author = author ; 
		this.price = price ;
	}
	
	static int modifyPrice (int price) {
		price += 5000 ; 
		return price;
	}
}
/*
문제 1.
call by reference 를 이용해 책의 금액을 수정하는 메소드를 코딩하세요. 
*/