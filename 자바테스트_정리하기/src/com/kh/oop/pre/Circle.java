package com.kh.oop.pre;

//인터페이스를 처음에 가져올 때는 빨간선이 생기는건 당연
//앞에서 작성한 미완성된 메서들르 완성해달라고 빨간색이 뜨는 것이기 때문!

public class Circle implements Shape, Drawble {
	//shape drawble 인터페이스 호출
	//위에서 작성한 메서드 재사용
	@Override
	public double Area() {
		return 4.8;
	}
	
	@Override
	public void draw() {
		System.out.println("원을 그립니다.");
	}
}
