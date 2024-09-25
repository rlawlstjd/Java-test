package com.test.java.ch01;

public class Ex08Swap {
	public static void main (String[]args) {
		
		int i = 10 ; 
		int j = 70 ; 
		System.out.printf("i의 값은 %d이고 j의 값은 %d입니다. %n%n", i , j); 
		
		
		int tmp = i ; 
		i = j ; 
		j = tmp ; 
		System.out.printf("i의 값은 %d이고 j의 값은 %d입니다. %n%n", i, j );
		
	}
}
