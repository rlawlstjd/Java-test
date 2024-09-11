package com.test.java.ch13;

public class Ex02EqualsTest {
	public static void main(String[] args) {
		Movie m = new Movie ();
		m.title = "미나리"; 
		m.author = "엘"; 
		
		Movie m1 = new Movie ();
		m1.title = "기생충";
		m1.author = "엘";
	
		Movie m2 = new Movie (); 
		m2.title = "기생충"; 
		m2.author = "엘";
	
		
		System.out.println(m.equals(m1)); 
		System.out.println(m1.equals(m2)); 
	}
}

class Movie {
	String title; 
	String author; 
	
	
	
	
	@Override
	public boolean equals (Object o) {
		if (!(o instanceof Movie)) 
			return false; 
			Movie m = (Movie) o ; 
		
		return title.equals(m.title) && author.equals(m.author); 
		
	}
	
}
/*
문제 1.
원하는 클래스를 만드세요.
인스턴스 두 개를 생성하세요.
equals 메소드를 오버라이딩하여 인스턴스 변수들의 값이 모두 같을 시 true 를 반환하도록 코딩하세요. 
*/