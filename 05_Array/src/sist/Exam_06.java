package sist;

/*
 *		1
 *		2	3
 *		4	5	6
 *		7	8	9	10
 *	   11  12  13   14   15	
 * 
 */

public class Exam_06 {

	public static void main(String[] args) {
		
		// 1. 다차원 배열 선언 및 메모리 생성
		int[][] arr = new int[5][5];	// 전체적으로 0 값이 들어가 있음.
		int count = 1;

		// 2. 다차원 배열에 데이터를 추가해 보자.
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<=i; j++) {
				arr[i][j] = count++;
			}
		}	// 값을 넣지 않은 나머지 부분들은 여전히 0 값으로 존재함
		
		// 3. 다차원 배열을 화면에 출력해 보자.
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				String value = (arr[i][j] == 0) ? "" : ""+arr[i][j];	// 문자열로 출력됨
				System.out.print(value+"\t");
			}
			System.out.println();
		}
		

	}

}
