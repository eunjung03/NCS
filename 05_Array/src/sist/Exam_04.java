package sist;

/*
 *  1	 2	 3 	 4	 5
 *  6	 7	 8	 9	10
 * 11	12	13	14	15
 * 16	17	18	19	20
 * 21	22	23	24	25
 * 
 * - 2차원배열(5행5열)
 */

public class Exam_04 {

	public static void main(String[] args) {

		// 1. 2차원 배열 선언 및 메모리 할당
		int[][] arr = new int[5][5];
		int num = 1;
		
		// 2. 5행5열 다차원 배열에 데이터를 저장하자.
		for(int i=0; i<arr.length; i++) {			//행
			for(int j=0; j<arr[i].length; j++) {	//열
				arr[i][j] = num++;
			}
		}
		
		// 3. 다차원 배열의 화면에 출력해 보자
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%2d\t", arr[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
