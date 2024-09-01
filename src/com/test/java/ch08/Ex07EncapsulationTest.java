package com.test.java.ch08;

public class Ex07EncapsulationTest {
	public static void main(String[] args) {
		Movie1 m = new Movie1(); 
		m.setDirector("봉준호");
		m.setTitle("미나리");
		m.setPrice(15000);
		Movie1.printInfo(m);
		
	}
}
class Movie1{
	private String director;
	private String title; 
	private int price ; 
	
	public void setDirector(String director)  {
		this.director = director ;
	}
	
	public String getDirector() {
		return director; 
	}
	
	public void setTitle(String title) {
		this.title = title; 
	}
	
	public String getTitlte() {
		return title; 
	}
	
	public void setPrice (int price) {
		this.price = price ; 
	}
	
	public int getPrice() {
		return price;
	}
	
	public static void printInfo(Movie1 m) {
		System.out.println(m.title + "," + m.director + "," + m.price + "원");
		
	}
	
}
/*
문제 1.
특정 개체에 대한 클래스를 만들고 getter/setter 를 이용하여 캡슐화된 클래스를 작성한 뒤 출력하세요. 
*/