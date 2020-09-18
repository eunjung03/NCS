package classes;

import java.util.Scanner;

class Item{
	
	// 멤버변수
	String name;		// 품명
	int unitPrice;		// 단가
	int count;			// 수량
	
	public Item() {	}	// 기본 생성자
	
	public Item(String name, int unitPrice, int count) {	
		this.name = name;
		this.unitPrice = unitPrice;
		this.count = count;
	}	// 인자 생성자
}

public class Exam_05 {

	public static final double TAX_RATE = 1.1;	// 상수
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이템은 몇 개인가요? : ");
		Item[] items = new Item[sc.nextInt()];
		
		// 아이템을 입력 받아서 객체 배열에 저장해 주자.
		for(int i=0; i<items.length; i++) {
			System.out.println("품명, 단가, 수량을 입력하세요...");
			items[i] = new Item(sc.next(), sc.nextInt(), sc.nextInt());
		}
		System.out.println();
		
		int totalPrice = 0;		// 총금액 변수
		
		System.out.println("------------------------------------------------");
		System.out.println("품명\t단가\t수량\t금액");
		System.out.println("------------------------------------------------");
		
		for(int i=0; i<items.length; i++) {
			System.out.printf("%s\t%,6d\t%3d\t%,6d원\n", 
					items[i].name, items[i].unitPrice, items[i].count, items[i].unitPrice*items[i].count);
			totalPrice += items[i].unitPrice*items[i].count; 
		}
		
		// 공급가액을 구하자 = 총금액 / 1.1
		int supplyPrice = (int)(totalPrice / Exam_05.TAX_RATE);
		
		// 부가세액을 구하자 = 총금액 - 공급가액
		int vat = totalPrice - supplyPrice;

		System.out.println("------------------------------------------------");
		System.out.printf("공급가액\t\t\t%,6d원\n",supplyPrice);
		System.out.printf("부가세액\t\t\t%,6d원\n",vat);
		System.out.println("------------------------------------------------");
		System.out.printf("청구금액\t\t\t%,6d원\n",totalPrice);
		
		
		sc.close();
	}

}
