package sist;

import java.util.Scanner;

/*
 * [문제] 배열에 5개의 정수를 키보드를 이용하여 저장 후 ,
 * 		  배열에 저장된 정수를 화면에 출력해 보세요.
 * 		  조건) 일반 for문과 단축 for문을 이용하여 출력할 것.
 */

public class Ex03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 1. 배열 선언 및 배열 메모리 생성
		int[] arr = new int[5];
		
		// 2. 배열의 초기화 작업
		for(int i=0; i<5; i++) {
			System.out.print((i+1)+"번째 정수 입력 >>> ");
			arr[i] = sc.nextInt();
		}
		System.out.println();
		
		// 3. 배열에 저장된 데이터를 일반 for문을 이용하여 화면에 출력해 보자.
		for(int i=0; i<5; i++) {
			System.out.println("arr["+i+"] >>> "+arr[i]);
		}
		System.out.println();
		
		// 4. 단축 for문을 이용하여 화면에 출력해 보자.
		for(int num : arr) {
			System.out.println("arr 배열의 요소 >>> "+num);
		}
		
		sc.close();
	}

}
