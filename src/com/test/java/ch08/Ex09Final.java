package com.test.java.ch08;

public class Ex09Final {
	public static void main(String[] args) {
		Book7 b = new Book7();
		System.out.println(b.tax);
	
	
	}
}

final class Book7{ //상속불가
	String title; 
	String author;
	int price ;
	final float tax ; //최초 한 번만
	
	public Book7() {
		tax = 1.1f;
	}
}

class Book8 {
	String title; 
	String author; 
	
	final public void setTitle(String title) { //오버라이딩 못하게 메소드 ....
		this.title = title; 
	}
}

class EBook7 extends Book8 {
	String fontColor;
}