package com.test.main;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

import javax.swing.plaf.SliderUI;
import java.util.concurrent.ConcurrentLinkedQueue; 

public class Test {
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