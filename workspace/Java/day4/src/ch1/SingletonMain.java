package ch1;

public class SingletonMain {

	public static void main(String[] args) {
		// Singleton s1 = new Singleton(); 는 불가
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		Bread b1 = new Bread();
		Bread b2 = new Bread();
		
		System.out.println("싱글톤 패턴: " + (s1==s2)); // true
		System.out.println("일반 객체: " + (b1==b2)); // false
		
	}
}
