package com.test.java.ch14;

import java.util.Arrays;

public class Ex03StringUtilsTest {
	public static void main(String[] args) {
		String s = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
		
		System.out.println(s.substring(18));
		
		String[] strArr = s.split(" +"); 
		System.out.println(Arrays.toString(strArr));
		
		for (int i= strArr.length-1 ; i >= 0; i-- ) {
		
			System.out.print(" "+strArr[i]);		
			
		}
		System.out.println();
		
		String a = "동해물";
		String b = "백두산";
		
		
		// a가 b보다 앞서면 양수고, b가 a보다 앞서면 음수고 같으면 0 
		System.out.println(a.compareTo(b) > 0 ? a : b); // 
		
	}
}
/*
문제 1.
동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세
위 문장에서 substring 을 사용하여 "하느님이" 부터 끝까지 출력하세요.

문제 2.
위 문장을 split을 사용하여 공백을 기준으로 배열로 만든 뒤 
배열의 맨 뒤에서 앞으로 요소들을 출력하세요.

문제 3.
동해물
백두산
두 문자열 중 더 큰 문자열을 출력하세요.
힌트) compareTo를 사용하세요.
*/