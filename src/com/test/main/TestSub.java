package com.test.main;

import java.util.Arrays;

public class TestSub {
	public static void main(String[] args) {
		int a = 3; 
		int b = 7; 
		Integer intgA ; 
		Integer intgB ; 
		
		intgA = Integer.valueOf(a);
		intgB = Integer.valueOf(b);
		
		Integer AB = Integer.sum(intgA, intgB); 
		
		System.out.println(AB.intValue());
			
		
		
		if (intgA.compareTo(intgB) < 0) { // 음수면 intgB 값 출
			System.out.println(intgB); 
		} else if (intgA.compareTo(intgB) == 0) {//같으면 0 반
			int zero = 0;
			System.out.println(zero); 
		} else {
			System.out.println(intgA);
		}
		
		
		System.out.println(intgA.compareTo(intgB) > 0 ? intgA : intgA.compareTo(intgB) == 0 ? 0 : intgB);

		
		System.out.println(Integer.min(intgA,intgB)); 
		System.out.println(Integer.max(intgA,intgB));
		
		
		
	}
}
		/*
		문제 1.
		int a = 3;
		int b = 7;
		Integer intgA;
		Integer intgB;
		a와 b의 값을 갖는 intgA, intgB를 코딩하세요.

		문제 2.
		intgA와 intgB의 값을 더한 뒤 int로 변환하여 출력하세요.

		문제 3.
		intgA와 intgB의 값을 compareTo를 이용하여 비교하고 더 큰 값을 출력하세요.

		문제 4.
		intgA 와 intgB의 최소값과 최대값을 구하세요.
		힌트) max, min을 사용하세요.
		*/