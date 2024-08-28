package com.test.java.ch07;

public class Ex06ClassMethod {
	

	public static void main(String[] args) {
		Book5 b1 = new Book5();
		b1.bookNo = Book5.generateBookNo();
		System.out.println(b1.bookNo);
		
		System.out.println();
		
		Book5 b2 = new Book5();
		b2.bookNo = Book5.generateBookNo();
		System.out.println(b2.bookNo);
		
		float dollar = b2.getDollarPrice();
		System.out.println(dollar);
		
		Book5 b5 = new Book5();
		b5.genBookNo3();
		Book5 b6 = new Book5();
		b6.genBookNo3();
		
		Book5 b7 = new Book5();
		Book5.genBookNo2(b7);
		System.out.println(b7.bookNo);
	}

}

class Book5 {
	String title;
	int bookNo;
	int price ; 
	
	static int generateBookNo() {
		return (int)(Math.random()*9000)+1000;
	}
	
	static int genBookNo() {
		 return (int)(Math.random()*9000)+1000;
		
	}
	float getDollarPrice() {
		float dollarPrice = price / 1000f ; 
		return dollarPrice ; //return ? 
	}
	
	static void genBookNo2(Book5 book) {
		book.bookNo = (int)(Math.random()*9000)+1000;
		//return bookNo;
	}
	
	int genBookNo3() {
		bookNo = (int)(Math.random()*9000)+1000;
		return bookNo;
	}

}


/*
문제 1.
	주석처리된 코드의 오류를 수정하세요.

문제 2.
책의 가격을 달러로 변환하여 리턴하는 클래스 메소드를 작성하세요.
1달러=1000원으로 가정합니다. 
*/
	