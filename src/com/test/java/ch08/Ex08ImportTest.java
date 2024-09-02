package com.test.java.ch08;

import static java.lang.Math.*;
import com.test.java.ch07.Ex00000;

public class Ex08ImportTest {
	public static void main(String[] args) {
		floor(3.14);
		double sum = PI;
	//	float pi = (float)floor(PI);
		//System.out.println("pi의 정수 부분:" + (int)pi);
	
		Parasite p1 = new Parasite();
		
		Ex00000 e1 = new Ex00000();
		//com.test.java.ch08.Book3 b1 = new com.test.java.ch08.Book3(); 
	}
}
/*
문제 1.
Math.floor() 메소드를 사용하여 PI의 정수값만 출력하세요.
Math.floor() 메소드에 import static 을 적용하세요. 
*/