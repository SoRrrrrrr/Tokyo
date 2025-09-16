package ch1;

public class DogMain {

	public static void main(String[] args) {
		// Dog 클래스(설계도)로 실제 강아지(객체) 만들기
		Dog dog1 = new Dog("흰둥이", "mix", "white", 3, 4, false);		
		Dog dog2 = new Dog("송이", "사모예드", "white", 6, 20, true);
		
		dog1.eat();
		dog2.poopoo();
	}
}