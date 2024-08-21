package com.test.java.ch03;

import java.util.Scanner;

public class Ex01ArithmeticOperatorTest {
	public static void main (String[]args) {
		Scanner scan = new Scanner (System.in); 
		
		System.out.printf("TV의 수량을 입력하시오."); 
		int tv = scan.nextInt();
		
		System.out.printf("TV의 금액을 입력하시오."); 
		int price = scan.nextInt();
		
		int total = tv * price ; 
		
		System.out.printf("총 금액은 %d원 입니다.", total); 
		
		
		
		
	}
}
/*
문제 1.
TV의 수량과 금액을 입력 받고 총액을 출력하세요. 
 */