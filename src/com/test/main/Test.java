package com.test.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		List<Book4> books = new ArrayList<>(); 
		Collections.addAll(books, new Book4(1, "자바 문법"), new Book4(1, "파이썬 문법"), new Book4(3, "자바 컬렉션"));
		
		System.out.println("< 번호 오름차순 정렬, 제목 오름차순 정렬 >"); 
		Collections.sort(books, new AscendingNo());
		System.out.println(books);
		System.out.println(); 
		
		System.out.println("< 번호 내림차순 정렬, 제목 내림차순 정렬"); 
		Collections.sort(books, new Comparator<Book4>() {
			@Override
			public int compare(Book4 b1, Book4 b2) {
				int result = Integer.valueOf(b1.getNo()).compareTo(b2.getNo())* -1; 
				if ( result == 0) {
					return b1.getTitle().compareTo(b2.getTitle()) * -1; 
				}
				return result; 
			}
		});
		System.out.println(books);
		System.out.println();
		
		System.out.println("< Comparator.reverseOrder >"); 
		Collections.sort(books, Comparator.reverseOrder());
		System.out.println(books);
		System.out.println(); 
		
		List<String> list = new ArrayList<>(); 
		Collections.addAll(list, "Z", "e", "a", "c", "b", "D"); 
		
		System.out.println("< 알파벳 내림차순 정렬 >"); 
		Collections.sort(list, Comparator.reverseOrder());
		System.out.println(list);
		System.out.println();
		
		Collections.sort(list);
		System.out.println(list);
		System.out.println(); 
		
		System.out.println("< 대소문자 상관없이 알파벳 오름차순 정렬 >"); 
		Collections.sort(list, String.CASE_INSENSITIVE_ORDER); // String.CASE_INSENSITIVE_Order
		System.out.println(list);
		
		
	
	}
}


class AscendingNo implements Comparator<Book4> {
	@Override 
	public int compare(Book4 b1, Book4 b2) { // compare 는 두 가지 객체를 비교 . 두 개의 파라미터 필요. 
		int result = Integer.valueOf(b1.getNo()).compareTo(b2.getNo());
		if ( result == 0 ) {
			return b1.getTitle().compareTo(b2.getTitle()); 
		}
		return result; 
	}

}

class Book4 implements Comparable<Book4> {
	private String title; 
	private int no ; 
	
	@Override 
	public int compareTo(Book4 b) {
		int result = Integer.valueOf(no).compareTo(b.getNo());
		if ( result == 0 ) {
			return title.compareTo(b.title); 
		}
		return result; 
	}
	
	public String getTitle() {
		return title; 
	}
	
	public int getNo() {
		return no;
	}
	
	Book4(int no, String title){
		this.title = title; 
		this.no = no; 
	}
	
	public String toString() {
		return "( " + no + "번 " +  title + " )"; 
	}
	
	
}