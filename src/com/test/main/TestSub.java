package com.test.main;

import java.security.KeyStore.Entry;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.IntToLongFunction;
import java.util.function.LongSupplier;
import java.util.function.ObjIntConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class TestSub {
	 public static void main(String[] args) {
		 System.out.println("< 익명클래스 >");
		 Supplier<Integer> as = new Supplier<Integer>() {
			 @Override 
			 public Integer get() {
				 return (int)(Math.random()*10); 
			 }
		 }; 
		 System.out.println(as.get());
		 
		 System.out.println("< Supplier >"); // Supplier - return만 get() 파라미터 없음 . 
		 Supplier<Integer> s = () -> (int)(Math.random()*10);
		 System.out.println(s.get());
		 System.out.println(); 
		 
		 System.out.println("< IntSupplier >"); 
		 IntSupplier is = () -> {
			 Random random = new Random(); 
			 return random.nextInt(10); 
		 }; 
		 System.out.println(is.getAsInt());
		 
		 System.out.println("< DoubleSupplier >"); 
		 IntSupplier is1 = () -> {
			return  (int)(Math.random()*1000); 
		 };
		 System.out.println(is1.getAsInt()); 
		 
		 System.out.println("< Consumer >");// Consumer - 파라미터만 있음. return 하지않음.
		 Consumer<Integer> c = i -> System.out.println(i);
		 c.accept(7);
		 System.out.println();
		 
		 System.out.println("< BiConsumer >"); 
		 BiConsumer<String, Integer> s1 = (name, num) -> System.out.println(name + ": "+ num); 
		 s1.accept("A", 7);
		 
		 System.out.println("< Function >"); // Supplier + Consumer =  Function
		 Function<Integer, Double> f = i -> i/2.0; // Integer을 받고 Double 타입으로 리턴
		 System.out.println(f.apply(5));
		 System.out.println(); 
		 
		 System.out.println("< ToIntFunction >");
		 ToIntFunction<String> a2 = str -> Integer.parseInt(str);
		 System.out.println(a2.applyAsInt("777"));
		 
		 System.out.println("< BiFunction >");
		 BiFunction<Integer, Integer, Double> bf = (i1, i2) -> i1/ (double)i2; 
		 System.out.println(bf.apply(5, 2)); 
		 System.out.println(); 
		 
		 System.out.println("< IntToLongFunction >"); 
		 IntToLongFunction it = i -> i*1000000000000L; 
		 System.out.println(it.applyAsLong(7));
		 System.out.println();
		 
		 System.out.println("< Predicate >"); 
		 Predicate<Integer> p = i -> i == 20 ; 
		 System.out.println(p.test(20));
		 Predicate<Integer> p2 = i -> i < 10 ; 
		 Predicate<Integer> p3 = i -> i < 20 ; 
		 Predicate<Integer> pr = p.or(p2.negate().and(p3)); // or = ||  and = &&  negate() 반대. 
		 System.out.println(pr.test(19));
		 Predicate<String> p5 = Predicate.isEqual("ok");
		 System.out.println(p5.test("ok"));
		 System.out.println(); 
		 
		 System.out.println("< UnaryOperator >"); 
		 UnaryOperator<Integer> u = i -> i*10;  //Integer 타입으로 받고 Integer타입으로 리턴 . 
		 System.out.println(u.apply(7));
		 System.out.println(); 
		 
		 System.out.println("< BooleanSupplier >"); 
		 boolean bool = true; 
		 BooleanSupplier b = () -> !bool; 
		 System.out.println(b.getAsBoolean());
		
		 System.out.println("< ObjIntConsumer >");
		 ObjIntConsumer<LocalDateTime> oi = (time, i) -> System.out.println(time.plusYears(i));
		 oi.accept(LocalDateTime.now(), 5); 
		 System.out.println(); 
		 
		
		 
	 }
}
