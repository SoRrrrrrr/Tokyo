package ch2;

import ch3.Book;

public class ProductMain {

	public static void main(String[] args) {
		Product product = new Product("상품", 0);
		Book book = new Book("어린왕자", 14000,"생택쥐베리");
		Food food = new Food("Food", 3000);
		
		product.showInfo();
		book.bookInfo();
		food.showFood();
	}
}
