package ch1;

public class MethodEx2 {
	public static int cupRamen(int n) {
		return n*500;
	}
	public static int pay(int n1, int n2) {
		return n1*n2;
	}
	
	public static void main(String[] args) {
		// 컵라면 칼로리 계산 메서드
		System.out.println(cupRamen(3)+"kcal"); // kcal
		
		//컵라면 계산 메서드
		System.out.println(pay(1500, 11)+"원 입니다.");

	}

}
