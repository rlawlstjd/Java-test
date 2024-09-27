package com.test.java.ch07;

import java.util.Scanner;

public class Ex07FinalVariableTest {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		//Book6.BOOKSTORE_NAME = "가"; final 로 인해 바꿀 수 없음 . 
		
		Book6 b1 = new Book6(); 
		b1.title = "파이썬 기초문법";
		b1.author = "엘컴퓨터학원";
		b1.price = 50000; 
		
		Book6 b2 = new Book6(); 
		b2.title = "리눅스 명령어 모음집";
		b2.author = "엘코딩연구소"; 
		b2.price = 30000; 
		
		System.out.println("제목: " + b1.title + "저자: "+ b1.author + "서점: " + Book6.BOOKSTORE_NAME + "가격: " + b1.getTaxPrice() + "세율: " + Book6.tax);
		System.out.println("제목: " + b2.title + "저자: "+ b2.author + "서점: " + Book6.BOOKSTORE_NAME + "가격: " + b2.getTaxPrice() + "세율: " + Book6.tax);
		
		System.out.println();
		
	}
}

class Book6 {
	final static String BOOKSTORE_NAME = "서점";
	String title; 
	String author; 
	int price; 
	final static float tax = 1.3f;  // 책 세율 설정 .
	
	public int getTaxPrice() {  //int 반환 float 반환시 리턴값 float 명시적 형변환 x. 
		 return (int)(price * tax); 
	}
} 

/*
문제 1.
책의 세율을 final로 설정한뒤 세율이 적용된 책의 가격을 출력하는 코드를 작성하세요. 
*/