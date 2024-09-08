package com.test.test;

public class Test3 {


	    public static void main(String[] args) {
	        Dog dog = new Dog(); // Dog 객체 생성
	        Animal animal = dog; // 업캐스팅: Dog 객체를 Animal 타입으로 변환
	        animal.makeSound(); // Animal 클래스의 메서드 호출
	    }
	
	
	
}
class Animal {
    public void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Woof!");
    }
}