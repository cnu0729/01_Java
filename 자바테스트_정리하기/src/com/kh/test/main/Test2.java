package com.kh.test.main;

public class Test2 {
	public static void main(String[] args) {
		/*
		 2단에서 5단까지의 구구단 결과 중 홀수인 것만 출력한다.
		 단, for문을 이용한다.
		*/
		
		for(int 단=2; 단<=5; 단++) {
			for(int num=1; num<=9; num++){
				if(단%2!=0 && num%2!=0) {
					System.out.println(단+"*"+num+" = "+(단 * num));
				}
			}
		}
		
		
		// i 만 홀수
		for(int 단=2; 단<=5; 단++) {
			System.out.println("=== " +단+"단 ===");
			for(int i = 1; i<=9; i += 2) { //숫자에 2씩 증가하기
				System.out.println(단 +" * "+ i + " = " +(단*i));
			}
		}
	}
}
