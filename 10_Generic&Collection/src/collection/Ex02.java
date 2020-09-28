package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) {
		
		//ArrayList<String> list = new ArrayList<String>();
		// 다형성으로 객체 생성
		List<String> list = new ArrayList<String>();
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		
		// 자바의 컬렉션 프레임워크에서 컬렉션에 저장되어 있는 요소들을 
		// 읽어오는 방법을 표준화 해 놓은 객체가 Iterator 객체임.
		Iterator<String> it = list.iterator();
		
		// hasNext() : 읽어올 요소가 있는지 확인하는 메서드 - 있으면 true, 없으면 false (boolean형)
		while(it.hasNext()) {
			// next() : 다음 요소를 가져오는 메서드
			System.out.println(it.next());
		}
		
		
		
	}

}
