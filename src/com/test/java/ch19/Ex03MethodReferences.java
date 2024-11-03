package com.test.java.ch19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public class Ex03MethodReferences {
	public static void main(String[] args) {
		System.out.println("< 메서드 참조 >"); 
		Function<String, Integer> f1 = str -> Integer.parseInt(str);
		System.out.println(f1.apply("777"));
		System.out.println(); 
		
		Function<String ,Integer> f2 = Integer::parseInt; 
		System.out.println(f2.apply("888"));
		System.out.println(); 
		
		System.out.println("< 메서드 참조를 이용한 배열 생성 >");
		IntFunction <int[]> f3 = s -> new int[s];
		System.out.println(Arrays.toString(f3.apply(3)));
		System.out.println(); 
		
		IntFunction <int[]> f4 = int[]::new; 
		System.out.println(Arrays.toString(f4.apply(2)));
		System.out.println(); 
		
		Store store = new Store(); 
		String[] str = {"자바문법", "신년맞이자바특강", "한달완성자바", "자바"}; 
		
		store.addAll(str, s -> new Book(s), s -> Book.validateLength(s));
		Collections.sort(store.getItems(), Item::compareByTitleAsc);
		
		System.out.println("< '인스턴스::메소드' 방식으로 인스턴스 메소드 호출 >");
		Runnable printItems = store::forEach;
		printItems.run(); 
		System.out.println(); 
		
		System.out.println("< '클래스::메소드' 방식으로 인스턴스 메소드 호출 >");
		Consumer<Store> printItems2 = Store::forEach; 
		printItems2.accept(store);
		System.out.println(); 
		
		//문제 1 
		System.out.println("< '내림차순 정렬' >");
		Collections.sort(store.getItems(), Item::descending); 
		Consumer<Store> printItems3 = Store::forEach; 
		printItems3.accept(store); 
		System.out.println(); 
		
		//문제 2 
		System.out.println("< 새로운 메소드 >"); 
		Runnable printItems4 = store::printTitle;
		printItems4.run();
		System.out.println(); 
		
		Consumer<Store> printItems5 = Store::printTitle; 
		printItems5.accept(store);
		System.out.println(); 
		
		
	}
}

class Store {
	private List<Item> items = new ArrayList<>(); 
	
	public void addAll(String[] titles, Function<String, Item> createItem, Predicate<String> validateItem) {
		for (String title : titles) {
			if (validateItem.test(title)) {
				items.add(createItem.apply(title)); 
			}
		}
	}
	
	public List<Item> getItems(){
		return items;
	}
	public void forEach() {
		for( Item item : items) {
			System.out.println("[title]" + item.getTitle()); 
		}
	}
	public void printTitle() {
		for(Item item : items) {
			System.out.println("[Title]: " + item.getTitle()); 
		}
	}
}

class Book implements Item{
	public static final int TITLE_MAX_LENGTH = 5; 
	private String title; 
	
	public Book(String title) {
		this.title = title ; 
	}
	
	@Override
	public String getTitle() {
		return title;
	}
	
	public static boolean validateLength(String title) {
		return title.length() <= TITLE_MAX_LENGTH; 
	}
	
	public static int compareByTitle(Book b1, Book b2) {
		return  b1.getTitle().compareTo(b2.getTitle());
	}
	
}

interface Item {
	public abstract String getTitle() ; 
	
	public static int compareByTitleAsc(Item item1, Item item2) {
		return item1.getTitle().compareTo(item2.getTitle());
	}
	
	public static int descending(Item item1, Item item2) {
		return item1.getTitle().compareTo(item2.getTitle()) * -1 ; 
	}
	
}
