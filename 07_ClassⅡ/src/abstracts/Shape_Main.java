package abstracts;

abstract class Shape {	// 부모클래스 - 추상클래스
	
	abstract void draw();	// 추상메서드
}

class Line extends Shape {
	@Override
		void draw() {	// 추상메서드 재정의
			System.out.println("선을 그린다.");
		}
}

class Circle extends Shape {
	@Override
	void draw() {	// 추상메서드 재정의
		System.out.println("원을 그린다.");
	}
}

class Rect extends Shape {
	@Override
	void draw() {	// 추상메서드 재정의
		System.out.println("사각형을 그린다.");
	}
}

public class Shape_Main {

	public static void main(String[] args) {

		Line line = new Line();
		Circle circle = new Circle();
		Rect rect = new Rect();
		
		line.draw();  circle.draw();  rect.draw();
	
	}

}
