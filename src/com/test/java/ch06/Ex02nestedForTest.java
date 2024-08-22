package com.test.java.ch06;

import java.util.Arrays;

public class Ex02nestedForTest {
	public static void main(String[] args) {
		for (int a=2; a<=9; a++) {
			for (int b=1; b<=9; b++) {
				System.out.printf("%dx%d=%d\t", a, b, a*b); 
			} System.out.println();
		}
		
		System.out.printf("%n%n%n%n");
		
		
		for (int a2=1; a2<=9; a2++) {
			for (int b2=2; b2<=9; b2++) {
				System.out.printf("%dx%d=%d\t", b2, a2, a2*b2 );
			} System.out.println(); 
			
		}
	
		int [][] g = {
				{25,50},
				{40,25},
				{65,30}
		};

		int sum = 0 ; 
		for (int a3=0; a3<g.length; a3++) {
			for (int b3=0; b3<g[a3].length; b3++) {
				sum += g[a3][b3] ; 
				
			}
		}System.out.printf("3명의 회원이 구매한 모든 제품들의 금액은 %d", sum); 
		
		
		
	}
}
/*

문제 3.
3명의 회원은 모두 제품 2개씩 구매하였습니다.
3명의 회원이 구매한 제품들의 금액을 배열에 저장한 뒤 모든 금액을 합산하여 출력하세요.
힌트) 2차원 배열과 중첩 for문을 사용하세요.  
*/