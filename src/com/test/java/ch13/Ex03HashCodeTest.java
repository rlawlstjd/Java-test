package com.test.java.ch13;

import java.util.Objects;

public class Ex03HashCodeTest {
	public static void main(String[] args) {
		Drama d = new Drama("선재업고튀어","김혜윤");
		Drama d1 = new Drama("태양의 후예", "송중기");
		Drama d2 = new Drama("더글로리", "송혜교"); 
		Drama d3 = new Drama("더글로리", "송혜교");
	
		System.out.println(d.hashCode());
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		System.out.println(d3.hashCode());
		
		System.out.println(d1.equals(d3));
		System.out.println(d2.equals(d3));
	}
}

class Drama {
	String title; 
	String actor; 
	
	Drama(String title, String author){
		this.title = title; 
		this.actor = author; 
	}
	
	@Override 
	public int hashCode () {
		return Objects.hash(title, actor);
	}
	
	public boolean equals (Object o) {
		if(!(o instanceof Drama))
			return false; 
	
		Drama d = (Drama) o;
			
		return title.equals(d.title) && actor.equals(d.actor);
	}
	
	
	
}
/*
문제 1.
원하는 클래스를 만드세요.
인스턴스 두 개를 생성하세요.
hashCode 메소드를 오버라이딩하여 인스턴스 변수들의 값이 모두 같을 시 같은 해시코드를 반환하도록 코딩하세요. 
*/