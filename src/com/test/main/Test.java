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
		Book4.tax = 1.2f; 
		
		Book4 b1 = new Book4() ; 
		b1.title = "자바문법";
		b1.price = 50000; 
		
		Boook4 b2 = new Book4(); 
		b2.title = "c문법";
		b2.price = 40000; 
		
		b1.printInfo(); 
		b2.printInfo();
		System.out.println();
	}
}
class Book4 {
	private String title; 
	private String price;
}