package com.test.java.ch18;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex03CollectionTest {
	public static void main(String[] args) {
		List<List<Integer>> nestedList = new ArrayList<>();
		
		for (int i=0; i<5; i++) {
			List<Integer> innerList = new ArrayList<>();
			for(int j=0; j<5; j++) {
				innerList.add(j + (j *10));
			}
			nestedList.add(innerList);
		}
		
		for (List<Integer> innerList : nestedList ) {
			System.out.println(innerList);
		}

		List<Integer> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add(1);
        listWithDuplicates.add(2);
        listWithDuplicates.add(3);
        listWithDuplicates.add(2);
        listWithDuplicates.add(4);
        listWithDuplicates.add(1);
        
        System.out.println("중복 제거 전 리스트: " + listWithDuplicates);
        
        // Set을 이용해 중복 제거
        Set<Integer> setWithoutDuplicates = new HashSet<>(listWithDuplicates);
        
        // 중복 제거 후 리스트로 변환
        List<Integer> listWithoutDuplicates = new ArrayList<>(setWithoutDuplicates);
        
        System.out.println("중복 제거 후 리스트: " + listWithoutDuplicates);
   
	}
}
/*
문제 1.
실행 결과와 구글링을 통해 각 컬렉션의 특징을 정리하세요.

문제 2.
중첩 리스트를 작성하고 임의의 값을 입력 및 출력하는 코드를 작성하세요.

문제 3.
리스트의 중복되는 값을 Set을 이용해 중복처리 후 결과를 출력하세요. 
*/