package Hw_250916;

public class DelieveryOrderMain {

	public static void main(String[] args) {
		DeliveryOrder order = new DeliveryOrder();
		order.setFood("떡볶이");
		order.setAddress("기숙사");
		
		order.deliver();
	}
}
