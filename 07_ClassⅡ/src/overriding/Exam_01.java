package overriding;

import java.util.Scanner;

class Employee{		// 부모클래스
	
	// 멤버변수
	String name;	// 이름

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	// 상속을 받을 클래스에서 재정의를 진행할 메서드
	int getPays(){
		return 0;
	}
}

class Permanent extends Employee{	// 정규직 클래스(자식 클래스)
	
	// 멤버변수
	// String name; 
	private int pay;		// 급여
	private int bonus;		// 보너스
	
	public Permanent() {	}	// 기본 생성자
	
	public void Permanent(String name, int pay, int bonus) {
		this.name = name;
		this.pay = pay;
		this.bonus = bonus;
	}	// 인자 생성자
	
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	@Override
		int getPays() {	// 메서드 재정의
			return pay+bonus;
		}
	
}

class Temporary extends Employee{
	
	// 멤버변수
	private int time;		// 작업시간
	private int pay;	// 시간당 급여
	
	public Temporary() {	}	// 기본 생성자
	
	public Temporary(String name, int time, int pay) {	
		this.name = name;
		this.time = time;
		this.pay= pay;
	}	// 인자 생성자

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	@Override
	int getPays() {	// 메서드 재정의
		return pay*time;
	}
	
}

public class Exam_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String pt = null;		// 고용형태를 저장할 문자열 변수
		
		System.out.println("고용형태-정규직<P>, 임시직<T>을 입력하세요...");
		pt = sc.next();
		
		if(pt.equalsIgnoreCase("P")) {
			pt = "정규직";
			System.out.println("이름, 기본급, 보너스를 입력하세요...");
			Permanent permanent = new Permanent();
			permanent.setName(sc.next());
			permanent.setPay(sc.nextInt());
			permanent.setBonus(sc.nextInt());
			
			System.out.println("=======================================");
			System.out.println("고용형태 : "+pt);
			System.out.println("이      름 : "+permanent.getName());
			// 재정의한 메서드 호출
			System.out.printf("급여 : %,d원\n", permanent.getPays());
		}else if(pt.equalsIgnoreCase("T")) {
			pt = "임시직";
			System.out.println("이름, 작업시간, 시간당 급여를 입력하세요....");
			Temporary temporary = new Temporary(sc.next(), sc.nextInt(), sc.nextInt());
			
			System.out.println("=======================================");
			System.out.println("고용형태 : "+pt);
			System.out.println("이      름 : "+temporary.getName());
			// 재정의한 메서드 호출
			System.out.printf("급      여 : %,d원\n", temporary.getPays());
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		sc.close();
	}

}
