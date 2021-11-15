package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("근무시간 :");
		
		int worktime = sc.nextInt();
		
		if(worktime<=8) {
			System.out.println("임금은" + worktime*10000 +"입니다.");
		}else if(worktime>8) {
			System.out.println("임금은" +worktime*10000*1.5 + "입니다");
		}

		
		
		sc.close();
	}

}
