package sec12.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {

	public static void main(String[] args) {
		List<Student> totalList = new ArrayList<Student>();
		totalList.add(new Student("홍길동", "남", 92));
		totalList.add(new Student("이수진", "여", 87));
		totalList.add(new Student("김재현", "남", 95));
		totalList.add(new Student("양지은", "여", 93));
		
		// 스트림을 컬렉션으로 변환: toList(), toSet(), toMap() 등
		// 남학생만 묶어 List 생성
//		List<Student> maleList = totalList.stream()
//			.filter(s -> "남".equals(s.getGender()))
//			.collect(Collectors.toList()); // 요소를 리스트에 담아서(toList()) 모으겠다.(collect())
		
		// 자바 16부터는 좀 더 편리하게 요소 스트림에서 List 컬렉션을 얻을 수 있음
		List<Student> maleList = totalList.stream()
				.filter(s -> "남".equals(s.getGender()))
				.toList();
		
		maleList.stream()
			.forEach(s -> System.out.println(s.getName()));
		
		// 학생의 이름을 키로, 학생의 점수를 값으로 갖는 Map 생성
		Map<String, Integer> map = totalList.stream()
			.collect(
				Collectors.toMap(
					s -> s.getName(), // Student 객체에서 키가 될 부분 리턴
					s -> s.getScore() // Student 객체에서 값이 될 부분 리턴
//					s -> s // 값으로 Student 객체 자신을 그대로 저장
				)
			);
		
		System.out.println(map);
		
	}

}
