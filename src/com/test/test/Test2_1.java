package com.test.test;

import java.util.Scanner;

public class Test2_1 {
	public static void main(String[] args) {
		while (true) {
			User2 user = null ; 
			
			user = LoginService2.form();
			
			try {
				LoginService2.login(user);
	
			} catch (IDMismatchException2 e) {
				System.out.println(e.getMessage());
				System.out.println("아이디 찾기를 원하시면 클릭해 주세요");
			
			} catch (PasswordMismatchException2 e) {
				System.out.println(e.getMessage());
				System.out.println("비밀번호 찾기를 원하시면 클릭해 주세요.");
			
			} finally {
				LoginService2.increaseCount(); 
			}	
			
			if (user.isLogin()) {
				LoginService2.success(user);
				break;
			}
			
			System.out.println("로그인에 실패하였습니다.");
		}
		
		System.out.println("1. 회원정보");
		System.out.println("2, 커뮤니티");
		System.out.println("3. 쇼핑"); 
		System.out.println("4. 로그아웃");  
		
	}
}

class LoginService2 {
	private static final String DB_ID = "admin"; 
	private static final String DB_PW = "1234"; 
	private static int count = 0 ; 
	
	public static User2 form() {
		User2 user = new User2(); 
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("-로그인 화면-");
		System.out.println("아이디를 입력하세요."); 
		user.setId(scan.nextLine());
		System.out.println("비밀번호를 입력하세요.");
		user.setPassword(scan.nextLine());
		
		return user; 
	}
	
	public static void success(User2 user) {
		System.out.println(user.getId()+ "님 환영합니다.");
	}	
	
	public static void increaseCount() {
		count++; 
		System.out.println("로그인 시도 " + count + "회");
	}
	
	
	public static void login (User2 user) throws IDMismatchException2, PasswordMismatchException2{
		if(!DB_ID.equals(user.getId())) {
			throw new IDMismatchException2("잘못된 아이디를 입력하였습니다.");
			
		} else if (!DB_PW.equals(user.getPassword())) {
			throw new PasswordMismatchException2("잘못된 비밀번호를 입력하였습니다.");
			
		} else {
			user.setLogin(true);
		}
	}
}

class User2 {
	private String id; 
	private String password; 
	private boolean login; 
	
	public void setId(String id) {
		this.id= id; 
	}
	
	public String getId() {
		return id; 	
	}
	
	public void setPassword (String password) {
		this.password= password;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setLogin (boolean login) {
		this.login = login ;
	}
	
	public boolean isLogin () {
		return login;
	}
}

class IDMismatchException2 extends Exception {
	public IDMismatchException2(String message) {
		super(message);
	}
}

class PasswordMismatchException2 extends Exception {
	public PasswordMismatchException2 (String message) {
		super (message);
	}
}

/*AudioBook 클래스를 추가하세요.
카트에 오디오북을 담으세요.
카트의 리스트 출력 시 오디오북은 [오디오북]책제목의 형식으로 출력되도록 코딩하세요. 
*/