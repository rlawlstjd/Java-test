package com.test.java.ch07;

import java.util.Scanner;

public class Ex111111 {
	public static void main(String[] args) {
		Car1 car = new Car1("김진성") ; 
		car.printInfo () ; 
		
		Car2 car2 = new Car2() ; 
		car2.printInfo();
	
	
	
	}
}
class Car1{
	String name ; 
	String company; 
	int price ; 
	
	Car1(String name){	
		this.name= name ; 
		this.company = "엘컴퓨터학원" ; 
		this.price = 50000 ; 
		}
	
	
	void printInfo() {
		System.out.printf("이름: %s%n공장: %s%n가격: %s%n", name, company, price); 
	}	
}
class Car2 {
	String name; 
	String company; 
	int price ; 
	
	Car2(){
		this.name = "안녕하세요" ; 
		this.company = "엘컴퓨터학원";
		this.price = 50000 ; 
	}
	
	void printInfo() {
		System.out.printf("이름: %s%n공장: %s%n가격: %s%n", name, company, price); 
	}
	
}