package com.test.java.ch09;

public class Test44 {
	public static void main(String[] args) {
		Product p = new Product();
		Product p2 = p; 
		System.out.println(p.equalsProduct(p2));
		
		Book4 b1 = new Book4(); 
		b1.setTitle("자바 자료구조");
		b1.setAuthor("엘컴퓨터학원");
		
		Book4 b2 = new Book4(); 
		b2.setTitle("자바 자료구조");
		b2.setAuthor("엘컴퓨터학원");
		
		Book4 b3 = new Book4(); 
		b3.setTitle("자바 자료구조");
		b3.setAuthor("엘코딩랩"); 
		
		System.out.println(b1.equalsProduct(b2));
		System.out.println(b1.equalsProduct(b3));
		
	
	
	}
}

class Product {
	public boolean equalsProduct(Product p) {
		return this == p ; 
	}
	
	public Product compareProduct(Product p) {
		return null; 
	}
} 

class Book4 extends Product {
	private String title; 
	private String author ; 
	
	public String getTitle() {
		return title; 
	}
	
	public void setTitle(String title) {
		this.title = title ;
	}
	
	public String getAuthor () {
		return author; 
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public boolean equalsProduct(Product p) {
		if (!(p instanceof Book4))
			return false;
		
		Book4 book = (Book4)p; 
		boolean result = title.equals(book.title)&& author.equals(book.author); // b1과 b2의 위치
		
		return result;
	}
}
