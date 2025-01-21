package test;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Test {
	public static void main(String[] args) {
		List<EBook> ebooks = new ArrayList<>();
		ebooks.add(new EBook("자바 기본문법", 50000, EBook.Category.LANG));
		ebooks.add(new EBook("자바 알고리즘", 30000, EBook.Category.APP));
		ebooks.add(new EBook("파이썬 기본문법", 35000, EBook.Category.LANG));
		ebooks.add(new EBook("파이썬 기본문법", 33000, EBook.Category.LANG));
		ebooks.add(new EBook("파이썬 기본문법", 33000, EBook.Category.LANG));
		ebooks.add(new EBook("리눅스", 40000, EBook.Category.APP));
		
		System.out.println("*** Collector ***"); 
		// Collectors는 Collector를 반환하는 메소들로 이루어진 클래스 
		System.out.println("< toList >"); 
		List<String> ebTitleList =  
					ebooks
							.stream()
							.filter(b -> b.getPrice() < 50000)
							.map(EBook::getTitle)
							.collect(Collectors.toList());  //캡슐화 (supplier, accumulator, combineer )
		System.out.println(ebTitleList); 
		System.out.println(); 
		// * .collect(Collector.toList());  . collect(Collectors.toSet()); 메소드를 활용해서 stream을  Set이나 List로 변환이 가능하다 
		// 즉, Collectors.toList 나 collectors.toSet 메소드는 collect의 파라미터 supplier, accumulator, combiner를 모두 리턴 
		System.out.println(ebTitleList); 
		System.out.println(); 
		
		System.out.println("< toSet >"); 
		Set<String> ebTitleSet = 
				ebooks
						.stream()
						.filter(b -> b.getPrice() < 50000)
						.map(EBook::getTitle)
						.collect(Collectors.toSet()); 
		System.out.println(ebTitleSet); 
		System.out.println(); 
		
		System.out.println("< groupingBy >"); 
		Map<EBook.Category, List<EBook>> ebMap = 
				ebooks
					.stream()
					.collect(Collectors.groupingBy(k -> k.getCategory())); // = EBook::getCategory
 	// *
		s
	
	
	}
}

class EBook {
    private String title;
    private int price;
    private Category category;

    enum Category {
        APP, LANG
    }

    public EBook(String title, int price, Category category) {
        this.title = title;
        this.price = price;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }
    public int getPrice() {
        return price;
    }
    public Category getCategory() {
        return category;
    }

    @Override
    public String toString(){
        return "제목: " + title + ", 가격: " + price + ", 카테고리: " + category;
    }
}