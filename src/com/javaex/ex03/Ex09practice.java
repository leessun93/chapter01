package com.javaex.ex03;

import java.util.Scanner;

public class Ex09practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요");
		
		int point = sc.nextInt();
		
		if(point>=90) {
			System.out.println("A등급");
		}else if(90>point && point>=80) {  //깐깐하게 둘다 만족시켜야 허락하겠다
			System.out.println("B등급");	
		}else if(80>point && point>=70) {  //깐깐하게 둘 다 만족시켜야 허락한다
			System.out.println("C등급");
		}else if(70>point && point>=60) {  //깐깐 둘 다 만족 허락
			System.out.println("D등급");
		}else {
			System.out.println("넌 낙제야 꺼져");
		}
		
		
		sc.close();
		
	}

}
