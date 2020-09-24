package sist;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		System.out.println("프로그램 시작");

		Scanner sc = new Scanner(System.in);

		// System.out.println("정수를 입력하세요...");

		int su = 0;

		try {
			su = sc.nextInt();
		} catch (Exception e) {
			System.out.println("정수만 입력하세요.");
			System.out.println("예외 정보 : " + e);
		} finally {
			sc.close();
		}

		System.out.println("입력받은 정수 >>> " + su);
		System.out.println("프로그램 종료");
	}
}
