package com.test.java.ch02;

public class Ex01PrimitiveDataType {
	public static void main (String[]args) {
		System.out.println("정수형\n---"); 
		
		byte b = -128 ; 
		//b = 129 ; 
		
		System.out.printf("byte type 최솟값 = \t%d%n", b); 
		b = 127 ; 
		System.out.printf("byte type 최댓값 = \t%d%n", b); 
	   
		short s = -32768 ; 
		System.out.printf("short type 최솟값 = \t%d%n", s); 
		s = 32767 ; 
		System.out.printf("short type 최댓값 = \t%d%n", s); 
		
		int i = -2147483648 ; 
		System.out.printf("int type 최솟값 = \t%d%n", i ); 
		i = 2_147_483_647 ; 
		System.out.printf("int type 최댓값 = \t%d%n", i ); 
		
		long l = -9223372-36854775808l; 
		System.out.printf("int type 최솟값 = \t%d%n", l); 
		l = 9_223_372_036_854_775_807l; 
		System.out.printf("long type 최댓값 = \t%d%n", l ) ; 
		
		System.out.println("\n실수형\n---"); 
		
		float f = -31.999998f; 
		System.out.printf("float type 최솟값 = \t%d%n" ,f); 
		f = 31.9999998f; 
		System.out.printf("double type 최댓값 = \t%d%n", f); 
		
		double d = -127.99999999999999;
		System.out.printf("double type 최솟값 = \t%19.14f%n", d); 
		d = 127.99999999999999;
		System.out.printf("double type 최댓값 = \t%19.14f%n", d); 
		
		System.out.println("\n문자형\n---"); 
		
		
		char c =  0 ; 
		System.out.printf("char type 최솟값 = %c%n", c ) ; 
		c = 65535 ; 
		System.out.printf("char type 최댓값 = %c%n", c) ; 
		c= 65 ; 
		System.out.printf("char type 65 = %c%n", c) ; 
		c = 97 ; 
		System.out.printf("char type 97 = %c%n", c ) ; 
		c = 49 ; 
		System.out.printf("char type 49 = %c%n", c); 
		c = 'b' ; 
		System.out.printf("char type 'b' = %c%n" , c ) ; 
		//c = '' ; 
		
		
		
		
		
		


		
		
		
		
	}
}
