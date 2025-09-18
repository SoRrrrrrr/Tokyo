package ch3;

import ch2.Product;

public class Book extends Product{
	// field : writer
	private String writer;
	
	public Book(String name, int price, String writer) {
		super(name, price);
		this.writer = writer;
	}
	
	// method : Parents class's method + print writer
	public void bookInfo() {
		super.showInfo();
		System.out.println("저자: "+writer);
	}
}
