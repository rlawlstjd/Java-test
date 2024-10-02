package com.test.java.ch08;

public class Ex03SuperTest {
	public static void main(String[] args) {
		PaperBook1 p = new PaperBook1 (15, 30); 
		System.out.println("책의 제목: [" + p.title + "]" + ", 저자: [" + p.author + "]");

	}
}

class Book31{
	String title; 
	String author; 
	
	Book31(String title, String author){
		this.title = title ; 
		this.author = author; 
	}
}

class PaperBook1 extends Book3{
	int width; 
	int height; 
	
	PaperBook1(int w, int h){
		super("홍길동전", "허균");
		this.width = w; 
		this.height = h;
	}
	
}



/*
문제 1.
기본 생성자가 없는 Book3의 자식 클래스를 만들고
해당 자식 클래스를 이용해 인스턴스를 생성하세요.
힌트) super를 이용하세요.
*/