package com.test.java.ch17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class Ex01ListTest {
	public static void main(String[] args) {
		Book1[] arrBook = {
				new Book1 ("가", "엘컴퓨터학원"),
				new Book1 ("나", "비컴퓨터학원"),
				new Book1 ("다", "씨컴퓨터학원"),
				new Book1 ("라", "엘컴퓨터학원"),
				new Book1 ("마", "엘컴퓨터학원"),
				new Book1 ("바", "디컴퓨터학원"),
				new Book1 ("사", "엘컴퓨터학원"),
				new Book1 ("아", "엘컴퓨터학원"),
				new Book1 ("자", "지컴퓨터학원"),
				new Book1 ("차", "엘컴퓨터학원")		
		};
		
		Book1 book = new Book1("김", "진성");
		System.out.println(book);
		
		
		
		List<Book1> books = new ArrayList<Book1>(Arrays.asList(arrBook));
		
		Book1.printAllBooksWithForeach(books);
		
		Book1.removeWithIteraotr(books);
		
		
	}
}
class Book1{
	String title; 
	String author; 
	private List<Book1> books;
	
	
	Book1(String title, String author){
		this.title = title; 
		this.author = author;
	}
	
	@Override 
	public String toString() {
		return "저자= " + author + " , " + "제목=" + title + "\n";
	}
	
	public static void printAllBooksWithForeach (List<Book1> books) {
		for (Book1 book : books) {
			System.out.println(book);
		}
	}
	
	public static void removeWithIteraotr(List<Book1> books) {
		Iterator<Book1> it = books.iterator(); it.hasNext();
		
		while (it.hasNext()) {
			Book1 book = it.next();
			
			if (!book.author.equals("엘컴퓨터학원")) {
				it.remove();
				System.out.println("삭제: " + book);
			}
		}
		System.out.println(books.toString());
		
	}
}
		
		

/*
문제 1.
Book 타입 인스턴스 10개를 생성하여 배열에 저장합니다.
배열을 ArrayList로 변경합니다.
foreach 문을 사용하여 리스트에 저장된 모든 책들을 출력합니다.
Book의 저자가 엘컴퓨터학원인 것을 제외한 나머지 책은 모두 삭제합니다.
리스트에 남아 있는 책들을 출력합니다.
힌트) 삭제 시 foreach문은 예외가 발생될 수 있습니다.
*/