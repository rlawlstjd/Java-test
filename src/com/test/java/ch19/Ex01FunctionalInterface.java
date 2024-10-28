package com.test.java.ch19;

import java.time.LocalDateTime;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.IntToLongFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class Ex01FunctionalInterface {
	public static void main (String[] args) {
		System.out.println("< 익명클래스 >"); 
		Supplier<Integer> as = new Supplier<Integer>() {
			@Override
			public Integer get() {
				return (int)(Math.random()*10); // 0~9 까지의 랜덤한 숫자.
			}	
		};
		System.out.println(as.get()); 
		
		System.out.println("< Supplier >"); 
		Supplier<Integer> s = () -> (int)(Math.random()*10); 
		System.out.println(s.get());
		System.out.println(); 
		
		System.out.println("< Consumer >");
		Consumer<Integer> c = i -> System.out.println(i); 
		c.accept(7);
		System.out.println(); 

		System.out.println("< Function >");
		Function<Integer, Double> f = i -> i/2.0; 
		System.out.println(f.apply(5)); 
		System.out.println(); 
		
		System.out.println("< Predicate >");
		Predicate<Integer> p = i -> i == 22;
		System.out.println(p.test(15));
		Predicate<Integer> p2 = i -> i < 10; 
		Predicate<Integer> p3 = i -> i < 20; 
		Predicate<Integer> p4 = p.or(p2.negate().and(p3));  // negate()조건을 반대로 뒤집어 줌.
		System.out.println(p4.test(19)); 
		Predicate<String> p5 = Predicate.isEqual("ok");
		System.out.println(p5.test("ok"));
		System.out.println();
		
		System.out.println("< UnartOperator >");
		UnaryOperator<Integer> u = i -> i*10;
		System.out.println(u.apply(7));
		System.out.println(u.apply(10));
		System.out.println();
		
		System.out.println("< BiConsumer >");
		BiConsumer<String, Integer> bc = (str, i) -> System.out.println(str + ": " + i);
		bc.accept("A", 7);
		BiConsumer<String, Integer> bc2 = (str, i) -> System.out.println(str + "*10: " + (i * 10));
		bc.andThen(bc2).accept("A", 8);
		System.out.println(); 
		
		System.out.println("< BiFunction >");
		BiFunction<Integer, Integer, Double> bf = (i1, i2) -> i1/(double)i2;
		System.out.println(bf.apply(5,  2));
		System.out.println(); 
		
		BiFunction<Integer, Integer, Long> bf1 = (i1, i2) -> i1 * (long)i2;
		System.out.println(bf1.apply(55555, 555555)); 
		System.out.println(); 
		
		System.out.println("< IntSupplier >");
		IntSupplier is = () -> (int)(Math.random()*20);
		System.out.println(is.getAsInt()); 
		System.out.println(); 
		
		System.out.println("< IntToLongFunction >");
		IntToLongFunction it = i -> i * 10000000000000L; 
		System.out.println(it.applyAsLong(7));
		System.out.println(); 
		
		System.out.println("< BooleanSupplier >");
		boolean bool = true; 
		BooleanSupplier bs = () -> !!!!!!!!!!!!!!!bool; 
		System.out.println(bs.getAsBoolean());
		System.out.println(); 
		
		System.out.println("< ObjIntConsumer >");
		ObjIntConsumer<LocalDateTime> oi = (time, i) -> System.out.println(time.plusYears(i));
		oi.accept(LocalDateTime.now(), 5);
		System.out.println(); 
	
		System.out.println("< ToIntFunction >");
		ToIntFunction<String> tif = str -> Integer.parseInt(str); 
		System.out.println(tif.applyAsInt("777") + 10); 
		System.out.println(); 
		
		System.out.println("< ToDoubleFunction >"); 
		ToDoubleFunction<String> tdf = i -> Double.parseDouble(i); // parse는 String타입만을 인수로 받는다. 
		System.out.println(tdf.applyAsDouble("77.24"));		
		
		
		
	}
}
