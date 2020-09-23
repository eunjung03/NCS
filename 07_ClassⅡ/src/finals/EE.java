package finals;

/*
 * final 지정자
 * - 클래스나 멤버변수, 멤버메서드에 적용해서 사용함.
 * - 클래스 : - 변경할 수 없는 클래스, 확장될 수 없는 클래스.
 *          - final 로 지정된 클래스는 다른 클래스의 조상이 될 수 없음.
 * - 멤버메서드 : - 변경될 수 없는 메세드.
 *            - final 로 지정된 메서드는 오버라이딩을 통해 재정의를 할 수 없음.    
 * - 멤버변수 : - 변수명 앞에 final 이라는 키워드가 붙으면, 값을 변경할 수 없다. 
 * - 대표적인 final 클래스는 String 클래스와 Math 클래스가 있음.
 */

public final class EE {

	public static void main(String[] args) {
		
		AA aa = new AA();
		
		// 변수명 앞에 final 이라는 키워드가 붙으면, 값을 변경할 수 없다. 
		// aa.su = 200;		// error 발생
		
	}
}

class AA {
	//final int su = 123;
	final void prn() {
		System.out.println("final prn() 메서드");
	}
}

// 클래스 이름 앞에 final 이라는 키워드가 붙어 있기 때문에
// final 로 지정된 클래스는 다른 클래스의 조상(부모클래스)이 될 수 없음.
/*class AA extends EE {	// error 발생
	
}*/

class BB extends AA {
	
	// final 로 지정된 메서드는 오버라이딩을 통해 재정의를 할 수 없음
    /*@Override
	void prn() {	// error 발생
		System.out.println("prn() 메서드 재정의");
	}*/
	
}
