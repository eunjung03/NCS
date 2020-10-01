package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 2. Set 계열의 컬렉션 프레임워크 특징
 *    - 자료의 순서가 없다(정렬 기능 없음. - index가 없다).
 *    - 중복 데이터 허용 불가.
 *    - Set 인터페이스의 자식클래스를 이용하여 구현.
 *      -> HashSet(O 많이 씀), TreeSet(X 거의 잘 안 씀)
 */

public class Ex08 {

	public static void main(String[] args) {

		// Set 인터페이스의 자식클래스를 이용하여 객체 생성
		Set<Integer> set = new HashSet<Integer>();
		
		// 1. 원소 추가 메서드 : add(값)
		set.add(100);
		set.add(200);
		set.add(300);	// 중복 데이터 발생
		set.add(400);
		set.add(500);
		set.add(300);	// 중복 데이터 발생
		
		// 2. 원소 크기 메서드 : size()
		System.out.println("Set 컬렉션 크기 >>> " + set.size()); 	// 중복 허용 안 됨으로 중복 하나가 없어졌다.
		System.out.println();
		
		// 3. 원소 출력
		for(Integer k : set) {
			System.out.println("set 요소 >>> " + k);
		}
		System.out.println();
		
		// Iterator 사용하여 출력하는 방법
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println("set 요소 >>> " + it.next());
		}
		
		
	}

}
