package com.test.java.ch09;

public class Ex01UpcastingTest {
	public static void main(String[] args) {
		Book11 book = null; 
		book = new Book11();
		book.setTitle("자바 기본문법");
		System.out.println(book.getTitle());
		
		book = new EBook11();			// 업캐스팅
		book.setFontColor("블랙");
		System.out.println(book.getFontColor());
		book.setTitle("자바 자료구조");
		System.out.println(book.getTitle());
		
		book = new AudioBook (); 
		book.setVolume(15);
		System.out.println(book.getVolume());
		
	}
}

class Book11 {
	private String title;
	private String fontColor;
	private int volume;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setFontColor(String title) {
	}
	
	public String getFontColor() {
		return fontColor; 
	}
	
	public void setVolume(int v) {
	}
	
	public String getVolume () {
		return "," + volume; 
	}
}


class EBook11 extends Book11{
	private String fontColor;

	public String getFontColor() {
		return fontColor;
	}
	public void setFontColor(String fontColor) {
		this.fontColor = fontColor;
	}
	
	@Override
	public void setTitle(String title) {
		title = "[EBOOK]" + title;
		super.setTitle(title);
	}
}

class AudioBook extends Book11{
	private int volume; 
	
	@Override
	public void setVolume (int v) {
		this.volume = v; 
		
	}
	@Override
	public String getVolume () {
		return "설정한 볼륨은: " + volume + "입니다." ; 
		
	}
}

/*
문제 1.
book.setFontColor("블랙") 코드에서 컴파일 오류가 나지 않도록 수정해 주세요.

문제 2.
Book의 자식 클래스인 AudioBook 클래스를 추가해 주세요.
업캐스팅을 이용해 AudioBook 클래스의 특정 메소드를 호출하는 코드를 작성하세요. 
*/