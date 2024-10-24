package com.test.java.ch18;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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
		for ( Map.Entry<String,String> it : teamA.entrySet()) {
			System.out.println(it.getKey() + "의 " + it.getValue());
		}
		System.out.println(); 
		
		System.out.println("< 팀B >"); 
		Map<String, String> teamB = new HashMap<>(); 
		teamB.put("A", "자바"); 
		teamB.put("C", "파이썬"); 
		teamB.put("F", "자바"); 
		teamB.put("G", "안드로이드"); 
		teamB.put("H", "IOS"); 
		teamB.put("I", "안드로이드");
		for(Iterator<String> it = teamB.keySet().iterator(); it.hasNext();) {
			String a = it.next();
			System.out.println(a + "의 " + teamB.get(a)); 
		}
		
		System.out.println("< A + B 통합 팀 >"); 
		Map<String, String> employee = new HashMap<>(); 
		employee.putAll(teamA);
		employee.putAll(teamB);
		for (Map.Entry<String,String> e : employee.entrySet()) {
			System.out.println(e.getKey() + "의 " + e.getValue()); 
		}
		System.out.println(); 
		
		System.out.println("< 안드로이드 개발자 부서 이동 후 팀원 목록 >"); 
		Set<String> skill = Collections.singleton("안드로이드"); 
		employee.values().removeAll(skill); //singleton을 이용하여 안드로이드 라는것을 고정시키고 벨류를 통해 값을 빼와 스킬을 통해 삭
		System.out.println(employee.keySet()); 
		System.out.println(employee.values()); 
		
		System.out.println("< C, F PL이 소속돼 있는지 확인"); 
		Map<String, String> pl = new HashMap<>(); 
		pl.put("C", "파이썬"); 
		pl.put("F", "자바"); 
		System.out.println( employee.entrySet().containsAll(pl.entrySet()));
		System.out.println(); 
		
		System.out.println("< 통합된 자바, 자바스크립트 스킬 보유 여부 >"); 
		System.out.println(employee.containsValue("자바"));
		System.out.println(employee.containsValue("자바스크립트"));
	
	}
}