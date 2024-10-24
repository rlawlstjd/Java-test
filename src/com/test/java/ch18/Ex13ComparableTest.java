package com.test.java.ch18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex13ComparableTest {
	public static void main (String[] args) {
		Student5 s1 = new Student5("이수", 1); 
		Student5 s2 = new Student5("박효신", 1); 
		Student5 s3 = new Student5("나얼", 1);	
		Student5 s4 = new Student5("김범수", 1); 
		
		List<Student5> students = new ArrayList<>(); 
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		
		Collections.sort(students);
		System.out.println(students);
	}
}

class Student5 implements Comparable<Student5>{
	private String name; 
	private int no ; 
	
	Student5(String name, int no){
		this.name = name; 
		this.no = no; 
	}
	
	public int getNo() {
		return no;
	}
	
	
	@Override
	public int compareTo(Student5 student) {
		int result = Integer.valueOf(no).compareTo(student.getNo());
		if ( result == 0) {
			return name.compareTo(student.name); 
		}
		return result;
	}
	
	@Override 
	public String toString() {
		return "(" + no + ", " + name + ")"; 
	}

}

/*
문제 1.
번호와 이름을 가진 학생 클래스를 만드세요.
학생의 번호를 오름차순으로 정렬하여 출력하세요.
번호가 같을 경우 이름을 내림차순으로 정렬하여 출력하세요.
*/