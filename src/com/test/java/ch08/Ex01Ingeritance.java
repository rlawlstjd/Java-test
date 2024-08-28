package com.test.java.ch08;

public class Ex01Ingeritance {
	public static void main(String[] args) {
		Book book = new Book () ; 
		book.price = 50000 ; 
		System.out.println("책의 가격은(세금포함): " + book.getPrice()); 
		//book.printDevices(); 
		//book.printSize(); 
		
		EBook eBook = new EBook () ; 
		eBook.price = 30000 ; 
		System.out.println("책의 가격은(세금포함): " + eBook.getPrice());
		String[] devices = {"아이패드", "킨들", "갤탭"}; 
		eBook.supportDevices = devices; 
		eBook.printDevices(); 
		//eBook.printSize(); 
		
		System.out.println(); 
		
		PaperBook qBook  = new PaperBook(150,200); 
		qBook.price = 40000 ; 
		System.out.println("종이책의 가격은(세금포함)" + qBook.getPrice());
		qBook.printSize(); 
		
	
	
	
	}
}
class Book {
	String title ; 
	String	author ; 
	int price  ; 
	
	int getPrice () {
		int taxPrice = (int)(price*1.1); 
		return taxPrice;
	}
}

class EBook extends Book {
	String[] supportDevices; 
	
	void printDevices() {
		System.out.println("호환기기 목록"); 
		for (int i=0; i<supportDevices.length; i++) {
			System.out.println("기기" + (i+1) + ":" + supportDevices[i]);
			
		}
	}
}

class PaperBook extends Book {
	int width; 
	int height ; 
	
	PaperBook(int width, int height){
		this.width  = width; 
		this.height = height ;
	}
	
	void printSize () {
		System.out.println("가로길이: " + width + "mm, 세로길이" + height + "mm");
	}
}