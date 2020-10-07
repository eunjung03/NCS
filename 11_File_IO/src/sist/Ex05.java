package sist;

import java.io.*;

public class Ex05 {

	public static void main(String[] args) {

		InputStream is = null;
		
		int readByte;

		try {
			is = new FileInputStream("C:/test/sample.txt"); // 1byte씩 읽어옴.

			while (true) { // 무한반복
				readByte = is.read();
				
				// 더 이상 읽을 데이터가 없는 경우 -1 값을 반환.
				if(readByte == -1) {
					break;
				}
				
				System.out.print((char)readByte);
			}
			// 파일 입출력 관련 객체는 닫아주는 것이 좋다.
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
