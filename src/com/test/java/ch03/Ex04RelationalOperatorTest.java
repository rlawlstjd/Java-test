package com.test.java.ch03;

public class Ex04RelationalOperatorTest {
	public static void main (String[]args) {
	  
		int tv = 300 ; 
		int balance = 1000 ; 
		
		boolean buyable = tv > balance ; 
		
		System.out.printf("%d으로 tv 한 대 (%d원)을 구입할 수 있다. (%b)%n",balance, tv*1, buyable); 
		
		buyable = balance > tv*2;
		System.out.printf("%d으로 tv 두 대 (%d원)을 구입할 수 있다. (%b)%n",balance, tv*2, buyable); 
		System.out.printf("%d으로 tv 두 대 (%d원)을 구입할 수 있다. (%b)%n",balance, tv*3, balance > tv*3);
		System.out.printf("%d으로 tv 두 대 (%d원)을 구입할 수 있다. (%b)%n",balance, tv*4, balance > tv*4);
		
	}
}
/*
문제 1.
TV의 금액은 300원입니다.
잔액이 1000원일 때 TV의 구매 가능 여부를 조건식을 이용하여 출력하세요. 
*/