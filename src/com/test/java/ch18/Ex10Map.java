package com.test.java.ch18;

import java.util.HashMap;
import java.util.Map;

public class Ex10Map {
	public static void main (String [] args) {
		
		System.out.println("< 팀A >"); 
		Map<String, String> teamA = new HashMap<>(); 
		teamA.put("A", "자바"); 
		teamA.put("B", "C"); 
		teamA.put("C", "파이썬");
		teamA.put("D", "자바");
		teamA.put("E", "자바");
		teamA.put("E", "DB");
		
		for(Map.Entry<String, String> e : teamA.entrySet()) {
			System.out.println("이름: " + e.getKey() + "\t스킬: " + e.getValue());
		}				
		
		System.out.println(); 
		
		System.out.println("< 팀8 >"); 
		Map<String, String> team8 = new HashMap<>(); 
				
		
	}
}
