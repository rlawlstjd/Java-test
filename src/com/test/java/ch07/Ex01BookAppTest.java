package com.test.java.ch07;

import java.util.Scanner;

public class Ex01BookAppTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.printf("도서관리 프로그램");
		System.out.printf("%n============");
		
		
		
		boolean run = true ; 
		String []arrAuthor = new String [10] ;
		String []arrTitle = new String [10] ; 
		int [] arrPrice = new int [10] ; 
		int bookCount = 0 ; 
		
		while (true) {
			String title = ""; 
			String author = "";
			int price = 0 ; 
			
			
			
			System.out.printf("메뉴를 선택하세요. 1: 책 등록, 책 목록, 0: 종료%n");
			System.out.printf(">>");
			int menu = scan.nextInt(); 
			scan.nextLine();
			
			
			switch (menu) {
			case 1: 
				System.out.printf("책을 등록하세요 !%n");
				System.out.printf("저자를 입력하세요.");
				author = scan.nextLine();
				System.out.printf("제목을 입력하세요.");
				title = scan.nextLine(); 
				System.out.printf("가격을 입력하세요."); 
				 price = scan.nextInt(); 
				System.out.printf("제목: %s, 저자: %s, 가격: %d ", title, author, price); 
				
				arrAuthor[bookCount]= title ; 
				arrTitle[bookCount]= author ; 
				arrPrice[bookCount]=price ; 
				bookCount++;
				
			case 2 : 
				System.out.println("책의 목록을 확인합니다."); 
				for (int i=0; i<arrTitle.length; i++) {
					for (int j=0; j<arrAuthor.length; j++) {
						for ( int k=0 ; k < arrPrice k++) 
					
					
					
					System.out.println("총 몽록:"+ arrTitle[i] + arrAuthor[j]+ arrPrice[k]);
				} 
				break; 
			}
			if (!run)
				break; 
			
		}
		
	System.out.printf("프로그램을 종료합니다.");
		
		
		
	
	}			
	}}
/*
문제 1.
(1) 의 위치에 책의 목록을 출력하는 코드를 작성하세요.
힌트) for문을 이용해 arrTitle, arrAuthor, arrPrice 배열들의 내용을 출력하면 됩니다. 
*/