package Hw_250919;

import java.util.List;
import java.util.Scanner;

public class AnimalController {
	Scanner sc = new Scanner(System.in);
	private AnimalService service;
	
	public AnimalController(AnimalService service) {
		this.service = service;	
	}
	
	public void run() {
		while(true) {
			System.out.println("번호입력:1 - 동물 등록 /2 - 동물 조회 /0 - 프로그램 종료");
			int n = sc.nextInt();
			sc.nextLine();
			
			
			switch(n) {
			case 1:
				System.out.println("아이디: ");
				String id = sc.next();
				System.out.println("보호자명: ");
				String protector = sc.next();
				System.out.println("반려동물명: ");
				String ani_name = sc.next();
				System.out.println("반려동물 나이: ");
				int ani_age = sc.nextInt();
				System.out.println("연락처: ");
				String contact = sc.next();
				
				service.addAnimal(id, protector, ani_name, ani_age, contact);
				System.out.println("동물 등록 완료");
				break;
			case 2:
				List<AnimalDTO> animals = service.getAllAnimal();
				for(int i=0;i<animals.size();i++) {
					AnimalDTO dto = animals.get(i);
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