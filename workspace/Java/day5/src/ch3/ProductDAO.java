package ch3;

import java.util.List;
import java.util.ArrayList;

public class ProductDAO {
	List<ProductDTO> productList= new ArrayList<>();
	
	public void save(ProductDTO dto) {
		productList.add(dto);
	}
	
	public List<ProductDTO> findAll(){
		return productList;
	}
}
