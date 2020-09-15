package sist;

import java.util.Scanner;

public class Exam_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 학생배열 생성 후 학생수 입력
		System.out.print("학생 수를 입력하세요. : ");
		
		//int num = sc.nextInt();
		
		// 1. 학생이름, 국어점수, 영어점수, 수학점수
		//	    총점, 평균, 학점, 순위 배열이 필요하다.
		String[] name = new String[sc.nextInt()];
		int[] kor = new int[name.length];
		int[] eng = new int[name.length];
		int[] mat = new int[eng.length];
		int[] tot = new int[eng.length];
		double[] avg = new double[name.length];
		String[] grade = new String[name.length];
		int[] rank = new int[name.length];
		
		// 2. 학생 수만큼 이름, 국어점수, 영어점수, 수학점수를 
		//	    키보드로 입력을 받아서 각각의 배열에 저장을 하자.
		for(int i=0; i<rank.length; i++) {
			
			System.out.print("학생 이름 입력 : ");
			name[i] = sc.next();
			
			System.out.print("국어 점수 입력 : ");
			kor[i] = sc.nextInt();
			
			System.out.print("영어 점수 입력 : ");
			eng[i] = sc.nextInt();
			
			System.out.print("수학 점수 입력 : ");
			mat[i] = sc.nextInt();
			
			
			
			///// 이름과 각 과목의 점수 배열 저장 /////
			
			// 3. 총점을 구하자.
			tot[i] = kor[i] + eng[i] + mat[i];
			
			// 4. 평균을 구하자.
			avg[i] = tot[i] / 3;
			
			// 5. 학점을 구하자.
			if(avg[i] >= 90) {
				grade[i] = "A학점";
			}else if(avg[i] >= 80) {
				grade[i] = "B학점";
			}else if(avg[i] >= 70) {
				grade[i] = "C학점";
			}else if(avg[i] >= 60) {
				grade[i] = "D학점";
			}else {
				grade[i] = "F학점";
			}
			
			// 6. 석차를 구하자.
			//    모든 학생은 본인이 1등이라고 생각한다.
			rank[i] = 1;
			
			System.out.println();
		} // for문 end
		
		// 진짜로 석차를 구하자.
		for(int i=0; i<rank.length; i++) {
			for(int j=0; j<rank.length; j++) {
				if(tot[i] < tot[j]) {
					rank[i]++;	// 내 등수가 1 ++
				}
			}
		}
		
		// 마지막으로 성적을 화면에 출력해 보자.
		for(int i=0; i<rank.length; i++) {
			System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			System.out.print("이    름 : "+name[i]+"\t");
			System.out.print("총    점 : "+tot[i]+"점\t");
			System.out.printf("평    균  : %.2f점\t", avg[i]);
			System.out.print("학    점 : "+grade[i]+"\t");
			System.out.print("석    차  : "+rank[i]+"등\t");
			System.out.println();
		}
		
		sc.close();
	}

}
