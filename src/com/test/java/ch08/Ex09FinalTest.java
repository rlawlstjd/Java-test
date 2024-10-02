package com.test.java.ch08;

public class Ex09FinalTest {
	public static void main(String[] args) {
		Book77 b1 = new Book77();
		System.out.println(b1.tax);
		//b1.tax = 1.2f;
		
		Book88 b2 = new Book88 ();
		b2.setTitle("안녕하세요");
		b2.getTitle();
		
		
		
	}

}

//final 
	class Book77 {
	String title;
	String author;
	int price;
	final float tax;
	// final float tax = 1;
	
	public Book77() {
		tax = 1.1f;
	}
}

/*
class EBook6 extends Book7 {
	
}
*/

class Book88 {
	String title;
	String author;
	
	final public void setTitle(String title) {
		this.title = title;
	}
	
	final String getTitle() {
		System.out.printf("책의 제목: %s", title);
		return title;
		
	}
}

class EBook66 extends Book77 {

}

class EBook77 extends Book88 {
	String fontColor;
	
	/*String getTitle() {
		return title;
	}*/
	
	/*
	final public void setTitle(String title) {
		this.title = "[E북]" + title;
	}
	*/
}

/*
문제1.
Book8클래스에 getTitle 메소드를 추가하고 EBook7 클래스에서 getTitle 메소드를 오버라이딩 할 수 없도록 코딩하세요.

문제2.
EBook6 클래스가 Book7 클래스를 상속 받을 수 있도록 수정하세요. 
*/