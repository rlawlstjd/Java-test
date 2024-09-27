package com.test.java.ch07;

public class Ex05ClassVariableTest {
	public static void main(String[] args) {
		//Book01.category ="문화"; 
		Book01.category ="도서"; // static  이용 변경. 
		
		Book01 b = new Book01 () ; 
		b.title = "무한도전";
		b.price = 50000 ; 
		b.author = "mbc"; 
		
		Book01 b2 = new Book01 () ; 
		b2.title = "1박2일"; 
		b2.price = 50000 ; 
		b2.author = "kbs"; 
		
		Book01 b3 = new Book01 () ; 
		b3.title = "웃찾사";
		b3.price = 50000 ; 
		b3.author = "sbs"; 
		
		b.printInfo();
		b2.printInfo();
		b3.printInfo();
		
	}
}

class Book01{
	String title ; 
	String author ; 
	int price ; 
	
	static String category = "문화";

	void printInfo() {
		System.out.printf("책이름: %s 가격: %d 저자: %s 카테고리: %s%n", title, price, author, category);
	}
}
/*
문제 1.
책 클래스에 카테고리를 저장할 수 있는 속성(변수)을 추가하세요.
카테고리를 "문화" 에서 "도서"로 변경해 주세요.
카테고리 변경 시 모든 인스턴스에 동일하게 적용되도록 코딩 후 적용된 결과를 출력하세요. 
*/