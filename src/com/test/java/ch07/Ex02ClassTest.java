package com.test.java.ch07;

import java.util.Scanner;

public class Ex02ClassTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in); 
		Book0 [] arrbook = new Book0 [100];  
		int bookCount = 0 ; 
		boolean run = true ; 
		
		
		while (run){
			System.out.println("==========="); 
			System.out.println("목록을 선택하세요."); 
			System.out.println("1.책 등록 2.책 목록, 0.종료");
			int number = scan.nextInt(); 
			scan.nextLine(); 
			
			
			
			switch (number) {
				case 1: 
					System.out.printf("책의 제목을 입력하세요");
					String title = scan.nextLine(); 
					System.out.printf("저자를 입력하세요"); 
					String author = scan.nextLine();
					System.out.printf("가격을 입력하세요");
					int price = scan.nextInt();
					
					Book0 b = new Book0 () ; 
					b.title = title ; 
					b.author = author ; 
					b.price = price ; 
					
					arrbook[bookCount] = b ;
					bookCount++; 
					
					System.out.println("책이 성공적으로 등록되었습니다.!\n");
					
					break;
					
				case 2 : 
					for (int i = 0 ; i <bookCount; i++) {
						System.out.print("현재 가지고 있는 책 목록은 "); 
						System.out.println(arrbook[i].title+ ", " + arrbook[i].author + ", " + arrbook[i].price);
					}
	
					break;
				case 0 : 
					run = false ; 
					break ; 
					
					
				default : 
					System.out.println("잘못된 입력입니다. 다시 입력하세요."); 
					break ; 
					
			}
			
		}
			System.out.println("프로그램이 종료됩니다.");
		
	
	
	
	
	}
}

class Book0 {
	String title ; 
	String author ; 
	int price ; 
	
		
}/*
문제 1.
클래스를 이용하여 도서관리 프로그램 등록과 목록 기능을 개발하세요. 
*/