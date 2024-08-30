package com.test.java.ch08;

import java.util.Arrays;

public class Ex01InheritanceTest {
	public static void main(String[] args) {
		SmartPhone sm = new SmartPhone () ; 
		sm.brand = "삼성";
		sm.modelName = "갤럭시 23";
		sm.price = 50000 ;
		sm.function = new String[] {"인터넷", "AI", "스마트 월렛"};
		
		sm.printInfo();
		sm.smartInfo();
		
		
		FeaturePhone fp = new FeaturePhone () ; 
		fp.brand = "노키아";
		fp.modelName = "3210";
		fp.price = 3200;
		fp.keyboard = true ;
		
		fp.printInfo();
		fp.featureInfo();
		
		
		
		}
	}
class Phone {
	String brand; 
	String modelName ; 
	int price ;
	
	void printInfo() {
		System.out.printf("브랜드: %s%n모델명: %s%n가격(세금포함): %d%n", brand, modelName, getPrice());
	}
	
	int getPrice() {
		int taxPrice = (int)(price*1.1f);
		return taxPrice;
	}
}

class SmartPhone extends Phone {
	String[] function ;
	
	void smartInfo () {
		System.out.printf("스마트폰의 기능: %s%n%n", Arrays.toString(function));
	}
} 

class FeaturePhone extends Phone {
	boolean keyboard ; 
	
	void featureInfo() {
		System.out.printf("물리적 자판기의 유무: %b%n", keyboard);
	}
}
	
	
	

/*
문제 1.
생각나는 개체를 클래스로 만들되 부모 자식 클래스로 나누어 주세요.
자식 클래스는 두 개 이상 만들어 주세요. 
모든 클래스에 속성(인스턴스 변수)과 기능(메소드)을 하나 이상 만들어 주세요.  
*/