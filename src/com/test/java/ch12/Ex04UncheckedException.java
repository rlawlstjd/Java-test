package com.test.java.ch12;

import java.io.File;
import java.io.IOException;

public class Ex04UncheckedException {

public static void main(String[] args) {
		
		File f = new File("./src/com/lcomputerstudy/books/java/ch12/hello.txt");
		
		//f.createNewFile();	// Checked Exception
		
		int[] arr = {3, 7, 5};
		System.out.println(arr[5]);		// Unchecked Exception

	}

}