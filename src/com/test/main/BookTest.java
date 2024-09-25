package com.test.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;



public class BookTest {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		String season = "계절";
		
		System.out.printf("숫자를 입력하세요");
		int n = s.nextInt();
		
		boolean a = true ;
		
		if (n >=3 && n <=5) {
			season = "봄";
		}else if (n >=6 && n <= 8) {
			season = "여름";
		}else if (n >= 9 && n <= 11) {
			season = "가을";
		}else if (n == 12 || n == 1 || n == 2) {
			season = "겨울";
		}else {
			System.out.printf("숫자를 잘못 입력하셨습니다.");
		}
		
		System.out.printf("입력하신 숫자 %d의 계절은 %s 입니다. ", n, season);
	}
}
	
