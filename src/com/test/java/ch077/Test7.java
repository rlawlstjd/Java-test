package com.test.java.ch077;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in); 
		
		Book6 b = new Book6(); 
		b.title = "파이썬 기초문법";
		b.author = "엘컴퓨터학원";
		
		Book6 b1 = new Book6(); 
		b1.title = "리눅스 명령어 모음집"; 
		b1.author = "엘코딩연구소"; 
		
		System.out.printf("제목: %s%n저자: %s%n서점: %s%n", b1.title, b1.author, Book6.bookstore_name);
		System.out.printf("제목: %s%n저자: %s%n서점: %s%n", b.title, b.author, Book6.bookstore_name);
	}
}
class Book6 {
		final static String bookstore_name = "엘컴퓨터서점";
		String title; 
		String author; 
}