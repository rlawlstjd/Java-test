package com.test.java.ch14;

public class Ex04StringBufferTest {
	public static void main(String[] args) {
		StringBuffer b = new StringBuffer(); 
		b.append("안").append(" ").append("녕").append(" ").append("하세").append(" ").append("요");
		b.append(",").append(" ").append("자바 기본 문법 엘 컴퓨터 학원입니다.");
	
		String str = b.toString(); 
		
		char[] chArr = str.toCharArray(); 
		
		
		System.out.println(chArr); 
	}
}


/*
문제 1.
String str = "안 녕 하세 요, 자바 기본 문법 엘 컴퓨터 학원 입니다.";
위 문자열을 char[] 타입으로 변환하세요.
StringBuffer를 이용해 문자열로 만들어 출력하세요. 
*/