package Hw_250916;

public class PizzsMain {

	public static void main(String[] args) {
		Pizza pizza = new Pizza();
		
		pizza.setSize("L");
		pizza.setType("페퍼로니");
		
		System.out.println("피자 종류는 "+pizza.getType()+"이고, "+ pizza.getSize()+"사이즈 입니다.");
	}
}
