package com.kh.Sandwich;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.kh.Hamburger.HamburgerOrder;

public class 샌드위치가게 {
	public static void main(String[] args) {
		//주문리스트 ArrayList
		List<샌드위치> 주문리스트 = new ArrayList<>();
		
		// "김하나", "BLT"
		// "이둘", "터키"
		// "김하나", "치킨"
		// "이셋", "에그마요"
		// "김하나", "베지터블"
		//고객명 HashSet
		주문리스트.add(new 샌드위치("김하나", "BLT"));
		주문리스트.add(new 샌드위치("이둘", "터키"));
		주문리스트.add(new 샌드위치("김하나", "치킨"));
		주문리스트.add(new 샌드위치("이셋", "에그마요"));
		주문리스트.add(new 샌드위치("김하나", "베지터블"));

		//중복제거리스트 ArrayList
		Set<String> 고객명 = new HashSet<>();
		List<샌드위치> 중복제거리스트 = new ArrayList<>();
		
		//중복여부를 확인하고 중복되지 않은 주문만 리스트에 추가
		for(샌드위치 주문 : 주문리스트) {
			//존재하는 고객만 추가하겠다라는 의미이기 때문에 추가가 안됨
			//if(중복고객제거.contains(주문.get고객명())) {
			if(!고객명.contains(주문.get고객명())) { //고객이 존재하지않는다면
				중복제거리스트.add(주문);					//주문 내용 추가
				고객명.add(주문.get고객명());
			}
		}
		//중복제거리스트 출력
		System.out.println(중복제거리스트);
		
		for(샌드위치 주문 : 중복제거리스트) {
			System.out.println(주문);
		}
		
		
		
		
	}
}
