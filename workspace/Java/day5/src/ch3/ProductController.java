package ch3;

import java.util.List;
import java.util.Scanner;

//250923 숙제 1,2,6 

public class ProductController {
	Scanner sc = new Scanner(System.in);
	private ProductService service;
	
	public ProductController(ProductService service) {
		this.service = service; 
	}
	public void run() {
		while(true) {
			System.out.println("번호 입력: 1-상품 등록|2-전체 상품 조회|3-개별 상품 조회|4-상품 정보 삭제|5-상품 정보 수정|6-상품 분석|0-프로그램 종료");
			int n = sc.nextInt();
			sc.nextLine();
			
			switch(n) {
			// 상품 등록 : 상품명, 수량, 가격, 상품번호
			case 1:
				System.out.println("상품명: ");
				String name = sc.nextLine();
				System.out.println("수량: ");
				int qty = sc.nextInt();
				System.out.println("가격: ");
				int price = sc.nextInt();
				System.out.println("상품 번호: ");
				int id = sc.nextInt();
				
				service.addProduct(id, name, qty, price);
				System.out.println("상품 등록 완료");
				break;

			// 전체 상품 조회 : 상품 번호, 상품명, 수량, 가격, 합계 출력
			case 2:
				List<ProductDTO> products = service.getAllProduct();
				for(int i=0;i<products.size();i++) {
					ProductDTO dto = products.get(i);
					System.out.println(dto);
				}
				break;
//			case 3:
//				service.outOneProduct();
//				break;
//			case 4:
//				service.delProduct();
//				break;
//			case 5:
//				service.modifyProduct();
//				break;
			// 상품 분석 : 전체 상품의 개수, 합계 
			case 6:
				 
				int totalCount = service.getTotalCount();
				int totalPriceSum = service.getSumQuantity();
				
				System.out.println("전체 상품 개수: "+ totalCount+"개");
				System.out.println("전체 합계 금액: "+ totalPriceSum+"원");
				break;
			case 0: 
				System.out.println("프로그램 종료");
				return;
			default: System.out.println("숫자만 입력하세요.");
			}
		}
	}
}
