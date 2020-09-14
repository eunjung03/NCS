package sist;

import java.util.Scanner;

/*
 * [문제2] 1부터 사용자가 입력한 수까지의 
 * 		    홀수의 합과 짝수의 합을 구해 보세요. 
 */

public class Exam_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 >>> ");
		int su = sc.nextInt();
		
		int oddSum=0, evenSum=0;
		
		for(int i=1; i<=su; i++) {
			if(i%2 == 1) {
				oddSum += i;
			}else {
				evenSum += i;
			}
		}
		
		System.out.printf("홀수의 합 >>> %d\n",oddSum);
		System.out.printf("짝수의 합 >>> %d\n",evenSum);

		sc.close();
	}

}
