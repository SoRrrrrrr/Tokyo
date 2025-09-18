package ch1;

public class Item {
	private String name;
	private int price;
	private int cnt;
	public Item(String name, int price, int cnt) {
		this.name = name;
		this.price = price;
		this.cnt = cnt;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getCnt() {
		return cnt;
	}
	public int total() {
		return price * cnt;
	}
	@Override
	public String toString() {
		return "Item [name=" + getName() + ", price=" + getPrice() + ", cnt=" + getCnt()+", total=" + total()+"]";
	}	
}