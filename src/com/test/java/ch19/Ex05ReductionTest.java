package com.test.java.ch19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Ex05ReductionTest {
	public static void main(String[] args) {
		List<Car1> cars = new ArrayList<>(); 
		cars.add(new Car1("A", 5000)); 
		cars.add(new Car1("B", 4000)); 
		cars.add(new Car1("C", 6000)); 
		cars.add(new Car1("D", 5500)); 
		cars.add(new Car1("F", 5200)); 
		cars.add(new Car1("G", 5300));
		
		System.out.println("< 자동차 금액의 평균가 >");
		double avgPrice = 
				cars 
					.stream()
					.mapToInt(Car1::getPrice)
					.average()
					.getAsDouble(); 
		System.out.printf("%,.0f원%n",avgPrice); 
		System.out.println(); 
		
		System.out.println("< 가장 높은 자동차의 금액 >"); 
		int maxPrice = 
				cars
					.stream()
					.mapToInt(Car1::getPrice)
					.max()
					.getAsInt(); 
		System.out.printf("%d원%n", maxPrice); 
		System.out.println(); 
		
		System.out.println("< 세금 10% 부과된 금액 >"); 
		int taxPrice = 
				cars	
					.stream()
					.mapToInt(Car1::getPrice)
					.reduce(0, (a,b) -> a+(int)(b*1.2f));
		System.out.println(taxPrice); 
		
		System.out.println("< 두 개의 리스트 생성 후 collect를 사용하여 병합 >"); 
		List<String> list1 = new ArrayList<>(); 
		list1.add("A"); 
		list1.add("B"); 
		list1.add("C"); 
		
		List<String> list2 = new ArrayList<>(); 
		list2.add("AA"); 
		list2.add("BB"); 
		list2.add("CC"); 
	
		List<String> mergedList = Stream.concat(list1.stream(), list2.stream())
				.collect(Collectors.toList());
		System.out.println(mergedList);
		
	/*	List<String> mergedList = new ArrayList<>(); 
		mergedList.addAll(list1); 
		mergedList.addAll(list2); 
		
	*/	
		
	}
}

class Car1 {
	private String name; 
	private int price; 
	
	Car1(String name, int price){
		this.name = name; 
		this.price = price;
	}
	public int getPrice () {
		return price;
	}
	public String getName() {
		return name;
	}
}
/*
문제 1.
자동차 금액의 평균가를 출력하세요.

문제 2.
가장 높은 자동차의 금액을 출력하세요.

문제 3.
세금 10% 부가된 자동차 가격 총액을 출력하세요.
힌트) reduce를 사용하세요.

문제 4.
두 개의 리스트를 생성 후 collect를 사용하여 병합하세요.
병합된 리스트를 출력하세요.
*/
