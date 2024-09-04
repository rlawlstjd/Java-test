package com.test.java.ch10;

public class Ex01InnerClassTest {
	public static void main(String[] args) {
		Outer outer = new Outer (); 
		Outer.Inner inner = outer.new Inner (); 
		
		inner.displayNames(); 
		
		
		
	}
}

class Outer{
	private String name = " Name";
	
	class Inner{
		private String name = " Name";
		
		void displayNames() {
			String name = " Name";
			System.out.printf("지역변수: %s%n", name);
			System.out.printf("이너 인스턴스 변수: %s%n", this.name);
			System.out.printf("아우터 인스턴스 변수: %s%n", Outer.this.name);
		}
	}
}
/*

문제 2.
아우터 클래스의 인스턴스 변수, 이너 클래스의 인스턴스 변수, 이너 크래스의 메소드내 지역 변수 모두 이름을 같게 설정하고 각각의 값을 출력하는 코드를 작성하세요.  

*/