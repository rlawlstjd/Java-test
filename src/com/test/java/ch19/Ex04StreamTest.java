package com.test.java.ch19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex04StreamTest {
	public static void main(String[] args) {
		// 문제 1
		Stream<String> stream = Stream.of("가", "나", "다"); 
		stream.forEach(System.out::println);
		System.out.println("\n"); 

		// 문제 2
		IntStream intStream = new Random()
				.ints(1,100)
				.limit(10);
		intStream.forEach(s-> System.out.print(s + ", "));
		System.out.println("\n"); 

		
		List<Car> cars = new ArrayList<>(); 
		cars.add(new Car("A", 600)); 
		cars.add(new Car("B", 400)); 
		cars.add(new Car("B", 420)); 
		cars.add(new Car("C", 520)); 
		cars.add(new Car("C", 430)); 
		cars.add(new Car("D", 540)); 
		cars.add(new Car("F", 490)); 
		
		// 문제 3 
		cars
			.stream()
			.filter(s -> s.getPrice() > 500)
			.forEach(System.out::println);
		System.out.println("\n"); 
		
		// 문제 4 
		cars
			.stream()
			.distinct()
			.forEach(System.out::println);
		System.out.println("\n"); 
		
		// 문제 5 
		cars 
			.stream()
			.map(Car::getName)
			.limit(3)
			.forEach(System.out::println);
		System.out.println(); 	
		
		// 문제 6  (flatMap sorted) 
		Stream<String> stream2 = Stream.of("소나타 현대자동차"); 
		stream2 
			.flatMap(s -> Arrays.asList(s.split("")).stream())
			.sorted() // sorted(Comparator.reverseOrder());  내림차순 
			.forEach(System.out::println);
		System.out.println(); 
		
		// 문제 7 
		cars
			.stream()
			.filter(car -> car.getName().equals("B"))
			.forEach(System.out::println);
		
	
	}
}

class Car {
	private String name; 
	private int price; 
	
	Car(String name, int price){
		this.name = name; 
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "[name]: " + name + ", [price]: " + price;
	}
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Car)) {
			return false;
		}
		Car car = (Car)o; 
		return name.equals(car.getName()); 
	}
	@Override
	public int hashCode() {
		return Objects.hash(name); 
	}
}
/*
문제 1.
스트림에 '가', '나', '다' 를 추가하는 코드를 작성하세요.

문제 2.
스트림을 사용하여 1~100 사이의 숫자 중 난수 10개를 출력하세요.

문제 3.
자동차 인스턴스 5개를 가진 배열을 만들고 스트림으로 변환하세요.
500원 보다 비싼 차량들을 출력하세요.

문제 4.
자동차 이름을 중복 제거 후 출력하세요.

문제 5.
자동차 인스턴스로 이뤄진 스트림을 자동차 금액들로만 이뤈진 스트림으로 변환 후 3개만 출력하세요.

문제 6.
스트림에 저장된 자동차명의 모든 글자를 나누어 한 글자씩 출력하되 오름차순으로 정렬하여 출력하세요.
힌트) flatMap, sorted 를 사용하세요.

문제 7.
스트림에서 특정 차량이름을 검색하여 출력하세요.
*/