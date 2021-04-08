package com.ict07.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		// ���� ��ҿ� ���ϸ��� �ް�
		// ���̱� ��ҿ� ���ϸ��� �޾Ƽ� ���̱� ����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ��ҿ� ���ϸ� : ");
		String pathname_1 = sc.next();
		
		System.out.print("���̱� ��ҿ� ���ϸ� : ");
		String pathname_2 = sc.next();
		
		File file1 = new File(pathname_1);
		File file2 = new File(pathname_2);
		
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			// �б�
			fr = new FileReader(file1);
			br = new BufferedReader(fr);
			
			String msg = null;
			StringBuffer sb = new StringBuffer();
			
			while ((msg = br.readLine()) != null) {
				sb.append(msg + "\n");
			}
			// ����
			fw = new FileWriter(file2);
			bw = new BufferedWriter(fw);
			//bw.write(sb.toString());
			
			//ġȯ
			String str = sb.toString();
			str = str.replace("���ѹα�", "��������");
			bw.write(str);
			bw.flush();
			System.out.println(sb.toString());
		} catch (Exception e) {
		
		} finally {
			try {
				bw.close();
				fw.close();
				br.close();
				fr.close();
			} catch (Exception e2) {
			
			}
		}
		
	}
}
