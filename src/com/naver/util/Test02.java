package com.naver.util;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Book b = new Book () ; 
		b.title = "자바문법"; 
		b.author = "엘컴퓨터학원"; 
		b.price = 50000 ; 
		System.out.println(b.title); 
		System.out.println(b.author);
		System.out.println(b.price); 
		
		System.out.println();
		
		Book b1 = new Book() ; 
		b1.title = "문법책"; 
		b1.author = "엘컴푸터학원"; 
		b1.price = 5000 ;
		System.out.println(b1.title); 
		System.out.println(b1.author); 
		System.out.println(b1.price); 
		
		System.out.println() ; 
		
		Book [] a = new Book [2] ; 
		a[0] = b; 
		a[1] = b1; 
		
		for (int i=0 ; i<a.length; i++) {
			System.out.printf("책의 제목: %s책의 저자: %s책의 가가격: %d%n", a[i].title, a[i].author, a[i].price);
		}
		
	
	
	
	
	}	
}
class Book {
	String title ; 
	String author; 
	int price ; 
	
}
/*
문제 1.
클래스를 이용하여 도서관리 프로그램 등록과 목록 기능을 개발하세요. 
*/