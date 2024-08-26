package com.test.java.ch07;

import java.util.Scanner;

public class Ex111111 {
	public static void main(String[] args) {
		rPtks c = new rPtks () ; 
		
		System.out.printf("더하기 %n");
		
		int result = 0 ; 
		int []n = new int [2] ; 
		n= c.input(); 
		result = c.plus(n) ;
		System.out.println("결과: " + result) ; 
		
		
		System.out.printf("빼기 %n"); 
		n = c.input() ; 
		result = c.minus(n); 
		System.out.println("결과: " + result); 
	
		System.out.printf("곱하기 %n"); 
		n = c.input () ; 
		result = c.multi(n);
		System.out.println("결과: " + result); 
		
		System.out.printf("나누기 %n"); 
		n = c.input() ; 
		result = c.divi(n); 
		System.out.println("결과: " + result); 
	
	
	
	}
}
class rPtks {
	int [] input () {
		int []a = new int [2] ;
		
		Scanner scan = new Scanner (System.in);
		System.out.printf("a[0] : "); 
		a[0] = scan.nextInt(); 
		System.out.printf("a[1] :");
		a[1] = scan.nextInt() ; 
		
		return a; 
	}
	
	int plus (int [] a ) {		
		return	a[0]+a[1] ; 
	}
	
	int minus (int [] a) {
		return a[0]-a[1] ; 
		
	}
	
	int multi (int [] a ) {
		return a[0]*a[1] ; 
	}
	
	int divi (int [] a) {
		return a[0]/a[1]; 
	}
	
}
