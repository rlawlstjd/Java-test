package com.test.java.ch12;

import java.util.Scanner;

public class Ex01TryCatch {
	public static void main(String[] args) {
	// 예외처리  .. 
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.print("문자열을 입력하여 예외를 발생시키세요:");
			int num = scan.nextInt(); 
			System.out.println(num);
		} catch (Exception e) {
			System.out.println("숫자만 입력 가능 합니다."); 
			
			//e.printstackTrace(); 
		}
	
		System.out.println("프로그램이 종료됩니다.");
	
	}
}
