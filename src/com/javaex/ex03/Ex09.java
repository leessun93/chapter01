package com.javaex.ex03;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력 하세요 :");
		int grade = sc.nextInt();
		
		
		if(grade>=90) {
			System.out.println("A등급");
		}else if(grade>=80) {
			System.out.println("B등급");
		}else if(grade>=70) {
			System.out.println("C등급");
		}else if(grade>=60) {
			System.out.println("D등급");
		}else {
			System.out.println("F등급");
		}
		

		
		sc.close();
	}

}
