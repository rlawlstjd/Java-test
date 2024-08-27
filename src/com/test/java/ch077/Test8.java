package com.test.java.ch077;

public class Test8 {
	public static void main(String[] args) {
		Book7 book = new Book7 (); 
		book.setInfo("자마8.0문법"); 
		book.getInfo();
	
		book.setInfo("자바문법", 5000, "먹방");
		book.getInfo(); 
		
		book.setInfo("자바문법", 5000);
		book.getInfo(); 
	}
}
class Book7 {
	String title; 
	int price ; 
	String author ; 
	
	void setInfo(String title) {
			this.title = title ; 
	}
	void setInfo(String title, int price, String author) {
			this.title = title ; 
			this.price = price ; 
			this.author= author ;
	}
	void setInfo(String title, int price) {
			this.title = title; 
			this.price = price;
	}
	

}
}