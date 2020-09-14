package sist;

/*
 * [문제6] coffee 메뉴 처리.
 */

import java.util.Scanner;

public class Exam_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** coffee 메뉴 ***");
		System.out.println("1. 아메리카노 - 3,000원");
		System.out.println("2. 카페라떼 - 4,000원");
		System.out.println("3. 마키아또 - 4,500원");
		System.out.println("4. 바닐라라떼 - 4,500원");
		System.out.print("위 메뉴 중 하나를 선택하세요. >>> ");
		int menu = sc.nextInt();
		
		System.out.print("주문 수량 >>> ");
		int su = sc.nextInt();
		
		System.out.print("입금액 >>> ");
		int money = sc.nextInt();
		
		System.out.println();
		
		String coffeeStr = "";	// 커피 종류	// ""대신 null값 입력해도 됨
		int price = 0;			// 커피 단가
		
		switch(menu) {
			case 1 :
				coffeeStr = "아메리카노";
				price = 3000;
				break;
			case 2 :
				coffeeStr = "카페라떼";
				price = 4000;
				break;
			case 3 :
				coffeeStr = "마키아또";
				price = 4500;
				break;
			case 4 :
				coffeeStr = "바닐라라떼";
				price = 4500;
				break;
			default :
				System.out.println("선택하신 커피는 없는 메뉴입니다.");
		}
		
		// 부가세 계산 : (단가 * 수량) * 0.1
		int vat = (int)((price * su) * 0.1);
		
		// 총 금액 계산 : 공급가액(단가*수량) + 부가세
		int total = (price * su) + vat;
		
		// 거스름돈 계산 : 입금액(money) - 총금액(total)
		int change = money - total;
		
		// 화면에 출력
		System.out.println("주문한 메뉴 : "+coffeeStr);
		System.out.printf("커피 단가 : %,d원\n",price); 
		System.out.println("주문 수량 : "+su); 
		System.out.printf("입 금 액 : %,d원\n",money); 
		System.out.printf("공급가액 : %,d원\n",(price*su)); 
		System.out.printf("부가세액 : %,d원\n",vat); 
		System.out.printf("총 금 액 : %,d원\n",total); 
		System.out.printf("거스름돈 : %,d원\n",change); 
		
		sc.close();
	}

}
