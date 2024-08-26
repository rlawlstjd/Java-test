package com.test.java.ch07;

public class Ex07FinalVariableTest {

	public static void main(String[] args) {
		
		
		book1 book = new book1() ; 
		book.price = 20000; 
		book.printInfo() ; 
		
		//book1.tax = 2  ; ---- 에러 
 		
		book1 book1 = new book1()  ;
		book.price = 14000 ; 
		book.printInfo() ; 
	
	
	
	
	}
}

class book1{
	String title ; 
	final int price  = 100 ; 
	//int price ;
	final static float tax = 1.5f;
	
	void printInfo() {
		System.out.println("세율이 적용된 책의 가격: " + price*tax);
		
	}
}
/*
문제 1.
책의 세율을 final로 설정한뒤 세율이 적용된 책의 가격을 출력하는 코드를 작성하세요. 
*/