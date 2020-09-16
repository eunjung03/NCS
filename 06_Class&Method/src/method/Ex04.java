package method;

import java.util.Scanner;

public class Ex04 {
	
	public static void plus(int a1, int a2) {
		System.out.println("덧셈 >>> "+(a1+a2));
	}
	
	public static void minus(int a1, int a2) {
		System.out.println("뺄셈 >>> "+(a1-a2));
	}
	
	public static void mul(int a1, int a2) {
		System.out.println("곱셈 >>> "+(a1*a2));
	}
	
	public static void divide(int a1, int a2) {
		System.out.println("나눗셈(몫) >>> "+(a1/a2));
	}
	
	public static void mod(int a1, int a2) {
		System.out.println("나머지 >>> "+(a1%a2));
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1. 키보드로 두 개의 정수와 연산자를 입력을 받자.
		System.out.print("첫번째 정수 입력 >>> ");
		int su1 = sc.nextInt();
		
		System.out.print("두번째 정수 입력 >>> ");
		int su2 = sc.nextInt();
		
		System.out.print("연산자 입력 >>> ");
		String op = sc.next();
		
		// 2. 연산자 변수에 입력된 연산기호를 가지고 해당 기호에 맞는 
		//	    메서드를 호출해 보자.
		switch(op) {
		case "+" :
			plus(su1, su2);
			break;
		case "-" :
			minus(su1, su2);
			break;
		case "*" :
			mul(su1, su2);
			break;
		case "/" :
			divide(su1, su2);
			break;
		case "%" :
			mod(su1, su2);
			break;
		}
		
		sc.close();
	}

}
