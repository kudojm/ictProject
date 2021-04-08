package com.ict07.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		// 복사 장소와 파일명을 받고
		// 붙이기 장소와 파일명을 받아서 붙이기 하자
		Scanner sc = new Scanner(System.in);
		
		System.out.print("복사 장소와 파일명 : ");
		String pathname_1 = sc.next();
		
		System.out.print("붙이기 장소와 파일명 : ");
		String pathname_2 = sc.next();
		
		File file1 = new File(pathname_1);
		File file2 = new File(pathname_2);
		
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			// 읽기
			fr = new FileReader(file1);
			br = new BufferedReader(fr);
			
			String msg = null;
			StringBuffer sb = new StringBuffer();
			
			while ((msg = br.readLine()) != null) {
				sb.append(msg + "\n");
			}
			// 쓰기
			fw = new FileWriter(file2);
			bw = new BufferedWriter(fw);
			//bw.write(sb.toString());
			
			//치환
			String str = sb.toString();
			str = str.replace("대한민국", "大韓民國");
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
