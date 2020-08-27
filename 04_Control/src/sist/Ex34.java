package sist;

import java.util.Scanner;

/*
 * 신장별 표준 체중 대응표를 만들어 보자.
 * 표시할 신장의 범위(시작값/종료값/증가값)은 정수를 받아보자.
 * 표준체중구하는공식 : (신장 - 100) * 0.9
 */

public class Ex34 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 cm부터 표시할까요? : ");
		int start = sc.nextInt();		// 130cm
		
		System.out.print("몇 cm까지 표시할까요? : ");
		int end = sc.nextInt();			// 200cm
		
		System.out.print("몇 cm 단위로 표시를 할까요? : ");
		int step = sc.nextInt();		// 1cm
		
		System.out.println("신장\t표준체중");
		System.out.println(":::::::::::::::::::");
		
		for(int i=start; i<=end; i=i+step) {
			//System.out.println(i+"cm\t"+(i-100)*0.9)+"kg");
			System.out.printf("%dcm\t%.1fkg\n",i,((i-100)*0.9));
		}
		sc.close();
	}

}
