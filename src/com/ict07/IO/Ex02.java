package com.ict07.IO;

import java.io.File;

public class Ex02 {
	public static void main(String[] args) {
		// File Ŭ������ ��� �ϱ� ���� Ư����ġ�� ����
		String pathname_1 = "C:\\Study\\javaStudy"; // �ü���� Windows �� ��
		String pathname_2 = "C:/Study/javaStudy";	// �ü���� Linux, Unix �� ��
		
		// �ü���� ������� ����ϴ� ���
		String pathname_3 = "C:" + File.separator + "Study" + File.separator + "javaStudy";
		
		File file = new File(pathname_3);
		String[] arr = file.list();
		for (String k : arr) {
			//System.out.println(k);
			File file2 = new File(pathname_3, k);
			//System.out.println(file2);
			if (file2.isDirectory()) {
				System.out.println("���丮 : " + file2);
			} else {
				System.out.println("���� : " + file2);
				
			}
		}
	}
}
