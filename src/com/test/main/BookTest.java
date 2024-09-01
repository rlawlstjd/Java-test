package com.test.main;

import com.test.book.*;

public class BookTest {
	public static void main(String[] args) {
		Book b = new Book () ; 
		b.setTitle("자바문법");
		System.out.println(b.getTitle());
	
		b.printInfo(); 
		
	}
}
