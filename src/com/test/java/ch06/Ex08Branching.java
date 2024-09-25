package com.test.java.ch06;

import java.util.Scanner;

public class Ex08Branching {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		
		
		int balance = 1000 ; 
		while (true) {
			System.out.println("출금할 금액을 입력하세요:");
			int money = scan.nextInt(); 
			if (balance - money < 0 ) {
				System.out.println("잔액을 초과합니다.");
				
			}else if (balance - money ==0 ) {
				System.out.println("더이상 출금할 수 있는 잔액이 없습니다."); 
				break; 
			}
			
			balance -= money ; 
			System.out.println(money + "원을 출금하였습니다.");
			System.out.println(balance + "원이 남았습니다.");
			
			
		}
	
		System.out.println("-----------"); 
		System.out.println("잔액은 " + balance + "원 입니다."); 
	
	}
}
