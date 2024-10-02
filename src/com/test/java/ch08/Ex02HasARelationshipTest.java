package com.test.java.ch08;

public class Ex02HasARelationshipTest {
	public static void main(String[] args) {
		Menu m = new Menu(); 
		m.menuName = "비빔밥";
		m.price = 5000; 
		
		Menu m2 = new Menu(); 
		m.menuName = "짜장면";
		m.price = 6000; 
		
		Restaurant r = new Restaurant(); 
		r.putMenu(m);
		r.print(m);
		
		r.putMenu(m2); 
		r.print(m2);
		
		r.putMenus(m,m2);
		r.print(r.menus);
		
	}
}

class Menu {
	String menuName; 
	int price; 
	
	String menuInfo() {
		return "메뉴: " + menuName + ", 가격: " + price;
	}
}

class Restaurant{
	Menu menu; 
	Menu[] menus;
	
	public void print(Menu[] m) {
		if ( m != null) {
			for (int i=0; i<m.length; i++) {
				System.out.println(m[i].menuInfo());
			}
		}
	}
	
	public void putMenus(Menu...menus) {
		this.menus = menus;
	}
	
	public void print (Menu m) {
		System.out.println(m.menuInfo());
	}
	
	public void putMenu (Menu m) {
		this.menu = m; 
	}
}

	/*
	문제 1.
	생각나는 개체를 이용하여 클래스들을 만들고 HAS-A 관계를 표현해주세요. 
	*/