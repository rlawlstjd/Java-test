package com.test.java.ch07;

import java.util.Arrays;

public class Ex11VarargsTest {
	public static void main(String[] args) {
		Book15 book = new Book15 () ; 
		book.title = "자바 문법"; 
		book.setAuthor("김범수", "나얼", "박효신", "이수"); 
		
		Book15.printInfo(book); 
	
	
	
	}
}
class Book15{
	String title ; 
	String[] author ; 
	
	void setAuthor (String...a) {
		author = new String[a.length];
		for (int i=0; i<author.length; i++) {
			author[i] = a[i]; 
		}
		}
		static void printInfo(Book15 b) {
			System.out.printf("제목: %s%n저자:%s%n", b.title, Arrays.toString(b.author));
		}
	
	}
	
	


/*
문제 1.
가변인자를 사용하여 책의 저자를 여러명 설정할 수 있는 코드를 작성하고 결과를 출력하세요. 
*/