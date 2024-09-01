package com.test.test;

public class test {
	public static void main(String[] args) {
		Book7 book = new Book7(); 
		book.setInfo("자바문법"); 
		System.out.println(book.getInfo());
	
	
	}
}
class Book7 {
	String title; 
	int price; 
	String author; 

	void setInfo(String title) {
		this.title = title ; 
	}
	
	void setInfo(String title, int price) {
		this.title = title; 
		this.price = price ; 
	}
	
	void setInfo(String title, int price, String author) {
		this.title = title; 
		this.price = price ;
		this.author = author; 
	}
	String getInfo () {
		return "제목: " + title + "\n가격: " + price + "\n저자: " + author ;
	}
	

}

/*
문제 1.
	주석처리된 코드의 오류를 수정하세요.

문제 2.
책의 가격을 달러로 변환하여 리턴하는 클래스 메소드를 작성하세요.
1달러=1000원으로 가정합니다. 
*/