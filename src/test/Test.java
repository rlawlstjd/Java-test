package test;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Test {
	public static void main(String[] args) {
		// optioanl 클래스는'요소'의 null 체크를 선언현프로그래밍 방법으로 할 수 있게 해주는 것이 optional 클래스이다 \
		// stream과 동작 매커니즘은 유사하지만, optional 클래스는 null 체크를 위한 wrapper 클래스이다. (용도 차이?)
		
		List<EBook> ebooks = new ArrayList<>(); 
		ebooks.add(new EBook("자바 기본문법",50000, EBook.Category.LANG));
		ebooks.add(new EBook("자바 알고리즘", 30000, EBook.Category.APP)); 
		ebooks.add(new EBook("파이썬 기본문법", 35000, EBook.Category.LANG)); 
		ebooks.add(new EBook("파이썬 기본문법", 33000, EBook.Category.LANG)); 
		ebooks.add(new EBook("파이썬 기본문법", 33000, EBook.Category.LANG)); 
		ebooks.add(new EBook("리눅스", 40000, EBook.Category.APP)); 
		
		System.out.println("< of (instance) >"); 
		EBook eb = new EBook("AWS", 40000, EBook.Category.APP); 
		Optional<EBook> opt = Optional.of(eb); 
		//Optional.of를 통해 인스턴스를 optional 클래스에 담고 있다. 
		System.out.println(opt.get()); 
		// get메서드를 사용해서 Optional 인스턴스에 저장되어 있는 요소를 가져올 수 있다. 
		System.out.println(); 
		
		System.out.println("< of (null) >"); 
		EBook eb2 = null; 
		
		try {
			Optional<EBook> opt2 = Optional.of(eb2); 
			
		} catch(NullPointerException e) {
			System.out.println("NullPointerException 발생"); 
		}
		System.out.println(); 
		
		System.out.println("< ofNullable >");  // orElseThrow
		Optional<EBook> opt3 = Optional.ofNullable(eb2); 
		// ofNullable 메서드 사용시 Null 값인 요소를 담을 수 있다. 
		

		try {
			opt3.get(); //다만 null이 담긴 요소를 가져오려할 때 예외가 발생하므로 예외처리 
			// 꼭 get일 때 예외처리 하는 것이 아닌 아래에 있는 opt3.orElseThorw 문 등을 통해서 ofNullable 로 인스턴스를 받은 후 null 여부를 검사해도 된다
		} catch (NoSuchElementException e) {
			System.out.println("get메소드 호출 시 " + e.getMessage()); 
		}
		System.out.println(); 
		
		System.out.println("< isPresent >"); 
		if (opt3.isPresent()) {
			// isPresent 메서드를 사용하면 Null 여부를 boolean 타입으로 return 받을 수 있다.
			System.out.println(opt3.get()); 
		} else {
			System.out.println("opt3는 null 입니다.");
		}
		
		EBook eb3 = opt3.isPresent() ? opt3.get() : new EBook("옵셔널", 30000, EBook.Category.LANG); 
		// 삼항연산자를 통해 null 여부 체크 
		// isPresent가 거짓일 경우 new EBook(~~);을 opt3에 return 
		System.out.println(eb3); 
		System.out.println();
		
		System.out.println("< orElse >"); 
		EBook eb4 = opt3.orElse(new EBook("옵셔널", 30000, EBook.Category.LANG)); 
		//orElse 메서드는 opt3가 null이 아니라면 opt3의 요소를 return하고 (아규먼트의 내요은 실행하지 않고), 
		System.out.println(eb4); 
		System.out.println(); 
		
		System.out.println("< orElseGet >"); 
		EBook eb5 = opt3.orElseGet(() -> new EBook("옵셔널", 30000, EBook.Category.LANG)); 
		// orElseGet 메서드는 호출자가 null일 경우 아규먼트인 람다식을 실행한다. (null 이 아닐 경우 opt3의 요소 return) ; 
		// orElse 와 orElseGet은 호출자가 null일 경우 아규먼트의 내용을 저장하는 메서드 . 
		System.out.println(eb5); 
		System.out.println(); 
		
		System.out.println("< orElseThrow >"); 
		
		try {
			opt3.orElseThrow(() -> new NullPointerException()); 
			// orElseThrow 메서드는 호출자가 null 일 경우 특정 예외 (NullPointerException 뿐만 아니라)를 
			// null이 아닐 경우 해당 try catch 코드 미실행 
			// orElse와 orElseGet은 호출자가 null일 경우 아규먼트의 내용을 저장하는 메서드지만 orElseThrow는 호출자가 Null이라면 오류를 발생시키는 메서
		} catch (NullPointerException e) {
			System.out.println("NullPointerException 발생"); 
		}	
		System.out.println(); 
		
		System.out.println("< empty >"); 
		Optional<EBook> opt4 = Optional.empty(); 
		// Optional타입 인스턴스 '요소' 가 빈 값이란 것을 표현하고 싶다면, = null이 아닌 Optional.empty 메서드를 활용하여 빈 메모리를 생성하면 된다. 
		// String a = ""; 와 같은 원리 
		Optional<EBook> opt5 = null; 
		System.out.println(opt4.orElse(new EBook("옵셔널", 30000, EBook.Category.LANG))); 
		// opt4는 '요소'가 비어있지만 (null) , Optional.empty 메서드로 인스스의 메모리는 생성하였기에 메서드 호출은 가능하나, '요소의 내용' 이 비어있기에 (null) orElse 호출 시 아규먼트가 저장된다. 
		// System.out.println(opt5.orelse(new EBook("옵셔널", 30000, EBook.Category.LANG))); 
		// opt5는 = null로 표현되어 opt4와 동일하게 내용이 null일 것 같지만 = null ; 은 메모리 생성을 하지 않으므로 메서드 호출이 불가능하다. 
		// 이전 예시(opt3)는 Optional 인스턴스의 메모리는 생성되었지만 'null인 요소'를 담고 있었기에 메서드 호출은 가능했지만 내용은 null이었던 것 
		System.out.println(); 
		
		System.out.println("< OptionalInt >"); 
		// OptionalInt 클래스 Int 타입만을 위한 Optional 클래스이다. 
		// *OptionalInt 클래스는 Int타입을 위한 클래스이기에 제네릭스가 없다 
		OptionalInt optInt = 
				ebooks 
						.stream()
						.mapToInt(EBook::getPrice)
						.max(); 
		// stream의 최대값을 구하는 max 메서드는 OptionalInt 타입으로 return 한다. 
		System.out.println(optInt.getAsInt()); 
		// OptionalInt 클래스의 인스턴스의 요소를 가져올 때는 get이 아닌 getAsInt메서드를 사용해야 한다. 
		System.out.println(); 
		
		
		System.out.println("< flatMap, map >"); 
		// stream의 flatMap과 map 메서드와 유사하지만 차이가 있음 
		
		Panel p = new Panel(); 
		p.setType("IPS");
		p.setType2("test");
		Optional<Panel> panel = Optional.of(p); 
		// Panel 타입의 인스턴스 p를 Optional에 저장하였다. 
		// Optional은 static 메서드이므로 아규먼트로 하나만 던질 수 있기에 하나의 Optioanl 클래스에 하나의 요소만 저장할 수 있다. 
		
		Panel q = new Panel(); 
		panel = Optional.of(q); 
		
		Screen s = new Screen(); 
		s.setPanel(panel);
		// s에 Optional 타입의 p를 Optional에 저장하였다. 
		
		Optional<Screen> screen = Optional.of(s); 
		// 그 s를 또 Optional에 담았다 ( Optional<Screen> screen 인스턴스의 screen.panel의 값은 Optional의 값은 Optional<Panel> panel이다.) 
		
		Monitor monitor = new Monitor(); 
		monitor.setScreen(screen);
		
		String panelType = 
				Optional
						.ofNullable(monitor)
						.flatMap(Monitor::getScreen)
						.flatMap(Screen::getPanel)
						.map(Panel::getType)
						.orElse("TN"); 
		System.out.println(panelType); 
		System.out.println(); 
		
		
		System.out.println("< ifPresent >"); 
		Optional<String> optPanelType = 
				Optional
					.ofNullable(monitor)
					.flatMap(Monitor::getScreen)
					.flatMap(Screen::getPanel)
					.map(Panel::getType);
		optPanelType.ifPresent(System.out::println);
	}
}
class Monitor {
	private Optional<Screen> screen; 
	
	public Optional<Screen> getScreen(){
		return screen; 
	}
	public void setScreen(Optional<Screen> screen) {
		this.screen = screen; 
	}
	
}

class Screen{
	private Optional<Panel> panel; 
	
	public Optional<Panel> getPanel(){
		return panel; 
	}
	public void setPanel(Optional<Panel> panel) {
		this.panel = panel; 
	}
}

class Panel {
	private String type; 
	private String type2; 
	
	public String getType() {
		return type; 
	}
	public void setType(String type) {
		this.type = type; 
	}
	public void setType2(String type2) {
		this.type2 = type2; 
	}
	@Override
	public String toString() {
		return type + type2; 
	}
}

class EBook {
	enum Category {
		APP, LANG
	}
	private String title; 
	private int price; 
	private Category category; 
	
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
	public String toString() {
		return "제목: " + title + ", 가격: " + price + ", 카테고리: " + category;  
	}
	
}