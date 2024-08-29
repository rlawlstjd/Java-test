package com.naver.util;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in); 
		System.out.printf("도서관리 프로그램"); 
		System.out.println("-------------"); 
		
		boolean run = true ; 
		
		String[] arrTitle = new String [10] ; 
		String[] arrAuthor = new String [10] ; 
		int [] arrPrice = new int [10] ; 
		
		int bookCount = 0 ; 
		
		
		
		while (run) {
			
			System.out.printf("목록을 선택하세요.%n"); 
			System.out.println("1:책등록 2:책목록 0:종료");
			int number = scan.nextInt(); 
			scan.nextLine(); 
			switch (number) {
			
				case 1: 
					System.out.printf("제목을 입력하세요.%n"); 
					String title = scan.nextLine(); 
					System.out.printf("저자를 입력하세요.%n"); 
					String author = scan.nextLine();
					System.out.printf("가격을 입력하세요.%n");
					int price = scan.nextInt(); 
					
					arrTitle[bookCount] = title ; 
					arrAuthor[bookCount] = author ; 
					arrPrice[bookCount] = price  ;
					bookCount ++; 
					break ; 
			
				case 2: 
					System.out.printf("책의 목록을 확인합니다."); 
					for (int i=0; i<bookCount; i++) {
						System.out.printf("%s, %s, %d", arrTitle[i], arrAuthor[i], arrPrice[i]);
					}
					System.out.println(); 
					break;
					
				case 0: 
					
					System.out.printf("시스템을 종료합니다."); 
					break; 
			}
			
			if (!run) break;  
			
			
		}
	
	
	
	}
}

/*
문제 1.
(1) 의 위치에 책의 목록을 출력하는 코드를 작성하세요.
힌트) for문을 이용해 arrTitle, arrAuthor, arrPrice 배열들의 내용을 출력하면 됩니다. 
*/