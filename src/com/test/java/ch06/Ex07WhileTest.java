package com.test.java.ch06;

import java.util.Scanner;

public class Ex07WhileTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		boolean insert = true ; 
		
		while (insert) {
			System.out.printf("동전을 넣어주세요"); 
			int coin = scan.nextInt();
			
			if(coin > 500) {
				System.out.printf("콜라를 구입할 수 있습니다.");
			}else if (coin > 300) {
				System.out.printf("사이다를 구입할 수 있습니다."); 
			}else if (coin > 200) {
				System.out.printf("환타를 구입할 수 있습니다.");
			}else {
				System.out.printf("잔액이 부족합니다.") ; 
			}
		}
		
		
		
	}
}
/*
문제 1.
while문을 사용해 자판기를 만드세요.
1: 콜라 (500원), 2: 사이다(300원), 3: 환타(200원)
잔액은 1000원으로 설정하고 잔액이 부족하면 음료수를 살 수 없어야 합니다.  
*/