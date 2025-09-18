package Hw_250918;

public class Car implements Vehicle {
	private int speed;
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void move() {
		System.out.println("car move");
	}
}
