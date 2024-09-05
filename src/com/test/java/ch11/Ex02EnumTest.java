package com.test.java.ch11;

import java.util.Scanner;

public class Ex02EnumTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		Movie m = new Movie () ; 
		m.setGenre(Genre.DRAMA);
		System.out.println(m.genre);
	}
}

class Movie {
	private	String title; 
	private	String author; 
	public Genre genre;
	
	public void setGenre (Genre genre) {
		this.genre = genre; 
	} 
	public Genre getGenre () {
		return genre; 
	}
	
}

enum Genre{
	HORROR, DRAMA, THRILLER, ACTION
}

/*
문제 1.
책의 장르를 enum을 사용해 설정하고 출력하세요.
*/