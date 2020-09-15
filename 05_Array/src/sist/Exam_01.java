package sist;

// 배열에 저장된 데이터 중에서 최대값, 최소값 화면에 출력하기

import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 >>> ");
		int[] arr = new int[sc.nextInt()];
		
		// 최대값 변수, 최소값 변수 선언 
		int max = 0, min = 99;
		
		// 배열에 키보드를 이용하여 임의의 정수를 입력을 받자.
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1)+"번째 값을 입력하세요 >>> ");
			arr[i] = sc.nextInt();
			
			// 최대값을 구해 보자.
			if(arr[i] > max) {
				max = arr[i];
			}
			
			// 최소값을 구해 보자.
			if(arr[i] < min) {
				min = arr[i];
			}
		} // for문 end
		
		System.out.println("최대값 >>> "+max);
		System.out.println("최소값 >>> "+min);
		
	
		sc.close();
	}

}
