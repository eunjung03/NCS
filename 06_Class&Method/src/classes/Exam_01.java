package classes;

import java.util.Scanner;

class PersonEx{
	
	// 멤버변수
	String name;
	String gender;
	int age;
	
	public PersonEx() {}	// 기본 생성자
	
	public PersonEx(String name, String gender, int age) {	// 인자 생성자
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public void output() {
		System.out.println("이 름 : "+name);
		if(gender.equalsIgnoreCase("male")) {
			System.out.println("성 별 : 남자");
		}else if(gender.equalsIgnoreCase("female")){
			System.out.println("성 별 : 여자");
		}
		System.out.println("나 이 : "+age+"세");
	}

}

public class Exam_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 성별(male/female), 나이를 입력하세요. >>> ");
		
		PersonEx person = new PersonEx(sc.next(),sc.next(),sc.nextInt());
		System.out.println("===============================");
		
		person.output();

		sc.close();
	}

}
