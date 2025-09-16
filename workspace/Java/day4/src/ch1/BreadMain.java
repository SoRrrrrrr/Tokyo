package ch1;

public class BreadMain {

	public static void main(String[] args) {
		// 좋아하는 빵의 객체를 생성자의 매개변수 개수를 달리하여 두 개 만들고 
		Bread bbang1 = new Bread();
		bbang1.setName("크로와상");
		bbang1.setCnt(10);
		bbang1.setGram(30);
		bbang1.setPrice(2500);
		Bread bbang2 = new Bread("소라빵", 40, 1900, 3);
		
		// 해당 제품명과 금액을 출력
		System.out.println("빵이름: " +bbang1.getName());
		System.out.println("총 금액: "+bbang1.breadTotal()+"원");
		System.out.println("빵이름: " +bbang2.getName());
		System.out.println("총 금액: "+bbang2.breadTotal()+"원");
		
		Bread bread3 = new Bread();
		bread3.setName("꽈배기");
		bread3.setGram(80);
		bread3.setPrice(800);
		bread3.setCnt(4);
		System.out.println(bread3.toString());
	}
}
