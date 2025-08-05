package sec01.exam04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// HashSet은 특정 상황에서만 사용되며, List 계열보다는 사용 빈도가 낮은 편
// 중복된 데이터 제거가 필요할 때 유용(예: ArrayList의 요소에서 중복을 제거할 때)
public class HashSetExample {

	public static void main(String[] args) {
		// Set 특징
		// 수학의 집합에 비유
		// 순서 없이 데이터 저장(저장된 요소들을 순서대로 꺼낼 수 없음)
		// 만약 저장한 순서대로 꺼내왔다면 우연히 해시 충돌이 없었거나,
		// JVM의 내부 해시 구현에 의해 우연히 정렬된 것처럼 출력된 것일 뿐 순서를 보장하지 않음
		// 동일한 요소를 중복해서 저장할 수 없음(저장 자체를 안함)
		// 하나의 null만 저장 가능
		// 중복 판단 기준: hashCode()로 위치 찾고, equals()로 동등성 확인
		
//		Set<String> set = new HashSet<String>();
		Set<String> set = new HashSet<>();
		
		// 객체 추가
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); // 중복 저장 안됨
		set.add("iBatis");
		
		// Set 출력하기
		System.out.println(set);
		
		// 저장된 총 객체 수 얻기
		int size = set.size();
		System.out.println("총 객체수: " + size);
		
		// Iterator(반복자)로 모든 객체를 하나씩 가져오기
		// 컬렉션의 요소를 하나씩 순회할 수 있도록 도와주는 인터페이스
		// 타입 파라미터는 저장된 객체와 동일하게 작성
		Iterator<String> iterator = set.iterator(); // 반복자 얻기(Iterator 구현 객체를 반환)
		while (iterator.hasNext()) { // 가져올 객체가 있으면 true, 없으면 false
			String element = iterator.next(); // 컬렉션에서 1개의 객체를 가져옴
			System.out.println("\t" + element);
			
			// remove(): next()로 반환한 요소를 제거
			if ("Java".equals(element)) {
				iterator.remove();
				// 참고: remove()는 next() 호출 이후에만 호출 가능하며, 한 번만 가능
			}
		}
		System.out.println(set);
		
		// 객체 삭제
		// index를 가지고 있는 List와 다르게 index가 없음
		// 객체의 hashCode()와 equals()를 기준으로 판단
		set.remove("JDBC"); // 1객의 객체 삭제
		set.remove("iBatis");
		
		System.out.println("총 객체수: " + set.size());
		
		// 향상된 for 문으로 모든 객체를 하나씩 가져오기
		// 인덱스가 없으므로 일반 for문 사용 불가
		for (String element : set) {
			System.out.println("\t" + element);
		}
		
		// 모든 객체를 제거하고 비움
		set.clear();
		if (set.isEmpty()) { // 컬렉션이 비어 있는지 조사
			System.out.println("비어 있음");
		}
		
		// HashSet과 집합
		// 수학의 집합을 효율적으로 처리하기에 적합한 구조
		// 두 집합(HashSet)의 합집합, 교집합, 차집합 연산 가능
		Set<Integer> class1 = new HashSet<Integer>();
		class1.add(1);
		class1.add(2);
		class1.add(3);
		Set<Integer> class2 = new HashSet<Integer>();
		class2.add(2);
		class2.add(3);
		class2.add(4);
		
		// 합집합
		// 두 개의 HashSet을 하나로 합쳐줌
		// 이때 2개의 HashSet에 공통적으로 포함된 데이터는 제거
//		class1.addAll(class2);
//		System.out.println("합집합: " + class1);
		
		// 교집합
		// 2개의 HashSet에서 공통된 요소만 추려줌
//		class1.retainAll(class2);
//		System.out.println("교집합: " + class1);
		
		// 차집합
		// 기준 HashSet에서 대상 HashSet과의 교집합 제외
		class1.removeAll(class2);
		System.out.println("차집합: " + class1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
