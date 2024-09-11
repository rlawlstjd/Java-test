package com.test.java.ch12;

import java.util.Scanner;

public class Ex08ChainedExceptionTest {
	public static void main(String[] args) {
		while(true) {
		
			Scanner scan = new Scanner (System.in); 
			
			System.out.println("---자판기---");
			System.out.println("음료를 선택하세요.");
			System.out.println("1:사과맛 2:포도맛 3:망고맛"); 
			int choice = scan.nextInt();
			
			if (choice < 1 || choice > 3) {
				System.out.printf("잘못된 선택입니다. 시스템을 종료합니다.");
				break;
			}
			
			System.out.println("금액을 입력하세요.");
			int money = scan.nextInt(); 
			
			try {
				if(VendingMachine1.apple == money) {
					throw new 
				}
			}
		}
	}
}

class VendingMachine



class VendingMachine1 {
	static final int apple = 1000; 
	static final int grape = 1200;
	static final int mango = 1500; 
}
	

class VendingmachineException extends Exception {
	public VendingmachineException (String message, Exception e) {
		super (message, e);
	}
}

class InsufficientException extends Exception {
	
	
	public InsufficientException (String message) {
		super (message);
	}
}

class EmptyException extends Exception {
	public EmptyException (String message) {
		super(message);
	}
}
/*문제 1.
자판기 프로그램에 연결 예외를 적용해 주세요.
*/