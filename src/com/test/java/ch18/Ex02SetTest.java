package com.test.java.ch18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex02SetTest {
	public static void main(String[] args) {	
		String[] menu = {"짜장면", "짬뽕", "된장찌개", "김치찌개", "탕수육"};
		
		Customer c1 = new Customer ("A"); 
		c1.addFood("짜장면");
		c1.addFood("짬뽕");
		
		Customer c2 = new Customer ("B");
		c2.addFood("짜장면");
		c2.addFood("탕수육");
		
		Customer c3 = new Customer ("C");
		c3.addFood("짜장면");
		c3.addFood("김치찌개");
		
		Restaurant restaurant = new Restaurant() ;
		restaurant.setMenu(menu);
		restaurant.setCustomer(c1,c2,c3);
		
		System.out.println("정렬된 메뉴 ");
		List<String> oMenu = restaurant.getOrderedMenus();
		System.out.println(oMenu);
		
		System.out.println("모든 주문");
		Set<String> rMenus = restaurant.getRegisteredMenus();
		System.out.println(rMenus);
		
		System.out.println("모든 사람이 주문한 같은 메뉴");
		Set<String> sMenu = restaurant.getBasicMenus();
		System.out.println(sMenu);
		
		System.out.println("모든 사람들이 주문하지 않은 메뉴"); 
		Set<String> tMenu = restaurant.getCanceledMenus();
		System.out.println(tMenu);
		
		
	}
}
class Restaurant {
	private Set<String> menus; 
	private List<Customer> customers;
	
	public List<String> getOrderedMenus(){
		List<String> oMenu = new ArrayList<>(menus);
		Collections.sort(oMenu);
		return oMenu;
	}
	
	public void setMenu(String[] arrMenu) {
		List<String>menu = new ArrayList<>();
		Collections.addAll(menu, arrMenu); 
		menus = new HashSet<>(menu);
	}
	
	public Set<String> getCanceledMenus(){
		Set<String> rMenu = new HashSet<>(menus);
		Set<String> sMenu = getBasicMenus(); 
		rMenu.removeAll(sMenu);
		return rMenu;
		
	}
	
	public Set<String> getBasicMenus(){
		Set<String> sMenu = null; 
		for (Customer customer : customers) {
			if( sMenu == null) {
				sMenu = new HashSet<>(customer.getMenus());
			}
			sMenu.retainAll(customer.getMenus());
		}
		return sMenu;
	}
	
	public void setCustomer(Customer...arrCustomer ) {
		customers = new ArrayList<>();
		Collections.addAll(customers, arrCustomer);

	}
	
	public Set<String> getRegisteredMenus() {
		Set<String> rMenus = new HashSet<>();
		for (Customer customer : customers) {
			rMenus.addAll(customer.getMenus());
		}
		return rMenus;
	}
}

class Customer {
	private String name ;
	private Set<String> menus;
	
	public Customer(String name){
		this.name = name; 
		this.menus = new HashSet<>();
	}
	
	public void addFood(String menu) {
		menus.add(menu);
	}
	
	public Set<String> getMenus () {
		return menus;
	}
	
	
}
/*
엘컴퓨터식당에는 짜장면, 짬뽕, 된장찌개, 김치찌개, 탕수육 식사 메뉴가 있습니다.
A는 짜장면, 짬뽕을 시켰습니다.
B는 짜장면, 탕수육을 시켰습니다.
C는 짜장면, 김치찌개를 시켰습니다. 

문제 1.
주문한 모든 메뉴를 중복 없이 정렬하여 출력하세요.

문제 2.
모든 사람이 주문한 메뉴를 출력하세요.

문제 3.
한 명도 시키지 않은 메뉴들을 출력하세요.
*/