package com.test.java.ch16;

import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class Ex02DateTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일"); 
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd"); 
		
		System.out.printf("yyyy년 MM월 dd 패턴으로 입력해 주세요."); 
		String today = scan.nextLine();
		Date inputDate = null ; 
		
		
		try {
			inputDate = sdf.parse(today); 
			System.out.printf("입력한 날짜: " + sdf.format(inputDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println(); 
		
		Calendar cal  = Calendar.getInstance();
		cal.setTime(inputDate);
		cal.add(Calendar.MONTH, 1);
		Date inputDate2= cal.getTime();
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd"); 
		System.out.println(sdf2.format(inputDate2));	
	}	//mm은 분 MM일 
}
/*
문제1.
yyyy년MM월dd 패턴으로 입력 받아 1개월 뒤의 날짜를 yyyy/MM/dd 패턴으로 출력하세요.
*/