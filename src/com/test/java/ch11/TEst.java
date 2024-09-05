package com.test.java.ch11;

public class TEst {
	public static void main(String[] args) {
		Weather todayWeather = Weather.SUNNY;
				
		System.out.println("오늘 날씨는 " + todayWeather);
		
				
		Day toDay = Day.FRIDAY; 
		
		System.out.println("오늘의 요일은 " + toDay); 
		
	}
}
enum Weather {
	SUNNY, CLOUDY, RAINY
}

enum Day {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
