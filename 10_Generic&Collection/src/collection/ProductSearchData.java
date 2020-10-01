package collection;

import java.util.HashMap;
import java.util.Map;

public class ProductSearchData {

	// 상풍명과 상품정보가 저장될 Map 자료구조
	Map<String, String> map;

	public ProductSearchData() { // 기본 생성자
		
		map = new HashMap<String, String>();
		
		// 데이터를 map에 저장해 주자.
		map.put("세탁기", "드럼 세탁기 최신형");
		map.put("냉장고", "지펠 냉장고 최신형");
		map.put("TV", "HDTV 150인치 최신모델");
	} 

	// 상품명을 매개변수로 넘겨 받아서 해당 상품명이 Map의 키에 
	// 있는지 확인하여 상품정보를 반환해 주는 메서드.
	String search(String productName) {
		String proInfo = null; // 상품 정보가 저장될 변수

		if (map.containsKey(productName)) {
			proInfo = map.get(productName);
		}

		return proInfo;
	}

}
