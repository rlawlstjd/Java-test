package com.test.java.ch08;

import java.util.Arrays;

public class Ex01InheritanceTest {
	public static void main(String[] args) {
		Tablet t = new Tablet (); 
		t.width = 18; 
		t.height = 29; 
		t.printSize(); 
		System.out.println(); 
		
		
		Phone p = new Phone (); 
		p.width = 7; 
		p.height = 15;
		p.printSize(); 
		System.out.println(); 
		
		p.setAlramTime(10);
		System.out.println(p.getAlramTime());
	
	}
}

class Device {
	String modelName; 
	int price; 
		
	public void printInfo() {
		System.out.printf("모델명: " + modelName + "가격: " + price );
	}
	

}

class Tablet extends Device {
	int width; 
	int height; 
	
	public void printSize() {
		System.out.printf("가로길이: " + width + "세로길이: " + height);
	}
	
}

class Phone extends Tablet {
	int alramTime;
	
	public void setAlramTime(int t) {
		this.alramTime = t; 
	}
	
	public int getAlramTime() {
		return alramTime; 
	}
	
}
/*
문제 1.
생각나는 개체를 클래스로 만들되 부모 자식 클래스로 나누어 주세요.
자식 클래스는 두 개 이상 만들어 주세요. 
모든 클래스에 속성(인스턴스 변수)과 기능(메소드)을 하나 이상 만들어 주세요.  
*/