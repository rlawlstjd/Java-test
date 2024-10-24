package com.test.java.ch18;

import java.rmi.server.Skeleton;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Ex10MapTest {	
	public static void main (String[] args) {
		Map<String, Integer> r1 = new HashMap<>(); 
		r1.put("가", 40); 
		r1.put("나", 30); 
		r1.put("다", 92); 
		r1.put("라", 55); 
		r1.put("마", 95); 
		r1.put("바", 55); 
		
		Map<String, Integer> r2 = new HashMap<>(); 
		r2.put("자", 60);
		r2.put("자", 65); 
		r2.put("자", 55); 
		r2.put("자", 55); 
		r2.put("카", 55); 
		r2.put("파", 100); 
		
		TreeMap <String, Integer> students = new TreeMap<>(); 
		students.putAll(r1);
		students.putAll(r2);
		
		for (Map.Entry<String, Integer> it : students.entrySet()) {
			System.out.println(it.getKey() + "학생의 점수 : " + it.getValue()); 
		}
		System.out.println(); 
		
		
		//문제 2
		System.out.println("점수가 90점 이상인 학생들 삭제 후 출력");
		students.values().removeIf(score -> score >= 90);
		for( Map.Entry<String, Integer> it : students.entrySet()) {
			System.out.println(it.getKey() + "학생의 점수는 " + it.getValue());
		}
		System.out.println();		
		
		
		//문제 3
		System.out.println("점수가 55점 학생들을 맵에서 삭제후 출력."); 
		Set<Integer> num = Collections.singleton(55); 
		students.values().removeAll(num);
		for(Iterator<String> it = students.keySet().iterator(); it.hasNext();) {
			String key = it.next();
			System.out.println(key + "의 점수 : " + students.get(key));
		}
		System.out.println(); 
		
		
		//문제 4
		System.out.println("점수가  100 점인 학생이 존재하는지 출력"); 
		int r = 100; 
		System.out.println(students.values().contains(r));
		//System.out.println(students.values().contains(30));
		System.out.println(); 
		
	}
}

/*
문제 1.
1반 학생들의 이름, 점수가 저장된 맵과 2반 학생들의 이름, 점수가 저장된 맵을 만드세요.
두 반의 모든 학생들을 중복 없이 출력하세요.

문제 2.
점수가 90점 이상인 학생들을 맵에서 삭제 후 출력하세요.

문제 3.
55점인 학생 모두 맵에서 삭제하세요.

문제 4.
100점인 학생이 존재하는 지 출력하세요.
*/