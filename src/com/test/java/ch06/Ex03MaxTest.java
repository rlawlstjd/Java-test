package com.test.java.ch06;

import java.util.Arrays;

public class Ex03MaxTest {
	public static void main(String[] args) {
		/*int[][] a= new int [5][1] ; 
		a[0][0] = 25 ; 
		a[1][0] = 30 ; 
		a[2][0] = 85 ; 
		a[3][0] = 45 ; 
		a[4][0] = 50 ; 
		
		int max = a[0][0]; 
		for (int b=0; b<a.length; b++) {
			for (int c=0; c<a[b].length; c++) {
				if (a[b][c]>max) {
					max = a[b][c];
				}
			}
		}
		System.out.printf("최댓값은 %d", max);*/
		
		int[] arr = {25, 15, 7, 55, 30};
		int max = arr[0];
		for (int i=1; i<arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println(max);
	
	}
}
/*
문제 1.
학생 5명의 점수를 저장하는 배열을 작성 한 뒤 
최저점수와 최고점수를 찾아 출력하세요. 
*/