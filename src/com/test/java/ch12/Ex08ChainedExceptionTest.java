package com.test.java.ch12;

import java.util.Scanner;

import javax.xml.validation.SchemaFactoryLoader;

public class Ex08ChainedExceptionTest {
	public static void main(String[] args) {
		
		while (true) {
			VendingMachine1 vd = new VendingMachine1(); 
			
			Scanner scan = new Scanner (System.in); 
			
			System.out.println("---자판기---");
			System.out.println("음료를 선택하세요.");
			System.out.println("1:사과맛 2:포도맛 3:망고맛"); 
			int choice = scan.nextInt();
		
			
			System.out.println("금액을 입력하세요");
			int money = scan.nextInt();
				
			try {
				vd.selectBerverage(choice, money);
			} catch (MachineException e) {
				System.out.println("자판기에 문제가 생겼습니다.");
				e.printStackTrace();
			}
			
		}	
	}
}

	
	


class VendingMachine1 {
	private static final int apple = 1000; 
	private static final int grape = 1200;
	private static final int mango = 1500; 

	public void selectBerverage(int choice , int money)  throws MachineException{
		try {
		int price = 0 ;
		
		switch (choice) {
		
			case 1:
					System.out.printf("사과맛을 구매하셨습니다. ");
					price = apple; 
					break;
			case 2: 
					System.out.printf("포도맛을 구매하셨습니다. "); 
					price = grape;
					break;
			case 3: 
					System.out.printf("망고맛을 구매하셨습니다. ");
					price = mango;
					break;
					
			default : 
				 	throw new InvalidNumberException ("잘못된 번호를 누르셨습니다.");
		}
		
		if(money < price ) {
			throw new InsufficientFundException("금액이 부족합니다.");
			
		} else {
			System.out.println("감사합니다. 음료가 나왔습니다.");
			if (money > price) {
				System.out.println("거스름돈은" + (money - price));
			}
		}
		
		} catch (InvalidNumberException e) {
			System.out.println(e.getMessage());
			throw new MachineException("자판기에 문제가 생겼습니다.", e);
		} catch (InsufficientFundException e) {
			System.out.println(e.getMessage());
			throw new MachineException("자판기에 문제가 생겼습니다.", e);
		}
	}
}

class MachineException extends Exception {
	public MachineException (String message, Exception e) {
		super (message, e);
	}
}


class InvalidNumberException extends Exception {
	public InvalidNumberException (String message) {
		super (message);
	}
}

class InsufficientFundException extends Exception {
	public InsufficientFundException (String message) {
		super(message);
	}
}
/*문제 1.
자판기 프로그램에 연결 예외를 적용해 주세요.
*/