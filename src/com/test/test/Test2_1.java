package com.test.test;

public class Test2_1 {
	public static void main(String[] args) {
		Book2 book = new Book2();
		book.setTitle("자바 기본문법");
		
		EBook2 ebook = new EBook2();
		ebook.setTitle("자바 알고리즘");
		
		ComicBook cbook = new ComicBook();
		cbook.setTitle("만화로 배우는 자바");
		
		
		
		Cart cart = new Cart();
		cart.add(book);
		cart.add(ebook);
		cart.add(cbook);
		
		
		cart.printList();

		book.setVolume(50);
		System.out.println(book.getVolume());
		
	
	}

}

class Book2 {
	protected String title;
	private int volume; 
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	void setVolume (int volume) {
		this.volume = volume ; 
	}
	
	int getVolume () {
		return volume; 
	}
	
	
}

class EBook2 extends Book2 {
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

class ComicBook extends Book2 {
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


class AudioBook extends Book2{
	public int volume;
	
	void setVolume (int volume) {
		this.volume = volume ; 
	}
	
	int getVolume () {
		return volume; 
	}
	
	@Override 
	public String getTitle() {
		return "[오디오북]" + title; 
	}
}
	


class Cart {
	private Book2[] books = new Book2[10];
	private int index = 0;
	
	public void add(Book2 book) {	// 다형성
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
/*AudioBook 클래스를 추가하세요.
카트에 오디오북을 담으세요.
카트의 리스트 출력 시 오디오북은 [오디오북]책제목의 형식으로 출력되도록 코딩하세요. 
*/