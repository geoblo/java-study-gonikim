package sec01.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// List 특징
		// 순서를 유지하며 중복 요소를 허용
		
		// 인터페이스 타입을 사용하는 이유? 다형성 사용
		// List 인터페이스의 다른 구현 클래스를 사용하더라도 
		// 코드를 수정하지 않고 새로운 기능을 추가할 수 있음
		
		// 제네릭: 자바에서 클래스나 메소드가 사용할 타입을
		// 외부에서 파라미터처럼 받아서 사용할 수 있게 해주는 문법
		// 타입 파라미터: 제네릭을 사용할 때 전달하는 타입
		
//		List list = new ArrayList(); // 제네릭을 생략하면 Object로 간주(권장 안함)
//		List<String> list = new ArrayList<String>();
		List<String> list = new ArrayList<>(); // 생략하면 왼쪽에 지정된 타입을 따라 감(타입 추론)
		
		// 객체 추가
//		list.add(true); // 제네릭 타입으로 명시된 타입의 데이터만 추가 가능
		list.add("Java"); // 비어있는 마지막 index에 객체를 저장 
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database"); // 2번 인덱스에 저장(하나씩 밀려남)
		list.add("iBATIS");
		
		// 저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println("총 객체수: " + size);
		System.out.println();
		
		// 특정 인덱스의 객체 가져오기
		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();
		
		// 리스트 출력하기
		System.out.println(list); // 재정의된 toString()
		
		
		
		
		
		
		
		
	}

}
