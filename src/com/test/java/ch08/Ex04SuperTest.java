package com.test.java.ch08;

public class Ex04SuperTest {
	public static void main(String[] args) {
		Parasite m = new Parasite () ; 
		m.printInfo();
	
		
		
		
	
	}
}

class Movie {
	String director ; 
	String title ; 
	int price ; 
	
	Movie (String director, String title, int price) {
		this.director = director;
		this.title = title;
		this.price = price ; 
	}
	
}

class Parasite extends Movie {
	int spector ; 
	int price;
	String title;
	
	Parasite() {
		super ("봉준호", "기생충", 13000);
		this.spector = 100000; 
	}
	
	void init(int price, String title) {
		System.out.println("지역변수" + price);
		System.out.println("인스턴스변수" + this.price);
		System.out.println("부모인스턴스변수" + super.price);
		System.out.println(director);
	}
	
	void printInfo () {
		System.out.printf("영화제목: %s%n영화감독: %s%n티켓가격: %d%n", title, director, price);
	}	
}
/*
문제 1.
this와 super에 대해 설명할 수 있는 코드를 작성하세요.
*/