package com.test.java.ch11;

public class TEst {
	public static void main(String[] args) {
		Weather todayWeather = Weather.SUNNY;
				
		System.out.println("오늘 날씨는 " + todayWeather);
		
		
		switch (todayWeather) {
			case SUNNY: 
				System.out.println("오늘 날씨는 맑아요!");
				break; 
			case CLOUDY: 
				System.out.println("오늘은 흐려요. 우산을 챙기면 좋겠습니다.");
				break;
			case RAINY: 
				System.out.println("오늘은 비가 와요. 우산을 꼭 챙기세요.");
				break;
		
		}
		
		
	}
}
enum Weather {
	SUNNY, CLOUDY, RAINY
}

enum Day {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
