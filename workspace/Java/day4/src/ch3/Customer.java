package ch3;

public class Customer extends User{
	public Customer(String name, String email) {
		super(name, email);
	}
	
	public void buy() {
		System.out.println("상품 구매");
	}
}
