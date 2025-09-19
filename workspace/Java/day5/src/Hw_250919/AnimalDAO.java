package Hw_250919;

import java.util.List;
import java.util.ArrayList;

// 데이터 접근 계층
public class AnimalDAO {
	private List<AnimalDTO> aniLists = new ArrayList<>();
	
	public void save(AnimalDTO dto){
		aniLists.add(dto);
	}
	public List<AnimalDTO> findAll(){
		return aniLists;
	}
}
