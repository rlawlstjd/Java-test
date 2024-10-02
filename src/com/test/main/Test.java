package com.test.main;

public class Test {
	public static void main(String[] args) {	
		Tv tv = new Tv(); 
		tv.setModelName("lg 커브드 티비");
		tv.setTax(1.3f);
		tv.setCountry(Tv.Calculator.USA);
		tv.setPrice(50000);
		
		tv.print(); 
		
		Tv.Calculator calc1 = tv.new Calculator (); 
		
	}
}

class Tv {
	private String modelName; 
	private int price; 
	private float tax; 
	private int country; 
	private int amount; 
	
	
	class Calculator {
		float tax; 
		public static final int CHINA = 1; 
		public static final int JAPAN = 2; 
		public static final int USA = 3; 
		
		public void setTotalPrice() {
			switch(country) {
					case CHINA : 
						tax = 1.1f;
						break; 
					case JAPAN : 
						tax = 1.2f; 
						break; 
					case USA : 
						tax = 1.3f; 
						break; 
					default: 
						tax = 1.25f; 
			}
			Tv.this.amount = (int)(Tv.this.price * (Tv.this.tax + tax));
		}
	
	}
	public void print() {
		System.out.println("모델명: " + modelName); 
		System.out.println("판매금액: " + amount); 
		System.out.println("판매국가: " + getCountryString());
	}
	
	public String getCountryString() {
		String str; 
		switch(country) {
			case Calculator.CHINA : 
				str = "중국";
				break;
			case Calculator.JAPAN : 
				str = "일본";
				break; 
			case Calculator.USA : 
				str = "미국";
				break; 
			default : 
				str = "기타";
		}
		return str; 
		
	}	
	public void setCountry(int country) {
		this.country = country;
	}
	
	public int getCountry () {
		return country ; 
	}
	public void setModelName(String name) {
		this.modelName = name;
	}
	
	public String getModelName() {
		return modelName; 
	}
	
	public void setPrice(int price) {
		this.price = price; 
		Tv.Calculator calc1 = this.new Calculator(); 
		calc1.setTotalPrice(); 
	}
	
	public int getPrice() {
		return price; 
	}
	
	public void setTax(float tax) {
		this.tax = tax; 
	}
	
	public float getTax () {
		return tax; 
	}
	
}
/*
문제 1.
이너 클래스를 사용한 예제를 작성하세요.

*/
