package sist;

import java.util.Scanner;

// [문제] 키보드로 입력 받은 수까지의 홀수의 합과
//		 짝수의 합을 구하여 화면에 출력해 보세요.

public class Ex28 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 숫자를 입력받는다.
		System.out.print("숫자를 입력하세요. : ");
		int num = sc.nextInt();
		
		// 입력받은 숫자까지의 홀수의 합, 짝수의 합을 구한다.
		int su = 1, even=0, odd=0;
		
		while(su <= num) {
			if(su%2 == 0) {
				even += su;
				su++;
			}else {
				odd += su;
				su++;
			}
		}
		
		// 화면에 출력한다.
		System.out.println("홀수의 합 >>> "+ odd);
		System.out.println("짝수의 합 >>> "+ even);
		
		sc.close();
	}

}
