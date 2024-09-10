package com.test.java.ch12;

import java.util.Scanner;

public class Ex09TryWithResourceTest {
	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner (System.in)) {
			System.out.print("입력할 문자열을 적으세요.");
			String text = scan.nextLine(); 
			System.out.println("입력한 문자열: " + text);
		}
	}
}
/*
문제 1.
Scanner 의 nextLine 메소드를 이용하여 입력받은 문자열을 출력하는 코드를 작성하세요.
스캐너는 사용후 scanner.close() 와 같이 자원을 반납하여야 합니다.
반납하지 않으면 경고가 뜨게 됩니다.
try with resources 문법으로 스캐너의 자원을 자동 반납하도록 코딩하세요. 
*/