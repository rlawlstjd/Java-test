package com.test.java.ch01;

public class Ex04Println {
	public static void main(String[]args) {
		int balance = 1000 ; 
		System.out.println("현재 잔액은 " + balance + "원 입니다."); 
		System.out.println(); 
		
		int tvPrice = 300 ; 
		System.out.println("TV는 " + tvPrice + "원 입니다."); 
		System.out.println("TV를 구매하였습니다."); 
		
		balance = balance - tvPrice ; 
		System.out.println("현재 잔액은 " + balance + "원 입니다."); 
		
		System.out.println(); 
		
		int salary = 500 ; 
		System.out.println("월급 " + salary + "원이 입금되었습니다."); 
		 
		balance = balance + salary ; 
		System.out.println("현재 잔액은 " + balance + "원 입니다." ); 
		
	}
}
