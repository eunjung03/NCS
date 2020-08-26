package sist;

public class Exam_02 {

	public static void main(String[] args) {
		
		// 1. 임의의 숫자 하나를 키보드로부터 입력을 받자.
		int su = Integer.parseInt(args[0]);
		
		// 2. 임의의 숫자의 제곱근을 구하자.
		//    공식) 임의의 수 * 임의의 수	
		System.out.println("입력받은 정수 >>> " + su);
		System.out.println(su + "의 제곱근 >>> " + (su * su));
		
		
		
		// 3. 임의의 숫자의 세제곱근을 구하자.
		//    공식) 임의의 수 * 임의의 수 * 임의의 수 
		System.out.println(su + "의 세제곱근 >>> " + (su * su * su));

	}

}
