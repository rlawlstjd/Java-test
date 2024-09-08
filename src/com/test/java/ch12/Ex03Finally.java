package com.test.java.ch12;

import java.util.Scanner;

public class Ex03Finally {
	public static void main(String[] args) {	
		
		boolean run = true ; 
		
		Scanner scan = new Scanner (System.in);
		int num = 0 ; 
		
		try {
			
			System.out.print("문자열을 입력하여 예외를 발생시키세요:");
			num = scan.nextInt(); 
			
		} catch (Exception e) {
			System.out.println("숫자만 입력하세요.");
			
		} finally { //예외가 되든 안되든 실행이 됨 . . . . 
			System.out.println("예외의 발생 여부와 상관 없이 실행됩니다."); 
		}
		
	
	}
}
