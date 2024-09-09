package com.test.java.ch11;

import java.util.Scanner;

public class Ex01EnumTest {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		
		System.out.println("원하는 책의 장르를 선택하세요\n");
		System.out.println("1: 소설\n2: 공포\n3: 에세이\n");
		Book b = Book.values()[s.nextInt()-1];
		
		switch (b) {
			case FICTION:
				System.out.println("선택한 책의 장르는 " + b + "이며 " + b + "의 대표적인 책에는");
				for (Fiction f : Fiction.values()) {
					System.out.println(f);
				}
				break;
			case HORROR: 
				System.out.println("선택한 책의 장르는 " + b + "이며 " + b + "의 대표적인 책에는");
				for (Horror h : Horror.values()) {
					System.out.println(h);
				}
				break;
			case ESSAY:
				System.out.println("선택한 책의 장르는 " + b + "이며 " + b + "의 대표적인 책에는");
				for (Essay e : Essay.values()) {
				System.out.println(e);
				}
				break;
		}
	}
}

enum Book {
	FICTION, HORROR, ESSAY
}

enum Horror {
	DRACULA, IT
}

enum Fiction {
	MOBY_DICK, TO_KILL_A_MOCKINGBIRD
}

enum Essay {
	THE_GREAT_GATSBY, SELF_RELIANCE
}


/*
문제 1.
enum 과 switch 문을 사용한 예제를 작성하세요.
*/
