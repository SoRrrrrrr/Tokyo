package ch3;

public class Tv extends Goods{
	public Tv(String brand) {
		super(brand);
	}
	
	@Override 
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	@Override 
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
}
