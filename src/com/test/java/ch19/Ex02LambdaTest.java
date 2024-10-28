package com.test.java.ch19;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class Ex02LambdaTest {
	public static void main(String[] args) {
		Map<String, User1> allUsers = UserService1.getUserMap(); 
		Map<String, User1> condUser = null; 
		
		condUser = UserService1.search(allUsers, level -> level.getLevel() >= 2); 
		UserService1.print(condUser);
	}
}

class UserService1 {
	private static Map<String, User1> userMap; 
	
	static {
			userMap = new HashMap<>(); 
			UserService1.add("admin", new User1("admin", 27, 1)); 
			UserService1.add("test1", new User1("test1", 30, 1)); 
			UserService1.add("test2", new User1("test2", 22, 2)); 
			UserService1.add("test3", new User1("test3", 19, 2)); 
			UserService1.add("test4", new User1("test4", 35, 2)); 
	}
	
	public static void print(Map<String, User1> users) {
		for (Map.Entry<String, User1> e : users.entrySet()) {
			System.out.println(e.getValue()); 
		}
	}
	
	public static Map<String, User1> search (Map<String, User1> users, Predicate<User1> c){
		Map<String, User1> userMap = new HashMap<>(); 
		for (Map.Entry<String, User1> e : users.entrySet()) {
			if (c.test(e.getValue())) {
				userMap.put(e.getKey(), e.getValue()); 
			}
		}
		return userMap; 
	}
	
	public static void add(String id, User1 user) {
		userMap.put(id, user); 
	}
	
	public static Map<String, User1> getUserMap(){
		return userMap; 
	}
}

class User1 {
	private String id; 
	private int age; 
	private int level; 
	
	User1(String id, int age, int level){
		this.id = id; 
		this.age = age; 
		this.level = level; 
	}
	public String getId() {
		return id; 
	}
	public int getAge() {
		return age;
	}
	public int getLevel() {
		return level;
	}
	
	@Override
	public String toString() {
		return "id: " + id + ", age: " + age + ", level: " + level; 
	}
	
	
}
/*
문제 1.
회원에 레벨 속성을 추가하고 레벨이 2이상인 회원만 출력하는 코드를 람다식을 사용하여 코딩하세요. v  
*/