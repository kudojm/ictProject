package com.ict03.class03;


// Ex02와 Ex03은 지금부터 상속관계
public class Ex03 extends Ex02 {
	String name = "차두리";
	int age = 34;
	static String hobby = "영화보기";
	
	public Ex03() {
		System.out.println("자식 클래스 생성자");
	}
	
	public void sound() {
		// 객체 생성없이 부모클래스가 멤버를 사용한것
		System.out.println("자식 클래스 메소드");
	}
	
	public void study() {
		System.out.println("공부장소 : " + addr);
		
		System.out.println("name : " + name); // name은 전역변수에 있으니까 차두리들고옴 ㅇㅈ?
		System.out.println("name : " + super.name); // 이거는 즈그애미꺼 가져옴 차범근
		// 상속관계라도 private는 사용할 수 없다.
		// System.out.println("우리집 애완동물 : " + dog);
		
	}
	
	// 오버라이딩 : 부모메소드의 겉모양을 그대로 사용하면서 내용만 변경
	//	(재정의)
	@Override
	public void eat() {
		System.out.println("아침밥은 생략한다.");
	}
	
	// 오버라이딩을 할 수 없게하는 예약어 : final
}
