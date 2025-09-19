package Hw_250919;

import java.util.List;

public class FoodService {
	private FoodDAO dao;
	
	public FoodService(FoodDAO dao) {
		this.dao = dao;
	}

	public List<FoodDTO> getAllFood() {
		return dao.findAll();
	}

		// 리스트 추가를 위한 구체적인 회원 등록
	public void addFood(String food_num, String name, int num, String date) {
		FoodDTO dto = new FoodDTO(food_num, name, num, date); 
		dao.save(dto);
	}
}
