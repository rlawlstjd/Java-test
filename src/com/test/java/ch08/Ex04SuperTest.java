package com.test.java.ch08;

public class Ex04SuperTest {
	public static void main(String[] args) {
		EvCar c = new EvCar(); 
		c.name = "소나타";
		c.price = 5000; 
		c.door = 4; 
		
		c.carInfo();
		
		EvCar c2 = new EvCar(); 
		c2.setName("그랜져");
		c2.setPrice(6000);
		c.door = 4; 
		
	
	}
}

class Car {
	String name ; 
	int price; 
}

class EvCar extends Car {
	int door; 
	String name; 
	int price; 
	
	public void carInfo() {
		System.out.println("모델명: " + name + ", 가격: " + price + "문 갯수: " + door);
	}
	
	public void setName(String n) {
		super.name = n;
		this.name = n + "입니다";
		System.out.println("일반차의 이름: " + super.name );
		System.out.println("전기차의 이름: " + this.name );
	}
	
	public void setPrice(int p) {
		super.price = p + 1000;
		price = p; // 자식클래스에 price 변수 없으면 부모클래스에 덮어 씌어버림.
		System.out.println("일반차의 가격: " + super.price);
		System.out.println("전기차의 가격: " + price); 
	}
}
/*
문제 1.
this와 super에 대해 설명할 수 있는 코드를 작성하세요.
*/