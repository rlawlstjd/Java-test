package com.test.java.ch12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02MultipleCatchBlock {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int[] arr = {3,5,7};
	
		try {
			
			System.out.print("0~2 숫자를 입력하세요:");
			int i = scan.nextInt(); 
			
			System.out.print("0 이외의 숫자를 입력하세요:");
			int num = scan.nextInt(); 
			
			System.out.print(arr[i] / num );
			
		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력 가능 합니다.");
		} catch (ArithmeticException e) {
			System.out.println("산술 예외가 발생되었습니다.");
		} catch (Exception e) {
			System.out.println("예외 발생!!!");
			e.printStackTrace();
			
		}
	
		System.out.println("프로그램이 종료됩니다.");
	}
}
