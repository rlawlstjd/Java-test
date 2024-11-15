package com.test.java.ch21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex01ByteStreamsTest {
	public static void main(String[] args) {
		try ( 
				FileInputStream in = new FileInputStream("./src/com/test/java/ch21/benson.txt");
				FileOutputStream out = new FileOutputStream("./src/com/test/java/ch21/difbenson.txt");
			){
				int c; 
				while ((c = in.read()) != -1) {
					out.write(c);
				}
				System.out.println("< try with >");
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(); 
		
		
	}
}
/*
문제 1.
임의의 내용이 입력된 hello.txt파일을 생성하세요.
hello.txt파일의 내용을 복사하는 코드를 작성하세요.
*/