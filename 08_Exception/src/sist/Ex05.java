package sist;

public class Ex05 {

	public static void main(String[] args) {

		System.out.println("프로그램 시작");

		String str1 = "korea";
		String str2 = null; // null : 값이 없는 상태

		try {
			System.out.println("str1 문자열의 길이 >>> " + str1.length());
			System.out.println("str1 문자열의 길이 >>> " + str2.length());
		} catch (Exception e) {
			System.out.println("null 값을 갖는 오류 발생");
			System.out.println("예외 정보 : " + e);
		}

		System.out.println("프로그램 종료");

	}

}
