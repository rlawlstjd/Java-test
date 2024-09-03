package com.test.java.ch09;

public class Ex01UpcastingTest {
	public static void main(String[] args) {
		Book1 book = null; 
		book = new Book1();
		book.setTitle("자바 기본문법");
		System.out.println(book.getTitle());
		
		book = new EBook1();			// 업캐스팅
		book.setFontColor("블랙");
		System.out.println(book.getFontColor());
		book.setTitle("자바 자료구조");
		System.out.println(book.getTitle());
	
		
		book = new AudioBook (); 
		book.setVoiceActor("엘컴퓨터학원");
		System.out.println(book.getVoiceActor());
	}
	

}

class Book1 {
	private String title;
	private String fontColor; 
	private String voiceActor;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setFontColor(String fontColor) {
		this.fontColor = fontColor; 		
	}
	public String getFontColor() {
		return fontColor;
	}
	
	public void setVoiceActor (String voiceActor) {
		this.voiceActor = voiceActor; 
	}
	public String getVoiceActor () {
		return voiceActor;
	}
	
}
class EBook1 extends Book1{
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

class AudioBook extends Book1 {
	private String voiceActor ;
	
	public void setVoiceActor (String voiceActor) {
		this.voiceActor = voiceActor;
		super.setVoiceActor(voiceActor);
 	}
	
	public String getVoiceActor () {
		return voiceActor;
	}
	
}


/*
문제 1.
book.setFontColor("블랙") 코드에서 컴파일 오류가 나지 않도록 수정해 주세요.

문제 2.
Book의 자식 클래스인 AudioBook 클래스를 추가해 주세요.
업캐스팅을 이용해 AudioBook 클래스의 특정 메소드를 호출하는 코드를 작성하세요. 
*/