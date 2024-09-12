package com.test.java.ch14;

public class Ex02IndexOf {
	public static void main(String[] args) {
		String s1 = "자바 기본문법 엘컴퓨터학원 자바 알고리즘 엘컴퓨터학원 자료구조";
		String target = "엘컴퓨터학원"; 
		System.out.println(s1.indexOf(target));
		System.out.println(s1.lastIndexOf(target)); 
		
		String s2 = "[엘컴퓨터학원] 자바 기본문법!! (자료구조 포함)"; 
		String filter = "[]()"; 
		String result = ""; 
		for (int i=0; i <s2.length(); i ++) {
			char ch = s2.charAt(i); 
			
			if (filter.indexOf(ch)== -1) { //필터에 ch값이 없다면 결과에 ch값을 담는다. 
				result += String.valueOf(ch);
			}
		}
		
		System.out.println(result); 
		System.out.println(); 
		
		s2= "엘, 컴, 퓨, 터 , 학, 원, 자바 기본, 문, 법,,"; 
		target = ","; 
		int pos = 0 ; 
		int count = 0 ; 
		while((pos = s2.indexOf(target,pos))!= -1) {
			pos += target.length(); 
			count++; 
		}
		
		System.out.println(count);
	
	}
}
