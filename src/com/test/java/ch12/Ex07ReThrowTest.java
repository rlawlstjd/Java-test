package com.test.java.ch12;

import java.util.Scanner;

public class Ex07ReThrowTest {
	public static void main(String[] args) {
		Berverage berverage = new Berverage() ; 
		Scanner scan = new Scanner(System.in); 
		
		while (true) {
			System.out.println("1: 사과 (1000원) "); 
			System.out.println("2: 포도 (1200원) "); 
			System.out.println("3: 망고 (1500원) ");
			System.out.print("음료 번호를 입력하세요 (0: 종료) : ");
			int choice = scan.nextInt(); 
			if(choice ==0 ) {
				break;
			}
			
			System.out.print("금액을 입력하세요:"); 
			int amount = scan.nextInt();
			
			try {
				berverage.selectBerverage(choice,amount);
				System.out.println("음료가 나왔습니다.");
				
			} catch (InvalidBerverageException e) {
				System.out.println(e.getMessage());
			} catch (InsufficientFundsException e) {
				System.out.println(e.getMessage()+ "추가로 " + e.getAmountNeeded() + "원이 필요합니다."); 
			}
		}	
	}
}


class Berverage { // 자판기 클래스 
	private static final int apple_flavor = 1000; 
	private static final int grape_flavor = 1200; 
	private static final int mango_flavor = 1500; 
	
	public void selectBerverage(int choice, int amount) throws  InvalidBerverageException,InsufficientFundsException{
		int price ; // throw 쓰면 try catch 넘김 
		
		switch (choice) {
			case 1: 
				price = apple_flavor ; 
				break; 
			case 2:
				price = grape_flavor ; 
				break;
			case 3: 
				price = mango_flavor ; 
				break;
			default :
				throw new InvalidBerverageException("잘못된 음료 번호입니다.");
		}
		
		if (amount<price) {
			throw new InsufficientFundsException("잔액이 부족합니다." , price - amount);
		} else if (amount > price) {
			System.out.println ("거스름돈은" + (amount -price) + "원 입니다."); 
		}
	
	}

}


//예외 클래스 
class InvalidBerverageException extends Exception {
	InvalidBerverageException (String message){
		super (message);
	}
}
	
class InsufficientFundsException extends Exception {
	private int amountNeeded; 
	
	InsufficientFundsException (String message, int amountNeeded){
		super (message);
		this.amountNeeded = amountNeeded; 
	}
	
	public int getAmountNeeded () {
		return amountNeeded; 
	}
}
/*
문제 1.
자판기 프로그램에 re throw를 적용해 주세요.
*/