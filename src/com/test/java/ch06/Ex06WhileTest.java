package com.test.java.ch06;

public class Ex06WhileTest {
	public static void main(String[] args) {
		int i = 2 ; 
		
		while (i <=9 ) {
			int j = 1 ; 
			while (j<=9) {
				System.out.printf("%dx%d=%d\t", i, j, i*j);
				j++;
			}
			i++; 
			System.out.println();
		}
	}
}
		
		
/*
문제 1.
while문도 for문처럼 중첩시킬 수 있습니다. 
중첩 while문을 이용해 구구단을 출력하세요. 
*/