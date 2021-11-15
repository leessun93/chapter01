package com.javaex.ex01;

public class Ex07 {
	public static void main(String[] args) {
		
		int a = 7;
		int b = 2;
		
//		산술연산자
		System.out.println("산술연산자");
//		sysout + Ctrl + spacebar = System.out.println()
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b); //3.5 몫 3 나머지 1 --> 몫을 표시
		System.out.println(a % b); // 3.5 몫 3 나머지 1 --> 나머지 표시
		
		
		System.out.println("산술연산자 자세히");
		System.out.println(7.0/2.0);  //3.5
		System.out.println(7.0%2.0);  //1.0
		
		System.out.println("부호연산자");
		int var = -3;
		int pVar = +var;
		int mVar = -var;
		
		System.out.println(pVar);  // +(-3)
		System.out.println(mVar);  // -(-3)
		
		
		
		System.out.println("증감연산자");
		System.out.println(a); //7
		System.out.println(++a); // 1. a를 1올린다,7->8 2. a를 출력한다
		System.out.println(a); 
		
		System.out.println(b);
		System.out.println(--b); // 1. b를 1내린다 2. b를 출력한다
		System.out.println(b);
		
		System.out.println(a); //8
		System.out.println(a++); //a를 출력한다 2. a를 1 올린다
		System.out.println(a); //
		
		System.out.println(b); //
		System.out.println(b--); // 1 b를 출력한다 2 b를 1내린다
		System.out.println(b);
		
		
		
	
	
	}

}
