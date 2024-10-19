package com.test.java.ch18;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Ex09TreeSet {
	public static void main(String[]aggs) {
		NavigableSet<Integer> tvSet = new TreeSet<>(); 
		
		tvSet.add(300);
		tvSet.add(700);
		tvSet.add(100);
		tvSet.add(200);
		tvSet.add(200);
		tvSet.add(900);
		tvSet.add(870);
		
		System.out.println("< Tv 최저가순 >"); // 오름차순.
		for (Iterator<Integer> it = tvSet.iterator(); it.hasNext();) {
			System.out.println(it.next() + "원");
		}
		
		System.out.println("< Tv 최고가순 >"); 
		for (Iterator<Integer>it = tvSet.descendingIterator(); it.hasNext();) {
			System.out.println(it.next() + "원");
		}
		
		System.out.println("< 최고가순 >"); 
		NavigableSet<Integer> reverseSet = tvSet.descendingSet(); 
		for (Iterator<Integer> it = reverseSet.iterator(); it.hasNext();) {
			System.out.println(it.next() + "원"); 
		}
		
		int money = 300; 
		
		System.out.println("< 구매 가능 tv 가격>"); 
		SortedSet<Integer> availableSet = tvSet.headSet(money);
		System.out.println(availableSet); 
		
		System.out.println("< 구매 가능 tv 가격>"); 
		NavigableSet<Integer> availableSet2 = tvSet.headSet(money, true);
		System.out.println(availableSet2);
		
		System.out.println("< 구매 불가능 tv 가격>");
		NavigableSet<Integer> notAvailableSet = tvSet.tailSet(money, true); 
		System.out.println(notAvailableSet);
		
		System.out.println("< 200원 이상 900원 미만인 tv 검색");
		NavigableSet<Integer> searchSet = tvSet.subSet(200, true, 900, false); 
		System.out.println(searchSet);
		
		System.out.println("< 판매중인 tv >"); 
		for (Iterator<Integer> it = tvSet.iterator(); it.hasNext();) {
			System.out.println(it.next() + "원"); 
		} 
		
		System.out.println("< 750원이거나 조금 더 비싼 TV를 검색 >"); // ceiling <=
		System.out.println(tvSet.ceiling(750)); 
		System.out.println("< 300원이거나 조금 더 비싼 tv를 검색>");
		System.out.println(tvSet.ceiling(300));
		System.out.println(); 
		
		System.out.println("< 750원이거나 조금 더 싼 tv를 검색 >");  // floor >= 
		System.out.println(tvSet.floor(750));
		System.out.println("< 300원이거나 조금 더 싼 tv를 검색 >");
		System.out.println(tvSet.floor(300));
		System.out.println(); 
		
		System.out.println("< 750원 보다 조금 더 비싼 tv를 검색 >"); // higher -  >
		System.out.println(tvSet.higher(750)); 
		System.out.println("< 750원 보다 조금 더 싼 tv를 검색 >");  // higher -  < 
		System.out.println(tvSet.lower(750));
		System.out.println(); 
		
		System.out.println("< 제일 비싼 tv와 싼 tv 판매");
		System.out.println(tvSet.pollFirst());  // 반환 후 삭제 100; 
		System.out.println(tvSet.pollLast());  // 반환 후 삭제 900; 
		
		System.out.println(" < 870원 tv 판매 > ");   // remove로 삭제 되면 true반
		System.out.println(tvSet.remove(870));  
		System.out.println(" < 550원 tv 재고 없음>");  // remove로 삭제 안되면 false 반환
		System.out.println(tvSet.remove(550)); 
		
		System.out.println("< 판매중인 tv >"); 
		for (Iterator<Integer> it = tvSet.iterator(); it.hasNext();) {
			System.out.println(it.next() + "원"); 
		} 
	}
}