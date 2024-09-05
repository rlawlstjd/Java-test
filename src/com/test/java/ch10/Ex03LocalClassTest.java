package com.test.java.ch10;

public class Ex03LocalClassTest {
	public static void main(String[] args) {
		Book22 b = new Book22("Java Programing", "LCOM");
		Book22 b1 = new Book22("Python Programing", "LCOMPUTER");
	
		System.out.println("Author of book1 is valid: " + b.validAuthorName());
        System.out.println("Author of book2 is valid: " + b1.validAuthorName());
    
	
	}
}
class Book22{
	private String title; 
	private String author; 
	 
	public Book22(String title,String author) {
		this.title = title; 
		this.author = author; 
	}
	
	public boolean validAuthorName () {
		
		class ValidAuthorName {
			
			public boolean isValid(String name) {
				if(name == null || name.isEmpty()) {
					return false;
				}
				for (int i=0; i<name.length(); i++) {
					char ch = name.charAt(i);
					if(!(ch >= 'A' && ch <= 'Z') && ch != ' ' ) {
						return false;
					}
					
				}
				return true ; 
			}
		}	
		ValidAuthorName validator = new ValidAuthorName();
	      
	    return validator.isValid(author);
	}
}
/*
문제 1.
로컬 클래스를 사용하여 저자 이름 유효성 검사 메소드를 코딩하세요.
저자 이름은 영문 대문자, 공백만 가능합니다.
*/