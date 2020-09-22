package interfaces;

import java.util.Scanner;

interface Calculator{
	
	int add(int a, int b);		// 추상메서드
	int sub(int su1, int su2);	// 추상메서드
	double average(int[] arr);	// 추상메서드
	
}

class GoodCalc implements Calculator {	// 구현
	@Override
	public int add(int a, int b) {
		return a + b;
	}
	
	@Override
		public int sub(int su1, int su2) {
			return su1 - su2;
		}
	
	// 배열에 저장된 정수의 평균값을 반환(리턴)
	@Override
		public double average(int[] arr) {
			double sum = 0;
			for(int i=0; i<arr.length; i++) {
				sum += arr[i];
			}
			return sum / arr.length;
		}
}
public class Calculator_Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요...");
		int[] score = new int[sc.nextInt()];
		
		System.out.println("배열에 저장될 정수값을 입력하세요...");
		for(int i=0; i<score.length; i++) {
			score[i] = sc.nextInt();
		}
		
		GoodCalc calc = new GoodCalc();
		
		System.out.println("add() 메서드 호출 >>> "+calc.add(56, 44));
		System.out.println("sub() 메서드 호출 >>> "+calc.sub(56, 44));
		System.out.printf("average() 메서드 호출 >>> %.2f\n", calc.average(score));
		
		
		sc.close();
	}

}
