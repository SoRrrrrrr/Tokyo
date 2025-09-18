package ch3;

public class UserMain {

	public static void main(String[] args) {
		Admin admin = new Admin("권소령", "sr1234@naver.com");
		Customer customer = new Customer("홍길동", "gd345@gmail.com");
		
		admin.login();// 이름, 이메일 출력
		admin.manager(); // 관리자 입장
		
		customer.login(); 
		customer.buy(); // 상품 구매
	}
}
