package com.test.java.ch08;

public class Ex01InheritanceTest {
	public static void main(String[] args) {
		Phone phone = new Phone () ;
		phone.brand = "애플" ;
		phone.name = "아이폰 14";
		phone.numberOfUsers = 100 ; 
		phone.printInfo();
		
		Size size = new Size (); 
		size.width = 150; 
		size.height = 200 ; 
		
		size.printSize();
		size.printInfo();
	
	}
}
class Phone {
	String brand ;
	String name ; 
	int numberOfUsers ; 

	void printInfo() {
		System.out.printf("핸드폰 정보 -%n브랜드: %s%n기기명: %s%n사용자 수: %s%n%n", brand, name, numberOfUsers );
	}
	
}

class Size extends Phone {
	int width ;
	int height; 
	
	void printSize() {
		System.out.println("가로길이: " + width + "mm, 세로길이" + height + "mm, " + brand);
	}
}
	


/*
문제 1.
생각나는 개체를 클래스로 만들되 부모 자식 클래스로 나누어 주세요.
자식 클래스는 두 개 이상 만들어 주세요. 
모든 클래스에 속성(인스턴스 변수)과 기능(메소드)을 하나 이상 만들어 주세요.  
*/