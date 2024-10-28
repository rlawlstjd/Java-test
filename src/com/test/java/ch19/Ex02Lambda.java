package com.test.java.ch19;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class Ex02Lambda {
	public static void main(String[] args) {
		Map<String, User> allUsers = UserService.getUserMap(); 
		Map<String, User> condUser = null; 
		
		/*condUser = UserService.search(allUsers,  new Criteria() {
			@Override 
			public boolean where(User user) {
				return user.getAge() < 30 ; 
			}
		}); 
		UserService.printUsers(condUser);
		System.out.println(); 
		*/ 
		condUser = UserService.search(allUsers, u -> u.getAge() >25);
		UserService.printUsers(condUser);
		System.out.println(); 
		
		condUser = UserService.search(allUsers, u -> u.getId().startsWith("test")); 
		UserService.printUsers(condUser);
		System.out.println(); 
		
		
	}
}
/*@FunctionalInterface
interface Criteria {
	public abstract boolean where(User user); 
}*/

class UserService{
	private static Map<String, User> userMap; 
	
	static {
			userMap = new HashMap<>(); 
			UserService.add("admin", new User("admin", 27)); 
			UserService.add("test1", new User("test1", 30)); 
			UserService.add("test2", new User("test2", 22)); 
			UserService.add("test3", new User("test3", 19)); 
			UserService.add("test4", new User("test4",35)); 
	}
	
	public static Map<String, User> getUserMap(){
		return userMap; 
	}
	
	public static void add(String id, User user) {
		userMap.put(id, user);
	}
	
	public static Map<String, User> search(Map<String, User>users, Predicate<User> c){
		Map<String, User> condUsers = new HashMap<>(); 
		
		for (Map.Entry<String,User> entry : users.entrySet()) {
			if (c.test(entry.getValue())) {
				condUsers.put(entry.getKey(), entry.getValue());
			}
		}
		
		return condUsers; 
	}
	
	public static void printUsers(Map<String, User> users) {
		for (Map.Entry<String, User> entry : users.entrySet()) {
			System.out.println(entry.getValue()); 
		}
	}
}

class User{
	private String id; 
	private int age; 
	public User(String id, int age) {
		this.id = id; 
		this.age = age;
	}
	public String getId() {
		return id; 
	}
	public int getAge() {
		return age; 
	}
	@Override
	public String toString() {
		return "id" + id + ", age= " + age ; 
	}
}



