package com.test.java.ch06;

import java.util.Scanner;

public class Ex09DoWhileTest {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		char ch = '0';
		
		do {
			System.out.println("문자를 입력하세요."); 
			String a = s.nextLine();
			ch = a.charAt(0);
			if (ch <= 'Z') {
				System.out.println(ch);
			}
		
		} while (ch <= 'Z'); // while참이 되어야 계속 돎 . false 실행 끝 . 즉 ch 는Z 보다 작거나 같아야 참이고. Z보다 커지면 
								// fals가 되어버림. 
		System.out.println("프로그램이 종료되었습니다.");
	}
}


/*
문제 1.
do while문을 사용하여 대문자 Z가 입력될 때까지 입력된 문자를 출력하는 코드를 작성하세요.
Z가 입력되면 프로그램을 종료한다는 문구를 출력 후 프로그램을 종료하세요. 
*/