package com.test.java.ch11;

public class sss {
	public static void main(String[] args) {
	int[] numbers = {1,2,3,4,5}; 
	
	for (int n : numbers) {
		System.out.println(n);
	}
	
	
	for (Season s : Season.values()) {
		System.out.println(s);
	
	}
	}
}
enum Season {
	WINTER, SPTRING, SUMMER, FALL
}