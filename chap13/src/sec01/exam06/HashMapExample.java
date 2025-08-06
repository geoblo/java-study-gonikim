package sec01.exam06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// Map 특징
		// 키-값 쌍으로 데이터 저장
		// 키는 중복 불가, 값은 중복 가능
		// 순서 보장 여부는 구현체에 따라 다름
		// (예: HashMap은 보장X, LinkedHashMap은 보장O)
		
		// HashMap
		// 가장 많이 쓰이는 일반적인 Map
		// 키를 기반으로 hashCode()를 계산하여 위치를 정함
		// 순서 보장 안됨
		
		// Map 컬렉션 생성
		// 키의 타입으로 1. String, 2. Integer/Long 을 많이 씀
		// 이유? 동등 객체로 판단하기 위한 equals()와 hashCode()가 이미 잘 구현되어 있음
//		Map<String, Integer> map = new HashMap<String, Integer>();
		Map<String, Integer> map = new HashMap<>();
		
		// 객체 저장
		// put()은 내부적으로 키가 이미 존재하는지 확인하고,
		// 존재하지 않으면 새로 추가하고 null 반환
		// 존재하면 값을 덮어쓰고, 덮어쓰기 전의 값을 반환
		map.put("김재현", 85);
		map.put("유재석", 90);
		map.put("이이경", 80);
		map.put("유재석", 95); // 키가 같으면 기존의 값은 없어지고 새로운 값으로 덮어씀(기존 Entry 객체에서 값만 대체됨)
		System.out.println("총 Entry 수: " + map.size());
		
		// 객체 찾기
		// Key값으로 Value를 검색
		// 요소를 찾지 못하면 null을 반환
		System.out.println("\t유재석: " + map.get("유재석"));
		System.out.println();
		
		// 객체를 하나씩 처리
		// Iterator(반복자): 컬렉션 내부의 요소를 하나씩 순회할 수 있도록 도와줌
		// Iterator를 쓰려면 해당 객체가 Iterable 인터페이스를 구현하고 있어야 함
		// Collection을 구현한 클래스들(예: ArrayList, HashSet 등)은 이미 Iterable을 구현하고 있음
		// Map은 Iterable을 구현하지 않음
		// => 해결: Map의 구성 요소를 Set으로 변경해서 Iterator 사용
		
		// 1. keySet() 이용: Key만 Set으로 변환
		// Set<K> 반환
		// Key만 모은 Set이 필요할 때 사용
		Set<String> keySet = map.keySet();
		
		System.out.println("Iterator 사용");
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			// 반복해서 키를 얻고 키값으로 Map에서 값을 가져옴
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : "  + value);
		}
		System.out.println();
		
		// 향상된 for 문으로 객체를 하나씩 처리
		// 읽기 전용으로 순회할 때는 대부분 이 방식을 더 선호
		System.out.println("향상된 for 문 사용");
		for (String key : keySet) {
			Integer value = map.get(key);
			System.out.println("\t" + key + " : "  + value);
//			map.remove(key); // 예외 발생 -> Iterator 사용 시 안전
		}
		System.out.println();
		
		// 객체 삭제
		// List는 index 또는 Element를 기준으로 삭제 요소 판단
		// Set은 Element를 기준으로 판단
		// Map은 Key를 기준으로 판단
		map.remove("유재석"); // 키로 Map.Entry 객체를 제거
		System.out.println("총 Entry 수: " + map.size());
		System.out.println();
		
		// 객체를 하나씩 처리
		// 2. entrySet() 이용: Entry를 Set으로 변환
		// Set<Map.Entry<K, V>> 반환
		// 키와 값을 함께 보존한 Set이 필요할 때 사용
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		
		System.out.println("Iterator 사용");
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while (entryIterator.hasNext()) {
			// 반복해서 Map.Entry 객체를 얻고 키와 값을 얻어냄
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : "  + value);
//			entryIterator.remove(); // 테스트
		}
		System.out.println();
		
		// 향상된 for 문으로 객체를 하나씩 처리
		// 읽기 전용으로 순회할 때는 대부분 이 방식을 더 선호
		System.out.println("향상된 for 문 사용");
		for (Entry<String, Integer> entry : entrySet) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : "  + value);
//			map.remove(key); // 테스트: 예외 발생 -> Iterator 사용 시 안전
		}
		System.out.println();
		
		// 정리: Iterator가 필요한 상황(for-each보다 유리한 경우)
		// 읽기 전용이면 for-each가 가장 깔끔하고 실용적
		// 수정, 삭제, 조건 제어 등 복잡한 순회가 필요하면 Iterator가 더 유리
		// Iterator는 반복 중 컬렉션의 구조 변경을 감지 가능
		// 예: 순회 중 요소를 안전하게 제거할 때
		// Iterator.remove()는 ConcurrentModificationException 없이 안전하게 삭제 가능
		// 반면 for-each에서 map.remove()를 쓰면 오류 발생 가능
		
		// 객체 검색
		// HashMap의 Key와 Value를 기준으로 특정키나 특정값의 포함 여부를 판단할 수 있음
		
		// containsKey()
		// HashMap 내에 특정키(Key)가 있는지 확인
		String keyToCheck = "김재현";
		if (map.containsKey(keyToCheck)) {
			System.out.println(keyToCheck + " 키가 존재합니다.");
		} else {
			System.out.println(keyToCheck + " 키가 존재하지 않습니다.");			
		}
		
		// containsValue()
		// HashMap 내에 특정값(Value)이 있는지 확인
		// 찾는 값이 있으면 첫 번째로 발견되는 즉시 true를 반환(중복이 있더라도 첫 번째 매치에서 멈춤)
		int valueToCheck = 80;
		if (map.containsValue(valueToCheck)) {
			System.out.println(valueToCheck + " 값이 존재합니다.");
		} else {
			System.out.println(valueToCheck + " 값이 존재하지 않습니다.");			
		}
		System.out.println();
		
		// 객체 전체 삭제
		map.clear(); // 모든 Map.Entry 삭제
		System.out.println("총 Entry 수: " + map.size());
	}

}
