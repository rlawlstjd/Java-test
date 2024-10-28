package com.test.java.ch19;

import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.Supplier;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;

public class Ex01FunctionalInterfaceTest {
	public static void main(String[] args) {
		System.out.println("< BiPredicate >");   
		/*
		추상 메소드  -test(); 
		디폴트 메소드 - and(), negate(), or()
		*/
		BiPredicate<Integer, Integer> bp = (b1, b2) -> (b1 + b2) <= 100 ? true : false;
		System.out.println(bp.test(50, 50)); 
		
		System.out.println("50과 30을 전달: " + bp.and((b1,b2) -> (b1 + b2) < 150 ? true : false)
		.test(50, 30));  // and (&&) 연산 적용. 
		
		System.out.println("40과 20을 전달: " + bp.or((b1,b2) -> (b1+b2) == 60 ).test(40, 20));
		// or (||) 연산자 적용. 
		
		System.out.println(bp.negate().test(50, 55)); // negate()( <= ) -> ( > ) 
		System.out.println(); 
		
		
		System.out.println("< BinaryOperator >"); // 두 인수를 받아 계산하거나 조합, 같은 타입의 결과를 반할 때 .
		BinaryOperator<Integer> add = (a, b) ->  a + b; 
		System.out.println(add.apply(1, 5)); 
		
		BinaryOperator<String> concat = (str1, str2) -> (str1 + str2); 
		System.out.println(concat.apply("안녕" , "하세요")); 
		
		//최대값 최대값 최소값 비교 
		BinaryOperator<Integer> bo = BinaryOperator.maxBy(Comparator.naturalOrder()); 
		System.out.println(bo.apply(1111111, 22)); 
		
		BinaryOperator<Integer> bo1 = BinaryOperator.minBy(Comparator.naturalOrder()); 
		System.out.println(bo1.apply(111111,22)); 
		System.out.println(); 
	
		System.out.println("< IntConsumer >"); // int를 소비한다 . 노 리턴 
		IntConsumer printInt = i -> System.out.println("받은 값: " + i);
		printInt.accept(7);
		
		System.out.println("< IntFunction >"); // Int로 받은 값을 파라미터로 변환 
		IntFunction<String> a = i -> String.valueOf(i);
		System.out.println(a.apply(777));
		
		System.out.println("< IntPredicate >"); 
		IntPredicate b = num -> { return num > 50; } ; 
		System.out.println(b.test(30));
		
		System.out.println("< IntUnaryOperator >"); 
		IntUnaryOperator c = i -> Math.max(i, 3);
		System.out.println(c.applyAsInt(2));
		
		System.out.println("< IntBinaryOperator >"); 
		IntBinaryOperator d = (x, y) -> Math.max(x, y);
		System.out.println(d.applyAsInt(10, 200)); 
		
		System.out.println("< IntToDoublFunction >"); 
		IntToDoubleFunction e = i -> i / (double) 2; 
		System.out.println(e.applyAsDouble(5));
		
		System.out.println("< ToIntFunction<T >"); 
		ToIntFunction<String> f = i -> Integer.valueOf(i);
		System.out.println(f.applyAsInt("777")); 
		
		System.out.println("< ToIntFunction >"); 
		ToIntBiFunction<Double, Double> g = (x, y) -> (int)( x / y ); 
		System.out.println(g.applyAsInt(32222.2, 17.242)); 
	}
}


/*
문제 1.
BiPredicate = 두 개의 입력값을 받아 boolean 값을 반환하는 조건식이 필요할 때. 
BinaryOperator = * 두 인수를 받아 계산하거나 조합. 같은 타입의 결과를 반활할 때. 
IntConsumer = int 타입의 값을 파라미터로 받음. 
IntFunction<R> = int타입 값을 받고 r타입을 리턴.  
IntPredicate = int 타입의 값을 받고 boolean타입을 리턴. 
IntUnaryOperator = int 타입을 받고 p 타입을 리턴. 
IntBinaryOperator = int타입을 받고 int타입을 리턴 
IntToDoubleFunction = int 타입을 받고 double 타입을 리턴. 
ToIntFunction<T> = t값을 받고 p 타입을 리턴. 
ToIntBiFunction<T,U> = T,U 값을 받고 int 타입을 리턴.  

위 함수형 인터페이스들을 이용해 람다식을 작성하고 출력하세요. 
*/