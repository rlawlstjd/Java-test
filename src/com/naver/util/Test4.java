package com.naver.util;

public class Test4 {
	public static void main(String[] args) {
		Book3 b = new Book3 () ; 
		int bookPrice = b.getPrice(); 
		System.out.println("세금 포함된 책의 가격: " + bookPrice);
		
		b.price = 50000 ; 
		b.setPrice(35000);
		System.out.println();
		
		b.setTitle("자바");////null이 뜨는 이유 알기 
		System.out.println("책이름: " + b.title); 
		
		b.setTitle("자바문법");
		System.out.println("책이름: " + b.title); 
	
	}
}
class Book3 {
	int price ; 
	String title ; 
	
	int getPrice() {
		if (price <= 0)
			return 0 ; 
		
		float tax = 1.1f;
		price = (int)(price*tax); 
		return price;
		
	}
	void setPrice(int price) {
		System.out.println("price -> " + price); 
		System.out.println("this.price -> " + this.price);
		
		this.price = price; 
		System.out.println("this.price = price 적용 후 this.price ->" + this.price);
	}
	
	void setTitle (String title ) {
		String[]filter = {"자바", "c", "파이썬"};
		
		for (int i=0; i<filter.length; i++) {
			if (title.equals(filter[i])) {
				System.out.println("사용할 수 없는 책 이름입니다.");
				return; 
			}
		}
		 this.title = title; 
	}
}

