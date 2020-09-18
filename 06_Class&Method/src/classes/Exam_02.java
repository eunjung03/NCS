package classes;

import java.util.Scanner;

class Rectangle{

	int width;		//가로변수
	int height;		//세로변수
	
	public Rectangle() {}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void recX(int width, int height){
		System.out.println("사각형의 넓이 : "+(width*height));
	}
	
	public void recSize(int width, int height) {
		System.out.println("사각형의 둘레 : "+((width+height)*2));
	}
}

public class Exam_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("사각형의 가로, 세로를 입력하세요. >>> ");
		int width = sc.nextInt();
		int height = sc.nextInt();
				
		Rectangle rec = new Rectangle();
		
		// 사각형의 넓이를 구하는 메서드를 호출
		rec.recX(width, height);
		
		// 사각형의 둘레를 구하는 메서드를 호출
		rec.recSize(width, height);
	
		sc.close();
	}

}
