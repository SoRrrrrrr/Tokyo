package ch3;

import java.util.List;

public class ProductService {
	private ProductDAO dao;
	
	public ProductService(ProductDAO dao) {
		this.dao= dao;
	}

	public void addProduct(int id, String name, int qty, int price) {
		ProductDTO dto = new ProductDTO(id, name, qty, price);
				
		dto.setId(id);
		dto.setName(name);
		dto.setQty(qty);
		dto.setPrice(price);
		
		dao.save(dto);
	}                   
	
	public List<ProductDTO> getAllProduct(){
		return dao.findAll();
	}
	
	
	// 전체 상품 개수 반환
	public int getTotalCount() {
		List<ProductDTO> products = getAllProduct();
		
		int sum = 0;
		for(ProductDTO dto: products) {
			sum+=dto.getQty();
		}
		return sum;
	}
	
	// 상품 종합 금액
	public int getSumQuantity() {
		List<ProductDTO> products = getAllProduct();
		
		int sum = 0;
		for(ProductDTO dto: products) {
			sum+=dto.getTotal();
		}
		return sum;
	}
}