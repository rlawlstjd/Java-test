package com.test.java.ch05;

import java.util.Scanner;

public class Ex05SwitchTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in); 
		
		System.out.printf("숫자를 입력하세요.");
		int number = scan.nextInt();
		

		
		switch (number) {
			case 1:
			case 2: 
			case 12:
				System.out.printf("입력하신 숫자의 계절은 겨울 입니다.");
				break ; 
			case 3:
			case 4: 
			case 5: 
				System.out.printf("입력하신 숫자의 계절은 봄 입니다.");
				 break ; 
			case 6: 
			case 7:
			case 8: 
				System.out.printf("입력하신 숫자의 계절은 여름 입니다.");
				break ; 
			case 9:
			case 10:
			case 11: 
				System.out.printf("입력하신 숫자의 계절은 가을 입니다.");
				break ;  
					
			default :
				System.out.printf("잘못 입력하셨습니다.");
			   
		}
	}
}
/*
문제 1.
입력 받은 숫자가 3~5이면 "봄", 6~8이면 "여름", 9~11이면 "가을" 12,1,2 를 입력하면 "겨울"을 출력하고 
그 외의 숫자를 입력하면 "잘 못 입력하였습니다"를 출력하는 코드를 switch문으로 작성하세요. 
*/