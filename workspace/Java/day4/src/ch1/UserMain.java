package ch1;

// 회원 객체
public class UserMain {

	public static void main(String[] args) {
		// User user = new User(); User class에 기본 생성자가 없기 때문에 오류 발생
		// 매개변수가 있는 생성자 : 필요 정보가 빠진 객체가 생기는 걸 방지하기 위해
		User user = new User("한라봉", "abc", "1313");
		
		System.out.println(user.getName());
		System.out.println(user.getId());
		System.out.println(user.getPassword());
		
		// 상품의 이름, 가격, 수량 출력 (.toString())
	System.out.println("===================");
		Item item = new Item("레모나", 30, 1400);
		System.out.println(item.toString());
	}
}
