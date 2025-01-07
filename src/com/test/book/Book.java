package com.test.book;

 class Book {
	String title; 
	String author; 
	int price ; 
	
	
	public void setTitle(String title) {
		this.title = title ; 
	}
	
	public String getTitle() {
		return title  ;
	}
	
	public void printInfo() {
		System.out.printf("안녕하세요");
	}
}
