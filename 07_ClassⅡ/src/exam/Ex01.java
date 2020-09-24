package exam;

// 객체간 협업(유기적 관계)
// 객체를 이루는 것은 데이터(속성)와 기능(메서드)

// 과일장수 
// 1. 과일을 판매한다. - 행동(메서드)
// 2. 과일장수는 사과 20개, 오렌지 10개를 보유하고 있다. - 데이터(속성)
// 3. 과일 장수의 판매 수익은 50,000원이다. - 데이터(속성)

class FruitSeller {		// 사과 장수
	
	// 데이터(속성)
	final int APPLE_PRICE = 1000;		// 사과 가격 - 변하지 않는 가격
	int numOfApple;		// 사과의 갯수
	int myMoney;		// 판매 수익
	
	public FruitSeller() {	}	// 기본 생성자
	
	public FruitSeller(int numOfApple, int myMoney) {	
		this.numOfApple = numOfApple;
		this.myMoney = myMoney;
	}	// 인자 생성자
	
	
	// 사과 판매 메서드
	int saleApple(int money) {	// money : 사과 구매액
		
		// 사과 재고는 줄어든다.
		int count = money / APPLE_PRICE;	// 사과가 개당 1000원이라고 가정
		numOfApple -= count;	// numOfApple = numOfApple - num;
		// 판매 수익은 늘어난다.
		myMoney += money;		// myMoney = myMoney + money;
		
		return count;			// 실제 구매가 발생한 사과의 수를 반환
	}
	
	void showSaleResult() {
		System.out.println("남은 사과 : "+numOfApple);
		System.out.println("판매 수익 : "+myMoney);
	}
}

class FruitBuyer {	// 나 객체
	
	// 멤버변수
	int myMoney;
	int numOfApple;
	
	public FruitBuyer() {	}	// 기본 생성자
	
	public FruitBuyer(int myMoney, int numOfApple) {	
		this.myMoney = myMoney;
		this.numOfApple = numOfApple;
	}	// 인자 생성자
	
	// 사과를 사는 행위
	void buyAppple(FruitSeller seller, int money) {	// 인자값에 객체가 들어감
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	// 현재 사과를 산 후 상태
	void showBuyResult() {
		System.out.println("현재 잔액 : "+myMoney);
		System.out.println("사과 갯수 : "+numOfApple);
	}
}

public class Ex01 {

	public static void main(String[] args) {

		FruitSeller seller = new FruitSeller(20, 0);
		FruitBuyer buyer = new FruitBuyer(5000, 0);
		FruitBuyer buyer2 = new FruitBuyer(10000, 0);
		
		buyer.buyAppple(seller, 3000);
		buyer2.buyAppple(seller, 2000);
		
		System.out.println("*** 과일 판매자 현재 상황 ***");
		seller.showSaleResult();
		System.out.println();
		
		System.out.println("*** 과일 구매자 현재 상황 ***");
		buyer.showBuyResult();
		buyer2.showBuyResult();
		
	}

}
