package com.test.java.ch07;

public class Ex13CallByValueTest {
	public static void main(String[] args) {
		Book19 b = new Book19("자바문법", "엘컴퓨터학원", 10000); 
		
		b.price = Book19.modifyPrice(b.price);
		b.printInfo();
	}
}

class Book19 {
	String title; 
	String author; 
	int price; 
	
	Book19(String title, String author, int price){
		this.title = title; 
		this.author = author; 
		this.price = price; 
	}
	
	static int modifyPrice(int p) {
		return (int)(p*1.2f);
	}
	
	public void printInfo() {
		System.out.println("제목: " + title + ", 저자: " + author + ", 가격: " + price); 
	}
}

/*
문제 1.
call by value 를 이용해 책의 금액을 수정하는 메소드를 작성하세요.
힌트) 수정된 금액을 return 하세요. 
*/