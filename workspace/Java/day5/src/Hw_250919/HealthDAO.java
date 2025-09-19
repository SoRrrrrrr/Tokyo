package Hw_250919;

import java.util.ArrayList;
import java.util.List;

public class HealthDAO {
	private List<HealthDTO> healthLists = new ArrayList<>();
	
	public void save(HealthDTO dto){
		healthLists.add(dto);
	}
	public List<HealthDTO> findAll(){
		return healthLists;
	}
}
