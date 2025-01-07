package com.test.java.ch18;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ex08DequeTest1 {
public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); 
		MessageService ms = new MessageService(); 
		boolean run = true; 
		
		while (run) {
			System.out.println("메세지를 입력하세요"); 
			String a = s.nextLine(); 
			if (a.equals("quit")) {
				run = false; 
				System.out.println("메세지를 종료합니다."); 
				break; 
			}
			ms.add(new Message(a));
		}
		
		ms.viewLastThree();
	
	}
}

class MessageService {
	private List<Message> messageList; 
	private Deque<Message> messageDeque; 
	
	public MessageService() {
		messageList = new LinkedList<>(); 
		messageDeque = new ArrayDeque<>(); 
	}
	
	public void add(Message m) {
		messageList.add(m); 
		messageDeque.push(m); 
		
	}
	public void viewLastThree() {
		for (int i=0; i<=2; i++) {
			System.out.println(messageDeque.pop());
		}
	}
	
	public void viewMessage() {
		for (Message m : messageList) {
			System.out.println(m); 
		}
	}
}

class Message{
	private String content; 
	
	public Message(String content) {
		this.content = content; 
	}
	
	public String getContent() {
		return content; 
	}
	
	@Override
	public String toString() {
		return "내용 : " + content; 
	}
}
/*
문제 1.
반복문을 이용해 사용자가 입력한 메세지들을 저장하세요. 
마지막으로 입력한 메세지 세개만 화면에 출력되도록 코딩하세요.
quit가 입력되면 반복문은 종료되어야 합니다.
*/