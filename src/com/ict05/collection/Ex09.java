package com.ict05.collection;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Ex09 {
	public static void main(String[] args) {
		// ���������� ������ �ش� ������ ������ ����ϴ� ���α׷�
		
		// 1. ����� ������ ������ �ִ� ������
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("�ѱ�", "����");
		map.put("���ѹα�", "����");
		map.put("KOREA", "����");
		map.put("korea", "����");
		map.put("�̱�", "������");
		map.put("�߱�", "����¡");
		map.put("�Ϻ�", "����");
		map.put("�±�", "����");
		map.put("ĳ����", "��Ÿ��");
		
		// ���� set �÷��ǿ� �־���.
		Set<String> sets = map.keySet();
		
		Scanner sc = new Scanner(System.in);
		
		esc:
		while (true) {
			System.out.print("���� : ");
			String msg = sc.next();
			if (sets.contains(msg)) {
				String result = map.get(msg);
				System.out.println(msg + "�� ������" + result + "�Դϴ�.");
			} else {
				System.out.println("�����Ϳ� ���� ���� �Դϴ�.");
			}
			
			while (true) {
				System.out.print("����ұ��? (y / n) : ");
				String str = sc.next();
				if (str.equalsIgnoreCase("y")) {
					continue esc;
				} else if (str.equalsIgnoreCase("n")) {
					break esc;
				} else {
					System.out.println("�߸� �Է� �ϼ̽��ϴ�");
					System.out.println("�ٽ� �Է� �ϼ���");
					continue;
				}
			}
		}
	}
}
