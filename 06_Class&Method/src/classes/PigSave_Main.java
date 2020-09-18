package classes;

class PigSave {			// 돼지 저금통
	
	// 멤버변수
	int balance;		// 돼지 저금통 잔액
	
	public PigSave() {	}	// 기본 생성자
		
	public PigSave(int b) {
		balance = b;
	}	// 인자 생성자
	
	// 입금하는 메서드
	public void deposit(int money) {
		System.out.println("돼지 저금통에 입금을 합니다...");
		balance += money;
		System.out.println("현재 잔액 >>> "+balance+"원");
	}
	
	// 출금하는 메서드
	public void withdraw(int money) {
		if(money > balance) {
			System.out.println("잔액이 부족합니다...");
			return;
		}
		System.out.println("돼지 저금통에서 출금을 합니다...");
		balance -= money;
		System.out.println("현재 잔액 >>> "+balance+"원");
	}
	
	
}

public class PigSave_Main {

	public static void main(String[] args) {
		
		// 돼지 저금통 객체 생성
		PigSave pig = new PigSave(0);
		
		pig.deposit(3000); 		// 입금
		pig.deposit(5000); 		// 입금
		pig.withdraw(2000); 	// 출금
		pig.withdraw(10000); 	// 출금
		
//		pig.balance = 100000;	// 이렇게 접근할 수 있게 하면 안됨
		
	}

}
