package method;

import java.util.Scanner;

public class Ex09 {
	
	// 총점을 구하는 메서드
	public static int total(int k, int e, int m) {
		return k + e + m;
	}
	
	// 평균을 구하는 메서드
	public static double average(int tot) {
		return tot / 3.0;
	}

	// 학점을 구하는 메서드
	public static String hakjum(double avg) {
		String grade = "";
		
		if(avg >= 90) {
			grade = "A학점";
		}else if(avg >= 80) {
			grade = "B학점";
		}else if(avg >= 70) {
			grade = "C학점";
		}else if(avg >= 60) {
			grade = "D학점";
		}else {
			grade = "F학점";
		}
		
		return grade;			
	}
	
	// 출력하는 메서드
		public static void output(int kor, int eng, int mat, int sum, double avg, String grade) {
			System.out.println("국어점수 : "+kor+"점");
			System.out.println("영어점수 : "+eng+"점");
			System.out.println("수학점수 : "+mat+"점");
			System.out.println("총      점 : "+sum+"점");
			System.out.printf("평      균 : %.2f점\n",avg);
			System.out.println("학      점 : "+grade);
		}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("국어 점수 입력 >>> ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수 입력 >>> ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수 입력 >>> ");
		int mat = sc.nextInt();
		
		// 1. 총점 메서드 호출
		int sum = total(kor, eng, mat);
		
		// 2. 평균 메서드 호출
		double avg = average(sum);
		
		// 3. 학점 메서드 호출
		String grade = hakjum(avg);
		
		// 4. 화면에 출력해 보자.
		output(kor, eng, mat, sum, avg, grade);
		
		sc.close();
	}

}
