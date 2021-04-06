package com.ict05.collection;

import java.util.LinkedList;

public class Ex07 {
	public static void main(String[] args) {
		// Queue(ť) �������̽��� ������ Ŭ���� : LinkedList
		//           FIFO(First In First Out) : �������� ������ ���� ����
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		// �߰� , ���� : add, addFirst, addLast, offer, offerFirst, offerLast
		linkedList.add("����ȣ");
		linkedList.offer("�ڼ���");
		linkedList.add("�����");
		System.out.println(linkedList);
		
		linkedList.addFirst("�豤��");
		System.out.println(linkedList);
		
		linkedList.offerFirst("�Ѹ�");
		System.out.println(linkedList);
		
		if(linkedList.contains("�ڼ���")) {
			System.out.println(linkedList.indexOf("�ڼ���"));
			System.out.println(linkedList.get(linkedList.indexOf("�ڼ���")));
			System.out.println(linkedList.getFirst());
			System.out.println(linkedList.getFirst());
			System.out.println(linkedList.getLast());
			
		}
		System.out.println(linkedList.size() +" ��Ұ� ������");
		// �Ѹ��� �̴�ȣ�� ��������
		if (linkedList.contains("�Ѹ�")) {
			linkedList.set(linkedList.indexOf("�Ѹ�"), "�̴�ȣ");
		}
			System.out.println("����");
			
			// ���� : remove, removeFirst, removeLast 
			linkedList.removeFirst();
			System.out.println("�۽�Ʈ" + linkedList);
			
			linkedList.removeLast();
			System.out.println("��Ʈ" + linkedList);
			
			System.out.println(linkedList.remove(1)+"�� ���� �Ǿ����ϴ�.");
			System.out.println(linkedList);
	}
}