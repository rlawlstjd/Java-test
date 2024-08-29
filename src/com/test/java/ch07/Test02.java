package com.test.java.ch07;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in); 
		
		boolean run = true ; 
		
		Book[] arrTitle = new Book [10]; 
		Book[] arrAuthor = new Book [10]; 
		Book[] arrPrice = new Book [10]; 
		int bookCount = 0; 
		
		while (true) {
			System.out.printf("메뉴를 선택하세요.%n");
			System.out.println("1:책등록 2:책목록 0:종료");
			int number = scan.nextInt();
			
			switch(number) {
				case 1: 
					
					Book b = new Book (); 
					System.out.printf("제목을 입력하세요");
					b.title = scan.nextLine(); 
					System.out.printf("저자를 입력하세요"); 
					b.author = scan.nextLine(); 
					System.out.printf("가격을 입력하세요"); 
					b.price = scan.nextInt(); 
					
					arrTitle[bookCount] = b.title;
					arrAuthor[bookCount] = b.author; 
					arrPrice[bookCount] = b.price ; 
					bookCount ++; 
					break ; 
			}
		}
		
	
	
	
	
	
	
	}
}



class Book {
	String title ; 
	String author ; 
	int price ; 
}
/*
문제 1.
클래스를 이용하여 도서관리 프로그램 등록과 목록 기능을 개발하세요. 
*/