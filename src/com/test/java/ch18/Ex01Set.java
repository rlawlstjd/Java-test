package com.test.java.ch18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex01Set {
	public static void main(String[] args) {
		Integer[] intg1 = {1, 2, 3, 4, 5, 6, 7, 8}; 
		
		List<Integer> list1 = new ArrayList<>(); 
		Collections.addAll(list1, intg1);
		print(list1);
		System.out.println(); 
		
		Set<Integer> s1 = new HashSet<>(); 
		s1.add(6);
		s1.add(7);
		s1.add(8);
		s1.add(9);
		s1.add(10);
		print(s1);
		Collection<Integer> c1 = s1;
		print(c1);
		System.out.println();
		
		Set<Integer> s2 = new HashSet<>(list1); 
		print(s2);
		s2.remove(1);
		s2.remove(2);
		s2.remove(8);
		print(s2);
		s2.add(6);
		s2.add(7);
		print(s2);
		System.out.println();
		
		print(s1);
		print(s2);
		s1.addAll(s2);
		System.out.println("addaAll");
		print(s1);
		System.out.println();
		
		print(s1);
		print(s2);
		s1.retainAll(s2);
		System.out.println("retainAll");
		print(s1);
		print(s2);
		System.out.println();
		
		print(s1);
		print(s2);
		s1.removeAll(s2);
		System.out.println("removeAll");
		print(s1);
		print(s2);
		
	}
	
	public static void print(Collection<Integer> c) {
		for (Integer i : c)
			System.out.print(i + ", "); 
		System.out.println();
	}
}
//자바 제네릭스 공변 불공변
