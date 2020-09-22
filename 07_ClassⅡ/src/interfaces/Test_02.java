package interfaces;

import java.util.Scanner;

interface Shape1 {
	double findArea1();
}

class Circle1 implements Shape1{
	
	// 멤버변수
	int r;
	
	// 생성자
	public Circle1() {	}
	
	public Circle1(int r) {	
		this.r = r;
	}
	
	//
	@Override
	public double findArea1() {
		return 3.14 * r * r;
	}
}

class Rectangle1 implements Shape1{
	
	// 멤버변수
	int width, height;
	
	// 생성자
	public Rectangle1() {	}

	public Rectangle1(int width, int height) {	
		this.width = width;
		this.height = height;
	}

	//
	@Override
	public double findArea1() {
		return width * height;
	}
}

public class Test_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 도형 선택
		System.out.println("도형을 선택하세요.(1.원형 / 2. 사각형)");
		System.out.print("도형 선택 => ");
		int s = sc.nextInt();
		
		if(s == 1) {
			System.out.print("반지름 입력 => ");
			Circle1 cir = new Circle1(sc.nextInt());
			System.out.println("================================");
			System.out.printf("원의 면적 : %.1f", cir.findArea1());
		} else if(s == 2) {
			Rectangle1 rec = new Rectangle1();
			System.out.print("가로 => ");
			rec.width = sc.nextInt();
			System.out.print("세로 => ");
			rec.height = sc.nextInt();
			System.out.println("================================");
			System.out.printf("사각형의 면적 : %.1f", rec.findArea1());
		} 

		sc.close();
	}

}
