package com.test.java.ch07;

public class Ex02Class {
	public static void main(String[] args) {
		Book book1 = new Book () ; 
		book1.title = "자바문법책"; 
		book1.author= "엘컴퓨터학원"; 
		book1.price = 50000; 
		System.out.println("book1.title");
		System.out.println("book1.author");
		System.out.println("book1.price"); 
		
		System.out.println(); 
		
		Book book2 = new Book () ; 
		book2.title = "c문법책"; 
		book2.author = "엘컴휴터학원"; 
		book2.price = 35000;
		System.out.println(book2.title);
		System.out.println(book2.author); 
		System.out.println(book2.price);
		
		System.out.println(); 
		
		Book[] a = new Book [2] ; 
		a[0] = book1; 
		a[1] = book2; 
		
		for (int i=0; i<a.length; i++) {
			System.out.printf("제목: %s, 저자: %s, 가격: %d%n", a[i].title, a[i].author, a[i].price); 
		}
		
		
		
		
	}
}

 class Book {
	String title ; 
	 String author ; 
	 int price; 
 } 
	

