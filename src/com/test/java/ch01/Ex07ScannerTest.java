package com.test.java.ch01;

import java.util.Scanner;

public class Ex07ScannerTest {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in); 
		
	
		
		System.out.printf("슈퍼에 있는 사탕의 개수를 입력하세요.%n"); 
		int candy = scan.nextInt(); 
		
		System.out.printf("철수가 산 사탕의 개수를 입력하세요.%n") ; 
		int a = scan.nextInt() ; 
		 
		System.out.printf("영희가 산 사탕의 개수를 입력하세요.%n"); 
		int b = scan.nextInt(); 
		
		System.out.printf("둘리가 환불한 사탕의 개수를 입력하세요.%n"); 
		int refund = scan.nextInt(); 
	
		candy = candy - a - b + refund ;
		
		System.out.printf("슈퍼에 남아있는 사탕의 재고는 %d개 입니다.", candy); 
	
		
		
		
		
		
	}
}
/* 

문제 1. 슈퍼에는 10개의 사탕이 있습니다. 
철수는 3개의 사탕을 사고 영희는 2개의 사탕을 샀습니다.
둘리는 예전에 사두었던 사탕 2개를 환불했습니다.
슈퍼에 남아 있는 사탕의 재고는 7개입니다.
위 내용을 scanner를 사용하여 작성하세요.
 
*/ 