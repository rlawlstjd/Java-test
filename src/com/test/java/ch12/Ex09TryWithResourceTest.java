package com.test.java.ch12;

import java.util.Scanner;

public class Ex09TryWithResourceTest {
	public static void main(String[] args) {
		Book3 b1 = new Book3 ("자바 컬렉션", "엘컴퓨터학원", 2); 
		Book3 b2 = new Book3 ("자바 알고리즘", "엘컴퓨터학원", 7); 
		Book3 b3 = new Book3 ("자바 알고리즘", "엘컴퓨터학원", 7); 
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b1.equals(b2)); 
		System.out.println(); 
		
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b2.equals(b3));
		System.out.println(); 
		
		Book4 b4 = new Book4("자바 컬렉션", "엘컴퓨터학원", 2); 
		Book4 b5 = new Book4 ("자바 알고리즘", "엘컴퓨터학원", 7); 
		Book4 b6 = new Book4 ("자바 알고리즘", "엘컴퓨터학원", 7); 
		
		System.out.println(b4); 
		System.out.println(b5); 
		System.out.println(b4.equals(b5));
		System.out.println(); 
		
		System.out.println(b5);
		System.out.println(b6);
		System.out.println(b5.equals(b6)); 
		System.out.println(); 
	
	}
}

class Book3 {
	private String title ; 
	private String author; 
	private int num;
	
	Book3(String title, String author, int num){
		this.title = title; 
		this.author = author; 
		this.num = num; 
	}
	
	@Override 
	public String toString () {
		return "제목: " + title + ", 저자: " + author; 
	}
}

class Book4 {
	private String title ;
	private String author; 
	private int num; 
	
	Book4(String title, String author, int num){
		this.title = title; 
		this.author = author;; 
		this.num = num; 
	}
	
	@Override 
	public boolean equals(Object obj) {
		if(!(obj instanceof Book4)) {
			return false;
		}
		
		Book4 book = (Book4) obj; 
		//int 는 equlas 를 쓸 수 없음 . 
		return title.equals(book.title)&& author.equals(book.author)&& num == book.num;
	}
	
	
	@Override
	public String toString () {
		return "제목 : " + title + ", 저자: " + author; 
	}
	
}