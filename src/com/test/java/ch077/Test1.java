package com.test.java.ch077;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in); 
		System.out.println("도서관리 프로그램"); 
		
		String[] arrTitle = new String[10] ; 
		String[] arrAuthor = new String[10] ; 
		int[] arrPrice = new int [10] ; 
		
		int bookCount = 0 ; 
		
		boolean run = true; 
		
		while (run) {
			String title = ""; 
			String author =  ""; 
			int price = 0 ; 
			
			System.out.println("----------"); 
			System.out.println("메뉴를 선택하세요. 1:책등록 2:책목록 0:종료"); 
			System.out.print(">>"); 
			int menu = scan.nextInt(); 
			scan.nextLine() ;
			
			switch (menu) {
			case 1: 
				System.out.println("책을 등록하세요."); 
				System.out.printf("제목: "); 
				title = scan.nextLine(); 
				System.out.print("저자: "); 
				author = scan.nextLine(); 
				System.out.print("가격: ");
				price = scan.nextInt(); 
				
				arrTitle[bookCount]=title ; 
				arrAuthor[bookCount]=author ; 
				arrPrice[bookCount]=price ; 
				bookCount++; 
				break; 
			
			case 2: 
				System.out.printf("책 목록%n"); 
				for (int i=0; i<bookCount; i++) {
					System.out.printf("제목: %s, 저자: %s 가격: %d", arrTitle[i], arrAuthor[i], arrPrice[i]); 
					System.out.println();
				}
				break; 
				
				case 0:
						run = false ; 
						break ; 
			}
					
				
				} 
		System.out.printf("시스템을 종료합니다."); 
		}
		
		}
		
	
			
			
		
	
	
	
	
	
	
