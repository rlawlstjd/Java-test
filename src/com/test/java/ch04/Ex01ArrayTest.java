package com.test.java.ch04;

public class Ex01ArrayTest {
	public static void main (String[]args) {
		
		int [] a = new int [3] ; 
		a[0] = 50 ; 
		a[1] = 30 ; 
		a[2] = 0 ; 
		
		System.out.printf("%d%n", a[2]);
		
		System.out.printf("%d%n", a[0]>a[1] ? a[0]:a[1] );
		
	}
}
/*
문제 1.
정수형 변수 3개를 저장 할 수 있는 배열에 
인덱스 0번에 50, 인덱스 1번에 30, 인덱스 2번에 0을 저장하는 코드를 작성하세요.

문제 2.
문제 1에서 만든 배열의 인덱스 2번의 값을 출력하세요.

문제 3.
문제 1에서 만든 배열의 0번 인덱스와 1번 인덱스에 저장된 값 중 더 큰 값을 출력하세요.  
힌트) 삼항연산자를 사용하세요.
*/