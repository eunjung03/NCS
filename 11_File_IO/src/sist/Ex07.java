package sist;

import java.io.*;

public class Ex07 {

	public static void main(String[] args) {

		InputStreamReader isr = new InputStreamReader(System.in); // 보조스트림
		// InputStream면 bufferedStream. 
		// InputStreamReader면 bufferedReader.  형식 맞춰줘야함.
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("문자열을 입력하세요...");
		
		try {
			String str = br.readLine();		//문자열을 String으로 반환.
			
			System.out.println("입력받은 문자열 >>> "+str);
			
			// 입출력 객체 닫기 : 열어준 순서 반대로 닫아주는 것이 좋다.
			br.close(); isr.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
