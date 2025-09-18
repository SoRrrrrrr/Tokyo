package ch3;

// 자식 클래스 
public class Child extends Parents{
	// 필드
	private int field3;
	
	public Child() { }
	// 생성자
	public Child(int field1, String field2, int field3) {
		super(field1, field2);
		this.field3 = field3;
	}
	
	//method2()
	@Override
	public void method2() {
		System.out.println("Child 메소드");
	}
}
