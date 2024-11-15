package com.test.java.ch21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex02CharacterStreamsTest {
	public static void main(String[] args) {
		try (
				BufferedReader in  = new BufferedReader(new FileReader("./src/com/test/java/ch21/benson.txt")); 
				BufferedWriter out = new BufferedWriter(new FileWriter("./src/test/dif5"));
				) {
					String line ; 
					while ((line = in.readLine()) != null) {
						out.write(line);
						out.newLine();
					}
					System.out.println("버퍼를 이용해 텍스트 파일을 읽어오기"); 
				} catch (IOException e) {
					e.printStackTrace();
				}
		System.out.println(); 
		
	}
}
/*
문제 1.
문장들이 적힌 텍스트 파일을 생성하세요.
버퍼를 사용해 텍스트 파일을 읽어 들인 후 줄 번호와 함께 내용들을 출력하세요.
예) 
1. 안녕하세요.
2. Hello.
*/