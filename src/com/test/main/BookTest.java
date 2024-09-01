package com.test.main;

import com.test.book.*;

public class BookTest {
	public static void main(String[] args) {
		Book b = new Book ();
		Book.print(b);
		Book b1 = new Book("자바문법");
		Book.print(b1);
		Book b2 = new Book ("파이썬 문법",5000);
		Book.print(b2);
		Book b3 = new Book ("sql",30000,"엘컴퓨터학원");
		Book.print(b3);
	
	}
}
class Book{
	String title; 
	int price; 
	String author; 
	
	Book(){
		this("제목입력", 0, "저자입력");
	}
	Book(String title){
		this(title, 0, "저자입력");
	}
	Book(String title, int price){
		this(title, price, "저자입력");
	}
	Book(String title, int price, String author){
		this.title = title; 
		this.price = price; 
		this.author= author; 
	}
	
	void printInfo() {
		System.out.printf("제목: %s%n가격: %d%n저자: %s%n%n",title, price, author);

	}
	static void print (Book book) {
		System.out.printf("제목: %s%n가격: %d%n저자: %s%n%n",book.title, book.price, book.author);

		
	}
	
}