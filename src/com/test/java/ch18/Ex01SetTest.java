package com.test.java.ch18;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex01SetTest {
	public static void main(String[] args) {
		
		Set<String> a = new HashSet<>(); 
		a.add("국어");
		a.add("영어");
		print("둘리", a);
		
		Set<String> b = new HashSet<>();
		b.add("영어");
		b.add("수학");
		print("도치", b);
		
		Set<String> c = new HashSet<>(); 
		c.add("국어");
		c.add("수학");
		c.add("과학");
		print("도우너", c);
		
		printAll(a,b,c);
		
		
		
	}

	public static void print(String student, Set<String> subject) {
			System.out.print(student + "는 "); 
			for ( String s : subject) {
				System.out.print( s + ", ");
			}
			System.out.print("수업을 듣습니다.");
			System.out.println();
	}
	
	public static void printAll(Set<String>...subjectSets) {
		Set<String> allSubject = new HashSet<>();
		for (Set<String> subjects : subjectSets ) {
			for( String s : subjects) {
				allSubject.add(s);
			}
		}
		System.out.println("학생들이 수강하는 모든 과목: " + allSubject);
	}
}




/*
문제 1.
둘리는 국어, 영어 수업을 듣습니다.
또치는 영어, 수학 수업을 듣습니다.
도우너는 국어, 수학, 과학 수업을 듣습니다.
학생들이 수강하는 모든 과목을 중복 없이 출력하세요.
*/