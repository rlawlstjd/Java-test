package com.test.java.ch01;

public class Ex04PrintlnTest {
	public static void main (String[]args) {
		
		
		int balance = 5000 ; 
		
		System.out.println("현재 잔액은 " + balance + "원 입니다."); 
		System.out.println() ; 
		
		int TV = 500 ; 
		
		System.out.println("TV의 가격의 가격은 " + TV + "원 입니다."); 
		System.out.println("TV 한 대를 구입하였습니다."); 
		balance = balance - TV ; 
		System.out.println("현재 잔액은 " + balance + "원 입니다.");
		System.out.println() ; 
		
		int computer = 300 ; 	// 깃헙 테스트입니다.
		
		System.out.println("컴퓨터의 가격은 " + computer + "원 입니다."); 
		System.out.println("컴퓨터 한 대를 구입하였습니다."); 
		balance = balance - computer ; 
		System.out.println("현재 잔액은 " + balance + "입니다."); 
		System.out.println() ; 
		
		int salary = 500 ; 
		
		System.out.println("월급 " + salary + "원이 입금되었습니다."); 
		balance = balance + salary ; 
		System.out.println("현재 잔액은 " + balance + "원 입니다."); 
		
	}
}
/* 

문제 1. 5000원의 잔액에서 TV(500원)와 컴퓨터(300원)를 구매 후 500원의 월급이 입금되는 코드를 작성하세요. 
 
*/ 