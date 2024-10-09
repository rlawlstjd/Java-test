package com.test.java.ch12;

import java.util.Scanner;

public class Ex05Throw {
	public static void main(String[] args) {
		while (true) {
				User user = new User(); 
				
				user= LoginService.form(); 
				LoginService.login(user); 
				
				if (user.isLogin()) { //false?
						LoginService.success(user);
						break;
				}
		
		
				System.out.println("로그인에 실패하였습니다.\n");
		
		}
		
		System.out.println("1.회원정보"); 
		System.out.println("2.커뮤니티"); 
		System.out.println("3.쇼핑"); 
		System.out.println("4.로그아웃"); 
	}
}	

class LoginService {
		private static final String DB_ID = "admin"; 
		private static final String DB_PW = "1234"; 
		private static int count = 0 ; 
		
		public static void login (User user) {
				try {
						if (!DB_ID.equals(user.getId())) {
							throw new IDMismatchException("잘못된 아이디를 입력하였습니다.");  //throw 강제로 예외를 방생시키는 것
							
						} else if (!DB_PW.equals(user.getPassword())) {
							throw new PasswordMismatchException("잘못된 패스워드를 입력하였습니다.");
						
						} else {
							user.setLogin(true);
						}
							
				} catch (IDMismatchException e) {
					System.out.println(e.getMessage()); 
					System.out.println("아이디 찾기를 원하시면 클릭해 주세요.");
					
				} catch (PasswordMismatchException e) {
					System.out.println(e.getMessage()); 
					System.out.println("비밀번호 찾기를 원하시면 클릭해 주세요."); 
					
				} catch (Exception e ) {
					System.out.println("시스템 장애"); 
					
				} finally {
					increaseCount(); 
				}
		}
		
		public static User form() {
			Scanner scan = new Scanner(System.in);
			User user = new User ();
			
			System.out.println("=로그인 화면 ="); 
			System.out.print("아이디를 입력하세요:"); 
			user.setId(scan.nextLine()); 
			System.out.print("패스워드를 입력하세요:"); 
			user.setPassword(scan.nextLine()); 
			
			return user; 
		}
		
		public static void success (User user) {
			System.out.println(user.getId() + " 님 환영합니다.");  
		}
		
		public static void increaseCount() { // 클래스 이름과 ? 
			count++;
			System.out.println("로그인 시도" + count + "회"); 
		}
}


class User {
	private String id; 
	private String password; 
	private boolean login; 
	
	public String getId() {
		return id; 
	}
	
	public void setId(String id) {
		this.id = id; 
	}
	
	public String getPassword() {
		return password; 
	}
	
	public void setPassword(String password) {
		this.password = password; 
	}
	
	public boolean isLogin() {
		return login;
	}
	
	public void setLogin(boolean login) {
		this.login = login ;
	}
}

class IDMismatchException extends Exception {
	public IDMismatchException(String message) {
		super(message);  //?
	}
}

class PasswordMismatchException extends Exception {
	public PasswordMismatchException(String message) {
		super(message); 
	}
}