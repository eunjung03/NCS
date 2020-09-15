package sist;

import java.util.Scanner;

public class Exam_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		//키보드로 입력받은 5개의 정수를 배열에 저장
		System.out.println("5개의 정수를 입력하세요 ");
		for(int i=0; i<5; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 내림차순으로 정렬하기
		int temp = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println();
		
		// 내림차순으로 정렬된 배열을 화면에 출력
		System.out.println("=== 내림차순으로 정렬 ===");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		
		
		sc.close();
	}

}
