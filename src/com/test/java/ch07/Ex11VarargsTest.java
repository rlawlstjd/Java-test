package com.test.java.ch07;

import java.util.Arrays;

public class Ex11VarargsTest {
	public static void main(String[] args) {
		Book122 b = new Book122();
		b.setAuthors ("김범수", "나얼", "박효신","이수");
		
		Book122.printInfo(b);
	}
}

class Book122 {
	String title; 
	String author;
	String [] authors;
	
	public void setAuthors (String ...strings) {
		authors = new String[strings.length]; 
		for (int i=0; i<authors.length; i++) {
			authors[i] = strings[i];
		}
	}
	
	public static void printInfo(Book122 b) {
		System.out.println(Arrays.toString(b.authors));
	}
}
/*
문제 1.
가변인자를 사용하여 책의 저자를 여러명 설정할 수 있는 코드를 작성하고 결과를 출력하세요. 
*/