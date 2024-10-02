package com.test.java.ch09;

public class Ex03Downcasting {
	// 다운캐스팅 (다형성)

	public static void main(String[] args) {
		Book3 book = null;
		
		AudioBook1 ab = null; 
		
		book = new Book3();
		book.setTitle("자바 기본문법");
		System.out.println(book.getTitle());
		
		EBook3 ebook = new EBook3();
		ebook.setTitle("자바 알고리즘");
		System.out.println(ebook.getTitle());
	
	
		
		book = new AudioBook1();
		ab = (AudioBook1)book ; 
		ab.setVolume(50);
		System.out.println(ab.getVolume());
	
	}
}

class Book3 {
	private String title;
	private String fontColor;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setFontColor(String color) {
		this.fontColor = color;
	}
	
	
}

class EBook3 extends Book3{
	private String fontColor;
	
	
	@Override
	public void setTitle(String title) {
		title = "오디오 " + title;  
		super.setTitle(title);
	}
	public String getFontColor() {
		return fontColor;
	}
	public void setFontColor(String fontColor) {
		this.fontColor = fontColor;
	}
	
}

class AudioBook1 extends Book3{
	public int volume;
	
	void setVolume (int volume) {
		this.volume = volume; 
	}
	
	int getVolume () {
		return volume; 
	}
}
	/*
	문제 1.
	오디오북 클래스를 추가하세요.
	볼륨을 저장하는 정수타입의 속성을 추가하세요.
	main 메소드에서 다운캐스팅을 사용하여 오디오북의 볼륨을 출력하는 코드를 작성하세요. 
	*/