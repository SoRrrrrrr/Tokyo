package Hw_250919;

import java.util.List;
import java.util.Scanner;

public class HealthController {
	Scanner sc = new Scanner(System.in);
	private HealthService service;
	
	public HealthController(HealthService service) {
		this.service = service;	
	}
	
	public void run() {
		while(true) {
			System.out.println("번호입력:1 - 회원 등록 /2 - 회원 조회 /0 - 프로그램 종료");
			int n = sc.nextInt();
			sc.nextLine();
			
			
			switch(n) {
			case 1:
				System.out.println("회원명: ");
				String name = sc.next();
				System.out.println("회원번호: ");
				int num = sc.nextInt();
				System.out.println("기준 칼로리: ");
				int kcal = sc.nextInt();
				System.out.println("소비 칼로리: ");
				int burn_kcal = sc.nextInt();
				
				service.addHealth(name, num, kcal, burn_kcal);
				System.out.println("회원 등록 완료");
				break;
			case 2:
				List<HealthDTO> healths = service.getAllHealth();
				for(int i=0;i<healths.size();i++) {
					HealthDTO dto = healths.get(i);
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
