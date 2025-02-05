package test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		// 디펙토리 = 폴더 // 같은 의미 // // 출력 = write // 파일생성 
		
		try (
				DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("src/test/benson.txt"))); 
				// FileOutput을 BufferedOutput에서 DataOutput으로 변환하는모습. 
				// DataOutputStream은 데이터를 타입별로 쓸 수 있게 한다. 
				){
			Book book = new Book("자바 I/O", 30000, 1.2, "테스트"); 
			out.writeUTF(book.getTitle());
			// DataOutputStream 클래스의 writeUTF메서드는 호출자의 경로에 아규먼트의 문자열 (String)을 작성(write)할 수 있다. 
			out.writeInt(book.getPrice()); 
			// writeInt메서드는 호출자의 경로에 아규먼트의 정수(Int)을 작성(write)할 수 있다. 
			out.writeDouble(book.getTax()); 
			// writeDouble 호출자의 경로에 아규먼트의 실수(Double)을 작성(write)할 수 있다. 
			out.writeUTF(book.getTitle2()); 
		} catch (IOException e) {
			e.printStackTrace(); 
		}
		
		try (
				DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("src/test/benson.txt"))); 
				// FileInput을 BufferedInput에서 DataInput으로 변환하는 모습 
				// DataInputStream은 데이터를 타입별로 읽을 수 있게 한다. 
				){
			
			String title = in.readUTF(); 
			int price = in.readInt(); 
			double tax = in.readDouble(); 
			String title2 = in.readUTF(); 
			/*
			 *  쓴 순서대로 읽어야 정상적으로 동작한다 (writeUTF, writeInt, writeDouble 순서대로 썻으면 읽는 순서도 동일하게 readUTF, readInt, readDoube)
			 *  그렇지 않을 시 오류 발생하거나 잘못 읽어옴
			 * int tmp = in.readint(); 
			 */
			Book book = new Book(title, price, tax, title2); 
			
			System.out.println(book); 
		} catch (EOFException e) { // EOFExcepction  순서오류 예외 
			System.out.println("읽는 순서가 잘모되었거나 더 이상 읽을 데이터가 없습니다."); 
		} catch (IOException e) {
			e.printStackTrace(); 
		}
		// DataInputStream이나 DataOutputStream은 무자열 및 기본혀을 대상으로만 입/ 출력 가능하다는 다넘이 있다. (객체단위로 사용 불가 )
		// 해당 단점을 보완하기 위한 클래스가 아래의 Object(in/out)putSTrema이다. 
		
		/// 저장이 어떤 방식으로 되는.. 예를 들면 writeUTF사용 시 스트림만 따로 저장된 후 writeInt 사용 시 스트링 옆에 int가 저장되는가 
		
		// Object(in/out)putStream은 기본형 뿐만 아니라 객체타입으로도 쓰거나 읽어올 수 있는 장점이 있다. 
		try(
				ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("src/test/benson.txt"))); 
				// FileOutput을 BufferedOutput에서 ObjectOutput으로 변환하는 모습 
		){
			Book b1 = new Book("자바 I/O", 30000, 1.2, "테스트2"); 
			Book b2 = new Book("자바 기본문법", 50000, 1.1, "테스트3"); 
			Cart cart = new Cart(); 
			cart.add(b1); 
			cart.add(b2); 
			out.writeObject(cart); 
			// writeObject 메서드는 호출자의 경로에 아규먼트의 문자열이나 기본형 또는 객체(인스턴스)를 작성(write)할 수 있다. 
			// 어떤 방식으로 읽는(read)? 
			out.writeObject(BigDecimal.valueOf(0.1 + 1.1)); 
			// java의 실수 계산은 정확하지 않으며 정확한 값을 위해선 bigDecimal 클래스를 사용하자 
			// 따라서 요점은 Data(In/Out)putStream 클래스는 아규먼트로 객체(인스턴스)도 못주고 메서드의 결과도 못주는 반면, Object(In/Out)putStream 는  가능하다 
		} catch (IOException e) {
			e.printStackTrace(); 
		}
		
		try (
				ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("src/test/benson.txt"))); 
				
		){
			Cart cart = (Cart)in.readObject();  // 다운캐스팅 
			//readObject 메서드를 통해 writeObject로 출력(write)한 내용을 읽어(read)올 수 있다. (어떤 타입을 읽을지 모르기 때문에 object클래스로 return 한다)
			//DataInputStream과 마찬가지로 읽어올때도 출력( 작성. write)한 순서 그대로 읽어와야 한다. (cart를 writeObject한 후 BigDecimal~~을 WriteObject햇으니 읽어올 때도 cart를 먼저 readObject 한 후 BigDecimal~~을 readObject)
			BigDecimal bd = (BigDecimal)in.readObject(); // 다운캐스팅 
			System.out.println(cart.getBooks()); // return이 books니까 자동으로 books.toString이 호출? 
			System.out.println(bd.toString()); 
			System.out.println(bd.add(BigDecimal.valueOf(1)).toString()); 
		} catch (IOException e) {
			e.printStackTrace(); 
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); 
		}
	}
}

class Book implements Serializable {
	/*
	 * Object (In/Out) putStream을 사용할 클래스는 Serializable인터페이스ㅡㄹ 구혀나고 있어야 한다. 
	 * Serializable 인터페이스는 객체(인스턴스)를 일렬로 된 문자열로 바꿀 수 있게 해준다. 
	 * 
	 */
	private static final long serialVersionUID = 1L; 
	// Serialzable 인터페이스를 구현 중인 클래스는 private static final long serialVersionUID 변수를 반드시 가져와야한다. (클래스의 충돌을 미연에 방지하기 위한 변수)(미구현 시 에러) 
	// 다른 네트워크와 serialVersionUID의 값이 일치할 때만 데이터를 주고받을 수 있다. 
	private String title; 
	private String title2; 
	private int price; 
	private double tax; 
	public Book(String title, int price, double tax, String title2) {
		this.title = title; 
		this.price = price; 
		this.tax = tax; 
		this.title2 = title2; 
	}
	public String getTitle() {
		return title; 
	}
	public void setTitle(String title) {
		this.title = title; 
	}
	public String getTitle2() {
		return title2; 
	}
	public int getPrice() {
		return price; 
	}
	public void setPrice(int prcie) {
		this.price = price; 
	}
	public double getTax() {
		return tax; 
	}
	public void setTax(double tax) {
		this.tax = tax; 
	}
	@Override 
	public String toString() {
		return "Book [title=" + title + ", price=" + price + ", tax=" + tax + ", title2=" + title2 + "]"; 
	}
}

class Cart implements Serializable {
	private static final long serialVersionUID = 1L; 
	private List<Book> books = new ArrayList<>(); 
	public void add(Book book) {
		books.add(book); 
	}
	public void print() {
		System.out.println(books); 
	}
	public List<Book> getBooks(){
		return books; 
	}
}