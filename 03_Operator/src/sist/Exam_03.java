package sist;

public class Exam_03 {

	public static void main(String[] args) {

		// 1. 키보드로 금액과 상품단가, 수량을 입력을 받아야 한다.
		// 금액을 키보드로 입력을 받는다.
		int money = Integer.parseInt(args[0]);	// 금액을 키보드로 입력을 받는다.
		// 상품단가를 키보드로 입력을 받는다.
		int danga = Integer.parseInt(args[1]);	// 상품단가를 키보드로 입력을 받는다.
		// 수량을 키보드로 입력을 받는다.
		int su = Integer.parseInt(args[2]);	// 수량을 키보드로 입력을 받는다.
		
		// 2. 부가세액을 구하자. ==> (단가 * 수량) * 0.1
		int vat = (int)((danga * su) * 0.1);	// 0.1은 double형
		
		// 3. 상품 총액을 구하자. ==> (단가 * 수량) + 부가세액
		int total = (danga * su) + vat;
		
		// 4. 거스름돈을 구하자. ==> (입금액 - 상품 총액)
		int change = money - total;
		
		// 5. 화면에 내용을 출력해 보자.
		System.out.printf("지불한 금액 >>> %,d원\n", money);
		System.out.printf("제품 단가 >>> %,d원\n", danga);
		System.out.println("제품 수량 >>> " + su);
		System.out.printf("공급가액 >>> %,d원\n", (danga * su));
		System.out.printf("부가세액 >>> %,d원\n", vat);
		System.out.printf("상품 총액 >>> %,d원\n", total);
		System.out.printf("거스름돈 >>> %,d원\n", change);
		
	}

}
