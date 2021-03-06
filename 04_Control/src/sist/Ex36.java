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
		
		// 구구단 좌측으로 출력하기
		for(int i=1; i<10; i++) {	
			if(i == 1) {
				for(int n=2; n<10; n++) {
				System.out.print("*** "+n+"단 ***\t");
				}
			System.out.println();
			}
			for(int j=2; j<10; j++) {
				//System.out.println(i+" * "+j+" = "+(i*j));
				System.out.printf("%d * %d = %2d\t",j,i,(i*j));
			}
			System.out.println();
		}
	}

}
