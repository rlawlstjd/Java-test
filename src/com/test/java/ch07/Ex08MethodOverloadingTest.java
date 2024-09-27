package com.test.java.ch07;

import java.util.Scanner;

public class Ex08MethodOverloadingTest {
	public static void main(String[] args) {
		Car car = new Car();
		car.setCompany("현대");
		car.setName("소나타");
		car.setMaxSpeed(240);
		
		Car car2 = new Car(); 
		car2.setInfo("기아", "k5", 250);
		
		System.out.println(car.getInfo());
		System.out.println(car2.getInfo());
		
	}
}

class Car {
	private int maxSpeed; 
	private String name; 
	private String company; 
	
	
	public void setInfo(String s, String n, int m) {
		this.company = s; 
		this.name = n; 
		this.maxSpeed = m; 
	}
	
	
	public void setCompany(String c) {
		this.company = c;
	}
	
	public void setName (String n) {
		this.name = n;
	}
	
	public void setMaxSpeed (int s) {
		this.maxSpeed = s; 
	}
	
	public String getInfo() {
		return "기업: " + company + "모델명: " + name + "최고 속도: " + maxSpeed;
	}
}
/*
문제 1.
자동차 정보 자동차이름(문자열), 최대속도(정수), 자동차회사(문자열) 를 저장하는 클래스를 만들고
각각의 속성을 설정하는 메소드를 작성 후 출력하세요.

문제 2.
속성을 설정하는 메소드를 오버로딩을 사용하여 작성 후 출력하세요. 
*/