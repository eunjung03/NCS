package sist;

import java.util.Scanner;

// 키보드로 문자열 배열 크기를 입력받아서 
// 배열에 저장 후 화면에 출력해 보자.

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 배열의 크기를 입력하시오 : ");
		
		String[] arr = new String[sc.nextInt()];
		System.out.println("5개의 문자열을 입력하세요. ");
		
		// 배열에 문자 입력
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.next();		// 위의 println 때문에 nextLine하면 엔터키가 먹는다.
		}
		System.out.println();
		
		// 화면에 배열 출력
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"] >>> "+arr[i]);
		}
		
		sc.close();
	}

}
