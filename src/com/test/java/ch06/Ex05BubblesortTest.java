package com.test.java.ch06;

import java.util.Arrays;

public class Ex05BubblesortTest {
	public static void main(String[] args) {
		
		int [] a = {10, 5, 7, 25, 37, 8} ;
		
		for (int i=0; i<a.length-1; i++) {
			for (int j=i+1; j<a.length; j++) {
				if (a[i]<a[j]) {
					int tmp = a[i]; 
					a[i] = a[j]; 
					a[j] = tmp ; 
				}
			}
		} 
		System.out.println(Arrays.toString(a));
	}
}
/*
문제 1.
{10, 5, 7, 25, 37, 8} 배열을 버블정렬을 이용하여 내림차순으로 정렬하세요. 
*/