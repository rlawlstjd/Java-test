package com.test.java.ch06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex04ShuffleTest {
	public static void main(String[] args) {
		List<Integer> number = new ArrayList<>(); 
		
		for (int a=1; a<=45; a++) {
			number.add(a); 
		}
		Collections.shuffle(number);
		
		System.out.println("로또 번호:");
		for (int b= 0; b < 6; b++) {
			System.out.print(number.get(b)+"\t");
		
		}
	}
}
/*
문제 1.
로또번호를 저장하는 배열에 for문을 사용하여 1~45까지의 숫자를 저장한 뒤
shuffle 알고리즘을 사용해 배열에 저장돼 있는 값들의 위치를 모두 섞고 
6개의 번호만 출력하는 코드를 작성하세요. 
*/