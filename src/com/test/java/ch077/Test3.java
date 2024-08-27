package com.test.java.ch077;

public class Test3 {
	public static void main(String[] args) {
		Book2 b = new Book2 () ; 
		b.title = "자바문법"; 
		b.author = "엘컴퓨터학원";
		b.price = 40000 ; 
		
		b.printInfo() ; 
		
		Book2 b2 = new Book2(); 
		b2.title = "c문법"; 
		b2.author = "엘컴퓨터학원"; 
		b2.price = 30000 ; 
		
		b2.printInfo();
		
		b2.setPrice(30000);
		b2.printInfo();
		
		b2.setPrice(30000, 1.2f);
		b2.printInfo(); 
		
		float dollar = b2.getDollarPrice(); 
		System.out.println(dollar); 
		
		b2.printInfoEng();
	
	
	
	}
}
class Book2 {
	String title ; 
	String author; 
	int price ; 
	int stock ; 
	
	void printInfo() {
		System.out.println("----------------"); 
		System.out.println("도서명: " + title); 
		System.out.println("저자: " + author); 
		System.out.println("가격: \u20a9" + price + "원");
		System.out.println("-----------------"); 
		
	}
	
	void setPrice(int a) {
		price = (int)(a *1.1f); 
	}
	
	void setPrice(int a, float b) {
		price = (int)(a*b); 
	}
	void printInfoEng() {
		System.out.println("----------------"); 
		System.out.println("title: " + title); 
		System.out.println("author: " + author); 
		System.out.println("price: $" + price + "원");
		System.out.println("-----------------"); 
		
	} 
	
	float getDollarPrice () {
		float dollarPrice = price /1000f ; 
		return dollarPrice; 
	}
	
}
