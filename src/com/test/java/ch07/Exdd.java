package com.test.java.ch07;

public class Exdd {
	 public static void main(String[] args) {
	        int original = 10;
	        modifyValue(original);
	        System.out.println("Original Value: " + original); // 출력: 10
	    }

	    static void modifyValue(int value) {
	        value = 20;
	    }
}
/*
문제 1.
call by value 를 이용해 책의 금액을 수정하는 메소드를 작성하세요.
힌트) 수정된 금액을 return 하세요. 
*/