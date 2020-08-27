package sist;

public class Ex26 {

	public static void main(String[] args) {

		// while 반복문으로 1~10까지의 합을 구해 보자.
		int su = 1;			// 반복문에서 초기식
		int sum = 0;		// 합을 저장하는 변수
		
		while(su <= 10)	{
			sum += su;		// 누적변수
			su++;			// 반복문에서 증감식
		}
		
		System.out.println("sum >>> " + sum);
	}

}
