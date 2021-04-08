package com.ict07.IO;

import java.io.File;
import java.text.SimpleDateFormat;

public class Ex02 {
	public static void main(String[] args) {
		// File 클래스를 사용 하기 전에 특정위치를 지정
		String pathname_1 = "C:\\Study\\javaStudy"; // 운영체제가 Windows 일 때
		String pathname_2 = "C:/Study/javaStudy";	// 운영체제가 Linux, Unix 일 때
		
		// 운영체제와 상관없이 사용하는 방법
		String pathname_3 = "C:" + File.separator + "Study" + File.separator + "javaStudy" + File.separator + "MyProject";
		File file = new File(pathname_3);
		String[] arr = file.list();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");

		for (String k : arr) {
			// System.out.println(k);
			File file2 = new File(pathname_3, k);
			// System.out.println(file2);
			// 컴퓨터에 저장할 수 있는 종류는 디렉토리와 파일 밖에 없다.
			
			// 수정날짜 구하기 
			
			if(file2.isDirectory()) {
				System.out.println("디렉토리 : " + file2 +"\n크기 : 크기가 존재하지 않음\n"+
									"수정한 날짜 : "+sdf.format(file2.lastModified()));
			}else {
				System.out.println("파일 : " + file2+
						"\n크기 : "+ (int)(file2.length()/1024)+"KB \n"+
						"\n수정한 날짜 : "+sdf.format(file2.lastModified()));
			}
		}
	}
}
