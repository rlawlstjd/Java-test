package com.test.java.ch19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public class Ex03MethodReferencesTest {
	public static void main(String[] args) {
		Store1 store = new Store1(); 
		String[] str = {"자바문법", "자바프레임워크", "자바기초문법입니다.", "자바"}; 
		
		store.addAll(str, Book1::validateLength, Book1::new);
		store.forEach(); 
		
		//문제 1
		Collections.sort(store.getItems(), Item1::compareByTitleAsc);
		store.forEach();
		System.out.println(); 
		
		//문제 2
		Runnable printItem = store::print;
		printItem.run();
		System.out.println(); 
		
		Consumer<Store1> printItem1 = Store1::print;
		printItem1.accept(store);
		System.out.println(); 
		
		
	}
}
interface Item1 {
	public abstract String getTitle() ; 
	
	public static int compareByTitleAsc(Item1 item1, Item1 item2) {
		return item1.getTitle().compareTo(item2.getTitle()) ;
	}
	
}

class Store1 {
	private List<Item1> items = new ArrayList<>(); 
	
	public void addAll(String[] titles, Predicate<String> validateItem, Function<String, Item1> createItem ) {
		for (String title: titles) {
			if (validateItem.test(title)) {
				items.add(createItem.apply(title)); 
			}
		}
	}
	
	
	public List<Item1> getItems (){
		return items;
	}
	
	public void forEach() {
		for (Item1 item : items) {
			System.out.println("[title] " + item.getTitle()); 
		}
	}
	
	public void print() {
		for (Item1 item : items){
			System.out.println("[title] " + item.getTitle()); 
		}
	}
}

class Book1 implements Item1 {
	private String title; 
	public static final int TITLE_MAX_LENGTH = 5; 
	
	public Book1(String title) {
		this.title = title; 
	}
	@Override
	public String getTitle() {
		return title; 
	}
	
	public static boolean validateLength(String title) {
		return title.length() <= TITLE_MAX_LENGTH; 
	}
	
	public static int compareLength (Book1 b1 , Book1 b2) {
		return b1.getTitle().compareTo(b2.getTitle());
	}
	
}




/*
문제 1.
Store의 Item을 메소드 참조를 이용하여 내림차순으로 정렬하세요.

문제 2.
인스턴스 메소드를 Store에 추가후 메소드 참조를 통해 호출하세요.
메소드 참조를 이용하여 인스턴스 메소드를 호출하는 두 가지 방식 모두 사용하세요. 
*/