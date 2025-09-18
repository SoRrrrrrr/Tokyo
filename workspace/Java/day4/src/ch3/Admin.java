package ch3;

public class Admin extends User{
	public Admin(String name, String email) {
		super(name, email );
	}
	public void manager() {
		System.out.println("관리자 입장");
	}
}
