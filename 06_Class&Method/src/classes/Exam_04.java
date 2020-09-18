package classes;

import java.util.Scanner;

class Temporary{
	
	// 멤버변수
	String name;		// 이름
	int time;			// 작업 시간
	int pay;			// 시간당 급여
	
	public Temporary() {}		// 기본 생성자
	
	public Temporary(String name, int time, int pay) {	// 인자 생성자
		this.name = name;
		this.time = time;
		this.pay = pay;
	}
	
	// 급여 계산하는 메서드
	void paySum() {
		
		// 총급여액 = 일한 시간(작업 시간) * 시간당 급여
		int total = time * pay;
		
		// 공제액 = 총급여액 *0.03
		int amount = (int)(total * 0.03);
		
		// 실지급액 = 총급여액 - 공제액
		int payable = total - amount;
		
		output(total, amount, payable);
	}
	
	public void output(int tot, int amount, int payable) {
		System.out.println("=======================");
		System.out.println("이름 : "+name);
		System.out.printf("총급여 : %,d원\n",tot);
		System.out.printf("공제액 : %,d원\n",amount);
		System.out.printf("실지급액 : %,d원\n",payable);
	}
}

public class Exam_04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름, 작업시간, 시간당 급여를 입력하세요. >>> ");
		Temporary tem = new Temporary(sc.next(), sc.nextInt(), sc.nextInt());
		
		tem.paySum();
		
		sc.close();
	}

}
