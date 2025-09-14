package ch1;

import java.util.Scanner;

public class Control5 {

	public static void main(String[] args) {
		//1~10까지의 정수 중 하나를 입력받아 홀/짝수 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("1에서 10 중 하나를 입력하세요: ");
		int num = sc.nextInt();
		String result = "" ;
		
		//중첩 if문
		if (num<11 && num > 0) {
			if (num%2==0) result="짝수";
			else result = "홀수";
		}else {
			System.out.println("1-10 범위 내의 숫자를 입력하세요.");
		}		
		System.out.println(result+"입니다.");
	}
}