package Hw_250918;

public class PasswordMain {

	public static void main(String[] args) {
		Password pw = new Password();
		
		pw.setPassword("abc123");
		System.out.println("내 비밀번호는 "+pw.getPassword());
	}

}