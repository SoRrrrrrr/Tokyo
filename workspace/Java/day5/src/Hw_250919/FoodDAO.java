package Hw_250919;

import java.util.ArrayList;
import java.util.List;

public class FoodDAO {
	private List<FoodDTO> foodLists = new ArrayList<>();
	
	public void save(FoodDTO dto){
		foodLists.add(dto);
	}
	public List<FoodDTO> findAll(){
		return foodLists;
	}
}
