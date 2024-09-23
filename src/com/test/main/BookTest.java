package com.test.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class BookTest {
	public static void main(String[] args) {
		String[] arrSubjects = { "자바", "파이선", "자바", "알고리즘", "스프링", "자료구조", "자바스크립트", "데이터베이스", "스프링", "스프링", "C", "람다" };
		System.out.println(Arrays.toString(arrSubjects));
		System.out.println(); 
		
		Student s1 = new Student("a");		
		s1.addSubject("자바");
		s1.addSubject("알고리즘");
		s1.addSubject("파이썬");
		s1.addSubject("스프링");
		
		Student s2 = new Student("b"); 
		s2.addSubject("자바");
		s2.addSubject("데이터베이스");
		s2.addSubject("스프링");
		
		Student s3 = new Student("c");
		s3.addSubject("자바");
		s3.addSubject("스프링");
		s3.addSubject("자바스크립트");
		
		Course course = new Course();
		course.setStudents(s1,s2,s3);
		
		System.out.println("-모든 과목-"); 
		course.setSubjects(arrSubjects);
		Set<String>subject = course.getSubjects(); 
		System.out.println(subject);
		
		System.out.println("-정렬된 과목-");
		List<String> oSubject = course.getOrderedSubjects();
		System.out.println(oSubject);
		
		System.out.println("- 학생들이 수강 중인 모든 과목 (합집합)");
		Set<String> rSubject = course.getRegisteredSubjects();
		System.out.println(rSubject);
		
		System.out.println("-모둔 학생들이 수강 (교집합) ");
		Set<String> bSubject = course.getBasicSubjects();
		System.out.println(bSubject);
	
		System.out.println("- 모든 학생들이 듣지 않는 수업 (여집합)");
		Set<String> ySubject = course.getCanceledSubjects();
		System.out.println(ySubject);\
	
	}
}

class Course{
	private Set<String> subjects; 
	private List<Student> students; 
	
	public List<String> getOrderedSubjects() {
		List<String> oSubject = new ArrayList<>(subjects);
		Collections.sort(oSubject);
		return oSubject;
	}
	
	public Set<String> getCanceledSubjects(){
		Set<String> rSubject = getRegisteredSubjects();
		Set<String> allStudent = new HashSet<>(subjects);
		
		allStudent.removeAll(rSubject);
		
		return allStudent;
	}
	
	
	public Set<String> getBasicSubjects(){
		Set<String> bSubject = null ; 
		for (Student student : students ) {
			if (bSubject == null) {
				bSubject = new HashSet<>();
			}
			bSubject.retainAll(student.getSubjects());
		}
		return bSubject; 
		
	}
	
	public Set<String> getRegisteredSubjects(){
		Set<String> rSubject = new HashSet<>(); 
		for(Student student : students) {
			rSubject.addAll(student.getSubjects());
		}
		return rSubject;
	}
	
	public void setStudents(Student... arrstudent) {
		students = new ArrayList<>();
		Collections.addAll(students, arrstudent); 
		
	}	
	
	public void setSubjects (String[] subject) {
		List<String> list = new ArrayList<>(); 
		Collections.addAll(list, subject);
		subjects = new HashSet<>(list);
	}
	
	public Set<String> getSubjects(){
		return subjects;
	}
	
	

}

class Student {
	private String name; 
	private Set <String> subjects;
	
	Student (String sudent){
		this.name = name; 
		subjects = new HashSet<>(); 
	}
	
	public void addSubject(String subject) {
		subjects.add(subject);		
	}
	
	public Set<String> getSubjects(){
		return subjects;
	}
}
	
