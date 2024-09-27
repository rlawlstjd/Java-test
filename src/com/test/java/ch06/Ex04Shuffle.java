package com.test.java.ch06;

import java.util.Arrays;

public class Ex04Shuffle {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10}; 
		System.out.println(Arrays.toString(arr));  // Arrays.deepToString(?) ; 
		
		for (int i=0; i<arr.length; i++) {
			int n = (int)(Math.random()*arr.length); // 10 > 9 , 25 > 24 ; 무엇인가 ? 10~1 다 넣어도 똑같음
			int tmp = arr[i];
			arr[i] = arr[n]; 
			arr[n] = tmp ; 
		}
	System.out.println(Arrays.toString(arr));  
  	
	}
}
