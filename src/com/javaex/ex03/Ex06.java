package com.javaex.ex03;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요");
		int threenum = sc.nextInt();
		
		if(threenum%3==0) {
			System.out.println( threenum + "은(는) 3의 배수 입니다.");
		}else if(threenum/3!=0){
			System.out.println( threenum + "은(는) 3의 배수가 아닙니다.");
		}
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
