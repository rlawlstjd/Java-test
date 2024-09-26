package com.test.java.ch07;

import java.util.Scanner;

public class Ex03MethodTest {
	public static void main(String[] args) {	
		Cacu c = new Cacu() ;
		
		c.add(2,4);
		System.out.println(c.getResult());
		c.add(1,3);
		System.out.println(c.getResult());
		System.out.println();
		
		c.sub(3,1);
		System.out.println(c.getResult());
		c.sub(5,2);
		System.out.println(c.getResult());
		System.out.println();
		
		c.div(6,2,3);
		System.out.println(c.getResult());
		System.out.println();
		
		c.multi(2,2);
		System.out.println(c.getResult());
		c.multi(3,4);
		System.out.println(c.getResult());

		System.out.println();
		
	
	}
}
class Cacu {
	int result ;
	
	public void div (int ...is) {
		if (is.length>0) {
			result = is[0]; 
			for (int i=1; i<is.length; i++) {
				result /= is[i];
			}
		}
	}
	
	public void multi (int...is) {
		result = 1 ; 
		for (int num : is) {
			result *= num;
		}
	}
	
	
	public void sub (int...is) {
		if(is.length>0) {
			result = is[0];
			for (int i=1; i < is.length; i++) {
				result -= is[i];
			}
		}
	}

	
	public void add (int...is) {
		result = 0 ; 
		for (int num : is) {
			result += num;
		}
	}
	
	public int getResult() {
		return result;
	}
}
/*
문제 1.
계산기 클래스를 만들고 더하기, 빼기, 곱하기, 나누기 메소드를 작성한 뒤 메소드를 이용하여 결과를 출력하세요.  
*/
