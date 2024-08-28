package com.test.java.ch07;

import java.util.Scanner;

public class Ex03MethodTest {
	public static void main(String[] args) {
		rPtks c = new rPtks () ; 
		
		System.out.printf("더하기 %n");
		
		int result = 0 ; 
		int[] n = new int [2] ; 
		n= c.input(); 
		result = c.plus(n[0], n[1]) ;
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
	int[] input () {
		int []a = new int [2] ;
		
		Scanner scan = new Scanner (System.in);
		System.out.printf("a[0] : "); 
		a[0] = scan.nextInt(); 
		System.out.printf("a[1] :");
		a[1] = scan.nextInt() ; 
		
		return a; 
	}
	
	int plus (int a, int b) {		
		return	a+b ; 
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

/*
문제 1.
계산기 클래스를 만들고 더하기, 빼기, 곱하기, 나누기 메소드를 작성한 뒤 메소드를 이용하여 결과를 출력하세요.  
*/




	/*public static void main(String[] args) {
		Calc calc = new Calc();
		
		int result = 0;
		int[] n = new int[2];
		
		n = calc.input();
		result = calc.plus(n);
		System.out.println("결과: " + result);
		
		n = calc.input();
		result = calc.minus(n[0], n[1]);
		System.out.println("결과: " + result);
	}
}

class Calc {
	int[] input() {
		int[] a = new int[2];
		
		Scanner s = new Scanner(System.in);
		System.out.print("a[0]: ");
		a[0] = s.nextInt();
		System.out.print("a[1]: ");
		a[1] = s.nextInt();
		
		return a;
	}
	
	int[] arr = n;
	int plus(int[] arr = n) {
		return arr[0]+arr[1];
	}
	
	int minus(int a, int b) {
		return a-b;
	}
	
}
/*
문제 1.
계산기 클래스를 만들고 더하기, 빼기, 곱하기, 나누기 메소드를 작성한 뒤 메소드를 이용하여 결과를 출력하세요.  
*/
