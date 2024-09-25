package com.test.java.ch06;

import java.util.Scanner;

public class Ex07While {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in) ; 
		boolean isConnected = true ; 
		int channel = 0 ; 
		int code = 0 ; 
		
		while (isConnected) {
			System.out.println("명령어를 입력해 주세요.\n(Help ->1:전원켬, 2:채널+1, 3:채널-1, -1:종료):");
			code = scan.nextInt();
			
			if (code ==-1) {
				System.out.println("프로그램을 종료합니다.");
				isConnected = false; 
			}else if (code ==1) {
				System.out.println("티비를 켭니다.");
			}else if (code ==2) {
				channel++;
				System.out.println("채널을 1증가 시킵니다. 현재 채널은 " + channel + "입니다.");
			}else if (code ==3) {
				channel --; 
				System.out.println("채널을 1감소 시킵니다. 현재 채널은 " + channel + "입니다. "); 
			}else {
				System.out.printf("잘못된 명령어를 입력하였습니다.%n", code);
			}
			
		}
	}
}
