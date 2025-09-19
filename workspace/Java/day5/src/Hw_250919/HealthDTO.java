package Hw_250919;

public class HealthDTO {
	private String name;
	private int num;
	private int kcal;
	private int burn_kcal;
	
	public HealthDTO(String name, int num, int kcal, int burn_kcal) {
		this.name = name;
		this.num = num;
		this.kcal = kcal;
		this.burn_kcal = burn_kcal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getKcal() {
		return kcal;
	}

	public void setKcal(int kcal) {
		this.kcal = kcal;
	}

	public int getBurn_kcal() {
		return burn_kcal;
	}

	public void setBurn_kcal(int burn_kcal) {
		this.burn_kcal = burn_kcal;
	}

	@Override
	public String toString() {
		return "HealthDTO [name=" + name + ", num=" + num + ", kcal=" + kcal + ", burn_kcal=" + burn_kcal + "]";
	}
	
	
}
