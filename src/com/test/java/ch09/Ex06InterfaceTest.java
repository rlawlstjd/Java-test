package com.test.java.ch09;

public class Ex06InterfaceTest {
	public static void main(String[] args) {
		Pen pen = new Pen();
		pen.setName("모나미");
		pen.setColor("블랙");
		pen.setPrice(500);
		
		Pen pen1 = new Pen(); 
		pen1.setName("제트스트림");
		pen1.setColor("화이트");
		pen1.setPrice(1500);
		
		Water water = new Water(); 
		water.setName("삼다수");
		water.setAmount(500);
		water.setPrice(700);
		
		Mouse mouse = new Mouse(); 
		mouse.setName("로지텍");
		mouse.setPrice(5000);
		mouse.setColor("화이트");
		
		WareHouse warehouse = new WareHouse(); 
		warehouse.add(water);
		warehouse.add(pen1);
		warehouse.add(pen);
		
		warehouse.print();
		
		
	}
}

interface Stock {
	public abstract String getInboundDate();
	public abstract String getOutboundDate(); 
	public abstract String getStockName();
}

class Pen implements Stock {
	protected int price; 
	protected String name;
	private String color;

	public void setPrice(int price) {
		this.price = price; 
	}
	
	public int getPrice() {
		return price; 
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	
	public String getName() {
		return name; 
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	@Override
	public String getInboundDate() {
		return "5월 10일";
	}
	
	@Override
	public String getOutboundDate() {
		return "6월 10일"; 
	}
	
	@Override 
	public String getStockName() {
		return "[한정판]" + getName();  
	}
}

class Water extends Pen implements Stock {
	private int amount ;


	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public int getAmount () {
		return amount;
	}
	
	@Override
	public String getInboundDate() {
		return "5월 15일"; 
	}
	
	@Override
	public String getOutboundDate() {
		return "6월 15일";
	}
	
	@Override 
	public String getStockName() {
		return "[맑은 물]" + getName();
	}

}

class Mouse  {
	private String name; 
	private int price; 
	private String color; 
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name; 
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setColor(String color) {
		this.color = color; 
	}
	
	public String getColor() {
		return color;
	}
	

}

class WareHouse {
	protected Stock[] stocks ; 
	protected int index; 
	
	WareHouse(){
		stocks = new Stock[10];
		index = 0; 
	}
	
	public void add (Stock stock) {
		stocks[index] = stock; 
		index ++;
	}
	
	public void print () {
		for (int i=0 ; i<index; i++) {
			if ( stocks[i] == null) {
				break;
			}
			System.out.println("상품명: " + stocks[i].getStockName() + ""
			+ "\n 입고일: " + stocks[i].getInboundDate() + "\n 출고일: " + stocks[i].getOutboundDate() + "\n");
			
		}
	}
}

