package com.test.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Test {
	public static void main(String[] args) {	
		Scanner s = new Scanner (System.in);
		
		Book1 book = new Book1 ();
		
		String [] arrTitle = new String[10];
		String [] arrAuthor = new String [10];
		int [] arrPrice = new int [10];
		int bookCount = 0 ; 
		
		boolean a = true; 
		
		while (a) {
			System.out.printf("번호를 선택하세요.%n");
			System.out.printf("1. 책 등록  2. 책 목록 확인  3. 종료");
			int menu = s.nextInt();  s.nextLine();
			
			switch (menu) {
					case 1: 
							System.out.printf("책을 등록하세요.");
							book.title = s.nextLine(); 
							System.out.printf("저자를 입력하세요.");
							book.author = s.nextLine(); 
							System.out.printf("가격을 입력하세요.");
							book.price = s.nextInt();
							
							arrTitle[bookCount] = book.title;
							arrAuthor[bookCount] = book.author; 
							arrPrice[bookCount] = book.price;
							bookCount ++;
							break;
							
					case 2: 
							System.out.printf("책 목록을 확인합니다.%n");
							for (int i=0; i<bookCount; i++) {
								System.out.println("제목: " + arrTitle[i] + "저자: " + arrAuthor[i] + "가격: " + arrPrice[i]);
							}
							break;
							
					case 3: 
							System.out.printf("시스템을 종료합니다.");
							a = false;
							break;
			}
			
			if(a != true) {
				break;
			}
			
		}
	
	
	}
}
class Book1 {
	String title; 
	String author; 
	int price; 
	
	
}
/*
문제 1.
클래스를 이용하여 도서관리 프로그램 등록과 목록 기능을 개발하세요. 
*/