package com.test.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Test {
	public static void main(String[] args) {	
		Scanner s = new Scanner (System.in);
		boolean power = true;
		int cola = 500; 
		int soda = 300; 
		int fanta = 200; 
		int money = 1000; 
		
		while (power) {
			System.out.printf("번호를 누르세요"); 
			int n = s.nextInt(); 
			
			if (n == 1) {
				System.out.println("콜라를 구매하셨습니다.");
				money -= cola;
				if ( money < cola) {
					System.out.println("잔액이 부족합니다.");
					power = false;
				}
			} else if (n == 2) {
				System.out.println("사이다를 구매하셨습니다.");
				money -= soda;
				if(money < soda) {
					System.out.println("잔액이 부족합니다.");
					power = false; 
				}
			} else if ( n == 3) {
				System.out.println("환타를 구매하셨습니다."); 
				money -= fanta;
				if ( money < fanta) {
					System.out.println("잔액이 부족합니다.");
					power = false; 
				}
			} else {
				System.out.println("잘못된 번호 입니다.");
			}
			
			System.out.println("현재 잔액은" + money + "입니다."); 

		}
	}
}
	/*
		문제 1.
		while문을 사용해 자판기를 만드세요.
		1: 콜라 (500원), 2: 사이다(300원), 3: 환타(200원)
		잔액은 1000원으로 설정하고 잔액이 부족하면 음료수를 살 수 없어야 합니다.  
		*/