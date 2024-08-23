package com.test.java.ch06;

import java.util.Arrays;

public class Ex05BubblesortTest {
	public static void main(String[] args) {
		
		int [] a = {10, 5, 7, 25, 37, 8} ;
		
		for (int aa=0; aa<a.length-1; aa++) {
			for (int bb=aa+1; bb<a.length; bb++) {
				if (a[aa]<a[bb]) {
					int tmp = a[aa]; 
					a[aa] = a[bb]; 
					a[bb] = tmp ; 
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