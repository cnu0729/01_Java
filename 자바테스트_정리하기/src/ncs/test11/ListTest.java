package ncs.test11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListTest {
	
	//리스트 출력 메서드
	public static void display(List<Integer> list) {
		for(int num : list) {
			System.out.println(num + " ");
		}
	}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Random random = new Random();
		
		//1부터 100 사이에 임의의 정수 10개를 생성해서 리스트에 추가
		for(int i = 0; i<10; i++) {
			list.add(random.nextInt(100)+1);
		}
		System.out.print("정렬전 : ");
		display(list); // List 밑에 비슷하게 행동하고 비슷하게 생긴 메서드가 
		
		//내림차순 정렬
		Collections.sort(list, new Decending());
		
		System.out.print("정렬후 : ");
		display(list);
		

	}

}
