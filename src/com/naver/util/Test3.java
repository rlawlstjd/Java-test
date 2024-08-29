package com.naver.util;

public class Test3 {
	public static void main(String[] args) {
		Book2 book = new Book2 () ; 
		book.title = "자바문법";
		book.author = "엘컴퓨터학원";
		book.price = 50000 ; 
		
		book.printInfo() ; 
		
		Book2 book1 = new Book2 () ; 
		book1.title = "문법책";
		book1.author = "엘컴퓨터학원";
		book1.price = 30000 ; 
		
		book1.printInfo();
		
		book1.setPrice(3000);
		book1.printInfo(); 
	
		float dog = book1.getDollarPrice(); 
		System.out.println(dog); 
		
		book.setPrice(30000,1.2f);
		book.printInfo();
		
		book.printInfoEng();
	}
}

class Book2 {
	String title ; 
	String author ; 
	int price ;
	int stock ; 
	
	void printInfo() {
		System.out.printf("제목: %s%n저자: %s%n가격: %d%n", title, author, price ); 
		System.out.println() ; 	
	}
	
	void setPrice(int a) {
		price = a ; 
	}
	
	float getDollarPrice () {
		float dollar = price/1000f; 
		return dollar ; 
	}
	
	void setPrice (int a, float b) {
		price = (int)(a*b); 
	}
	
	void printInfoEng () {
		System.out.printf("title: %s%nauthor: %s%nprice: %f%n", title, author, getDollarPrice());
	} 
}