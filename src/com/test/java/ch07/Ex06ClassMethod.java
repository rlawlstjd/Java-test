package com.test.java.ch07;

public class Ex06ClassMethod {
	

		public static void main(String[] args) {
			Book5 b1 = new Book5();
			b1.bookNo = Book5.generateBookNo();
			System.out.println(b1.bookNo);
			
			System.out.println();
			
			Book5 b2 = new Book5();
			b2.bookNo = Book5.generateBookNo();
			System.out.println(b2.bookNo);
			
		}

	}

	class Book5 {
		String title;
		int bookNo;
		
		static int generateBookNo() {
			return (int)(Math.random()*9000)+1000;
		}}
	