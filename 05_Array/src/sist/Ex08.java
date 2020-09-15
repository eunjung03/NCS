package sist;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 배열의 크기를 입력하시오 : ");
		
		String[] str = new String[sc.nextInt()];
		System.out.println("5개의 문자열을 입력하세요. ");
		
		// 배열에 문자 입력
		for(int i=0; i<str.length; i++) {
			str[i] = sc.next();		
		}
		
		System.out.println();
		
		// str 배열에 저장된 문자열 검색
		System.out.print("검색할 문자열 입력 : ");
		String search = sc.next();
		
		for(int i=0; i<str.length; i++) {
			if(search.equals(str[i])) {
				System.out.println("찾은 문자열 >>> "+str[i]);
				System.out.println("찾은 인덱스 >>> str["+i+"]");
			}
		}
		
		
		sc.close();
	}

}
