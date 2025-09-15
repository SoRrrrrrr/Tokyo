package ch1;
import java.util.Scanner;
import java.util.Random;

public class Hw_250915 {
	//Q1
	public static int q1(){
		System.out.print("치킨 마리 수를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return 8*n;
	}
	//Q2
	public static int q2(){
		System.out.print("하루 마신 커피잔 수 : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return 80*n;
	}
	//Q3
	public static int q3(){
		System.out.print("먹은 삼각김밥 개수: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return 200*n;
	}
	//Q4
	public static int q4(){
		System.out.print("2명의 이름을 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		String name1 = sc.next();
		String name2 = sc.next();
		int result = ran.nextInt(101);
		return result;
	}
	//Q5
	public static String q5(){
		Random ran = new Random();
		int result = ran.nextInt(4);
		if (result==0) return "라면";
		else if(result==1) return "김밥";
		else if(result==2) return "파스타";
		else return "샐러드";
	}
	// Q6
	public static char q6(){
		System.out.print("점수 : ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		//2byte, 한 글자만 사용. 유니코드 사용 가능
		// 단, 값에 작은 따옴표 사용 ''
		char grade;
		// 90점 이상이면 A, 80점 이상이면 B,70점 이상이면 C,나머지는 D
		if(score >= 90) {
			grade = 'A';
		}
		else if(score < 90 && score >=80) {
			grade = 'B';
		}
		else if(score < 80 && score>=70) {
			grade = 'C';
			
		}
		else if(score < 70 && score>=60) {
			grade = 'D';
			
		}else {
			grade = 'F';
		}
		return grade;
	}
	//Q7
	public static int q7(){
		Scanner sc = new Scanner(System.in);
		System.out.println("시급과 일한 시간을 입력하세요: ");
		int money = sc.nextInt();
		int hours = sc.nextInt();
		return money*hours;
	}
	
	public static void main(String[] args) {
		// Q1
		System.out.println(q1()+"조각");
		// Q2
		System.out.println(q2()+"mg");
		// Q3
		System.out.println(q3()+"kcal");
		// Q4
		System.out.println("연애 성공 확률 : "+q4());
		// Q5
		System.out.println(q5());
		// Q6
		System.out.println("입력한 점수의 등급은 "+q6()+" 입니다.");
		// Q7
		System.out.println("총 급여 : "+q7()+"원");
										
	}

}
