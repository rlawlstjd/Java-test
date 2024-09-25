package com.test.java.ch18;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Ex06StackTest {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in); 

	Book1 book = new Book1 ("자바 문법책");
	book.addPage(new Page1(0));
	book.addPage(new Page1(1));
	book.addPage(new Page1(2));
	book.addPage(new Page1(3));
	book.addPage(new Page1(4));
	
	book.nextPage(); 
	book.view();
	book.nextPage(); 
	book.view();
	book.nextPage(); 
	book.view();
	
	System.out.println("\n"); 
	
	book.prevPage();
	book.view();
	book.prevPage();
	book.view();
	
	System.out.println("페이지를 입력하세요");
	book.addPage(new Page1(s.nextInt()));
	book.view();
	book.nextPage();
	book.view();
	book.prevPage();
	book.view();
	
	
	}
}

class Book1 {
	private String title; 
	private List<Page1> pageList;
	private Stack<Page1> pageStack;
	private int currentPage ; 
	
	Book1 (String a){
		this.title = a; 
		this.pageList = new LinkedList<>();
		this.pageStack = new Stack<>();
	}
	
	
	public void addPage (Page1 p) {
		pageList.add(p);
	}
	
	public void view () {
		System.out.println(pageList.get(currentPage));
	}
	
	public void nextPage() {
		pageStack.push(pageList.get(currentPage++));
	}
	
	public void prevPage() {
		Page1 page = pageStack.pop();
		currentPage = page.getNo();
	}
}

class Page1 {
	private int no; 
	private String content; 
	
	public int getNo() {
		return no ;
	}
	
	Page1(int a){
		this.no = a; 
	}
	
	@Override
	public String toString () {
		return no + "페이지";
	}
	
}
/*
문제 1.
입력한 페이지로 설정되는 메소드를 추가하세요.
view메소드를 이용해 설정된 페이지를 출력하세요.
페이지 설정 후 이전페이지와 다음페이지를 출력하세요.
*/