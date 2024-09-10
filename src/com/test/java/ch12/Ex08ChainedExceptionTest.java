package com.test.java.ch12;

import java.util.Scanner;

public class Ex08ChainedExceptionTest {
	public static void main(String[] args) {
		VendingMachine1 vd = new VendingMachine1(); 
		
		BerverageChoice bc = VendingMachine1.form();
		
		System.out.println(bc.getChoice());
		System.out.println(bc.getMoney());
		
	
	}
}

class VendingMachine1 {
	private static final int apple = 1000; 
	private static final int grape = 1200;
	private static final int mango = 1500; 
	
	
	public static BerverageChoice form() {
		BerverageChoice bc = new BerverageChoice();
		Scanner scan = new Scanner (System.in); 
		
		System.out.println("---자판기---");
		System.out.println("음료를 선택하세요.");
		System.out.println("1:사과맛 2:포도맛 3:망고맛"); 
		int choice = scan.nextInt();
		
		System.out.println("금액을 입력하세요");
		int money = scan.nextInt();
		
		bc.setChoice(choice);
		bc.setMoney(money);
		
		return bc;
		
	}

}


class BerverageChoice {
	private int choice; 
	private int money; 
	
	public void setChoice(int choice) {
		this.choice= choice;
	}
	
	public int getChoice() {
		return choice;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public int getMoney () {
		return money;
	}

}
/*문제 1.
자판기 프로그램에 연결 예외를 적용해 주세요.
*/