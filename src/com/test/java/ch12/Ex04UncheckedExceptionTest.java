package com.test.java.ch12;

import java.io.File;
import java.io.IOException;

public class Ex04UncheckedExceptionTest {
	public static void main(String[] args) {
	
		File f = new File("./src/com/test/java/ch12/hello.txt");
		
		
		try {
			f.createNewFile();	// Checked Exception // 미리 사전에 에러를 대비 
		
		} catch (IOException e) {
			e.printStackTrace();
		
		}
		
		
		
		int[] arr = {3, 7, 5};
		System.out.println(arr[5]);		// Unchecked Exception //사전에 별다른 조치 없어도 실행중에 에러 안뜸 .
	
	}
}
/*
문제 1.
f.createNewFile 의 주석을 제거합니다.
발생된 예외를 try catch 를 이용하여 처리하세요.
*/