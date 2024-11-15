package com.test.java.ch20;

/**
 * JavaDoc Class 
 * <Br>
 * Copyright 2022, 김진성 <kjih1999@naver.com> All right reserved.
 * @author 김진성 
 * @version 2.0
 * @since 2024.11.13
 * 
 */
public class Ex02JavaDocTest {
	private String title; 
	private String description; 
	
	/**
	 * 
	 * @return 자바 문서 제목 리턴
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 제목 설정 
	 * 
	 * @param title 자바 문서 제목
	 * @deprecated 구버전이므로 사용 금지 
	 */
	@Deprecated
	public void setTitle(String title) {
		this.title = title; 
	}
	
	/**
	 * 제목 , 설명을 동시에 설정 
	 * 
	 * @param title 자바 문서 제목
	 * @param description 자바 문서 설명 
	 */
	public void setTitle(String title, String description) {
		this.title = title;
		this.description = description;
	}
	public String getDescription() {
		return description; 
	}
	public void setDescription(String description) {
		this.description = description; 
	}
	
	@Override 
	public String toString() {
		return "Ex02JavaDoc [title=" + title + ", description=" + description + "]";
	}
	
	@TestAnnotation("abc")
	public static void printVersion() {
		System.out.println("v1.0");
	}
	
}
/*
문제 1.
클래스를 만들고 javadoc을 이용해 api document를 생성하세요.
*/
