package interfaces;

import java.util.Scanner;

interface Shape {			// 인터페이스
	
	double findArea();		// 추상메서드
}

class Circle implements Shape{
	
	int radius;		// 반지름 변수
	
	public Circle() {	}	// 기본 생성자

	public Circle(int radius) {	
		this.radius = radius;
	}	// 인자 생성자
	
	@Override
	public double findArea() {	// 인터페이스의 추상메서드 재정의
		return 3.14 * radius * radius;
	}

}

class Rectangle implements Shape {
	
	int width, height;
	
	public Rectangle() {	}	// 기본생성자
	
	public Rectangle(int width, int height) {	
		this.width = width;
		this.height = height;
	}	// 기본생성자

	@Override
	public double findArea() {
		return width * height;
	}
}

public class Exam_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("도형을 선택하세요(1:원형 / 2:사각형)");
		System.out.print("도형 선택 >>> ");
		int menu = sc.nextInt();
		
		if(menu == 1) {
			System.out.print("반지름 입력 >>> ");
			Circle circle = new Circle(sc.nextInt());
			System.out.println("==================================");
			System.out.printf("원의 면적 : %.1f\n",circle.findArea());
		} else if(menu == 2) {
			System.out.print("가로 입력 : ");
			int width = sc.nextInt();
			System.out.print("세로 입력 : ");
			int height = sc.nextInt();
			Rectangle rectangle = new Rectangle(width, height);
			System.out.println("==================================");
			System.out.printf("사각형의 면적 : %.1f\n",rectangle.findArea());
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		sc.close();
	}

}
