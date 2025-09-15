package ch1;

import java.util.Scanner;

public class Basic1 { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요: ");
		int num = sc.nextInt();
		if (num%2==0) System.out.println(num);
		else return;
	}
}