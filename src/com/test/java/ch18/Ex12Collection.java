package com.test.java.ch18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Ex12Collection {
	public static void main (String[] args) {
		System.out.println("< addAll >"); 
		List<String> list = new ArrayList<>(); 
		Collections.addAll(list, "A", "D", "B", "C", "E"); 
		System.out.println(list); 
		System.out.println(); 
		
		System.out.println("< binarySearch 정렬 전 >");  // binary? 
		System.out.println(Collections.binarySearch(list, "D")); 
		System.out.println(); 
		
		System.out.println(" < sort >");  //정렬 
		Collections.sort(list); 
		System.out.println(list);
		System.out.println(); 
		
		System.out.println("< binarySearc 정렬 후 >");  // binary란 무엇인가?
		System.out.println(Collections.binarySearch(list, "D")); 
		
		System.out.println("< max, min >"); 
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		System.out.println(); 
		
		System.out.println("< replaceAll >"); // list에 있는 A를 B로 전환.
		Collections.replaceAll(list, "A", "B"); 
		System.out.println(list);
		System.out.println(); 
		
		System.out.println("< reverse >"); //뒤집기 reverse.
		Collections.reverse(list);
		System.out.println(list);
		System.out.println(); 
		
		System.out.println(" < rotate >"); // rotate - 2 칸 밀어버림.
		Collections.rotate(list, 2);
		System.out.println(list);
		System.out.println(); 
		
		System.out.println("< shuffle >");
		Collections.shuffle(list);
		System.out.println(list); 
		System.out.println(); 
		
		System.out.println("< singleton >"); 
		Set<String> set = Collections.singleton("A"); 
		System.out.println(set);
		//set.add("b"); error; 
		System.out.println(); 
		
		System.out.println("< singletonList >"); 
		List<String> list2 = Collections.singletonList("B");
		System.out.println(list2);
		System.out.println(); 
		
		System.out.println("< reverseOrder >"); // 두번째 아규먼트로 정렬방식 정함. 
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		System.out.println(); 
		
		System.out.println(" < swap >"); 
		Collections.swap(list, 3, 1);
		System.out.println(list); 
		System.out.println(); 
		
		System.out.println(" < fill > "); 
		Collections.fill(list, "z");
		System.out.println(list); 
		System.out.println(); 
	
	}
}
