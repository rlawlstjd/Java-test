package com.test.java.ch07;

public class Ex13CallByValue {
	public static void main(String[] args) {
		Ex12Book book = new Ex12Book ("자바문법", "엘컴퓨터학원"); 
		
		System.out.println("책 번호: "  + book.bookNo);
		
		Ex12Book.generateBookNo(book.bookNo);
		
		System.out.println("책 번호: " + book.bookNo); 
		
	}
}
