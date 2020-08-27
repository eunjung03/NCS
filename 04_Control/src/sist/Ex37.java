package sist;

public class Ex37 {

	public static void main(String[] args) {

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
