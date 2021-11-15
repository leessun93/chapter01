package com.javaex.ex02;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
		//sc는 임의의 이름 sc를 쓸땐 마지막에 sc.close; 를 써서 닫아주어야 한다
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		
		int num = sc.nextInt();
		
		System.out.println("입력하신 숫자는 " + num + " 입니다.");
		
		sc.close();
	}
}
