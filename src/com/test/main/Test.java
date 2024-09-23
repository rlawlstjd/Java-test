package com.test.main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Test {
	public static void main(String[] args) {
		Book book = new Book ("자바 컬렉션");
		book.addPage(new Page(0,"표지"));
		book.addPage(new Page(1,"목차"));
		book.addPage(new Page(2,"ArrayList"));
		book.addPage(new Page(3,"Queue"));
		book.addPage(new Page(4,"Stack"));
		book.addPage(new Page(5,"LinkedList"));
		
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

class Book {
	private String title; 
	private List<Page> pageList;
	private Stack<Page> pageStack;
	private int currentPageNo;
	
	public void nextPage() {
		pageStack.push(pageList.get(currentPageNo++));
	}
	
	public void prevPage() {
		Page page =pageStack.pop();
		currentPageNo = page.getNo(); 
	}
	
	public void view () {
		System.out.println(pageList.get(currentPageNo));
	}
	
	Book (String title){
		this.title = title;
		this.pageList = new LinkedList<>();
		this.pageStack = new Stack<>(); 
	}
	
	public void addPage(Page p) {
		pageList.add(p);
	}
}

class Page  {
	private int no ; 
	private String content; 
	
	public int getNo() {
		return no;
	}
	
	Page(int no , String content){
		this.no = no ; 
		this.content = content;
	}
	
	@Override 
	public String toString() {
		return no + "페이지 -" + content;
	}
	
}