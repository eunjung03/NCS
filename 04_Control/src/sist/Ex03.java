package sist;

// 키보드로 입력받은 정수값이 음수이면 음수라고 화면에 출력해 보자.

public class Ex03 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		//1. 키보드로 정수를 입력 받자.
		int su = Integer.parseInt(args[0]);
		
		if(su < 0) {	//음수값인가 물어봄
			System.out.println("입력받은 수는 음수입니다.");
		}

		System.out.println("프로그램 종료");
		
	}

}
