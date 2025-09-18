package ch3;

public class User {
	private String name;
	private String email;
	
	public User(String name, String email) {
		this.email = email;
		this.name = name;
	}
	
	public void login() {
		System.out.println("이름: "+name+", 메일: "+ email);
	}
}
