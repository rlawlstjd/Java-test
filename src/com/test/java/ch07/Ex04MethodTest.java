package com.test.java.ch07;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04MethodTest {
	public static void main(String[] args) {
		BookTest b = new BookTest(); 
		b.setPrice(5000);
		System.out.println(b.getPrice());
		
		BookTest b2 = new BookTest(); 
		b2.setPrice(15000);
		System.out.println(b2.getPrice());
		
		String[] authors = {"가", "나", "다"};
		b2.setAuthor(authors);
		System.out.println(Arrays.toString(b2.getAuthor())); // 배열 보여줄 땐 Arrays.toString() ; 사용; 
	}
}

class BookTest{
	private int price; //인스턴스 변수.
	private String[] arrAuthor = new String [3];
	
	
	public void setPrice(int price) { // 책 가격을 설정하는 메소
		if (price >=10000 && price <= 80000) {
			this.price = price ; 
		}else {
			System.out.printf("설정가능하지 않은 가격입니다.");
		}
	}
	
	public int getPrice () {
		return price; 
	}
	
	public void setAuthor (String[] author) {
		for (int i=0; i<arrAuthor.length; i++) {
			arrAuthor[i] += author[i]; 
		}
		this.arrAuthor = author;
	}
	
	public String[] getAuthor () {
		return arrAuthor;
	}
}
/*
문제 1.
BookTest 클래스를 작성하세요.
가격을 저장하는 인스턴스 변수를 선언하세요.
책의 가격을 설정하는 메소드를 작성하세요.
책의 가격은 10000원 이상 80000원 미만으로만 설정가능해야 하며 그 외의 금액은 "설정 가능하지 않은 가격입니다." 를 출력하세요.

문제 2.
BookTest 클래스의 인스턴스를 두 개 생성하여 메소드를 사용하 각각 금액을 설정하고 설정된 금액을 출력하세요.

문제 3.
BookTest 클래스에 책의 저자를 최대 3명까지 저장할 수 있는 배열을 선언하세요.
저자를 설정할 수 있는 메소드를 작성하세요.
힌트1) 메소드 파라미터로 배열 사용이 가능합니다.
힌트2) for문과 배열간의 대입을 활용하세요. 
*/
/*
문제 1.
BookTest 클래스를 작성하세요.
가격을 저장하는 인스턴스 변수를 선언하세요.
책의 가격을 설정하는 메소드를 작성하세요.
책의 가격은 10000원 이상 80000원 미만으로만 설정가능해야 하며 그 외의 금액은 "설정 가능하지 않은 가격입니다." 를 출력하세요.

문제 2.
BookTest 클래스의 인스턴스를 두 개 생성하여 메소드를 사용하여 각각 금액을 설정하고 설정된 금액을 출력하세요.

문제 3.
BookTest 클래스에 책의 저자를 최대 3명까지 저장할 수 있는 배열을 선언하세요.
저자를 설정할 수 있는 메소드를 작성하세요.
힌트1) 메소드 파라미터로 배열 사용이 가능합니다.
힌트2) for문과 배열간의 대입을 활용하세요. 
*/