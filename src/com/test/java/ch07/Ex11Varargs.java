package com.test.java.ch07;

import java.util.Arrays;

public class Ex11Varargs {
	public static void main(String[] args) {
	Book12 book1 = new Book12(); 
	book1.title = "자바 문법"; 
	book1.author = "엘컴퓨터학원"; 
	book1.setTag("컴퓨터", "IT", "프로그램 언어", "자바");
	
	Book12.printInfo(book1); 
	
	Book12 book2 = new Book12(); 
	book2.title = "c 문법" ; 
	book2.author = "엘코딩"; 
	book2.setTag("IT", "프로그램 언어");
	
	Book12.printInfo(book2);
	
	
	
	}
}
class Book12 {
	String title; 
	String author; 
	String []tag ; 
	
	void setTag(String...params) {
		tag = new String[params.length]; 
		for (int i=0; i<tag.length; i ++) {
			tag[i] = params[i] ; 
		}
	}
	
	static void printInfo(Book12 book) {
		System.out.printf("제목: %s%n저자: %s%n", book.title, book.author); 
		System.out.printf("카테고리: %s%n", Arrays.toString(book.tag));
	}
}