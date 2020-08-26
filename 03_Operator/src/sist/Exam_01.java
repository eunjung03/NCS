package sist;

public class Exam_01 {

	public static void main(String[] args) {

		// 1. 키보드로 국어, 영어, 수학, 자바 점수를 입력을 받자.
		int kor = Integer.parseInt(args[0]) ; // 국어 점수 키보드로 입력
		int eng = Integer.parseInt(args[1]); // 영어 점수 키보드로 입력
		int mat = Integer.parseInt(args[2]); // 수학 점수 키보드로 입력
		int java = Integer.parseInt(args[3]); // 자바 점수 키보드로 입력
		
		// 2. 총점을 구해야 한다.
		int total = kor + eng + mat + java;
		
		// 3. 평균을 구해야 한다.
		float avg = (float)total / 4;	// 4.0으로 하면 double형으로 인식
		
		// 4. 화면에 성적을 출력해 보자.
		System.out.println("국어점수 : " + kor + "점");
		System.out.println("영어점수 : " + eng + "점");
		System.out.println("수학점수 : " + mat + "점");
		System.out.println("자바점수 : " + java + "점");
		System.out.println("총     점  : " + total + "점");
		System.out.printf("평     균  : %.2f점", avg);
				
	}

}
