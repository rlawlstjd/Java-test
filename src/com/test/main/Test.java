package com.test.main;

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
		/*Consumer -- 계열 
		 * P Consumer 
		 * Consumer <T>
		 * BiConsuemr <T,U> 
		 * 
		 * Predicate 계열 
		 * BiPredicate<T,U> 
		 * Predicate<T>
		 * 
		 * Operator 계열 
		 * UnaryOperator<T> 
		 * BinaryOperator<T>
		 * PUnaryOperator
		 * PBinaryOpertor
		 */
		
	Function<String, Integer> a = s -> Integer.parseInt(s);
	System.out.println(a.apply("333"));
	BiFunction<String, String, Integer> b = (i,j) -> Integer.parseInt(i) + Integer.parseInt(j);
	System.out.println(b.apply("524", "369")); 
	IntFunction<Double> c = i -> i/2.5; 
	System.out.println(c.apply(3));
	Function<String, Double> aa = s -> Double.parseDouble(s);
	IntToDoubleFunction is = i -> i/(double)3; 
	System.out.println(is.applyAsDouble(3325));
	ToIntFunction<String> d = s -> Integer.parseInt(s);
	System.out.println(d.applyAsInt("222"));
	ToDoubleBiFunction<Integer, Integer> f = (i,j) -> i/(double)j ; 
	System.out.println(f.applyAsDouble(1214, 234)); 
	}
}


/*
문제 1.
BiPredicate
BinaryOperator
IntConsumer
IntFunction
IntPredicate
IntUnaryOperator
IntBinaryOperator
IntToDoubleFunction
ToIntFunction
ToIntBiFunction

위 함수형 인터페이스들을 이용해 람다식을 작성하고 출력하세요. 
*/