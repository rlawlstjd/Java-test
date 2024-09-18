package com.test.java.ch17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex02GenericsTest {
	public static void main(String[] args) {
		Pencil[] pencil = {
							new Pencil("모나미", 500),
							new Pencil("오나미", 400), 
							new Pencil("나미", 300)
		};

		
		Box<Pencil> items = new Box<Pencil>(pencil);
		items.printAllItems();
		System.out.println(); 
		
		
		
		Tv [] tv = {
					new Tv("삼성", 5000), 
					new Tv("엘지", 5500),
					new Tv("샤오미", 3000)
		};		
		
		Box<Tv> items1 = new Box<Tv>(tv); 
		
		items1.printAllItems();
	}
}
class Pencil {
	String model; 
	int price; 
	
	Pencil(String model, int price){
		this.model = model; 
		this.price = price; 
	}
	
	@Override 
	public String toString() {
		return "modle: " + model + ", price: " + price ;
	}
}

class Tv {
	String model; 
	int price; 
	
	Tv(String model, int price){
		this.model = model; 
		this.price = price; 
	}
	
	@Override 
	public String toString() {
		return "modle: " + model + ", price: " + price ;
	}

}

class Box<T>{
	private List<T> items ; 
	
	public Box() {
		items = new ArrayList<>();
	}
	
	public Box(T[]arr) {
		items = new ArrayList<>(Arrays.asList(arr));
	}
	
	public void printAllItems () {
		for(T item : items) {
			System.out.println(item);
		}
	}
}

/*
문제 1.
상자에 연필과 티비를 담는 프로그램을 코딩하세요.
상자에는 연필, 티비 외에 어떠한 타입도 받을 수 있도록 타입 파라미터를 사용하세요. 
*/