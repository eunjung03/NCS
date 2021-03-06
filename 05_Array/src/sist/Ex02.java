package sist;

import java.util.Scanner;

// 내가 여행가고 싶은 5개 나라를
// 키보드로 입력받아서 배열에 저장해 보자.

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 5개 나라 저장할 배열 선언
		String[] nation = new String[5];
		
//		System.out.print("첫번째 나라 입력 : ");
//		nation[0] = sc.nextLine();
//		
//		System.out.print("두번째 나라 입력 : ");
//		nation[1] = sc.nextLine();
//		
//		System.out.print("세번째 나라 입력 : ");
//		nation[2] = sc.nextLine();
//		
//		System.out.print("네번째 나라 입력 : ");
//		nation[3] = sc.nextLine();
//		
//		System.out.print("다섯번째 나라 입력 : ");
//		nation[4] = sc.nextLine();
		
		for(int i=0; i<5; i++) {
			System.out.print((i+1)+"번째 나라 입력 >>> ");
			nation[i] = sc.nextLine();
		}
		
		// 배열에 저장된 5개 나라를 출력해 보자.
		for(int i=0; i<5; i++) {
			System.out.println((i+1) + "번째 나라 >>> " + nation[i]);
		}
		
		// 단축 for문으로 출력
		for(String str : nation) {
			System.out.println("내가 가고 싶은 5개국 >>> " + str);
		}
		
		/*
		 * 단축 for문(개선된 for문)
		 * - java jdk 1.5버전부터 추가된 기능.
		 * - 주로 배열의 요소(원소, 값)를 처리(출력)할 때 사용.
		 *   형식)
		 *   		for(자료형 변수명 : 배열명){
		 *   			반복 실행문;
		 *   		}
		 *   실행)
		 *   - 배열의 첫번째 인덱스[0]에 있는 데이터를 좌변의 변수에 
		 *     할당하여 출력함. 데이터의 수만큼 자동 반복하여 출력됨.
		 *   주의)
		 *   - 우변의 배열명의 자료형과 좌변의 변수명의 자료형은 
		 *     반드시 일치해야 함.
		 *   - 만약 일치하지 않으면 error 발생.
		 */
		
		sc.close();
	}

}
