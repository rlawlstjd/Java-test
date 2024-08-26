package com.test.java.ch07;

public class Ex09ConstructureTest {
	public static void main(String[] args) {
		movie m = new movie ("미나리", 120, "드라마") ; 
		m.printInfo();
		
		movie1 m1 = new movie1(); 
		m1.printInfo();
		
		movie2 m2 = new movie2(120);
		m2.printInfo();
		
		movie3 m3 = new movie3("드라마"); 
		m3.printInfo();
	}
}
class movie {
	String title; 
	int time; 
	String genre; 
	
	movie(String title, int time, String genre) {
		this.title = title ; 
		this.time = time ; 
		this.genre = genre ; 
	}
	
	void printInfo() {
		System.out.printf("영화제목: %s%n상영시간: %d%n장르: %s%n", title, time, genre);
	}
	
	
}
class movie1{
	String title; 
	int time ; 
	String genre; 
	movie1(){
		this.title= "미나리1";
		this.time= 60 ; 
		this.genre= "드라마"; 
	}
	void printInfo () {
		System.out.printf("영화제목: %s%n상영시간: %d%n장르: %s%n", title, time, genre);
	}
}
class movie2{
	String title; 
	int time ; 
	String genre;
	movie2(int time){
		this.title="only"; 
		this.time = time ;
		this.genre = "드라마";
	}
	void printInfo() {
		System.out.printf("영화제목: %s%n상영시간: %d%n장르: %s%n", title, time, genre);
	}
}
class movie3{
	String title; 
	int time ; 
	String genre;
	movie3(String genre){
		this.title= "Hi"; 
		this.time = 130;
		this.genre= genre;
	}
	void printInfo() {
		System.out.printf("영화제목: %s%n상영시간: %s%n장르: %s%n", title, time, genre); 
	}
}

/*
문제 1.
영화 제목(문자열), 상영시간(정수), 장르(문자열) 속성을 가진 클래스를 만들고 
생성자를 이용하여 속성을 설정한 뒤 출력하세요.

문제 2.
생성자 오버로딩을 이용해 생성자 세개를 추가하고
각각의 생성자를 이용하여 3개의 인스턴스를 생성후 정보를 출력하세요.  
*/