package sist;

import java.util.Scanner;

/*
 * 1 ~ 100 사이의 정수 중에서
 * 키보드로 5개의 정수를 입력받아서
 * 그 정수 중에서 최대값을 화면에 출력해 보자.
 * 예) 17, 34, 8, 93, 77
 */

public class Ex30 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int max = 0;		// 최대값 변수 : 항상 가장 작은 값을 넣어줄 것.
		int temp;
		int su = 1;			// 반복문에서 초기식
		
		while(su <= 5) {
			System.out.print(su+"번째 숫자 입력 : ");
			temp = sc.nextInt();
			
			if(temp > max) {
				max = temp;
			}
			su++;
		}
		
		System.out.println("최대값 >>> " + max);
		sc.close();
	}
}
