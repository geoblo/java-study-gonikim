package sec01.exam05;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// HashSet은 가장 기본적인 Set의 구현체
// 대용량 데이터의 저장/탐색에 유리하며, List 계열보다는 사용 빈도가 낮은 편
// 중복된 데이터 제거가 필요할 때 유용(예: ArrayList의 요소에서 중복을 제거할 때)
public class HashSetExample {

	public static void main(String[] args) {
		// Set 특징
		// 수학의 집합과 유사
		// (해시코드 값을 기반으로 저장하기엔) 순서 없이 데이터 저장(저장된 요소를 순서대로 꺼낼 수 없음)
		// 동일한 요소를 중복해서 저장할 수 없음(저장 자체를 안함)
		// 하나의 null만 저장 가능
		
		// 중복 판단 기준: hashCode()로 위치 찾고, equals()로 동등성 확인
		
		// (참고만) HashSet의 내부 원리
		// 1단계: set.add(new Student("김재현", 30)); 첫 번째 객체
		// hashCode() 호출 -> 예: 123456
		// 이 해시값을 바탕으로 버킷 위치 결정
		// 해당 버킷이 비어 있음 -> 객체 저장 완료
		// [버킷 테이블]
		// 123456 -> Student("김재현", 30)
		
		// 2단계: set.add(new Student("김재현", 30)); 두 번째 객체 (내용 같지만 객체 다름)
		// hashCode() 호출 -> 여전히 123456 (name과 age가 같기 때문)
		// 버킷 123456에 이미 객체가 있음
		// 그 객체와 equals() 비교 -> true -> 중복으로 판단 -> 저장 안 함
		
//		Set<String> set = new HashSet<String>();
		Set<String> set = new HashSet<>(); // 생략하면 왼쪽 Set에 지정된 타입을 따라 감(타입 추론)
		
		// 객체 추가
		// 추가할 때마다 중복 확인(hashCode()와 equals() 호출) 후 추가함
		// 기존에 같은 객체가 없을 때만 저장하고 true 반환
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); // 중복 저장 안됨
		set.add("iBATIS");
		
		// Set 출력하기
		System.out.println(set);
		
		// 저장된 총 객체 수 얻기
		int size = set.size();
		System.out.println("총 객체수: " + size);
		
		// Iterable과 Iterator - 컬렉션 조회 방법의 표준화(=인터페이스)
		// 여러 종류의 컬렉션(Iterable)을 같은 방법(Iterator)으로 읽을 수 있음
		
		// Iterator(반복자)로 모든 요소를 하나씩 가져오기
		// 컬렉션의 요소를 하나씩 순회할 수 있도록 도와주는 인터페이스
		// 타입 파라미터는 저장된 객체와 동일하게 작성
		Iterator<String> iterator = set.iterator(); // iterator 구현 객체를 반환
		while (iterator.hasNext()) { // 다음 요소가 있는지 확인
			// 저장된 객체 수 만큼 반복
			String element = iterator.next(); // 1개의 요소를 읽어옴
			System.out.println("\t" + element);
			
			// remove(): next()로 반환한 요소를 제거
			if ("Java".equals(element)) {
				iterator.remove();
//				iterator.remove();	
				// 참고: remove()는 next() 호출 이후에만 호출 가능하며, 한 번만 가능
			}
		}
		System.out.println(set);
		System.out.println();
		
		// 객체 삭제
		// index를 가지고 있는 List와 다르게 index가 없음
		// 객체의 hashCode()와 equals()를 기준으로 판단
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수: " + set.size());
		
		// 향상된 for문으로 모든 객체를 하나씩 가져오기
		// 순서 즉, 인덱스가 없으므로 일반 for문 사용 불가
		// 당연히 get()과 같은 메소드도 사용 불가
		for (String element : set) {
			System.out.println("\t" + element);
		}
		System.out.println();
		
		// 객체 검색
		if (!set.isEmpty()) { // 컬렉션이 비어 있는지 조사
			// 주어진 객체가 저장되어 있는지 조사
			System.out.println("Java 있니? " + set.contains("Java"));
			System.out.println("Servlet/JSP 있니? " + set.contains("Servlet/JSP"));
		}
		System.out.println();
		
		// 모든 객체를 제거하고 비움
		set.clear();
		if (set.isEmpty()) {
			System.out.println("비어 있음");
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
