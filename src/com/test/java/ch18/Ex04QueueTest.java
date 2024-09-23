package com.test.java.ch18;

import java.util.LinkedList;
import java.util.Queue;

public class Ex04QueueTest {
	public static void main(String[] args) {
		NoticeManager noticemanager = new NoticeManager(); 
		noticemanager.registerNotice("내일 휴무");
		noticemanager.registerNotice("다음주 휴무");
		noticemanager.registerNotice("다음달 휴무");
		
		noticemanager.noticeList();
		
		noticemanager.removeOldestNotice();
		
		noticemanager.noticeList();
		
		
	
	}
}
enum Notice {
	REGISTER, LIST, REMOVE
}

class NoticeManager {
	public static Queue<String> notice = new LinkedList<>(); 

	
	public void registerNotice (String n) {
		notice.add(n);
		System.out.println("등록된 공지사항은 " + n + "입니다.");
	}
	
	public void noticeList () {
		for ( String list : notice) {
			System.out.println("- " + list);
		}
		
	} 
	
	public void removeOldestNotice() {
		String remove =notice.poll();
		System.out.println("삭제된 공지사항: " + remove);
		
	}

}
/*
문제 1.
공지사항 등록, 목록, 삭제 기능을 코딩하세요.
삭제 시 제일 오래된 공지사항을 삭제하세요.
공지사항의 등록, 목록, 삭제 상수는 enum을 사용하세요.
*/