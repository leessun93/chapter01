package com.javaex.ex01;

public class Ex09 {
	public static void main(String[] args) {
		
		//논리연산자
		
		int a = 5;
		int b = 7;
		
		//논리연산자 && -- 깐깐하다
		System.out.println("&&연산자");
		System.out.println(true&&true); //true
		System.out.println(true&&false); //false
		System.out.println(false&&true); //false
		System.out.println(false&&false); //false
		
		
		
		
		//&&연산자 응용
		System.out.println("&&연산자 응용");
		System.out.println( (a>b) && (a<b) ); // 5>7 && 5<7 = F && T = F
		System.out.println( (a>b) && (a>b) ); // 5>7 && 5>7 = F && F = F
		
		//논리연산자 || 착하다
		System.out.println("||연산자"); //
		System.out.println(true||true); // true
		System.out.println(true||false); //ture
		System.out.println(false||true); //ture
		System.out.println(false||false); //false
		
		//||연산자 응용
		System.out.println("||연산자 응용");
		System.out.println( (a>b)||(a<b) ); // 5>7||5<7 = F||T = T
		
		//논리연산자 ! --> 반대
		System.out.println(!true); // true의 반대 F
		System.out.println(!false); // flase의 반대 T
		
		System.out.println(a>b); //5>7 F
		System.out.println( !(a>b) ); // !f --> true
		
		int num = 3+2;
		int num=3 +2;
		
		
		
		
		
		
		
	}
}
