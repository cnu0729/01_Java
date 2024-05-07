package com.kh.test.main;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		
		Scanner 스캐너 = new Scanner(System.in);
		System.out.println("두 정수를 입력하세요.");
		System.out.print("숫자 1 : ");
		int 숫자1 = 스캐너.nextInt();
		System.out.print("숫자 2 : ");
		int 숫자2 = 스캐너.nextInt();
		
		//두 수가 모두 1부터 9까지의 수인지 한 번에 확인!
		if(숫자1 >= 1 && 숫자1 <= 9 && 숫자2 >= 1 && 숫자2 <= 9) {
			//두 수가 1~9일 때 곱하기
			int 곱 = 숫자1 * 숫자2;
			
			//두 수의 곱이 한자리 수인지 두자리 수인지 확인
			if(곱 >= 1 && 곱<= 9) {
				System.out.println("한자리 수 입니다.");
			}else {
				System.out.println("두자리 수 입니다.");
			}
		}else {
			System.out.println("입력 한 수 중에서 1~9가 아닌 수가 있습니다.");
		}
	}
	

	
}
