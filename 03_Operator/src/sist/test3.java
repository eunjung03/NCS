package sist;

public class test3 {

	public static void main(String[] args) {

		int money = Integer.parseInt(args[0]);
		int price = Integer.parseInt(args[1]);
		int amount = Integer.parseInt(args[2]);
		
		int tax = (price * amount) / 10;
		int total = (price * amount) + tax;
		
		System.out.println("지불한 금액 : " + money + "원");
		System.out.println("제품단가 : " + price + "원");
		System.out.println("수량 : " + amount + "원");
		System.out.println("부가세 : " + tax + "원");
		System.out.println("상품총액 : " + total + "원");
		System.out.println("거스름 돈 : " + (money - total) + "원");
		
		
	}

}
