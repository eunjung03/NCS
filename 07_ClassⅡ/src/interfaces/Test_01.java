package interfaces;

import java.util.Scanner;

abstract class Employee1 {
	// 멤버변수
	String name;
	
	// 생성자
	public Employee1() {	}
	
	// 멤버메서드
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	// 추상메서드
	abstract int getPays1();

}

class Permanent1 extends Employee1{

	private int salary, bonus;
	
	// 생성자
	public Permanent1() {	}
	
	// getter and setter
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	// 추상메서드 재정의
	@Override
	int getPays1() {
		return salary+bonus;
	}
	
}

class Temporary1 extends Employee1 {
	int time, pay;
	
	//생성자
	public Temporary1() {	}
	
	public Temporary1(String name, int time, int pay) {	
		this.name = name;
		this.time = time;
		this.pay = pay;
	}
	
	//추상메서드 재정의
	@Override
	int getPays1() {
		return time * pay;
	}
}

public class Test_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("고용형태-정규직<P>, 임시직<T>를 입력하세요. >>> ");
		String pt = sc.next();
		
		if(pt.equalsIgnoreCase("P")) {
			System.out.println("이름, 기본급, 보너스를 입력하세요. >>> ");
			Permanent1 per = new Permanent1();
			per.setName(sc.next());
			per.setSalary(sc.nextInt());
			per.setBonus(sc.nextInt());
			System.out.println("==================================");
			pt = "정규직";
			System.out.println("고용형태 : "+pt);
			System.out.println("이       름 : "+per.getName());
			System.out.printf("급       여 : %,d원\n",per.getPays1());
		} else if(pt.equalsIgnoreCase("T")) {
			System.out.println("이름, 작업시간, 시간당 급여를 입력하세요. >>> ");
			Temporary1 tem = new Temporary1(sc.next(), sc.nextInt(), sc.nextInt());
			System.out.println("==================================");
			pt = "임시직";
			System.out.println("고용형태 : "+pt);
			System.out.println("이       름 : "+tem.getName());
			System.out.printf("급       여 : %,d원\n",tem.getPays1());
		} else {
			System.out.println("잘못 입력하였습니다.");
		}

		sc.close();
	}

}
