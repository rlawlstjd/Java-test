package com.test.java.ch07;

import java.util.Scanner;

public class Ex08MethodOverloadingTest {
	public static void main(String[] args) {
	
		//문제 1번
		/*Car car = new Car () ; 
		car.setInfo ("모르쉐") ;
		car.setInfo1 ("엘컴퓨터학원");
		car.setInfo (300);
		
		car.printInfo() ;  */
		
		
		//문제 2 번 
		Car car = new Car () ;
		car.setInfo("모르쉐", 300, "엘컴퓨터학원");
		System.out.println(car.getInfo());
		
	
	
	
	
	
	}
}

/*class Car {
	String name ; 
	String company; 
	int rate; 
		
	void setInfo (String name) {
		this.name = name ; 
	}
	
	void setInfo (int rate) {
		this.rate = rate ; 
	}
	
	void setInfo1 (String company) {
		this.company = company ; 
	}
	
	void printInfo () {
		System.out.println("자동차 이름: " +this.name);           //왜 한 줄에서 모두 사용이 안되는가?
		System.out.println("최고속도: " +  this.rate + "km/h");
		System.out.println("자동차 회사: " +this.company );
	}
}*/
	
class Car {
	String name ; 
	String company; 
	int rate; 
	void setInfo (String name, int rate, String company) {
		this.name = name; 	
		this.rate = rate; 
		this.company = company;
	}
	
	
	String getInfo() {
		return "이름: " + name  + "\n속도: " + rate + "\n회사: " + company + "\n";
	}
} 
/*
문제 1.
자동차 정보 자동차이름(문자열), 최대속도(정수), 자동차회사(문자열) 를 저장하는 클래스를 만들고
각각의 속성을 설정하는 메소드를 작성 후 출력하세요.

문제 2.
속성을 설정하는 메소드를 오버로딩을 사용하여 작성 후 출력하세요. 
*/