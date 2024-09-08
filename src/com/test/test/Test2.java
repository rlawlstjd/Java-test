package com.test.test;

public class Test2 {
	public static void main(String[] args) {
	
		Book2 b = new Book2() ;
		b.setTitle("자바 기본문법");
		
		EBook2 eb = new EBook2();
		eb.setTitle("자바 알고리즘"); 
		
		ComicBook cbook = new ComicBook(); 
		cbook.setTitle("만화로 배우는 자바");
		
		Cart cart = new Cart(); 
		cart.add(b);	
		cart.add(eb);
		cart.add(cbook);
	
		cart.print();
}
	
class Book2 {
	protected String title; 
	
	public String getTitle() {
		return title; 
	}
	public void setTitle(String title) {
		this.title = title; 
	}
}

class EBook2 extends Book2{
	private String fontColor; 
	
	public String getFontColor() {
		return fontColor;
	}
	public void setFontColor(String fontColor) {
		this.fontColor = fontColor;
	}
	
	@Override 
	public String getTitle() {
		return "[e북]" + title; 
	}
}

class ComicBook extends Book2{
	private boolean color; 
	
	public boolean isColor() {
		return color; 
	}
	public void setColor(boolean color) {
		this.color = color; 
	}
	
	@Override 
	public String getTitle() {
		return "[만화책]" + title; 
	}
}

class Cart {
	private Book2[] books = new Book2[10];
	private int index = 0 ; 
	
	public void add (Book2 book) {
		books[index] = book; 
		index++; 
	}
	
	public void print() {
		for (int i=0; i<index; i++) {
			System.out.println(books[i].getTitle());
		}
	}}

