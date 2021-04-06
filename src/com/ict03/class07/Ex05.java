package com.ict03.class07;

// �͸� ���� Ŭ���� (Anonymous) : ����� ���� �߻�Ŭ������ �������̽����� ���� ���

abstract class Car {
	abstract void run();
}

class Bus extends Car {

	@Override
	void run() {
		System.out.println("�ü� 80km �� �޸���.");
	}
}

class Taxi extends Car {

	@Override
	void run() {
		System.out.println("�ü� 160km �� �޸���.");
	}
}

class Police extends Car {

	@Override
	void run() { 
	System.out.println("�ü� 200km �� �޸���");
	}
}
	class Ex05 {
		public static void main(String[] args) {
			Bus bus = new Bus();
			bus.run();
			System.out.println();
			
			Car car = new Taxi();
			car.run();
			
			Car car2 = new Car() {

				@Override
				void run() {
					System.out.println("������ �޸���.");
				}
				
			};
			car2.run();
	
	
	
	
	}
}