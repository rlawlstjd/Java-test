package com.test.java.ch08;

public class Ex03SuperTest {
	public static void main(String[] args) {
		EBook3 eb = new EBook3 (); 
		System.out.println("제목: "+ eb.title + "책의 가격은" + eb.price + "책의 저자는" + eb.author + "글자 색깔은"+ eb.fontcolor);
		
	
	

	
	}
}
class Book5 {
	String author ; 
	String title ; 
	int price ;
	
	Book5(String author, String title, int price){
		this.author= author ; 
		this.title = title ; 
		this.price = price ;
		
	}
}
class EBook3 extends Book5{
	String fontcolor ; 
	
	EBook3(){
		super("엘컴퓨터학원", "c문법책", 100);
		this.fontcolor = "brown";
	
	}
		
}



/*
문제 1.
기본 생성자가 없는 Book3의 자식 클래스를 만들고
해당 자식 클래스를 이용해 인스턴스를 생성하세요.
힌트) super를 이용하세요.
*/