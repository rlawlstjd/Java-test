package test;

import java.io.IOException;
import java.rmi.server.Skeleton;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

import javax.swing.event.TreeSelectionListener;
public class Test {
	public static void main(String[] args) {
		System.out.println("< 메서드 참조 >"); 
		Function<String, Integer> f1 = str -> Integer.parseInt(str); 
		int i1 = f1.apply("77"); 
		System.out.println(i1); 
		
		Function<String, Integer> f2 = Integer::parseInt; 
		int i2 = f2.apply("78"); 
		System.out.println(i2); 
		System.out.println(); 
		
		System.out.println("< 메서드 참조를 이용한 배열 생성>"); 
		IntFunction<int[]> f3 = i -> new int[i]; 
		System.out.println(Arrays.toString(f3.apply(5))); 
		
		IntFunction<int[]> f4 = int[]::new; 
		System.out.println(Arrays.toString(f4.apply(5))); 
		System.out.println(); 
		
		Store store = new Store(); 
		String[] titles = {"자바문법", "자바컬렉션프레임워크", "람다", "스트림"}; 
		
		//static 메소드 호출 
		store.addAll(titles, Book::new, Book::validateLength); 
		// Book = new Booke() ; 
		Collections.sort(store.getItems(), Item::compareByTitleAsc);
		
		System.out.println("< '인스턴스::메소드' 방식으로 인스턴스 메소드 호출>"); 
		Runnable printItems = store::forEach; 
		printItems.run(); 
		System.out.println(); 
		
		System.out.println("< '클래스::메소드' 방식으로 인스턴스 메소드 호출 >"); 
		Consumer<Store> printItems2 = Store::forEach; 
		printItems2.accept(store);
		System.out.println(); 
		
		
		
		System.out.println("내림차순"); 
		Collections.sort(store.getItems(), Item::compareByTitleAsc );
		store.forEach();
		
	}
}

class Store {
	private List<Item> items = new ArrayList<>(); 
	
	public void addAll(String[] titles, Function<String, Item> createItem, Predicate<String> validateItem) {
		for (String title : titles) {
			if (validateItem.test(title)) {
				items.add(createItem.apply(title)); 
			}
		}
	}
	public List<Item> getItems(){
		return items; 
	}
	public void forEach() {
		for(Item item : items) {
			System.out.println("[title]" + item.getTitle()); 
		}
	}
}

interface Item {
	public abstract String getTitle(); 
	
	public static int compareByTitleAsc(Item item1, Item item2) {
		return item1.getTitle().compareTo(item2.getTitle()) * -1; 
		
	}
}

class Book implements Item{
	public static final int TITLE_MAX_LENGTH = 5; 
	private String title; 
	public Book(String title) {
		this.title = title; 
	}
	@Override
	public String getTitle() {
		return title; 
	}
	public static boolean validateLength(String title) {
		return title.length() <= TITLE_MAX_LENGTH; 
	}
	public static int compareByTitle(Book b1, Book b2) {
		return b1.getTitle().compareTo(b2.getTitle()); 
	}
}