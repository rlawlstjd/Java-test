package com.test.java.ch03;

public class Ex03unaryOperator {
	public static void main (String[]args) {
		int a = 3 ; 
		System.out.printf("a = %d%n", a++) ; 
		System.out.printf("a = %d%n", a) ; 
		System.out.printf("a = %d%n%n", ++a);
		
		a = 3 ; 
		int b = a++; 
		System.out.printf("b = %d, a = %d%n%n", b, a) ; 
		
		a= 3 ; 
		b = ++a ; 
		System.out.printf("b = %d , a = %d%n%n", b, a);
		
		a= 3; 
		System.out.printf("a = %d%n%n", --a); 
		
		
		
		
		
		
	}
}
