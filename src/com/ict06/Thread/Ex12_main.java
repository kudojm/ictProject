package com.ict06.Thread;

public class Ex12_main {
	public static void main(String[] args) {
		System.out.println("main ����");
		Ex12 t1 = new Ex12();
		Thread thread1 = new Thread(t1);
		thread1.start();
		
		// join() : ���羲����� join()�� ȣ���� �����尡 ���� �� ����
		//			�����¿� ���� �ִٰ� join()�� ȣ���� �����尡
		//			������ �ٽ� �����Ѵ�.
		//			��, join�� ȣ���� �����尡 ���� �� ���� ���� �� �� ����.
		System.out.println("main ��");
	}
}
