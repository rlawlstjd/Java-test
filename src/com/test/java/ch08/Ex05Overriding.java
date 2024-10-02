package com.test.java.ch08;

public class Ex05Overriding {
	public static void main(String[] args) {
		
		EBook5 eb = new EBook5 (); 
		eb.setPrice(30000);
		eb.printPrice(); 
		
		eb.printAllPrice(); 
	
	
	}
}

class Book05{
	String title ; 
	String author ; 
	int price; 
	
	void setPrice (int price) {
		this.price = price ; 
		
	}
	
	void printPrice() {
		System.out.println("paperbook price" + price);
	}
	
	void setPrice() {
	
	}
}

class EBook5 extends Book05 {
	int price; 
	String fontColor; 
	
	void setPrice (int price) {
		super.setPrice(price+10000);
		this.price = price ; 
	}
	
	void printPrice() {
		System.out.println("ebook price: " + price);
	}
	
	void printAllPrice() {
		super.printPrice();
		printPrice(); 
	}
	
	/*@Override
	 * void setPrice (){
	 * 
	 * }
	 * */
}