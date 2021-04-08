package com.ict07.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex07 {
	public static void main(String[] args) {
		// 1. FileInputStream ; 파일을 대상으로 1byte씩 데이터을 읽기를 할 수 있는 스트림
		//  - 생성자 : FileInputStream(File file), FileInputStream(String name)
		//     File file, String name => 특정위치 + 파일이름
		//  - 주요 메소드
		//    read() : int -> 결과가 숫자(아스키코드)로 나옴
		//                    char형으로 형변환 해야 문자가 된다.
		//                    더 이상 읽을 수가 없을 때 -1 이 나온다.
		//                    비 영어권 문자는 읽을 수 없다.
		
		//   read(byte[] b) : int -> 배열을 만들어서 인자에 넣으면 
		//                           배열크기만큼 문자을 읽을 수 있다.
		//                           (byte[] b에 읽을 문자들이 배열크기만큼 저장된다.)
		
		//   close : open된 스트림 닫기(사용 후 닫기), 보통 finally에서 처리 
		
		String pathname = "C:"+File.separator+"study"+File.separator+"util"
							+ File.separator+"ict01.txt";
		File file = new File(pathname);
		FileInputStream fis = null;
		try {
		    fis = new FileInputStream(file);
		    
		    // 한글자 읽어오기 : read() => 숫자(아스키코드) -> 형변환
		    int k = fis.read();
		    System.out.println(k + ":" + (char)(k));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}







