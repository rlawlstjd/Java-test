package com.test.java.ch03;

public class Ex06NotOperatorTest {
	public static void main (String[]args) {
		
		boolean power = false ; 
		
		System.out.printf("tv의 전원이 꺼져있습니다.(%b)%n",power);
		
		power = !power;
		System.out.printf("tv의 전원이 꺼져있습니다. (%b)%n", power);
		
		System.out.printf("tv의 전원이 꺼져있습니다.(%b)%n",power);
		
	}
}
/*
문제 1.
티비의 전원이 꺼져 있습니다.
부정 연산자를 사용하여 티비의 전원 변수의 값을 반대로 바꿔 저장한 뒤 출력하세요.  
*/