package test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Test4 {
	public static void main(String[] args) {
		try (
				ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("src/test/benson.txt")));
		){
			Car1 c1 = new Car1("소나타"); 
			Car1 c2 = new Car1("그랜져"); 
			Car1 c3 = new Car1("제네시스"); 
			Car1 c4 = new Car1("에쿠스"); 
			Park p = new Park(); 
			p.addCar(c1);
			p.addCar(c2); 
			p.addCar(c3); 
			p.addCar(c4); 
			out.writeObject(p); 
			System.out.println("🚗 주차장 상태가 파일에 저장되었습니다."); 
		} catch (IOException e) {
			e.printStackTrace(); 
		}
		
		try (
				ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("src/test/benson.txt"))); 
		){
			Park p = (Park)in.readObject(); // 객체읽기 
			System.out.println("📄 저장된 주차장 상태 출력:"); 
			p.print(); 
		} catch (IOException e) {
			e.printStackTrace(); 
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); 
		}

	}
}


class Car1 implements Serializable {
	private static final long serialVersionUID = 1L; 
	private String name; 
	
	public Car1 (String name) {
		this.name = name; 
	}
	public void setName(String name) {
		this.name = name; 
	}
	public String getName() {
		return name; 
	}
}
class Park implements Serializable {
	private static final long serialVersionUID = 1L; 
	private List<Car1> cars; 
	
	public Park() {
		cars = new ArrayList<Car1>(); 
	}
	
	public void addCar(Car1 car) {
		cars.add(car); 
	}
	public List<Car1> getCars(){
		return cars; 
	}
	public void print() {
		System.out.println(cars); 
	}
}


