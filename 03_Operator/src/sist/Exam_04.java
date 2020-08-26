package sist;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Exam_04 {

	public static void main(String[] args) {

		// 1. 키보드로부터 임의의 숫자 4자리를 입력을 받는다.
		int num = Integer.parseInt(args[0]);	// 8762
		
		// 2. 각각의 화폐단위 변수를 설정을 한다.
		int oc, c, ob, b, os, s, o, i, res;
		
		oc = num / 5000;		// 오천원의 몫 ==> 1
		res = num % 5000;		// 나머지 ==> 3762
		
		c = res / 1000;			// 천원의 몫 ==> 3
		res %= 1000;			// 나머지 ==> 762
		
		ob = res / 500;			// 오백원의 몫 ==> 1
		res %= 500;				// 나머지 ==> 262
		
		b = res / 100;			// 백원의 몫 ==> 2
		res %= 100;				// 나머지 ==> 62
		
		os = res / 50;			// 오십원의 몫 ==> 1
		res %= 50;				// 나머지 ==> 12
		
		s = res / 10;			// 십원의 몫 ==> 1
		res %= 10;				// 나머지 ==> 2
		
		o = res / 5;			// 오원의 몫 ==> 0
		i = res % 5;			// 일원 ==> 2
		
		// 3. 화면에 출력을 해 주자.
		System.out.println("입력받은 숫자 >>> " + num);
		System.out.println("오천원 지폐 >>> " + oc + "장");
		System.out.println("천원 지폐 >>> " + c + "장");
		System.out.println("오백원 동전 >>> " + ob + "개");
		System.out.println("백원 동전 >>> " + b + "개");
		System.out.println("오십원 동전 >>> " + os + "개");
		System.out.println("십원 동전 >>> " + s + "개");
		System.out.println("오원 동전 >>> " + o + "개");
		System.out.println("일원 동전 >>> " + i + "개");
		
		
		
	}

}
