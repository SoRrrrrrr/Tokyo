package Hw_250919;

import java.util.List;

public class HealthService {
	private HealthDAO dao;
	
	public HealthService(HealthDAO dao) {
		this.dao = dao;
	}

	public List<HealthDTO> getAllHealth() {
		return dao.findAll();
	}

		// 리스트 추가를 위한 구체적인 회원 등록
	public void addHealth(String name, int num, int kcal, int burn_kcal) {
		HealthDTO dto = new HealthDTO(name, num, kcal, burn_kcal); 
		dao.save(dto);
	}
}
