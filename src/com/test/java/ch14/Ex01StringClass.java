package com.test.java.ch14;

public class Ex01StringClass {
	public static void main(String[] args) {
		String s1 = "엘컴퓨터학원";
		String s2 = "엘컴퓨터학원";
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(); 
		
		String s3 = new String ("엘컴퓨터학원"); 
		String s4 = new String ("엘컴퓨터학원"); 
		System.out.println(s3.hashCode()); 
		System.out.println(s4.hashCode()); 
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		System.out.println(); 
		
		System.out.println(System.identityHashCode(s1)); 
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s3.intern()));
		System.out.println(); 
	
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s4); 
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s2)); 
		System.out.println(); 
		
		String s5 = null; 
		//System.out.println(s5.length());
		String s6 = "";
		System.out.println(s6.length());
	}
	
}

