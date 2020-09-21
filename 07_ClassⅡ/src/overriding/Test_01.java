package overriding;

import java.util.Scanner;

class Employee1 {
	
	// 멤버변수
	String name;

	// 생성자
	public Employee1() {	}	// 기본생성자

	// 멤버메서드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getPay() {
		return 0;
	}
}

class Permanent1 extends Employee1{
	
	// 멤버변수
	int pay = 0;
	int bonus = 0;
	
	// 기본 생성자
	public Permanent1() {}
	
	// 인자 생성자
	public Permanent1(String name, int pay, int bonus) {
		this.setName(name);
		this.pay = pay;
		this.bonus = bonus;		
	}
	
	// 급여계산
	@Override
	public int getPay() {
		return pay+bonus;
	}
}

class Temporary1 extends Employee1{
	
	// 멤버변수
	int time = 0;
	int pay = 0;

	// 기본 생성자
	public Temporary1() {	}

	// 인자 생성자
	public Temporary1(String name, int time, int pay) {	
		this.setName(name);
		this.time = time;
		this.pay = pay;
	}
	
	//급여계산
	@Override
	public int getPay() {
		return time*pay;
	}
}

public class Test_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("고용형태-정규직<P>, 임시직<T>를 입력하세요. >>> ");
		String e = sc.nextLine();
		if(e.equalsIgnoreCase("p")) {
			System.out.println("이름, 기본급, 보너스를 입력하세요 >>> ");
			Permanent1 per = new Permanent1(sc.nextLine(),sc.nextInt(), sc.nextInt());
			e = "정규직";
			System.out.println("==============================");
			System.out.println("고용형태 : "+e);
			System.out.println("이      름 : "+per.getName());
			System.out.printf("급      여 : %,d원\n", per.getPay());
			
		}else if(e.equalsIgnoreCase("t")) {
			System.out.println("이름, 작업시간, 시간당 급여를 입력하세요 >>> ");
			Temporary1 tem = new Temporary1(sc.nextLine(),sc.nextInt(), sc.nextInt());
			e = "임시직";
			System.out.println("==============================");
			System.out.println("고용형태 : "+e);
			System.out.println("이      름 : "+tem.getName());
			System.out.printf("급      여 : %,d원\n", tem.getPay());
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		sc.close();
	}

}
