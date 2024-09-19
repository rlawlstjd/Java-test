package com.test.java.ch16;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.YEARS;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.MONTHS;
import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.HOURS;
import static java.time.temporal.ChronoUnit.MINUTES;
import static java.time.temporal.ChronoUnit.SECONDS;
import static java.time.temporal.ChronoUnit.MILLIS;
import static java.time.temporal.ChronoUnit.NANOS;

public class Ex03LocalDateTest {
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2000, 12, 1);
		LocalDate date2 = LocalDate.of(2000, 5, 6);
		
		Period p = date2.until(date1); 
		System.out.println(p.getYears() + "년" + p.getDays() + "일");
	
		System.out.println();
		
		
		
		Scanner scan = new Scanner(System.in);
		
		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy년MM월dd"); 
		DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		
		System.out.print("날짜를 입력하세요  yyyy년MM월dd퍁턴으로 입력하세요. "); 
		String inputDate = scan.nextLine(); 
		
		
		LocalDate date = LocalDate.parse(inputDate, inputFormatter);
		
		LocalDateTime dateTime = date.plusMonths(1).atStartOfDay();
		
		System.out.println("1개월 뒤 날짜: " + dateTime.format(outputFormatter));
	}
}

/*
 * 문제 1. 2000년 12월 1일 2020년 5월 6일 두 날짜 간의 차이를 계산하여 n년 n일과 같은 패턴으로 출력하세요.
 * 
 * 문제 2. yyyy년MM월dd 패턴으로 입력 받아 1개월 뒤의 날짜를 yyyy/MM/dd HH:mm:ss 패턴으로 출력하세요.
 */