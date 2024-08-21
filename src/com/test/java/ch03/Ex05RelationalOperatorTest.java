package com.test.java.ch03;

public class Ex05RelationalOperatorTest {
	public static void main (String[]args) {
		
	int a = 300 ; 
	int b = 500 ; 
	int c = 600 ; 
	int tv = 200 ; 
	
	System.out.printf("%d<%d || %d>%d && %d<%d, (%b)%n", tv, a, tv, b, tv, c, tv<a||tv>b&&tv<c); 
	
		
		
		
		
		
	}
}
/*
문제 1.
TV의 가격이 300원 보다 작거나 500원 보다 크고 600원 보다 작은 경우 true를 반환하는 코드를 작성하고 결과를 출력하세요. 
*/