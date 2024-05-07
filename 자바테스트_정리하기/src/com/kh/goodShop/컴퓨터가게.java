package com.kh.goodShop;

import java.util.*;

public class 컴퓨터가게 {
	public static void main(String[] args) {
		//모든 제품으로 HashMap
		Map<String, Integer> 상품 = new HashMap<>();
		//상품추가 put
		//노트북 700000
		상품.put("노트북", 700000);
		//데스크탑 20000
		상품.put("데스크탑", 20000);
		//모니터 5000
		상품.put("모니터", 5000);
		//마우스 3000
		상품.put("마우스", 3000);
		//키보드 2000
		상품.put("키보드", 2000);
		
		System.out.println("컴퓨터 상품 목록");
		//Entry 사용해서 출력
		for(Map.Entry<String, Integer> e : 상품.entrySet()) {
			String 제품명 = e.getKey();
			int 제품가격 = e.getValue();
			System.out.println(제품명+"은 "+제품가격+"원");
		}
		
		//특정 물품의 가격 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("찾는 물건 : ");
		String 찾는물건 = sc.nextLine();
		
		System.out.println(찾는물건+ "는 가게에 있습니까? ");
		
		//containsKey 존재하는지 존재하지 않는지 if문 사용해서 확인 후
		if(상품.containsKey(찾는물건)) {
			int 제품가 = 상품.get(찾는물건);
			System.out.println("네~! 가격은 " +제품가+ "입니다.");
		}else {
			System.out.println("현재 품절입니다.");
		}
		//존재한다면 네~! 존재합니다.
		//존재하지않는다면 현재 품절입니다.
	}
}
