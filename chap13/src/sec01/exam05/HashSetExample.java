package sec01.exam05;

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
		
		Set<E>
		
		
		
		
		
	}

}
