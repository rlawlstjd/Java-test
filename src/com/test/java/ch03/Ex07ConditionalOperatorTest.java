package com.test.java.ch03;



public class Ex07ConditionalOperatorTest {
	public static void main (String[]args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.printf("숫자를 입력하세요."); 
		int number = scan.nextInt(); 
		
		System.out.printf("%s%n",number < 0 ? "음수" && number > 0 ? "양수" : "0" ) ; 
		
				
		
		
		
		
		
	}
}
/*
문제 1.
삼항연산자를 사용하여 사용자로 부터 입력 받은 값이 음수인지 양수인지 0인지를 출력하는 코드를 작성하세요. 
*/ 