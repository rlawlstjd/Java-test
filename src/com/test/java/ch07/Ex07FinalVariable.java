package com.test.java.ch07;

import java.util.Scanner;

public class Ex07FinalVariable {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Book61 b1 = new Book61();
		b1.title = "파이썬 기초문법";
		b1.author = "엘컴퓨터학원";
		
		Book61 b2 = new Book61();
		b2.title = "리눅스 명령어 모음집";
		b2.author = "엘코딩연구소";
		
		System.out.printf("제목: %s%n저자: %s%n서점: %s%n%n", b1.title, b1.author, Book61.BOOKSTORE_NAME);
		System.out.printf("제목: %s%n저자: %s%n서점: %s%n%n", b2.title, b2.author, Book61.BOOKSTORE_NAME);
	
	}
}

class Book61 {
	final static String BOOKSTORE_NAME = "엘컴퓨터서점";
	String title;
	String author;	
}

