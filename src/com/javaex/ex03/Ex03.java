package com.javaex.ex03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요");
		System.out.println("숫자");
		
		int point = sc.nextInt();
		//12
		if(point>0) {
			System.out.println("양수");
		} else if(point<0){ //-5,0
			System.out.println("음수");
		} else {//0
			System.out.println("0");
			
		}
		
		
		sc.close();
	}

}
