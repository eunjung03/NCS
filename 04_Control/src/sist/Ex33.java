package sist;

import java.util.Scanner;

/*
 * [문제1] for문을 이용하여 1~100까지의 홀수의 합과 짝수의 합을 구하시오.
 * [문제2] 키보드로 입력받은 수까지의 홀수의 합과 짝수의 합을 구하시오.
 */

public class Ex33 {

	public static void main(String[] args) {

		// [문제1]
		System.out.println("문제[1]");
		int even=0, odd=0;
		for(int num=1; num<=100; num++) {	// 홀수의 합과 짝수의 합을 구함.
			if(num%2 == 0) {
				even += num;
			}else {
				odd += num;
			}
		}
		System.out.println("홀수의 합은 >>> "+odd);
		System.out.println("짝수의 합은 >>> "+even);
		System.out.println("**********************");
		
		// [문제2]
		System.out.println("문제[2]");
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요. : ");
		int su = sc.nextInt();
		
		int even1=0, odd1=0;
		for(int i=1; i<=su; i++) {	// 홀수의 합과 짝수의 합을 구함.
			if(i%2 == 0) {
				even1 += i;
			}else {
				odd1 += i;
			}
		}
		System.out.println("홀수의 합은 >>> "+odd1);
		System.out.println("짝수의 합은 >>> "+even1);
		
		sc.close();
	}

}
