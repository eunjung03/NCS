package classes;

/*
 * 캡슐화(Encapsulation)?
 * - 객체지향 프로그램의 4대 특징 중 하나.
 * - 데이터를 감추기, 데이터를 외부에서 함부로 변경하지 못 하도록 
 *   외부의 접근을 제한하는 것을 말함.
 * - 정보 은닉 : 클래스의 멤버 접근 제어 기법.
 * - private : 외부에서 직접 접근 차단.
 * - public : 모든 클래스에서 접근 가능.
 * - setter() / getter() 메서드로 접근 가능.
 *   => setter() : 지정자 메서드	// 멤버변수의 초기값 할당
 *   => getter() : 획득자 메서드	
 */

class Number{
	
	// 멤버변수
	private int num1;
	private int num2;
	
	/*
	 * this : 멤버 자기 자신을 의미함.
	 * - 주로 멤버변수와 메서드 또는 생성자의 매개변수 이름이 동일할 때
	 * 	  인스턴스의 멤버임을 명확히 하기 위해 사용.
	 * - 매개변수(지역변수)의 이름과 멤버변수(전역변수)의 이름이 같을 때
	 *   멤버변수(전역변수) 앞에 this라는 키워드를 붙여서 구분할 때 사용함.
	 * - 지역변수와 전역변수의 이름이 같으면 우선순위는 지역변수가 높다.
	 * 
	 */
	
	/*
	 * setter() 메서드로 초기값 할당
	 * - private 멤버변수에 값을 지정(초기값 할당)하는 역할을 하는 메서드
	 *   형식)
	 *   		public void set멤버변수명(자료형 매개변수){
	 *   			멤버변수 = 매개변수;
	 *   		} 
	 */

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	/*
	 * getter() 메서드로 할당된 값을 가져오기
	 * - private 멤버변수에 할당된 값을 가져오는 역할을 하는 메서드.
	 *   형식)
	 * 			public 반환형 get멤버변수명() {
	 * 				return 멤버변수명;
	 * 			}
	 */
	
	public int getNum1() {
		return num1;
	}
	
	public int getNum2() {
		return num2;
	}
	
}

public class Number_Main {

	public static void main(String[] args) {
		
		Number number = new Number();
		
//		number.num1 = 10000;		// 외부에서 접근 방법(좋은 방법X)
//		number.num2 = 5000;		// 외부에서 접근 방법(좋은 방법X)
		
		number.setNum1(10000);
		System.out.println("num1 >>> "+number.getNum1());
		
		number.setNum2(5000);
		System.out.println("num2 >>> "+number.getNum2());

	}

}
