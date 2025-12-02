package sec01.exam06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();

		// 인스턴스는 다르지만 내부 데이터가 동일한 경우
		// 객체의 hashCode()와 equals()를 기준으로 동등성 판단
		set.add(new Member("김재현", 30));
		set.add(new Member("김재현", 30)); // (논리적) 동등 객체(중복 저장 안됨)
		
		set.remove(new Member("김재현", 30));
		
		System.out.println(set);
		
		// 이 외에도 동등 객체로 판단하는 많은 메소드들이 제대로 동작하려면 재정의 필수임
		
		// 요소 정렬
		// Member처럼 사용자 정의 객체끼리 비교할 경우 비교 불가능
		// 정렬 기준으로 어떤 값을 사용할지 별도로 구현해야 함
		// => Member 클래스가 Comparable 인터페이스를 구현
		// => Comparator 인터페이스를 구현해서 다양한 정렬 기준을 제공
		
		Set<Member> members = new HashSet<Member>();
		members.add(new Member("김재현", 30));
		members.add(new Member("이수진", 25));
		members.add(new Member("박민수", 40));
		
		// Quiz
		// 1. Set -> List
		List<Member> membersList = new ArrayList<Member>(members);
		
		// 2. 정렬(나이 오름차순)
		Collections.sort(membersList);
		
		// 참고: Comparator + 람다식 사용(이름 오름차순)
		membersList.sort((a, b) -> a.getName().compareTo(b.getName()));
		
		// 3. 출력
		for (Member m : membersList) {
			System.out.println(m.getName() + " - " + m.getAge());
		}
		
		// 다시 Set으로 변환(순서를 유지하려면 LinkedHashSet)
		Set<Member> sortedSet = new LinkedHashSet<Member>(membersList);
		for (Member m : sortedSet) {
			System.out.println(m.getName() + " - " + m.getAge());
		}
		
		// ArrayList의 요소에서 중복 제거하기
		List<Member> memList = new ArrayList<Member>();
		memList.add(new Member("김재현", 30));
		members.add(new Member("이수진", 25));
		members.add(new Member("박민수", 40));
		memList.add(new Member("김재현", 30)); // 중복
		members.add(new Member("이수진", 25)); // 중복
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
