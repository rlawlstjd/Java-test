package com.test.test;

import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		while (true) {
			User user = null; 
		
			user = loginService.form();
			loginService.login(user);
			
			if (user.isLogin()) {
				loginService.success(user);
				break; 
			}
			System.out.println("로그인에 실패하였습니다.");
		}
		
		System.out.println("1: 회원정보");
		System.out.println("2: 커뮤니티");
		System.out.println("3: 쇼핑");
	}
}
class loginService{
	private static final String DB_ID= "admin";
	private static final String DB_PW= "1234";
	private static final int count = 0 ; 
	
	public static User form() {
		User user = new User();
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("-로그인 화면-"); 
		System.out.println("아이디를 입력하세요.");
		user.setId(scan.nextLine());
		System.out.println("비밀번호를 입력하세요.");
		user.setPassword(scan.nextLine());
		
		return user; 
	}
	
	public static void success(User user) {
		
		System.out.println(user.getId() +"님 안녕하세요.");
	}
	
	public static void login(User user) {
		
		try {
			if(!DB_ID.equals(user.getId())) {
				throw new IDMismatchException("아이디를 잘못 입력하셨습니다.");
				
			} else if (!DB_PW.equals(user.getPassword())) {
				throw new PasswordMismatchException("비밀번호를 잘못 입력하셨숩나다.");
			
			} else {
				user.setLogin(true);
			}
			
		} catch (IDMismatchException e) {
			System.out.println(e.getMessage());
			System.out.println("아이디를 잊어버리셨나요?");
		
		} catch (PasswordMismatchException e) {
			System.out.println(e.getMessage());
			System.out.println("비밀번호를 잊어버리셨나요?");	
		} 
	}
}

class User {
	private String id;
	private String password; 
	private boolean login; 
	
	public void setId(String id) {
		this.id = id; 
	}
	
	public String getId () {
		return id; 
	}
	
	public void setPassword(String password) {
		this.password = password; 
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setLogin(boolean login) {
		this.login = login ;
	}
	
	public boolean isLogin() {
		return login;
	}
	
}

class IDMismatchException extends Exception{
	public IDMismatchException (String message) {
		super(message);
	}
}
class PasswordMismatchException extends Exception{
	public PasswordMismatchException (String message) {
		super(message);
	}
}

/*
문제 1.
book.setFontColor("블랙") 코드에서 컴파일 오류가 나지 않도록 수정해 주세요.

문제 2.
Book의 자식 클래스인 AudioBook 클래스를 추가해 주세요.
업캐스팅을 이용해 AudioBook 클래스의 특정 메소드를 호출하는 코드를 작성하세요. 
*/