package com.ict03.class01;

public class Ex03 {
		// �޼ҵ� : ���, ����
		//  - �޼ҵ带 ȣ���ϸ� �ش� �޼ҵ尡 ����ȴ�.
		//	- ������ ������ �޼ҵ带 ȣ���� ������ �ǵ��� ����.
		//  - �ǵ��� ���� ����� ������ ���� ���� �ƴ� ���� ��������.
		//	  �̶� ����� ���� �ʴ� ��츦 void��� �Ѵ�.
		//	  ����� �޴� ��� �� ����� �ڷ����� ��ȯ���̶�� �Ѵ�.
		//	  ��ȯ���� �ִ� ��쿡�� �ݵ�� "return ����������"�� �������ٿ� �����ؾ� �Ѵ�.
		
	// ��ȯ�� ����
	int s1 = 10;
	int s2 = 5;
	int result = 0;
	
	public void plus01() {
		System.out.println(2);
		result = s1 + s2;
	}
	
	// ��ȯ���� �ִ� ���
	public int sub01() {
		int res = s1 - s2;
		return res;
	}
}