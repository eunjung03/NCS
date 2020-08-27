package sist;

// 다중 for문을 이용하여 구구단을 화면에 출력해 보자

public class Ex36 {

	public static void main(String[] args) {

		for(int i=2; i<10; i++) {	// 고정 ==> 구구단에서의 단
			// 구구단의 타이틀 출력
			System.out.println("*** "+i+"단"+" ***");
			for(int j=1; j<10; j++) {
				//System.out.println(i+" * "+j+" = "+(i*j));
				System.out.printf("%d * %d = %2d\n",i,j,(i*j));
			}
			System.out.println();
		}
		
	}

}
