package com.test.java.ch08;

public class Ex03Super {
	public static void main(String[] args) {
		EBook2 eb = new EBook2 () ; 
		System.out.println("책의 제목은 [" + eb.title + "] 이고 글자의 색은 [" + eb.fontcolor + "] 입니다. ");
	
	
	}
}

class Book3 {
	String title ; 
	String author ;
	int price ; 
	
	Book3(String title, String author){
		this.title = title ;
		this.author = author; 
		
	}
	
	/*
	 * Book3()
	 */
}

class EBook2 extends Book3{
	String fontcolor ; 
	
	EBook2() {
		super("언어문법", "엘컴퓨터학원");
		this.fontcolor="블랙";
	}
}