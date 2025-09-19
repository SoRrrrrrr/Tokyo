package Hw_250919;

import java.util.List;

public class AnimalService {
	private AnimalDAO dao;
	
	public AnimalService(AnimalDAO dao) {
		this.dao = dao;
	}

	public List<AnimalDTO> getAllAnimal() {
		return dao.findAll();
	}

		// 리스트 추가를 위한 구체적인 회원 등록
	public void addAnimal(String id, String protector, String ani_name, int ani_age, String contact) {
		AnimalDTO dto = new AnimalDTO(id, protector, ani_name, ani_age, contact); 
		dao.save(dto);
	}
}
