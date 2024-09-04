package com.test.java.ch10;

public class Ex01InnerClassTest1 {
	public static void main(String[] args) {
		House house = new House(); 
		House.Room room = house.new Room("504호");
		
		room.displayInfo();
	
	
	}
}
class House {
	private String address = "달성군";
	
	class Room {
		private String name; 
		
		public Room(String name) {
			this.name = name;
		}
		
		void displayInfo() {
			System.out.println("House Address: " + address);
			System.out.println("Room name: " + name);
		}
	}
	
}


/*
문제 1.
이너 클래스를 사용한 예제를 작성하세요.


*/