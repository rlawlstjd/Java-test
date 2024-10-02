package com.test.java.ch07;

public class Ex09Constructure {
	public static void main(String[] args) {
		Book8 book = new Book8 () ; 
		book.title =  "자바문법"; 
		book.price = 350000 ; 
		book.author = "엘컴퓨터학원"; 
		book.printInfo();
		
		Book9 b2 = new Book9();
		b2.printInfo(); 
	
		Book10 b3 = new Book10("파이썬문법");
		b3.printInfo();
		
		Book10 b4 = new Book10("c문법", 50000); 
		b4.printInfo(); 
		
		Book10 b5 = new Book10("자바8문법", 40000, "엘컴퓨터학원");
		
		
		//Book10 b6 = new Book10("김진성", 400000, "엘컴퓨터학원"); 
		//b6.printInfo();
	}
}

class Book8 {
	String title; 
	int price ; 
	String author ; 
	
	void printInfo() {
		System.out.printf("제목: %s%n가격: %s%n저자: %s%n", title, price, author);
	}
}
class Book9 {
	String title ; 
	int price ; 
	String author ; 
	
	Book9() {
		System.out.println("new Book9() -> 생성자가 호출되었습니다.");
		this.title= "제목입력";
		this.price= 0; 
		this.author = "저자입력"; 
	}
	
	
	void printInfo() {
		System.out.printf("제목: %s%n가격: %s%n저자: %s%n", title, price, author);
	}
}

class Book10 {
	String title ; 
	int price ; 
	String author ; 
	
	Book10(String title){
		this.title = title; 
		this.price = 30000 ; 
		this.author =  "엘컴퓨터학원"; 
	}
	
	Book10(String title, int price) {
		this.title = title; 
		this.price = price ; 
		this.author = "엘컴퓨터학원"; 
	}
	
	Book10(String title, int price, String author) {
		this.title = title; 
		this.price = price; 
		this.author = author; 
	}
	
	void printInfo() {
		System.out.printf("제목: %s%n가격: %s%n저자: %s%n%n", title, price, author); 
	}
}