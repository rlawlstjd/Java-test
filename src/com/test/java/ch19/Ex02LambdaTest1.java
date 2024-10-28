package com.test.java.ch19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02LambdaTest1 {
	public static void main(String[] args) {
		List<Car> allCars = GateService.getCars();
		List<Car> condCars = null; 
		
		condCars = GateService.search(allCars, new CheckTime() {
			@Override 
			public boolean when(Car car) {
				return car.getTime() >= 5 && car.getTime() <= 9; 
			}
		});
		
		GateService.print(condCars);
		System.out.println(); 
		
		
	}
}

@FunctionalInterface
interface CheckTime {
	public abstract boolean when(Car car); 
}

class GateService {
	private static List<Car> cars;
	
	static {
			cars = new ArrayList<>(); 
			GateService.add(new Car("1822", 8));
			GateService.add(new Car("2884", 4));
			GateService.add(new Car("1946", 9));
			GateService.add(new Car("0587", 10));
			GateService.add(new Car("9472", 5));
	}
	
	public static void print (List<Car> car) {
		for (Iterator<Car> it = car.iterator(); it.hasNext();) {
			System.out.println(it.next()); 
		}
	}
	
	public static List<Car> search (List<Car> cars, CheckTime c){
		List<Car> fiveToNine = new ArrayList<>(); 
		
		for (Iterator<Car> it = cars.iterator(); it.hasNext();) {
			Car car = it.next(); 
			if (c.when(car)) {
				fiveToNine.add(car);
			}
		}
		return fiveToNine ; 
	}
	
	
	public static void add (Car car) {
		cars.add(car);
	}
	
	public static List<Car> getCars (){
		return cars;
	}
	
	
}

class Car {
	private String num ; 
	private int time;
	
	Car(String num, int time){
		this.num = num ; 
		this.time = time; 
	}
	public String getNum () {
		return num; 
	}
	public int getTime() {
		return time; 
	}
	
	public String toString() {
		return "차량번호: " + num + ", 입차시간: " + time; 
	}
}
/*
 * 문제 2.
차량 출입 시간이 5시에서 9시 사이인 차량만 출력하는 프로그램을 코딩하세요.
위 회원 검색 프로그램과 같이 함수형 인터페이스를 작성하고 람다식을 사용해야 합니다. 
 * 
*/

