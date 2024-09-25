package com.test.java.ch06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex04ShuffleTest {
	public static void main(String[] args) {
		int [] number = new int [45]; 
		
		for (int a=0; a<number.length; a++) {
			number [a] = a+1 ; 
		} 
		System.out.println(Arrays.toString(number));
		
		for (int aa = 0 ; aa<number.length; aa++) {
			int n = (int)(Math.random()*number.length); 
			int tmp = aa; 
			number[aa] = number[n] ; 
			number[n] = tmp ; 
		} System.out.println(Arrays.toString(number));
	
		for(int a= 0; a<6; a++) {
			System.out.printf("%d\t", number[a]); 
		}
	}
}	

	
	
	
	
	
	
	
	/*
	문제 1.
	로또번호를 저장하는 배열에 for문을 사용하여 1~45까지의 숫자를 저장한 뒤
	shuffle 알고리즘을 사용해 배열에 저장돼 있는 값들의 위치를 모두 섞고 
	6개의 번호만 출력하는 코드를 작성하세요. 
	*/
	
	
	
	/*public static void main(String[] args) {
		int[] lotto = new int[45];
		for (int i=0; i<lotto.length; i++) {
			lotto[i] = i+1;
		}
		
		System.out.println(Arrays.toString(lotto));
		
		for (int i=0; i<lotto.length; i++) {
			int n = (int)(Math.random() * lotto.length);
			int tmp = lotto[i];
			lotto[i] = lotto[n];
			lotto[n] = tmp;
		}
		
		System.out.println(Arrays.toString(lotto));
		
		for (int i=0; i<6; i++) {
			System.out.println(lotto[i]);
		}
		
		
		/*List<Integer> number = new ArrayList<>(); 
		
		for (int a=1; a<=45; a++) {
			number.add(a); 
		}
		Collections.shuffle(number);
		
		System.out.println("로또 번호:");
		for (int b= 0; b < 6; b++) {
			System.out.print(number.get(b)+"\t");
		
		}
	
		int number1 = 0 ; 
		for (int aa=0; aa<=44; aa++) {
			number1 += aa+1 ; 
		}System.out.println(number1);*/ 
	
	
	
/*
문제 1.
로또번호를 저장하는 배열에 for문을 사용하여 1~45까지의 숫자를 저장한 뒤
shuffle 알고리즘을 사용해 배열에 저장돼 있는 값들의 위치를 모두 섞고 
6개의 번호만 출력하는 코드를 작성하세요. 
*/