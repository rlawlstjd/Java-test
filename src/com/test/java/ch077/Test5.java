package com.test.java.ch077;

public class Test5 {
	public static void main(String[] args) {
		Book4.tax = 1.2f; 
		
		Book4 b1 = new Book4(); 
		b1.title = "자바문법"; 
		b1.price = 50000 ; 
		
		Book4 b2 = new Book4(); 
		b2.title = "c 문법"; 
		b2.price = 30000 ; 
		
		b1.printInfo();
		b2.printInfo(); 
		System.out.println(); 
		
		Book4.tax = 1.4f; 
		b1.printInfo(); 
		b2.printInfo(); 
		System.out.println(); 
		
		b1.tax = 1.5f ; 
		b1.printInfo();
		b2.printInfo();
	
	
	
	}
}
class Book4 {
	String title ; 
	int price ; 
	static float tax ; 

	void printInfo () {
		String message = "책이름: " + title + ", 책가격: " + ((int)(price*tax))+ ", 세율: " + tax;
		System.out.println(message);
	}
}