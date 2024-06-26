package com.kh.test.main;

public class Test7 {
	public static void main(String[] args) {
		//배열에 들어있는 데이터 중 홀수의 값들을 출력하고 합을 구한다.
		//단, continue를 이용하여 작성한다.
		
		int[] 배열 = {1,2,3,4,5,6,7,8,9,10};
		double 합 = 0;
		
		//for-each 문을 사용해서 모두 돌고
		/*
		 for each문 : 컬렉션이나 배열을 반복해서 처음부터 끝까지 순회할 때 사용
 			 반복문을 간결하게 작성할 수 있고, 배열안에 있는 데이터 개수에 따라 자동으로 반복
 		for(자료형 변수명 : 컬렉션 or 배열){ //컬렉션 = List Set Map
 		//각 데이터마다 실행되는 코드
 		//데이터가 없으면 자동으로 for믄 탈출
 		}
		*/
		for(int num : 배열) {
			//if문을 사용해서 (%2 != 0)
			if(num %2 != 0) {
				System.out.println(num);
				//아니면 += 해주기
				합 += num;
			}
		}
		
		//합계 출력하기
		System.out.println("합계 : " +합);
	}
}
