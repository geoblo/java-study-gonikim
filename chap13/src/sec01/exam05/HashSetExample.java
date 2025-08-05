package sec01.exam05;

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
		// 객체의 hashCode()와 equals()를 기준으로 판단
		set.add(new Member("김재현", 30));
		set.add(new Member("김재현", 30)); // 동등 객체
		
//		set.remove(new Member("김재현", 30));
		
		System.out.println(set);
		
		// 요소 정렬
		// Member처럼 사용자 정의 객체끼리 비교할 경우 비교 불가능
		// 정렬 기준으로 어떤 값을 사용할지 별도로 구현해야 함
		// => Member 클래스가 Comparable 인터페이스를 구현
		
		Set<Member> members = new HashSet<Member>();
		members.add(new Member("김재현", 30));
		members.add(new Member("이수진", 25));
		members.add(new Member("박민수", 40));
		
		// Quiz
		// 1. Set -> List 변환
		List<Member> memberList = new ArrayList<Member>(members);
		
		// 2. 정렬(나이 오름차순)
		Collections.sort(memberList);
		
		// 3. 출력(향상된 for문)
		for (Member m : memberList) {
			System.out.println(m.getName() + " - " + m.getAge());
		}
		
		// 다시 Set으로 변환(정렬된 순서 유지하려면 LinkedHashSet)
		Set<Member> sortedSet = new LinkedHashSet<Member>(memberList);
		for (Member m : sortedSet) {
			System.out.println(m.getName() + " - " + m.getAge());
		}
		
		
		// ArrayList의 요소에서 중복 제거하기
		List<Member> memList = new ArrayList<Member>();
		memList.add(new Member("김재현", 30));
		memList.add(new Member("이수진", 25));
		memList.add(new Member("박민수", 40));
		memList.add(new Member("김재현", 30)); // 중복
		memList.add(new Member("이수진", 25)); // 중복
		
		// Quiz
		
		
		
		
		
		
		
	}

}
