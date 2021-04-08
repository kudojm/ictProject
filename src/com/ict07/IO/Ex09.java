package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Ex09 {
	public static void main(String[] args) {

		// c:\\study\\util\\test100.txt ���Ͼȿ�
		// �̸� : 000
		// ���� : 000
		// ��ȭ��ȣ : 000-0000-0000 ��
		// �ۼ��ϴ� �ڵ��� �Ͻÿ�
		
		String pathname = "C:" + File.separator + "study" + File.separator + "Util" + File.separator + "test100.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(bos);
			
			String msg = "�̸� : �����\n���� : 25\n��ȭ��ȣ : 010-6635-7172";
			byte[] b = msg.getBytes();
			fos.write(b);
			fos.flush();
		} catch (Exception e) {
			
		} finally {
			try {
				bos.close();
				fos.close();
			} catch (Exception e2) {
				
			}
		}
	}
}