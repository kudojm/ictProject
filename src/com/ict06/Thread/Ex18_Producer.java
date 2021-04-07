package com.ict06.Thread;

import java.util.Iterator;

public class Ex18_Producer implements Runnable {
	// Ŭ������ �ڷ������� ���(�����ڷ���)
	private Ex17_Car car;

	// �����ڿ��� ���� ���ڴ� ������ ���������� ������.
	public Ex18_Producer(Ex17_Car car) {
		// ���������� ���������� �̸��� ���� �� �������� �տ� this�� ������.
		this.car = car;
	}

	public void run() {
		String carName = null;
		for (int i = 0; i < 20; i++) {
			// �ڵ��� ����
			carName = car.getCar();
			// ����� �ڵ����� â���� ����
			car.push(carName);

			try {
				Thread.sleep((int) (Math.random() * 200));
			} catch (InterruptedException e) {
				e.printStackTrace();

			}

		}
	}
}