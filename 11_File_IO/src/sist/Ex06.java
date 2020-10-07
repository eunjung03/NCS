package sist;

import java.io.*;

// 파일 입출력 소스 중에 Ex04 소스를
// 읽어 들여서 콘솔 창에 출력해 보자.

public class Ex06 {

	public static void main(String[] args) {
		
		Reader reader = null; 
				
		int readByte;
		
		try {
			reader = new FileReader("C:/NCS/workspace(java)/11_File_IO/src/sist/Ex04.java");
			
			while(true) {	// 무한반복
				readByte = reader.read();
				
				if(readByte == -1) {
					break;
				}
				System.out.print((char)readByte);
			}
			// 파일 입출력과 관련된 객체는 닫아주는 것이 좋다.
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
