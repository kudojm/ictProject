package com.ict03.class01;

public class Ex06 {
	private String name = "홍길동";
	private int age = 24;
	private double height = 180.3;
	private char rank = 'A';
	
	// private 변수에 접근하기 위해서는 메소드를 사용해야 된다.
	// getter()
	// private는 보안이유 등 여러가지 문제로 직접적인 연결이 없는게 좋다.
	// return; 하는것들은 가지고 있는 값을 보내주기만 한다고 생각하자.
	public String k1() {
		
		return name;
	}
	
	public int k2() {
		
		return age;
	}
	
	public double k3() {
		
		return height;
	}
	
	public char k4() {
		
		return rank;
	}
	// 변수에 접근해서 해당 변수의 데이터를 변경할때 사용
	// setter
	// private를 불러와서 데이터를 입력할 틀을 만들어준다고 생각해보자.
	
	public void m1 (String t1) {
		name = t1;
	}
	public void m2 (int t1) {
		age = t1;
	}
	public void m3 (double t1) {
		height = t1;
	}
	public void m4 (char t1) {
		rank = t1;
	}
	
}

