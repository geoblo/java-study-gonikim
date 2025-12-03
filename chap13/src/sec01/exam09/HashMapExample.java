package sec01.exam09;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// Map 특징
		// 키-값 쌍으로 데이터 저장
		// 기본적으로 순서를 보장하지 않는 자료구조
		// 키는 중복 불가, 값은 중복 가능
		
		// HashMap
		// 가장 기본적인 Map의 구현체
		// 키를 기반으로 hashCode()를 계산하여 위치를 정함
		// 순서 보장 안됨
		// 매우 빠른 검색, 삽입, 삭제
		
		// Map 컬렉션 생성
		// 키의 타입으로 일반적으로 1. String, 2. Integer/Long 을 많이 씀
//		Map<String, Integer> map = new HashMap<String, Integer>();
		Map<String, Integer> map = new HashMap<>();
		
		// 객체 저장
		// put()은 내부적으로 키가 이미 존재하는 확인하고, 
		// 존재하지 않으면 새로 추가하고 null 반환
		// 존재하면 값을 덮어쓰고, 덮어쓰기 전의 값을 반환
		map.put("김재현", 85);
		map.put("유재석", 90);
		map.put("이이경", 80);
		map.put("유재석", 95); // 기존 Entry 객체에서 값만 대체됨
		System.out.println("총 Entry 수: " + map.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
