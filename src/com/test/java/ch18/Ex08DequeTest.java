package com.test.java.ch18;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

public class Ex08DequeTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("메세지를 입력하세요. (종료하시려면 quit를 입력하세요)");
			String content = s.nextLine();
			if (content.equalsIgnoreCase("quit")){
				break;
			} else {
				Notice1.addNotice(content);
				System.out.println("저장되었습니다.");
			}
		}
		
		Notice1.printNotices();
		
		System.out.println(); 
		
		Notice1.last3Notice();
		
	}
}

class Notice1{
	public static Deque<String> notices = new ArrayDeque<>();
	
	public static void addNotice (String n) {
		notices.offer(n);
	}
	
	public static void printNotices () {
		for (Iterator<String> it = notices.iterator(); it.hasNext();) {
			String n = it.next();
			System.out.println(n); 
		}
	}
	
	public static void last3Notice() {
		int num =1; 
		while(num++ <= 3) {
			String n = notices.pollLast();
			System.out.println(n); 
		}
	}
}


/*
문제 1.
반복문을 이용해 사용자가 입력한 메세지들을 저장하세요. 
마지막으로 입력한 메세지 세개만 화면에 출력되도록 코딩하세요.
quit가 입력되면 반복문은 종료되어야 합니다.
*/
