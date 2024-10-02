 package com.test.java.ch09;

public class Ex01Upcasting {
	public static void main(String[] args) {
		Book book = null ; //빈값이다
		book = new Book(); //새로운 인스턴스 생성 
		book.setTitle("자바 기본문법");
		System.out.println(book.getTitle()); 
	
		
		book = new EBook(); //업캐스팅 //상속받고 있기 때문... 부모 자식간 업캐스팅 가능.  자식 -> 부모 타입 저장  = 업캐스팅 
		book.setTitle("자바 자료구조");  // 업캐스팅 저장했을 땐 부모타입의 메소드에 한해서만 호출 가능. 자식 메소드 x 
		System.out.println(book.getTitle()); // 업캐스팅 하면서 자식의 메소드를 쓰고싶다면 오버라이딩을 하라.
	}
}

class Book {
	private String title; 
	
	public String getTitle() {
		return title; 
	}
	
	public void setTitle (String title) {
		this.title = title; 
	}
	
}
	class EBook extends Book{
		private String fontColor; 
		
		public String getFontColor() {
			return fontColor; 
		}
		
		public void setFontColor (String fontColor) {
			this.fontColor = fontColor; 
		}
		
		public void setTitle(String title) {
			title = "[EBOOK]" + title ; 
			super.setTitle(title);
		}
		
	}
