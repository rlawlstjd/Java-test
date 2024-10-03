package com.test.main;

public class Test {
	public static void main(String[] args) {	
		Book b = new Book ("자바문법", "엘컴퓨터학원");
		
		System.out.println("유효한 저자명: " + b.validName()); 
		
	
	
	}
}

class Book { 
	String title ; 
	String author; 
	
	Book(String title, String author){
		this.title = title; 
		this.author = author; 
	}
	
	
	// 메소드 안 클래스 , 지역 클래스 
	public boolean validName () {
		
		class Check {
			
			public boolean isValid(String name) {
				if (name == null && name.isEmpty()) {
					return false; 
				}
				for (int i=0; i<name.length(); i++) {
					char ch = name.charAt(i);
					if (! (ch >='A' && ch <= 'Z') && (ch == ' ')) {
						return false;
					}
				}
				return true;
			}
		}
		Check c = new Check (); 
		return c.isValid(author);
	}
}
