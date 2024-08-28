package com.test.java.ch07;

public class Ex12Book {
	String title; 
	String author ; 
	int bookNo ;
	
	Ex12Book(String title, String author) {
		this.title = title; 
		this.author = author; 
		this.bookNo	= 1000; 
	}
	
	static void generateBookNo(int bookNo) {
		bookNo = (int)(Math.random()*9000)+1000; //왜 return을 쓰지 않았는가 
	}
	
	static void generateBookNo(Ex12Book book) {
		book.bookNo = (int)(Math.random()*9000)+1000 ;
		
}
}

