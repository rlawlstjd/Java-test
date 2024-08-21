package com.test.java.ch03;

public class Ex04RelationalOperator {
	public static void main (String []args) {
		int a = 3 , b = 7 ; 
		boolean result = a == 7 ; 
		System.out.printf("%d == %d (%b)%n", a, b, result) ; 
		System.out.printf("%d != %d (%b)%n", a, b, a != b); 
		System.out.printf("%d > %d (%b)%n", a, b, a>b ); 
		System.out.printf("%d < %d (%b)%n", a, b, a <b); 
		
		int c = 7 ; 
		System.out.printf("%d >= %d (%b)%n%n", b, c, b >=c ); 	
		System.out.printf("%d <= %d (%b)%n%n", a, c, a <= c ); 
		System.out.printf("%d != %d (%b%n%n", b, c, b != c); 
		System.out.printf("%d != %d (%b)%n%n", a, c, a != c); 
		
		
		
		
	}
}
