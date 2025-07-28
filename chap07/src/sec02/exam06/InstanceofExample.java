package sec02.exam06;

public class InstanceofExample {

	public static void main(String[] args) {
		// 테스트 먼저
		Parent parent = new Parent();
//		Child child = (Child) parent; // ClassCastException 예외 발생
		// 강제 타입 변환을 하기 전에 검사(안전한 코딩)
		// 검사할 객체(좌측) instanceof 클래스 타입(우측)
		if (parent instanceof Child) { 
			// parent 변수가 참조하는 객체가 Child 타입의 인스턴스인지 검사
			// (Child 타입으로부터 만들어졌는지)
			Child child = (Child) parent;
			System.out.println("강제 타입 변환 성공");
		}
		
		Parent parentA = new Child();
		method1(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
	}

	private static void method1(Parent parentA) {
		// Quiz: instanceof를 사용하여 안전하게 Child 타입으로 변환하기
		// 변환 성공 시 "Child로 변환 성공" 출력
		// 변환 실패 시 "Child로 변환되지 않음" 출력
		
	}

}
