package com.test.java.ch08;

import com.test.java.ch08.ex06.*;

public class Ex06AccessModifiers {
	public static void main(String[] args) {
	
	
	}
}
class Ebook05 extends Book {
	String fontColor;
	
	protected void setTax(float tax) {
		this.tax= tax+0.1f;
	}
	
	protected float getTax() {
		return tax;
	}
}