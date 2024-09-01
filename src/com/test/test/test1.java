package com.test.test;

import java.util.Arrays;

public class test1 {
	public static void main(String[] args) {
		Book b = new Book(); 
		b.title = "자바문법";
		b.author = "엘컴퓨터학원";
		b.setTag("가" , "나", "다","라");
		
		Book.print(b);
	
	
	}
}
class Book{
	String title; 
	String author; 
	String [] tag;
	
	void setTag(String...title) {
		tag = new String [title.length];
		for(int i=0; i<tag.length; i++) {
			tag[i] = title[i];
		}
	}
	static void print(Book book) {
		System.out.printf("제목: %s%n저자: %s%n", book.title, book.author);
		System.out.printf("카테고리: %s%n%n", Arrays.toString(book.tag));
	}
}