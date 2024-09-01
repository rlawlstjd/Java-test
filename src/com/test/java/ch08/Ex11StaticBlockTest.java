package com.test.java.ch08;

public class Ex11StaticBlockTest {
	public static void main(String[] args) {
		Cart3.printIn();
		
		Product p1 = new Product (); 
		Product p2 = new Product ("컴퓨터");
		Product p3 = new Product ("아이폰", "애플");
		Product p4 = new Product ("맥북", "애플", 50000);
		
		Cart3.add(p1);
		Cart3.add(p2);
		Cart3.add(p3);
		Cart3.add(p4);
		
		Cart3.printIn();
	
	}
}
class Cart3{
	public static Product[] p = new Product [5] ; 
	public static int productCount = 0 ; 
	
	static {   ///정적 초기화 블록
		Product product = new Product(); 
		product.name = "핸드폰";
		product.brand = "삼성";
		product.price = 50000 ;
		
		for (int i=0; i<p.length; i++) {
			p[i] = product ; 
		}
	}
	
	public static void printIn () {
		for (int i=0; i<p.length; i++) {
			p[i].print();
		}
		System.out.println();
	}
	
	public static void add (Product pod) {
		p[productCount] = pod;
		productCount++; 
	}
	
}

class Product{
	public String name; 
	public String brand; 
	public int price; 
	int productNo ; 
	static int amount =  0; 
	{
		productNo = amount++; ///인스턴스 블럭
	}
	
	
	public Product () {
		this("비어있음", "비어있음", 0);
	}
	 
	public Product (String name) {
		this (name , "삼성", 5000);
	}
	
	public Product (String name, String brand) {
		this (name, brand, 5000);
	}
	
	public Product (String name, String brand, int price){
		this.name = name; 
		this.brand = brand; 
		this.price = price; 
	}
	
	public void print () {
		System.out.println(productNo + "제품:" + name + " 브랜드:" + brand + " 가격:" + price);
	}
	
	static void printInfo () {
		
	}
}


/*
문제 1.
정적 초기화 블록과 인스턴스 초기화 블록을 사용한 예제를 작성하세요.

문제 2.
정적 초기화 블럭에서는 인스턴스 변수를 사용할 수 없습니다.
이유를 설명하세요.
*/