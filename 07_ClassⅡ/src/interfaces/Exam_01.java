package interfaces;

import java.util.Scanner;

abstract class Employee{
	
	String name;
	
	public Employee() {	}	// 기본 생성자

	public Employee(String name) {	
		this.name = name;
	}	// 인자 생성자
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	// 급여를 계산하는 메서드
	abstract int getPays();		// 추상메서드
	
}

// 정규직 클래스
class Permanent extends Employee {
	
	int salary;		// 급여
	int bonus;		// 보너스
	
	public Permanent() {	}	// 기본 생성자
	
	public Permanent(String name, int salary, int bonus) {	
		this.name = name;
		this.salary = salary;
		this.bonus = bonus;
	}	// 인자 생성자
	
	@Override
	int getPays() {		// 추상메서드 재정의
		return salary + bonus;
	}
	
}

// 임시직 클래스
class Temporary extends Employee {
	
	int time;	// 작업 시간
	int pays;	// 시간당 급여
	
	public Temporary() {	}	// 기본 생성자

	public Temporary(String name, int time, int pays) {	
		this.name = name;
		this.time = time;
		this.pays = pays;
	}	// 기본 생성자
	
	@Override
	int getPays() {		//  추상메서드 재정의
		return time * pays;
	}
	
}

public class Exam_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String pt;		// 고용형태 문자열 변수
		
		System.out.println("고용형태 - 정규직<P>, 임시직<T>을 입력하세요...");
		pt = sc.next();
		
		if(pt.equalsIgnoreCase("P")) {
			pt = "정규직";
			System.out.println("이름, 기본급, 보너스를 입력하세요...");
			Permanent permanent = new Permanent(sc.next(), sc.nextInt(), sc.nextInt());
			System.out.println("===================================");
			System.out.println("고용형태 : "+pt);
			System.out.println("이      름 : "+permanent.getName());
			System.out.printf("급      여 : %,d\n", permanent.getPays());
		} else if(pt.equalsIgnoreCase("T")) {
			pt = "임시직";
			System.out.println("이름, 작업시간, 시간당 급여를 입력하세요...");
			Temporary temporary = new Temporary(sc.next(), sc.nextInt(), sc.nextInt());
			System.out.println("===================================");
			System.out.println("고용형태 : "+pt);
			System.out.println("이      름 : "+temporary.getName());
			System.out.printf("급      여 : %,d\n", temporary.getPays());
		} else {
			System.out.println("잘못 입력했습니다.");
		}
		
		sc.close();
	}

}
