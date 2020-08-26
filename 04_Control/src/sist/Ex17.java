package sist;
import java.util.Scanner;
public class Ex17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요. : "); // println을 쓰면 엔터키가 주소입력에도 영향을 미친다
		int su = Integer.parseInt(sc.nextLine());
		
		System.out.print("주소를 입력하세요. : ");
		String addr = sc.nextLine();
		
		System.out.println("입력받은 수 >>> " + su);
		System.out.println("입력받은 주소 >>> " + addr);
		
		sc.close();
		
	}

}
