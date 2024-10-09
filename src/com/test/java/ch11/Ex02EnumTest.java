package com.test.java.ch11;

import java.util.Scanner;

public class Ex02EnumTest {
	public static void main(String[] args) {
		Movie m = new Movie(); 
		m.setGenre(Genre.valueOf("drama"));
		m.setTitle("미나리");
		m.print(m);
	}
}
class Movie {
	String title; 
	Genre genre; 
	
	void print(Movie m) {
		System.out.println("제목: " + m.getTitle()); 
		System.out.println("장르: " + m.getGenre() + " " + genre.getGenreName());
	}
	
	void setTitle (String title) {
		this.title = title;
	}
	String getTitle() {
		return title;
	}
	void setGenre(Genre g) {
		this.genre = g; 
	}
	Genre getGenre() {
		return genre;
	}
}
enum Genre {
	drama("드라마"), 
	fiction("픽션"), 
	horro("공포");
	
	public final String genreName; 
	
	Genre(String a){
		this.genreName  = a; 
	}
	
	String getGenreName() {
		return genreName; 
	}
}

/*
문제 1.
책의 장르를 enum을 사용해 설정하고 출력하세요.
*/