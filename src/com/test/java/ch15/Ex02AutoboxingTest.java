package com.test.java.ch15;

public class Ex02AutoboxingTest {
	public static void main(String[] args) {
		Integer intgA = Integer.valueOf(3);
		Integer intgB = Integer.valueOf(7);
		
		int sum = intgA + intgB;
		//int sum = intgA.intValue() + intgB.intValue();
		 
		
		System.out.println(sum);
		
	}
}

/*
문제 1.
Integer intgA = 3;
Integer intgB = 7;
int sum = intgA + intgB;
위 내용을 오토박싱과 오토언박싱이 필요 없는 코드로 수정하세요.
*/