package com.test.java.ch18;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Ex07DequeTest {
	public static void main(String[]args) {
		Alram alram = new Alram ();
		alram.addAlram(new AlramService(1,"10시"));
		alram.addAlram(new AlramService(2,"11시"));
		alram.addAlram(new AlramService(3,"12시"));
		alram.addAlram(new AlramService(4,"13시"));
		
		alram.prevAlram();
		alram.viewAlram();
		alram.prevAlram();
		alram.viewAlram();
		alram.prevAlram();
		alram.viewAlram();
	}
}

class Alram {
	private List<AlramService> alramList;
	private Deque<AlramService> alramStack;
	private int checkAlram ;
	
	Alram (){
		alramList = new LinkedList<>();
		alramStack = new ArrayDeque<>();
	}
	
	public void addAlram (AlramService t) {
		alramList.add(t);
		alramStack.push(alramList.get(checkAlram++));
	}
	
	public void prevAlram() {
		AlramService a = alramStack.pop();

	}
	
	public void viewAlram () {
		AlramService a = alramStack.peek();
		System.out.println(a.getAlamNo());
	}
}

class AlramService{
	private int AlramNo;
	private String alramTime;
	
	public int getAlamNo() {
		return AlramNo;
	}
	
	public String getAlramTime() {
		return alramTime;
	}
	
	AlramService(int n ,String t){
		this.AlramNo = n;
		this.alramTime = t;
	}
	

}
/*문제 1.
스마트폰의 알림기능은 마지막 알림부터 확인할 수 있습니다.
알림 등록, 확인, 확인 시 제거 기능을 구현하세요.
*/