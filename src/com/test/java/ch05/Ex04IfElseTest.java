package com.test.java.ch05;

import java.util.Scanner;

public class Ex04IfElseTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in); 
		
	  System.out.printf("숫자를 입력하세요."); 
	  int number = scan.nextInt(); 
	  		
	  String season = "계절"; 
	String name = "휴가철";
		if (number >=3 && number <=5) {
			season = "봄"; 
			System.out.printf("입력하신 숫자의 계절은 %s 입니다", season); 
		}else if (number >=6 && number <=8) {	
			season = "여름";
				if (number == 8) 
					season = "*여름 휴가철*";
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
사용자가 입력한 숫자에 맞는 계절을 출력하되 8월을 입력하면 "휴가철"도 같이 출력되게 작성하세요.
힌트) 중첩 if문을 사용하세요.  
*/