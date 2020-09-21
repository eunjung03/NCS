package inheritance;

/*
 * 1. super() 키워드
 *    - 자식클래스에서 부모클래스의 생성자를 호출하는 명령어.
 *      형식) super(인자);	// 인자는 생략도 가능.
 * 2. this() 키워드
 *    - 현재 클래스에서 다른 생성자를 호출하는 명령어.
 *      형식) this(인자);	
 *      주의) 생성자 첫 문장에 와야 한다. 
 */

class Point {	// 부모클래스
	
	// 멤버변수
	int x;
	int y;
	
	public Point() { }	// 기본 생성자
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}	// 인자 생성자

}

class Point3D extends Point {
	
	int z;
	
	public Point3D() { super(); }	// 부모의 기본생성자 호출

	
	public Point3D(int x, int y) {
		super(x, y);
	}
	
	public Point3D(int x, int y, int z) {
		// this.x = x;
		// this.y = y;
		this(x, y);		// 2개짜리 생성자(Point3D(int x, int y))를 호출. 부모가 먼저 생성되어야 하므로 z보다 먼저 실행되어야 한다.
		this.z = z;
	}

	void prn() {
		System.out.println("X 좌표 >>> "+x);
		System.out.println("Y 좌표 >>> "+y);
		System.out.println("Z 좌표 >>> "+z);
	}
	
}

public class Point_Main {

	public static void main(String[] args) {

		Point3D point = new Point3D();
		
		Point3D point3d2 = new Point3D(1, 2);
		
	}

}
