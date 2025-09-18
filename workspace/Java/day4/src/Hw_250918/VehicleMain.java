package Hw_250918;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		
		car.setSpeed(3);
		bicycle.setSpeed(10);
		car.move();
		bicycle.move();
		System.out.println("car speed: "+car.getSpeed());
		System.out.println("bicycle speed: "+bicycle.getSpeed());

	}
}
