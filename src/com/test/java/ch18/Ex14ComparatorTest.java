package com.test.java.ch18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Ex14ComparatorTest {
	public static void main(String[] args) {
		 List<Student> students = new ArrayList<Student>(); 
		 Collections.addAll(students, new Student("A", 1), new Student("C", 3), new Student("B", 2), new Student("D", 4));
		 Collections.sort(students);
		 System.out.println(students); 
		 System.out.println(); 
		 
		 Collections.sort(students, new Comparator<Student>() {
			 @Override
			 public int compare(Student s1, Student s2) {
				 int result = Integer.valueOf(s1.getNo()).compareTo(s2.getNo()) * -1;
				 if ( result == 0) {
					 return s1.getName().compareTo(s2.getName()) * -1; 
				 }
				 return result; 
			 }
		 });
		 System.out.println(students); 
		 System.out.println(); 
		 
		 
		 System.out.println("< 가격 내림차순 >");
		 PriorityQueue<Book> pqUp = new PriorityQueue<>();
		 Collections.addAll(pqUp, new Book("채식주의자", 98000), new Book("잡식주의자", 30000), new Book("육식주의자", 22000), new Book("금식", 40000));
		 while (!pqUp.isEmpty()) {
			 System.out.println(pqUp.poll());
		 }
		 System.out.println(); 
		 
		 System.out.println("< 가격 오름차순 >");
		 PriorityQueue<Book> pqDown = new PriorityQueue<>(new Comparator<Book>() {
			 @Override
			 public int compare(Book b1, Book b2) {
				 return Integer.valueOf(b1.getPrice()).compareTo(b2.getPrice());
			 }
		 }); 
		 
		 Collections.addAll(pqDown, new Book("채식주의자", 98000), new Book("잡식주의자", 30000), new Book("육식주의자", 22000), new Book("금식", 40000));
		 while(!pqDown.isEmpty()) {
			 System.out.println(pqDown.poll());
		 }
		 
		
	 }
}

class Book implements Comparable<Book> {
	private String title; 
	private int price; 
	
	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}
	
	Book(String title, int price){
		this.title = title;
		this.price = price;
	}
	
	@Override 
	public int compareTo(Book b) {
		return  Integer.valueOf(price).compareTo(b.price)* -1; 
	}
	@Override
	public String toString() {
		return "( " + title + "의 가격: " + price + "원 )"; 
	}
}

class Student implements Comparable<Student> {
	private String name; 
	private int no; 
	
	Student (String name, int no){
		this.name = name; 
		this.no = no; 
	}
	public int getNo() {
		return no; 
	}
	public String getName() {
		return name; 
	}
	
	@Override
	public int compareTo(Student s) {
		int result = name.compareTo(s.name);
		if ( result == 0 ) {
			return Integer.valueOf(no).compareTo(s.no)* -1; 
		}
		return result; 
	}
	@Override
	public String toString() {
		return "( " + no + "번 " + name + " )"; 
	}
	
}

/*
문제 1.
학생들을 Comparator 를 이용해 정렬하여 출력하세요.
번호 내림차순, 이름 오름차순으로 정렬하여 출력하세요.

문제 2.
번호 내림차순, 이름 내림차순으로 정렬하는 Comparator 를 이용해 출력하세요.
Comparator 는 익명클래스로 작성하세요.

문제 3.
PriorityQueue에 책들을 입력하세요.
Queue에서 책의 가격이 높은 책 부터 제거되도록 코딩하세요.
Comparable을 이용해 가격이 높은 책부터 제거되도록 작성하세요. 
Comparator를 이용해 가격이 낮은 책부터 제거되도록 코딩하세요.
*/