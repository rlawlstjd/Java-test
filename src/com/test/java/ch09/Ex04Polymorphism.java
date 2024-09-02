package com.test.java.ch09;

public class Ex04Polymorphism {
	public static void main(String[] args) {
		Product p = new Product(); 
		Product p2 = p; 
		System.out.println(p.equalsProduct(p2));
		
		Book4 b1= new Book4(); 
		b1.setTitle("자바 자료구조");
		b1.setAuthor("엘컴퓨터학원");
		b1.setPrice(5000);
		Book4 b2 = new Book4(); 
		b2.setTitle("자바 자료구조");
		b2.setAuthor("엘컴퓨터학원");
		b2.setPrice(3000);
		Book4 b3 = new Book4(); 
		b3.setTitle("자바 자료구조");
		b3.setAuthor("엘코딩랩");

		System.out.println(b1.equalsProduct(b2));
		System.out.println(b1.equalsProduct(b3));
		int higherPrice = b1.compareProduct(b2);
		System.out.println("더 높은 가격:" + higherPrice);
	}
}
class Product {
	public boolean equalsProduct(Product p) {
		return this == p;
	}
	
	public int compareProduct(Product p) {
		return 0; 
	}
	
	
}

class Book4 extends Product {
	private String title; 
	private String author; 
	private int price; 
	
	public void setPrice(int price) {
		this.price = price ; 
	}
	
	public int getPrice() {
		return price;
	} 
	
	public String getTitle() {
		return title; 
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author; 
	}
	
	public boolean equalsProduct(Product p) {
		if(!(p instanceof Book4))
			return false; 
		
		Book4 book = (Book4)p;
		boolean result = title.equals(book.title) && author.equals(book.author);
		
		return result; 
	}
	
	public int compareProduct(Product p) {
		if (!(p instanceof Book4))
			return this.price ; 
		
		Book4 bp = (Book4)p ; 
		return Math.max(this.price, bp.price);
	}
}
/*
문제 1.
Product 클래스에 두 인스턴스간의 크기를 비교하는 메소드인 compareProduct 메소드를 추가하세요.
Book4 클래스에 compareProduct 메소드를 오버라이딩 후 가격이 높은 책의 인스턴스를 반환하도록 코딩하세요.
반환된 인스턴스의 title을 출력하세요. 
*/