package com.test.java.ch08;

public class Ex02HasARelationshipTest {
	public static void main(String[] args) {
		Customer food = new Customer () ;
		food.menu = "참치마요"; 
		food.price =  50000 ; 
		
		Customer food1 = new Customer () ; 
		food1.menu = "소불고기 비빔밥"; 
		food1.price = 55000; 
		
		Order order = new Order () ; 
		order.putMenu(food);
		
		Order.print(food);
		
		order.putMenus(food,food1);
		Order.print(order.foods);
		
		
		
		
	
	
	}
}

class Order {
	 Customer order ; 
	 Customer[] foods; 
	 int price ; 
	 
	 void putMenu(Customer food) {
		 this.order = food ; 
	 }
	 
	 void putMenus(Customer...foods) {
		 this.foods = foods ;
	 }
	 
	 
	 static void print(Customer food) {
		 System.out.println("- 주문 -");
		 System.out.println(food.print());
	 }	 
	 
	 static void print (Customer[] foods) {
		 System.out.println("- 주문 -"); 
		 
		 for(int i=0; i<foods.length; i++) {
			 System.out.println(foods[i].print());
		 }
	 }
}

class Customer {
	String menu ; 
	int price ; 
	
	String print () {
		return "메뉴: "+menu+", 가격:"+price ; 
	}
}


/*
문제 1.
생각나는 개체를 이용하여 클래스들을 만들고 HAS-A 관계를 표현해주세요. 
*/