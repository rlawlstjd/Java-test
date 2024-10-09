package com.test.java.ch12;

import java.util.Scanner;

public class Ex03FinallyTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int num = 0 ;
		
		
		
		try {
			System.out.println("숫자를 입력하세요");
			num = scan.nextInt(); 
			System.out.println(num);
			
		} catch (Exception e) {
			System.out.println("숫자만 입력하세요");
		
		} finally {
			System.out.println(num);
		}
	
	
	}
}
/*
문제 1.
예외의 여부와 상관없이 num의 값이 출력되도록 코딩하세요.
*/