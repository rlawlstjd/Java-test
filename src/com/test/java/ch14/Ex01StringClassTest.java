package com.test.java.ch14;

public class Ex01StringClassTest {
	public static void main(String[] args) {
		String a = "hello"; 
		String b = "hello"; 
		String aa = new String("Hello"); 
		String bb = new String("Hello"); 
		
		
		
		System.out.println(a==b); 
		System.out.println(a.equals(b));
		System.out.println(aa==bb); 
		System.out.println(aa.equals(bb)); 
		
	
	
	}
}
/*
문제 1.
== 과 equals 의 차이를 설명할 수 있는 예제를 작성하세요.
*/