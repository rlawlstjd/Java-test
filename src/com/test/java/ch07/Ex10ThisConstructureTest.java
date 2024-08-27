package com.test.java.ch07;

public class Ex10ThisConstructureTest {
	public static void main(String[] args) {
		drama m = new drama () ; 
		drama.printInfo(m);
		
		drama m2 = new drama ("미나리"); 
		drama.printInfo(m2);
		
		drama m3 = new drama ("미나리","박정민"); 
		drama.printInfo(m3);
		
		drama m4 = new drama ("미나리","박정민","드라마");
		drama.printInfo(m4);
	
	
	
	}
}

class drama {
	String title; 
	String actor; 
	String genre; 
	
	drama(){
		this ("제목입력", "배우입력", "장르입력");
	}	
	
	drama(String title){
		this (title, "배우입력", "장르입력"); 
	}
	
	drama(String title, String actor){
		this (title, actor, "장르입력");
	}

	drama(String title, String actor, String genre){
			this.title = title ; 
			this.actor = actor ; 
			this.genre = genre ; 
	}
	
	static void printInfo(drama drama) {
		System.out.printf("제목: %s%n배위: %s%n장르: %s%n%n%n",drama.title, drama.actor, drama.genre);
	}
}

/*
문제 1.
this생성자를 사용하는 코드가 포함된 임의의 클래스를 작성하고 
각각의 생성자를 이용해 인스턴스 생성후 값들을 출력하는 코드를 작성하세요.
*/