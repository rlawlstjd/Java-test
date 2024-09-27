package com.test.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Test {
	public static void main(String[] args) {	
		Book20 b = new Book20 ("자바문법", "엘컴퓨터학원", 50000); 
		Book20.modifyPrice(b);
		b.printInfo();
	
	
	}
}

class Book20 {
	String title; 
	String author; 
	int price; 
	
	Book20 (String title, String author, int price){
		this.title = title; 
		this.author = author; 
		this.price = price; 
	}
	
	static void modifyPrice (Book20 b) {
		b.price *= 1.2f;
	}
	
	void printInfo() {
		System.out.println("제목: " + title + "저자: " + author + "가격: " + price);
	}
}
/*
문제 1.
call by reference 를 이용해 책의 금액을 수정하는 메소드를 코딩하세요. 
*/