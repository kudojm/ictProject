package com.ict03.class05;

public interface Ex01 {
	// 인터페이스는 : 서비스를 제공하는 목록과 같은 것이다.
	//				  상수와 추상메소드들로 이루어졌다.
	//				  생성자가 없다. (객체 생성 못함) => 실제 사용 못함 => 다중상속 가능
	//				  실제사용 하기 위해서는 인터페이스를 상속받은 클래스가 있고
	//				  상속받은 클래스를 사용하는 것이다.
	//	** '인터페이스'가 같다 라는말은 대체(호환)이 가능하다라는 뜻이다.
	
	// 인터페이스는 상수와 추상메소드만 가지고 있다.
	final int su1 = 10;
	static final int su2 = 20;
	int su3 = 30;
	static int su4 = 40;
	// 위 멤버필드들은 모두 static final이다.
	
	// 추상메소드가 아니므로 오류발생
	// public void play() {}
	
	public abstract void like();

	public  void sound();
}
