package classes;

import java.util.Scanner;

class NameCard{
	
	// 멤버변수
	String name;		// 이름
	String phone;		// 연락처
	String addr;		// 주소
	String position;	// 직급
	
	public NameCard() {}		// 기본 생성자
	
	public NameCard(String name, String phone, String addr, String position) {		// 인자 생성자
		this.name = name;
		this.phone = phone;
		this.addr = addr;
		this.position = position;
	}
	
	public void outPut(){
		System.out.println("=======================");
		System.out.println("이름 : "+name);
		System.out.println("전화번호 : "+phone);
		System.out.println("주소 : "+addr);
		System.out.println("직급 : "+position);
	}
}

public class Exam_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름, 전화번호, 주소, 직급을 입력하세요. >>> ");
		NameCard nc = new NameCard(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
		
		nc.outPut();
		
		sc.close();
	}

}
