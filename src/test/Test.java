package test;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Test {
	public static void main(String[] args) {
		List<Car> cars = new ArrayList<>(); 
		cars.add(new Car("소나타", 5000)); //
		cars.add(new Car("벤츠", 903300)); //
		cars.add(new Car("그렌져", 7000)); //
		cars.add(new Car("에쿠스", 7000)); //
		cars.add(new Car("에쿠스", 7000)); //
		cars.add(new Car("에쿠스", 7000)); //
		cars.add(new Car("에쿠스", 7000)); //
		
		List<Car> cars1 = new ArrayList<>(); 
		cars.add(new Car("링컨", 53000)); //
		cars.add(new Car("아우디", 83300)); 
		cars.add(new Car("페라리", 68000));  //
		cars.add(new Car("bmw", 9000)); //
		
		
		double avgCars = cars
			.stream()
			.mapToInt(Car::getPrice)
			.average()
			.getAsDouble(); 
		System.out.printf("%,.0f원", avgCars); 
		
		System.out.println("< max >"); 
		
		Car maxCar = 
				cars
					.stream()
					.reduce((a,b) -> a.getPrice() > b.getPrice() ? a : b)
					.get(); 
		System.out.println(maxCar); 
		System.out.println(); 
	
		long maxPrice = 
				cars
					.stream()
					.mapToInt(Car::getPrice)
					.max()
					.getAsInt(); 
		System.out.println(maxPrice); 
		System.out.println(); 
		
		
		int sumPriceTax = 
				cars
					.stream()
					.mapToInt(Car::getPrice)
					.reduce(0, (a, b) -> a + (int)(b * 1.1f));
		System.out.println("세금 합산금액: " +sumPriceTax); 
		
		Set<Car> priceSet2 = 
				cars 
					.parallelStream()
					.collect(
							() -> new HashSet<Car>(), 
							(set, i) -> set.add(i), 
							(set1, set2) -> set1.addAll(set2));
		System.out.println(priceSet2); 
		System.out.println(); 
	}
}
class Car {
	private String name; 
	private int price; 
	
	public Car (String name, int price) {
		this.name = name; 
		this.price = price; 
	}
	
	public String getName() {
		return name; 
	}
	public int getPrice() {
		return price; 
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
		
		Car car = (Car)o; 
		return price == car.price && name.equals(car.name); 
	}
	@Override
	public String toString() {
		return "모델명: " + name + ", 가격: " + price; 
	}
}