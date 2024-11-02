package com.test.main;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.*;

public class Test {
	public static void main(String[] args) {
		System.out.println("< 메서드 참조 >");
		Function<String, Integer> f1 = str -> Integer.parseInt(str); // String으로 받아서 Integer로 반환.
		System.out.println(f1.apply("777")); 
		
		Function<String, Integer> f2 = Integer::parseInt; 
		System.out.println(f2.apply("666"));
		
		System.out.println("< 메서드 참조를 이용한 배열 생성 >"); 
		Function<Integer, int[]> f3 = s -> new int [s];
		System.out.println(Arrays.toString(f3.apply(3)));
		
		Function<Integer, int[]> f4 = int[]::new ; 
		System.out.println(Arrays.toString(f4.apply(4)));
	
		
	
	
	
	}
}