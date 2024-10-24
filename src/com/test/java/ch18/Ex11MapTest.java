package com.test.java.ch18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex11MapTest {
	public static void main(String[] args) {
		Student1 student1 = new Student1("A"); 
		student1.addRate(new Example("2021", 50));
		student1.addRate(new Example("2022", 40));
		student1.addRate(new Example("2023", 70));
		
		Student1 student2 = new Student1("B");
		student2.addRate(new Example("2022", 40));
		student2.addRate(new Example("2023", 75));
		
		Student1 student3 = new Student1("C"); 
		student3.addRate(new Example("2021", 30)); 
		student3.addRate(new Example("2023", 72));
		
		List<Student1> class1 = new ArrayList<>(); 
		class1.add(student1);
		class1.add(student2);
		class1.add(student3);
		
		Student1 student4 = new Student1("D");
		student4.addRate(new Example("2023", 70));
		
		Student1 student5 = new Student1("F"); 
		student5.addRate(new Example("2022", 40));
		
		Student1 student6 = new Student1("G");
		student6.addRate(new Example("2021", 35));
		student6.addRate(new Example("2022", 55));
		student6.addRate(new Example("2023", 75));
		
		List<Student1> class2 = new ArrayList<>(); 
		class2.add(student4);
		class2.add(student5);
		class2.add(student6);
		
		
		School school = new School(); 
		school.addStudentrate("A", class1); 
		school.addStudentrate("B", class2);
		
		school.print(); 
	
	}
}


class School {
	private Map<String, List<Student1>> student; 
	
	School(){
		student = new HashMap<>(); 
	}
	
	public void print() {
		for (Map.Entry<String, List<Student1>> entry : student.entrySet()) {
			for (Student1 student : entry.getValue()) {
				System.out.println(student.getName()); 
				for (Example example : student.getExample()) {
					System.out.println(example.getName() + ", " + example.getRate());
				}
			}
			System.out.println("===="); 
		}		
	}
	
	public void addStudentrate(String name, List<Student1> students) {
		student.put(name, students); 
	}
}


class Student1{
	private String name; 
	
	private List<Example> examples; 
	
	Student1(String name){
		this.name = name;
		examples = new ArrayList<>(); 
	}
	
	public void addRate(Example example) {
		examples.add(example);
	}
	
	public String getName() {
		return name; 
	}
	public List<Example> getExample(){
		return examples;
	}
}

class Example{
	private String name; 
	private int rate; 
	
	Example(String name, int rate){
		this.name = name ; 
		this.rate = rate; 
	}
	
	public String getName() {
		return name; 
	}
	public int getRate() {
		return rate; 
	}
}

/*
문제 1.
반별 학생 목록을 저장하는 맵을 작성하세요.
학생들은 자신의 모의고사 점수들을 리스트로 갖습니다. 
학생마다 치른 모의고사 횟수는 다를 수 있습니다.
모든 반의 학생과 각 학생이 치른 모의고사들의 점수를 출력하세요.
위의 예제와 같이 클래스를 사용하여 코딩하세요.
*/
