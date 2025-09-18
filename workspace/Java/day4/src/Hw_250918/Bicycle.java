package Hw_250918;

public class Bicycle implements Vehicle{
	private int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	@Override
	public void move(){
		System.out.println("bicycle move");
	}
}
