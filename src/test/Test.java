package test;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Test {
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in); 

		Stream<String> str = Stream.of("가", "나", "다"); 
		str.forEach(a -> System.out.print(a + ", "));
		System.out.println("\n"); 
		
		// 1
		Stream<Integer> a = Stream.generate(() -> (int)(Math.random()*100)).limit(10); 
		a.forEach(s -> System.out.print(s + ","));
		System.out.println("\n"); 
		
		
		IntStream b = new Random().ints(1,101).limit(10); 
		b.forEach(s -> System.out.print(s + ","));
		System.out.println("\n"); 
		
		List<Car> cars = new ArrayList<>(); 
		cars.add(new Car("소나타", 400));
		cars.add(new Car("그렌져", 500)); 
		cars.add(new Car("산타페", 600));
		cars.add(new Car("산타페", 600)); 
		cars.add(new Car("펠리세이드", 600)); 
		cars.add(new Car("제네시스", 700)); 
		cars.add(new Car("에쿠스", 800)); 
		
		//3
		System.out.println("<스트림으로 변환>"); 
		cars.stream().filter(s -> s.getPrice() > 500).forEach(System.out::print);
		System.out.println("\n"); 
		//4 
		System.out.println("<중복제거>"); 
		cars
			.stream()
			.distinct() // 이때 equals 와 hashCode 메소드를 오버라이딩 하지 않는다면 주소를 가지고 중복처리한다. 
			.forEach(s -> System.out.println(s+ ","));
		System.out.println("\n"); 
		//5
		
		System.out.println("3출력"); 
		cars
			.stream()
			.map(s -> s.getPrice())
			.limit(3)
			.forEach(s -> System.out.println(s + ","));
		System.out.println("\n"); 
		//6
		cars
			.stream()
			.flatMap(s -> Arrays.asList(s.getName().split("")).stream())
			.forEach(System.out::print);
		System.out.println("\n"); 
		//7
		
		
		System.out.println("차량을 입력하세요") ; 
		String targetName = "소나타"	; 
		cars
			.stream()
			.filter(s -> s.getName().equals(targetName))
			.forEach(System.out::print);
	}
}

class Car {
	private int price; 
	private String name;
	
	public Car(String name, int price) {
		this.price = price; 
		this.name = name; 
	}
	public int getPrice() {
		return price; 
	}
	public String getName() {
		return name; 
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, price); 
	}
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Car)) {
			return false; 
		}
		Car c = (Car)o; 
		return price == c.getPrice() && name.equals(c.getName()); 
	}
	
	@Override 
	public String toString() {
		return "모델명: " + name + ", 가격: " + price; 
	}
	
}