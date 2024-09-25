package com.test.java.ch01;

public class Ex06Printf {
	public static void main (String[]args) {
		
		int balance = 1000 ; 
		System.out.printf("현재 잔액은 %d원 입니다. %n%n", balance); 
		
		int tvPrice = 300 ; 
		System.out.printf("TV는 %d원 입니다. %n", tvPrice) ; 
		System.out.printf("TV를 구매하였습니다.%n"); 
		
		balance = balance - tvPrice ; 
		System.out.printf("현재 잔액은 %d원 입니다.%n",balance );
		
		int salary = 500 ; 
		System.out.printf("%n월급 %d원이 입금되었습니다.", salary); 
		
		balance = balance + salary ; 
		System.out.printf("%n현재 잔액은 %d원 입니다.", balance); 
		
	}
}
