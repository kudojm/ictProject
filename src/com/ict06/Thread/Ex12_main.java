package com.ict06.Thread;

public class Ex12_main {
	public static void main(String[] args) {
		System.out.println("main 시작");
		Ex12 t1 = new Ex12();
		Thread thread1 = new Thread(t1);
		thread1.start();
		
		// join() : 현재쓰레드는 join()을 호출한 스레드가 끝날 때 까지
		//			대기상태에 빠져 있다가 join()를 호출한 스레드가
		//			끝나면 다시 실행한다.
		//			즉, join을 호출한 스레드가 끝날 때 까지 실행 할 수 없다.
		System.out.println("main 끝");
	}
}
