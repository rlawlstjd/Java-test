package com.test.main;

import java.util.Arrays;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;
import java.util.Objects; 

public class Test {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance(); 
		
		int year = now.get(Calendar.YEAR); 
		System.out.println(year);
		
		int month = now.get(Calendar.MONTH) +1 ; 
		System.out.println(month);
		
		int day = now.get(Calendar.DATE); 
		System.out.println(day);
		
		int hour12 = now.get(Calendar.HOUR);
		System.out.println(hour12);
		
		int hour24 = now.get(Calendar.HOUR_OF_DAY); 
		System.out.println(hour24);
		
		int minute = now.get(Calendar.MINUTE);
		System.out.println(minute);
		
		int second = now.get(Calendar.SECOND); 
		System.out.println(second);
		
		int millisecond = now.get(Calendar.MILLISECOND);
		System.out.println(millisecond);
		
		int ampm = now.get(Calendar.AM_PM);
		String strAmpm = ampm == 0 ? "AM" : "PM"; 
		System.out.println(ampm + ", " + strAmpm);
		
		String[] strDayOfWeek = {"", "일", "월", "화", "수", "목", "금", "토"}; 
		int dayOfWeek = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(dayOfWeek + ", " + strDayOfWeek[dayOfWeek]);
		
		String strDateTime = year + "-" + month + "-" + day + " " + hour12 + ":" + minute + ":" + second + "." + millisecond
				+ " " + strAmpm + " " + strDayOfWeek[dayOfWeek] + "요일";
		
		System.out.println(strDateTime);
		System.out.println(); 
		
		Calendar start = Calendar.getInstance(); 
		Calendar end = Calendar.getInstance(); 
		end.set(2030, 9, 7, 0, 0, 0);
		System.out.println(start.getTime());
		System.out.println(end.getTime());
		
		long diffMilli = end.getTimeInMillis() - start.getTimeInMillis(); 
		System.out.println(diffMilli + " 밀리초"); 
		long diffSecond = diffMilli / (1000) ; 
		System.out.println(diffSecond + " 초"); 
		long diffMinute = diffMilli / (60 * 1000); 
		System.out.println(diffMinute + " 분");
		long diffHour = diffMilli / (60 * 60 * 1000); 
		System.out.println(diffHour + " 시간"); 
		long diffDay = diffMilli / (24 * 60 * 60 * 1000 ); 
		System.out.println(diffDay + "일");
		long diffYear = diffMilli / (365L * 24 * 60 * 60 * 1000); 
		System.out.println(diffYear + "년"); 
		System.out.println(); 
		
		System.out.print(diffDay / 365 + " 년 "); 
		System.out.println(diffDay % 365 + " 일 차이"); 
		System.out.println(); 
		
		Calendar today = Calendar.getInstance(); 
		System.out.println(today.getTime().toString()); 
		
		today.add(Calendar.DATE, 1); 
		System.out.println(today.getTime().toString()); 
		
		today.add(Calendar.DATE,  -1); 
		System.out.println(today.getTime().toString()); 
		
		today.set(Calendar.DATE, 22) ; 
		System.out.println(today.getTime().toString()); 
		
	}
}