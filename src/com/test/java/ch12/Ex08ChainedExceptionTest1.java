package com.test.java.ch12;

import java.util.Scanner;

public class Ex08ChainedExceptionTest1 {
	public static void main(String[] args) {
		while(true) {
			Beverage1 b = null; 
			
			b = Machine2.form();
			
			try {
				Machine2.machineService(b);

			} catch (MachineException e) {
				e.printStackTrace(); 
				System.out.println("금액을 확인해 주세요.");
				Machine2.needMoney = b.beveragePrice - Machine2.amount; 
				System.out.println("부족한 금액: " + Machine2.needMoney);
			
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("예외 발생!!");
	
			}
		}
	}		
}

class Machine2 {
	static int amount ; 
	static Beverage1 beverage; 
	static int needMoney; 
	
	
	public static void machineService(Beverage1 b) throws MachineException{
		try {	
			if (amount < b.beveragePrice) {
				throw new NeedMoneyException ("잔액이 부족합니다."); 
			
			} else {
				System.out.println(b.name()+ "을 구매해 주셔서 감사합니다.");
			}	
		} catch (NeedMoneyException e) {
			System.out.println("000-0000-0000 으로 전화주세요!"); 
			throw new MachineException (" 자판기 오류가 발생했습니다.", e); 
		}
	}
	public static Beverage1 form() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("--자판기--"); 
		System.out.println("음료를 선택해 주세요."); 
		System.out.println("1. 오렌지(500)  2. 포도(600)  3. 콜라(700)  4. 사이다(800)  5. 초콜렛(990)");
		beverage = Beverage1.values()[s.nextInt()-1];
		System.out.println("금액을 넣어주세요."); 
		amount = s.nextInt();
	
		return beverage; 
	}
}

enum Beverage1{
	orange(500),
	grape(600),
	cock(700),
	soda(800),
	chocolate(900);
	
	public final int beveragePrice;
	
	
	Beverage1 (int price) {
		this.beveragePrice = price; 
	}
}

class MachineException extends Exception {
	public MachineException (String message, Exception e) {
		super (message, e); 
	}
}

class NeedMoneyException extends Exception {
	public NeedMoneyException (String message) {
		super(message); 
	}
}