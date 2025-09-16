package Hw_250916;

public class Idol{
	private String mem1;
	private String mem2;
	private String mem3;
	private String group;
	private String position1;	
	private String position2;
	private String position3;
	
	public Idol(String mem1,String mem2, String mem3,String group,String position1,String position2,String position3) {
		this.mem1 = mem1;
		this.mem2 = mem2;
		this.mem3 = mem3;
		this.group = group;
		this.position1 = position1;
		this.position2 = position2;		
		this.position3 = position3;
	}
	
	public void printInfo() {
		System.out.println(this.group + "그룹의 멤버는 "+ mem1+"("+ this.position1 + "), " + mem2 + "(" + this.position2 +"), "+mem3+"("+ this.position3 +") "
				+ "입니다.");
	}
}