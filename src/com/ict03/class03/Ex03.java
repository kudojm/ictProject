package com.ict03.class03;


// Ex02�� Ex03�� ���ݺ��� ��Ӱ���
public class Ex03 extends Ex02 {
	String name = "���θ�";
	int age = 34;
	static String hobby = "��ȭ����";
	
	public Ex03() {
		System.out.println("�ڽ� Ŭ���� ������");
	}
	
	public void sound() {
		// ��ü �������� �θ�Ŭ������ ����� ����Ѱ�
		System.out.println("�ڽ� Ŭ���� �޼ҵ�");
	}
	
	public void study() {
		System.out.println("������� : " + addr);
		
		System.out.println("name : " + name); // name�� ���������� �����ϱ� ���θ����� ����?
		System.out.println("name : " + super.name); // �̰Ŵ� ��׾ֹ̲� ������ ������
		// ��Ӱ���� private�� ����� �� ����.
		// System.out.println("�츮�� �ֿϵ��� : " + dog);
		
	}
	
	// �������̵� : �θ�޼ҵ��� �Ѹ���� �״�� ����ϸ鼭 ���븸 ����
	//	(������)
	@Override
	public void eat() {
		System.out.println("��ħ���� �����Ѵ�.");
	}
	
	// �������̵��� �� �� �����ϴ� ����� : final
}
