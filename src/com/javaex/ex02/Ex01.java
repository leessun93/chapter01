package com.javaex.ex02;

public class Ex01 {
	
	public static void main(String[] args) {
		
		
		//println() 과 print()의 차이점 줄바꿈과 같은줄
		System.out.print("안녕");
		System.out.println("하세요");
		System.out.println("안녕하세요");
		System.out.println("============================================");
		
		//println() 사용법
		int i = 2345;
		double d = 3.14;
		String str = "국뭐닝";
		char c = '한';
		String s = "한";

		String name = "이선흠";
		
		System.out.println("안녕하세요");  //안녕하세요
		System.out.println(str); //국뭐닝
		System.out.println(i); // 2345
		System.out.println(d); //3.14
		
		System.out.println(str+str); //국뭐닝국뭐닝
		System.out.println(str+i); //국뭐닝2345
		System.out.println(str+d);
		System.out.println(str+c);
		//국모닝 이랑 2345
		System.out.println(str+" 이랑 "+i); // 국모닝 " 이랑 "2345
		
		System.out.println(i+i); // 23452345
		System.out.println(i+d); // 2318.14
		System.out.println(i+i);
		System.out.println(i*i);
		
		System.out.println(c+c);// 숫자 더하기 숫자
		System.out.println(c+s);// 문자 더하기 문자
		
		
		
		System.out.println("제이름은 "+name+" 입니다."); // 제이름은 이선흠 입니다.
		System.out.println("안녕\"하\"세요"); //하면 "출력 쌉가능 (\")\
		System.out.println("안녕\\하\\세요"); // 안녕\하\세요 \\두개 써야함
		
	}

}
