package com.test.java.ch08;

import static java.lang.Math.*;

import java.util.Calendar;


public class Ex08ImportTest {
	public static void main(String[] args) {
		java.util.Date d = new java.util.Date();
		System.out.println(d.toString());
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.DATE));
		
		System.out.println(PI);
		System.out.println(((int)(random()*10000))+1000);
		System.out.println(round(3.14));
		System.out.println(floor(PI));
		
	
	}
}
/*
문제 1.
Math.floor() 메소드를 사용하여 PI의 정수값만 출력하세요.
Math.floor() 메소드에 import static 을 적용하세요. 
*/