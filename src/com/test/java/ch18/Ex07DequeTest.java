package com.test.java.ch18;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;


public class Ex07DequeTest {
	public static void main(String[] args) {
		AlarmService alarm = new AlarmService();
		alarm.addAlarm(new Alarm("월", 1));
		alarm.addAlarm(new Alarm("화", 2));
		alarm.addAlarm(new Alarm("수", 3));
		alarm.addAlarm(new Alarm("목", 4));
		alarm.addAlarm(new Alarm("금", 5));
		
		alarm.checkAlarm(); 
		alarm.checkAlarm(); 
		alarm.checkAlarm(); 
		
		System.out.println();
		
		alarm.viewAlarm();
		
	}
}

class Alarm {
	private int time ; 
	private String date; 
	
	Alarm (String date, int time){
		this.date = date;
		this.time = time;
	}
	
	public String toString() {
		return date + "요일 " + time + "시"; 
	}
	
}

class AlarmService{
	private List<Alarm> listAlarm ;
	private Deque<Alarm> dequeAlarm ;
	
	AlarmService(){
		listAlarm = new LinkedList<>(); 
		dequeAlarm = new ArrayDeque<>(); 
	}
	
	public void addAlarm(Alarm a) {
		listAlarm.add(a);
		dequeAlarm.push(a);
	}
	
	public void viewAlarm() {
		for(Alarm alarm : listAlarm) {
			System.out.println(alarm);
		}
	}
	
	public void checkAlarm() {
		Alarm alarm = dequeAlarm.pop();
		System.out.println(alarm);
	}
}
/*문제 1.
스마트폰의 알림기능은 마지막 알림부터 확인할 수 있습니다.
알림 등록, 확인, 확인 시 제거 기능을 구현하세요.
*/