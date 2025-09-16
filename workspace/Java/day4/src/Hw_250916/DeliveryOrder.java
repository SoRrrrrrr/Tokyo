package Hw_250916;

public class DeliveryOrder {
	private String food;
	private String address;
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void deliver() {
		System.out.println("주문 확인: 음식 = "+this.food +", 주소 ="+this.address);
	}
}