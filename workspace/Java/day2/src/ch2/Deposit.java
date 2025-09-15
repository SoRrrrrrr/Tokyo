package ch2;

import java.util.Scanner;

public class Deposit {

	public static void main(String[] args) {
		boolean run = true;
        int balance = 0; // 잔고
        int money = 0; //입출금액
        int num = 0;
        Scanner sc = new Scanner(System.in);
 
        while(run) {//원하는 바를 이룰 때까지 프로그램 진행
            System.out.println("-----------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-----------------------------------");
            System.out.print("번호를 입력하세요: ");
            num = sc.nextInt();
            // 작성 위치
            switch(num) {
        	case 1: {
            	System.out.print("입금액을 입력하세요: ");
        		money = sc.nextInt();
            	balance+=money;
            	System.out.printf("%d원 입금되었습니다.\n",money);
        		break;
        	}
        	case 2:{
        		System.out.print("출금액을 입력하세요: ");
        		money = sc.nextInt();
        		if(money>balance) System.out.println("출금액이 잔고보다 커서 출금할 수 없습니다.");
        		else {
        			balance-=money;
        			System.out.printf("%d원 출금되었습니다.\n",money);
        		}
        		break;
        	}
        	case 3:{
            	System.out.printf("잔고: %d원\n",balance);
        		break;
        	}
    		case 4:{
    			run = false;
    			break;
        	}	
    		default:
    			System.out.println("잘못된 입력입니다.");
            }
        }
        System.out.println("프로그램 종료");    
    }

}
