package Hw_250919;

import java.util.List;
import java.util.Scanner;

public class FoodController {
	Scanner sc = new Scanner(System.in);
	private FoodService service;
	
	public FoodController(FoodService service) {
		this.service = service;
	}
	
	public void run() {
		while(true) {
			System.out.println("번호입력:1 - 식자재 등록 /2 - 식자재 조회 /0 - 프로그램 종료");
			int n = sc.nextInt();
			sc.nextLine();
			
			
			switch(n) {
			case 1:
				System.out.println("식자재번호: ");
				String food_num = sc.next();
				System.out.println("식자재명: ");
				String name = sc.next();
				System.out.println("수량: ");
				int num = sc.nextInt();
				System.out.println("등록 날짜: ");
				String date = sc.next();
				
				service.addFood(food_num, name, num, date);
				System.out.println("식자재 등록 완료");
				break;
			case 2:
				List<FoodDTO> foods = service.getAllFood();
				for(int i=0;i<foods.size();i++) {
					FoodDTO dto = foods.get(i);
					System.out.println(dto);
				}
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("숫자를 입력해주세요");
			}

		}
	}
}		