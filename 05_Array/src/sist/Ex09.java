package sist;

import java.util.Scanner;

// 배열 공유

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수형 배열 크기 입력 : ");
		
		int[] arr = new int[sc.nextInt()];
		int[] arrCopy = arr;	// arr배열의 주소값을 복사하는 것. 상당히 중요한 개념(Call by Reference)
		System.out.println("배열의 크기만큼 정수값을 입력하세요...");
		
		// 정수형 배열에 키보드로 정수값을 입력하자.
		for(int i=0; i<arr.length; i++) {
			arrCopy[i] = sc.nextInt();
		}
		
		arrCopy[3] = 100;
		
		// 정수형 배열에 저장된 정수값을 출력해 보자.
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"] >>> "+arr[i]);
		}
		
		sc.close();
	}

}
