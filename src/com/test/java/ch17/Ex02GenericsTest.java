package com.test.java.ch17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.test.main.Cart;
import com.test.main.Pen;
import com.test.main.Tv;

public class Ex02GenericsTest {
	public static void main(String[] args) {
		Pen[] pens = {
				new Pen("빨간색", 500), 
				new Pen("주황색", 400),
				new Pen("노란색", 300)
		};

		Tv[] tvs = {
				new Tv("올레드", 5000),
				new Tv("커브드", 6000),
				new Tv("UHD", 7000)
		}; 


		Cart<Pen> cart = new Cart<>(pens);
		cart.printAllItems();
		System.out.println();
		
		Cart<Tv> cart2 = new Cart<>(tvs);
		cart.printAllItems();
		System.out.println();
		
		System.out.println(cart.get(2));
	}
}

class Pen {
	private String color; 
	private int price; 


	Pen(String color, int price){
		this.color = color;
		this.price = price;
	}
	
	@Override 
	public String toString() {
		return "색깔: " + color + ", 가격: " + price;
	}
}

class Tv {
	private String modelName; 
	private int price; 
	
	Tv(String modelName, int price){
		this.modelName = modelName; 
		this.price = price; 
	}
	
	@Override
	public String toString() {
		return "모델명: " + modelName + ", 가격: " + price; 
	}
}

class Cart<T> {
	private List<T> items;
	
	Cart(T[] arr){
		items = new ArrayList<>(Arrays.asList(arr)); 
	}
	
	public void printAllItems() {
		for (T item : items) {
			System.out.println(item);
		}
	}
	
	public T get(int index) {
		return items.get(index);
	}
}

/*
문제 1.
상자에 연필과 티비를 담는 프로그램을 코딩하세요.
상자에는 연필, 티비 외에 어떠한 타입도 받을 수 있도록 타입 파라미터를 사용하세요. 
*/