package com.test.java.ch077;

public class Test6 {
	public static void main(String[] args) {
	Book5 b1 = new Book5(); 
	b1.bookNo = Book5.generateBookNo();
	System.out.println(b1.bookNo); 
	
	System.out.println(); 
	
	Book5 b2 = new Book5(); 
	b2.bookNo = Book5.generateBookNo(); 
	System.out.println(b2.bookNo); 
	
 Book5.generateBookNo();
	
	}
}
class Book5{
	String title; 
	int bookNo; 
	
	static int generateBookNo() { // 스태틱? 
		return (int)(Math.random()*9000)+1000;  ////  (int)(Math.random()*930) + 70 ;  70부터 999까지 숫자
	}
}