package com.test.java.ch07;

import java.util.Scanner;

public class Ex00000 {
	public static void main(String[] args) {
		calcul c = new calcul();
		
		int result = 0 ; 
		int []n = new int [2] ; 
		
		n = c.input() ;
		result = c.plus(n) ; 
		System.out.printf("결과: " + result); 
		
	
		
	}
}
class calcul{
	int [] input() {
		int [] a = new int [2] ; 
		
		Scanner scan = new Scanner (System.in);
		System.out.print("a[0]: "); 
		a[0] = scan.nextInt(); 
		System.out.print("a[1]: "); 
		a[1] = scan.nextInt() ; 
		
		return a; 
		
	}
	int plus (int []a) {
		return a[0] + a[1] ; 
	}
	
}
/*
문제 1.
계산기 클래스를 만들고 더하기, 빼기, 곱하기, 나누기 메소드를 작성한 뒤 메소드를 이용하여 결과를 출력하세요.  
*/
