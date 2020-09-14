package sist;


/*
 * [문제3] 다중 for문을 사용한 별찍기
 */

public class Exam_03_01 {

	public static void main(String[] args) {

		// 올라가는 별 찍기
		for(int i=1; i<=6; i++) {		// i변수 : 라인 수
			for(int j=1; j<=i; j++) {	// j변수 : 별의 갯수
				System.out.print("*");
			}
			System.out.println();
		}
		// 내려가는 별 찍기
		for(int i=5; i>=1; i--) {		// i변수 : 별의 갯수
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
	}

}
