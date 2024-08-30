package com.test.java.ch08;

public class Ex05OverridingTest {
	public static void main(String[] args) {
		EBook51 b = new EBook51 () ;
		b.printInfo();
		
		b.printAllInfo();
	}
}
class Book51 {
	String title; 
	String author; 
	
	Book51 (String title, String author){
		this.title= title ;
		this.author = author; 
	}
	
	void setTitle (String title) {
		this.title = title;
	}
	void printInfo() {
		System.out.printf("종이책의 재목은: %s%n",title);
	}
	
}

class EBook51 extends Book51{
	EBook51 (){
		super("자바문법", "엘컴퓨터학원");
	}
	
	void setTitle (String title ) {
		super.setTitle(title);
		this.title = "미나리";
	}
	
	void printInfo() {
		System.out.printf("E북의 제목은 [이북]%s%n", title); 
	}
	
	void printAllInfo() {
		super.printInfo();
		printInfo() ; 
	}
	
}





/*
문제 1.
제목 설정 메소드를 부모클래스와 자식클래스에 모두 작성하고 자식클래스의 제목 설정 메소드는 제목에 [이북]이 추가되도록 작성하세요.
부모의 타이틀과 자식의 타이틀 모두 출력하세요. 
*/