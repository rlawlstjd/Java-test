package com.test.java.ch07;

public class Ex10ThisConstructureTest {
	public static void main(String[] args) {
		Movie m = new Movie(); 
		Movie.movieInfo(m);	
		
		Movie m2 = new Movie("베테랑");
		Movie.movieInfo(m2);
		
		Movie m3 = new Movie("비기어게인", "마크"); 
		Movie.movieInfo(m3);
		
		Movie m4 = new Movie("커버넌트", "제이크", "존"); 
		Movie.movieInfo(m4);
		
	
	}
}

class Movie {
	String title; 
	String actor; 
	String director;
	
	Movie (){
		this("트랜스포머", "크리스", "조시");
	}
	
	Movie (String title){
		this(title, "황정민", "류승완");
	}
	
	Movie (String title, String actor){
		this(title, actor, "존 카니");
	}
	
	Movie (String title, String actor, String director){
		this.title = title; 
		this.actor = actor; 
		this.director = director; 
	}
	
	public static void movieInfo(Movie m) {
		System.out.println("영화제목: " + m.title + ", 배우: " + m.title + ", 감독: " + m.director);
	}
	
	/*public void printInfo() {
		System.out.println("영화제목: " + title + ", 배우: " + title + ", 감독: " + director);
	}*/
}

/*
문제 1.
this생성자를 사용하는 코드가 포함된 임의의 클래스를 작성하고 
각각의 생성자를 이용해 인스턴스 생성후 값들을 출력하는 코드를 작성하세요.
*/