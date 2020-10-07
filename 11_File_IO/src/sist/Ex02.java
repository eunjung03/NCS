package sist;

import java.io.IOException;

public class Ex02 {

	public static void main(String[] args) {
		
		System.out.println("한 줄을 입력하세요...");
		int num;
		
		try {
			// 엔터를 치지 않으면 계속 실행해라. 엔터 치면 끝남
			while((num = System.in.read()) != '\n') {
				System.out.print((char)num);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
