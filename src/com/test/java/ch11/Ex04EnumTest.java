package com.test.java.ch11;

import java.util.Scanner;

public class Ex04EnumTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		Book23 b = new Book23 () ; 
		b.setGenre(Genre2.HORROR);
		System.out.println(b.genre);
		System.out.println(b.genre.getGenre1());
	
	}
}

class Book23 {
	private	String title; 
	private	String author; 
	public Genre2 genre;
	
	Book23(){
		
	}
	
	public void setGenre (Genre2 genre) {
		this.genre = genre; 
	} 
	public Genre2 getGenre () {
		return genre; 
	}
	
}

enum Genre2{
	HORROR("공포"),
	DRAMA("드라마"),
	THRILLER("스릴러"),
	ACTION ("액션");
	
	private final String genreName;
	
	Genre2(String name){
		this.genreName = name ; 
	}
	
	public String getGenre1() {
		return genreName;
	}
}

/*
문제 1.
장르 enum에 getString 메소드를 추가하세요.
메소드 호출 시 해당 장르를 한글로 리턴 하도록 코딩하고 출력하세요.
*/