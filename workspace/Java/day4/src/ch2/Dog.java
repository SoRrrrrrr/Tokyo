package ch2;

import ch3.Animal;

//구현 클래스
public class Dog implements Animal{
	// 	반드시 sound() 메서드의 구현 내용이 들어가야 함
	public void sound() {
		System.out.println("멍멍");
	}
}
