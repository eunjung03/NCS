package sist;

/*
 * 3. 논리연산자 
 *    - 논리곱(&& - AND) : 주어진 조건이 모두 true일 때 결과가 true가 됨.
 *                       그 나머지는 모두 false가 됨.
 *    - 논리합(|| - OR) : 주어진 조건 중 하나라도 true이면 결과는 true가 됨.
 *                      그 나머지는 false가 됨.
 *    - 부  정(! - NOT) : true -> false가 되고 false -> true가 됨.
 *    - 논리연산자는 우선적으로 관계연산자를 실행한 후 그 결과값을 가지고 논리연산을 수행하게 됨.
 */
public class Ex03 {

	public static void main(String[] args) {

		int su1 = 10, su2 = 7;
		
		// 논리곱인 경우
		// true && true ==> true
		boolean test1 = (su1 >= 7) && (su2 >= 5);	
		System.out.println("test1 >>> " + test1);
		
		// true && false ==> false
		boolean test2 = (su1 >= 7) && (su2 <= 5);
		System.out.println("test2 >>> " + test2);
		
		// false && true ==> false
		boolean test3 = (su1 <= 7) && (su2 >=5 );
		System.out.println("test3 >>> " + test3);
		
		// false && false ==> false
		boolean test4 = (su1 <= 7) && (su2 <= 5);
		System.out.println("test4 >>> " + test4);
		System.out.println();
		
		//논리합인 경우
		// true || true ==> true
		boolean test5 = (su1 >= 7) || (su2 >= 5);	
		System.out.println("test5 >>> " + test5);
		
		// true || false ==> true
		boolean test6 = (su1 >= 7) || (su2 <= 5);
		System.out.println("test6 >>> " + test6);
		
		// false || true ==> true
		boolean test7 = (su1 <= 7) || (su2 >=5 );
		System.out.println("test7 >>> " + test7);
		
		// false || false ==> false
		boolean test8 = (su1 <= 7) || (su2 <= 5);
		System.out.println("test8 >>> " + test8);
		System.out.println();
		
		
		
		
		
		
		
		
	}

}
