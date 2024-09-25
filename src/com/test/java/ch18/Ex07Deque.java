package com.test.java.ch18;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Ex07Deque {
	public static void main(String [] args ) {
		Book2 book = new Book2("자바 컬렉션");
		book.addPage(new Page2(0, "표지"));
		book.addPage(new Page2(1, "목차"));
		book.addPage(new Page2(2, "ArrayList"));
		book.addPage(new Page2(3, "LinkedList"));
		book.addPage(new Page2(4, "Queue"));
		book.addPage(new Page2(5, "Stack"));
		
		book.view();
		book.nextPage();
		book.view();
		book.nextPage();
		book.view();
		book.nextPage();
		book.view();
		
		System.out.println();
		
		book.prevPage();
		book.view();
		book.prevPage();
		book.view();
		book.prevPage();
		book.view();
		
		
	}
}

class Book2 {
	private List<Page2> pageList; 
	private Deque<Page2> pageStack;
	private String title;
	private int currentPage;
	
	Book2(String title){
		this.pageList = new LinkedList<>();
		this.pageStack = new ArrayDeque<>();
		this.title = title; 
	}
	
	public void view() {
		System.out.println(pageList.get(currentPage));
	}
	
	public void nextPage() {
		pageStack.offer(pageList.get(currentPage++));
	}
	
	public void prevPage() {
		Page2 page = pageStack.poll();
		currentPage = page.getNo();
	}
	
	public void addPage(Page2 p) {
		pageList.add(p);
	}
	
}

class Page2 {
	private int no ; 
	private String comment;
	
	public Page2(int no, String comment){
		this.no = no ; 
		this.comment = comment;
	}
	
	public int getNo() {
		return no;
	}
	
	public String toString () {
		return no + "페이지, 내용:" + comment; 
	}
}