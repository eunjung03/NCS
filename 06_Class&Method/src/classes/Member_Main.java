package classes;

import java.util.Scanner;

/*
 * 생성자 다중정의(constructor overloading)
 * - 동일한 클래스에서 동일한 이름의 생성자를
 *   여러 개 정의하는 문법.
 * - 조건 : 매개변수의 자료형 또는 매개변수의 갯수가 달라야 함.
 * 
 * 생성자의 역할 
 * 1. 객체를 생성하는 역할
 * 2. 멤버변수의 초기값을 설정하는 역할.
 * 3. 객체를 생성하는 시점에 자동으로 처리해야 할 내용을 설정하는 역할.
 */

class Member{
	
	// 멤버변수
	String name;		// 회원 이름
	int age;			// 회원 나이
	String phone;		// 회원 연락처
	String job;			// 회원 직업
	
	public Member() { }		// 기본생성자
	public Member(String n, int a, String p, String j) { 
		name = n;
		age = a;
		phone = p;
		job = j;
	}		// 인자생성자
	
	void output() {
		System.out.println("회원 이름 >>> " + name);
		System.out.println("회원 나이 >>> " + age);
		System.out.println("회원 연락처 >>> " + phone);
		System.out.println("회원 직업 >>> " + job);
	}
}

public class Member_Main {

	public static void main(String[] args) {
		
		// 기본 생성자로 객체 생성
		Member mem = new Member();
		mem.name = "김유신";
		mem.age = 25;
		mem.phone = "010-1111-1234";
		mem.job = "화랑도";
		mem.output();
		System.out.println();
		
		// 인자 생성자로 객체 생성
		Member mem1 = new Member("김연아", 26, "010-2222-2345", "피겨선수");
		mem1.output();
		System.out.println();
		
		// 인자 생성자로 객체 생성 - 키보드 데이터 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.println("회원의 이름, 나이, 연락처, 직업을 입력하세요 >>> ");
		Member mem2 = new Member(sc.next(), sc.nextInt(), sc.next(), sc.next());
		mem2.output();
		
	}

}
