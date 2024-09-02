package com.test.java.ch09;

public class Ex02Polymorphism {
	public static void main(String[] args) {
		Book2 book = new Book2 (); 
		book.setTitle("자바 기본문법");
		
		EBook2 ebook = new EBook2(); 
		ebook.setTitle("자바 알고리즘");
		
		comicBook cbook = new comicBook(); 
		cbook.setTitle("만화로 배우는 자바");
		
		Cart cart = new Cart();
		cart.add(book); 
		cart.add(ebook);
		cart.add(cbook); 
		
		cart.printList(); 
	
	}
}

class Book2 {
	protected String title; 
	
	public String getTitle () {
		return title; 
	}
	
	public void setTitle (String title ) {
		this.title = title ; 
	}
	
}
class EBook2 extends Book2 {
	private String fontColor; 
	
	public String getFontColor() {
		return fontColor; 
	}
	
	public void setFontColo(String fontColor) {
		this.fontColor = fontColor; 
	}
	public String getTItle() {
		return "[만화책]" + title ; 
	}
}




class comicBook extends Book2 {
	private boolean color; 
	
	public boolean isColor() {
		this.color = color;
	}
	
	public void setColor(boolean color) {
		this.color = color;
	}
	
	public String getTitle() {
		return "[만화책]" + title; 
	}
}

class Cart {
	private Book2[] books = new Book2[10]; 
	private int index = 0 ; 
	
	public void add(Book2 book) {
		books[index] = book;
		index++; 
	}
	
	
	public void printList() {
		for (int i=0; i<books.length; i++) {
			if (books[i] == null)
				break; 
			System.out.println(books[i].getTitle());
			// (1) System.out.println(books[i].getFontColor());
			
			
		}
	}
}