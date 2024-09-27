package com.test.java.ch07;

public class Ex06ClassMethod {
	public static void main(String[] args) {	
		Book5 b1 = new Book5(); 
		b1.bookNo = Book5.generateBookNo();
		System.out.println("b1.bookNo");
		
		System.out.println();
		
		Book5 b2 = new Book5(); 
		b2.bookNo = Book5.generateBookNo(); 
		System.out.println(b2.bookNo);
	
		Book5 b3 = new Book5(); 
		b3.price = 50000; 
		System.out.println(b3.getDollarPrice());
	}
}

class Book5{
	String title; 
	int price; 
	static int bookNo;
	
	
	static int generateBookNo() {
		return (int)(Math.random()*9000)+1000; //1000부터  8999 까지  Math.random() 0부터 0.99999 숫자 .
	}
	
	 static int genBookNo(){
		 bookNo = (int)(Math.random()*9000)+1000; 
		 return bookNo; 
	}
	 
	public float getDollarPrice() {
		float dollarPrice = price / 1100f; 
		return dollarPrice;
	
	}
}
/*
문제 1.
책 클래스에 카테고리를 저장할 수 있는 속성(변수)을 추가하세요.
카테고리를 "문화" 에서 "도서"로 변경해 주세요.
카테고리 변경 시 모든 인스턴스에 동일하게 적용되도록 코딩 후 적용된 결과를 출력하세요. 
*/