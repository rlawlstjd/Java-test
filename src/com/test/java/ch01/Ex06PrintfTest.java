package com.test.java.ch01;

public class Ex06PrintfTest {
	public static void main (String[]args) {
		
		int candy = 10 ; 
		int a = 3 ;
		int b = 2 ;
		int refund = 2; 
		
		
		System.out.printf("슈퍼에는 사탕 %d개가 있습니다.", candy); 
		
		
		System.out.printf("%n%n철수는 사탕 %d개를 구매했습니다.%n",a); 
		candy = candy - a ; 
		System.out.printf("현재 사탕의 재고는 %d개 입니다.%n%n", candy);
		
		
		System.out.printf("영희는 사탕 %d개를 구매했습니다.%n", b);
		candy = candy - b ; 
		System.out.printf("현재 사탕의 재고는 %d개 입니다. %n%n", candy);
		
		
		System.out.printf("둘리는 예전에 사두었던 사탕 %d개를 환불했습니다.%n", refund );
		candy = candy + refund ; 
		System.out.printf("현재 사탕의 재고는 %d개 입니다.", candy); 
		
	}
}
/* 

문제 1. 슈퍼에는 10개의 사탕이 있습니다. 
철수는 3개의 사탕을 사고 영희는 2개의 사탕을 샀습니다.
둘리는 예전에 사두었던 사탕 2개를 환불했습니다.
슈퍼에 남아 있는 사탕의 재고는 7개입니다.
위 내용을 코드로 작성하세요. 

*/ 