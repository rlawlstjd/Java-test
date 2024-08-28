package com.test.java.ch07;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04MethodTest {
	public static void main(String[] args) {
		/*Scanner scan  =  new Scanner (System.in);//        1번 문제 .1번 문제 .1번 문제 .
		
		BookTest book = new BookTest() ; 
		
		System.out.printf("가격을 설정하세요");
		int number = scan.nextInt();
		
		book.setPrice(number);

	
		BookTest book1 = new BookTest() ;  // 2번 문제 2번 문제 2번 문제 .
		book1.setPrice(25000);
		BookTest book2 = new BookTest() ; 
		book2.setPrice(30000); 
		
		System.out.println("\n\n");
		System.out.println(book1.price); 
		System.out.println(book2.price); 
	
	
		// 3번 문제 3번 문제 3번 문제. 
		
		Scanner scan1  =  new Scanner (System.in);
		int authorCount =  0 ; */
		
		BookTest book3 = new BookTest() ;  // 3번 문제 3번 문제 3번 문제. 
		String[] authors = {"김", "나", "박"};
		book3.setAuthor(authors);
		System.out.println(Arrays.toString(book3.author));
		
		
		authors[0] = "김2";
		authors[1] = "나2";
		authors[2] = "박2";
		BookTest book4 = new BookTest() ;
		book4.setAuthor(authors);
		System.out.println(Arrays.toString(book4.author));
		
		System.out.println("---");
		
		System.out.println(Arrays.toString(book3.author));
		
		
		
		/*book4.setAuthor("나얼");
		BookTest book5 = new BookTest() ;
		book5.setAuthor("박효신"); 
		Scanner scan11  =  new Scanner (System.in);
		String [] authorList = new String [3]; 
		for (int i = 0 ; i < authorList.length; i++) {
			System.out.printf("저자를 입력하세요: ", i+1);
			authorList[i]= scan11.nextLine();
		}
		
		
		for(int i=0 ; i <authorList.length; i++) {
			System.out.printf("저자의 목록은 %s", authorList[i]);
		
		}*/		
	}	
}

		
		
class BookTest {
	int price ; 
	String title ; 
	String[] author = new String[3];	// 60 
	
	//String[] name = 50;
	//String[] author = name;
	//author = 50;
	void setAuthor(String[] name) {
		for (int i=0; i<name.length; i++) {
			author[i] = name[i];	
		} 
	}
	
	void setPrice(int parameterPrice){
		if (parameterPrice >=10000 && parameterPrice <=80000) {
			System.out.printf("책의 가격은 %d입니다.",parameterPrice);
			price = parameterPrice ; 
		}else {
			System.out.printf("설정 가능하지 않은 가격입니다.%n%n%n");
		}
		

	}	
		/*void setTitle(String name){
			title = name; 
	}*/
	
}

/*
문제 1.
BookTest 클래스를 작성하세요.
가격을 저장하는 인스턴스 변수를 선언하세요.
책의 가격을 설정하는 메소드를 작성하세요.
책의 가격은 10000원 이상 80000원 미만으로만 설정가능해야 하며 그 외의 금액은 "설정 가능하지 않은 가격입니다." 를 출력하세요.

문제 2.
BookTest 클래스의 인스턴스를 두 개 생성하여 메소드를 사용하여 각각 금액을 설정하고 설정된 금액을 출력하세요.

문제 3.
BookTest 클래스에 책의 저자를 최대 3명까지 저장할 수 있는 배열을 선언하세요.
저자를 설정할 수 있는 메소드를 작성하세요.
힌트1) 메소드 파라미터로 배열 사용이 가능합니다.
힌트2) for문과 배열간의 대입을 활용하세요. 
*/