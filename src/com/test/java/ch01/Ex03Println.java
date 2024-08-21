package com.test.java.ch01;

public class Ex03Println {
	public static void main (String[]args) {
		System.out.println ("현재 잔액은 " + 1000 + "원 입니다.");
		System.out.println (); 
		
		System.out.println ("TV는 " + 300 + "원 입니다."); 
		System.out.println ("TV를 구매하였습니다.");
		
		System.out.println ("현재 잔액은 " + (1000-300) + "원 입니다."); 
		
		System.out.println(); 
		
		System.out.println("월급 " + 500 + "원이 입금되었습니다."); 
		System.out.println("현재 잔액은 " + (1000-300+500) + "원 입니다"); 
		
	}
}
