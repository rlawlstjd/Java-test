package com.test.java.ch18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex12CollectionTest {
	public static void main(String[] args) {
		//문제 1
		List<Integer> nums = new ArrayList<>(); 
		Collections.addAll(nums, 2, 1, 5, 4, 3, 6, 7, 8, 9); 
		System.out.println(nums);
		System.out.println(); 
		
		Collections.sort(nums);
		System.out.println(nums);
		System.out.println(); 
		
		System.out.println(Collections.binarySearch(nums, 6)); // binarySearc 정렬된 상태에서만 
		System.out.println(); 
		
		Collections.reverse(nums);
		System.out.println(nums); // 내림차순
		System.out.println(); 
		
		System.out.println(Collections.binarySearch(nums, 9)); 
		System.out.println(); 
		
		
		//문제 2
		List<Integer> a = Arrays.asList(15, 25, 35, 45);
		nums.addAll(a);
		System.out.println(nums); 
		
		

		//문제 3
		int[] i = {1,2,3,4,5};
		int[] j = {1,2,3,5,6};
		int[][] k = {
				{1,2,3},
				{4,5,6}
		};
		int[][] u = {
				{1,2,3},
				{4,5,6}
		};
		
		System.out.println(Arrays.equals(i, j)); // 1차원 값 비교. 2차원 이상에서는 주소를 비교 .
		System.out.println(Arrays.deepEquals(k, u)); // 2차원 이상에서 값 비교하기위해 deepEquals 사용.
		
	}
}


/*
문제 1.
addAll 을 이용해 리스트에 임의의 값들을 입력 후
binarySearch 를 이용해 검색하세요.
오름차순과 내림차순을 적용 후 출력하세요.

문제 2.
Arrays.asList를 이용해 리스트 생성 후 해당 리스트에 임의의 값을 추가하세요.

문제 3.
Arrays.equals 와 Arrays.deepEquals 를 사용하여 1차원 배열과 2차원 배열의 값을 비교하는 코드를 작성하세요.
*/