package sist;

/*
 * [문제5]
 * 1 - 2 + 3 - 4 + 5 - 6 + ... - 100
 */

public class Exam_05 {

	public static void main(String[] args) {

		int sum = 0;		// 누적 변수
		
		for(int i=1; i<=100; i++) {
			if(i%2 == 1) {
				sum += i;
			}else {
				sum -= i;
			}
		}
		System.out.println("sum >>> "+sum);
	}

}
