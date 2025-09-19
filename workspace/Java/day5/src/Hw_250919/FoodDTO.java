package Hw_250919;

public class FoodDTO {
	private String food_num;
	private String name;
	private int num;
	private String date;
	
	public FoodDTO(String food_num, String name, int num, String date) {
		this.food_num = food_num;
		this.name = name;
		this.num = num;
		this.date = date;
	}

	public String getFood_num() {
		return food_num;
	}

	public void setFood_num(String food_num) {
		this.food_num = food_num;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "FoodDTO [food_num=" + food_num + ", name=" + name + ", num=" + num + ", date=" + date + "]";
	}
	
	
}
