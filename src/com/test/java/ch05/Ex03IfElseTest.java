package com.test.java.ch05;

import java.util.Scanner;

public class Ex03IfElseTest {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.printf("숫자를 입력하세요."); 
		int number = scan.nextInt();
		
		String season = "계절"; 
		
		if (number >=3 && number <=5) {
			season = "봄"; 
			System.out.printf("입력하신 숫자의 계절은 %s 입니다", season); 
		}else if (number >=6 && number <=8) {	
			season = "여름"; 
			System.out.printf("입력하신 숫자의 계절은 %s 입니다", season); 
		}else if (number >=9 && number <=11) {
			season = "가을"; 
			System.out.printf("입력하신 숫자의 계절은 %s 입니다", season); 
		}else if (number == 12 && number ==1 && number == 2) {
			season = "겨울"; 
			System.out.printf("입력하신 숫자의 계절은 %s 입니다", season); 
		}else 
			System.out.printf("잘 못 입력하셨습니다.");
			
		
		
		}
		
	}

/*
문제 1.
입력 받은 숫자가 3~5이면 "봄", 6~8이면 "여름", 9~11이면 "가을" 12,1,2 를 입력하면 "겨울"을 출력하고 
그 외의 숫자를 입력하면 "잘 못 입력하였습니다"를 출력하는 코드를 작성하세요.  
*/