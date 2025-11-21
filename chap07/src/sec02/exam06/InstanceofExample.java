package sec02.exam06;

public class InstanceofExample {

	public static void main(String[] args) {
		Parent parentA = new Child();
//		method2(parentA);
		method1(parentA);
		
		Parent parentB = new Parent();
//		method2(parentB); // ClassCastException 예외 발생
		method1(parentB);
		
	}
	
	public static void method1(Parent parent) {
		// 강제 타입 변환을 하기 전에 검사(안전한 코딩)
		// instanceof를 사용하여 안전하게 Child 타입으로 변환하기
		// 검사할 객체(좌측) instanceof 클래스 타입(우측)
		// parent 변수가 참조하는 객체가 Child 타입의 인스턴스인지 검사(=Child 타입으로부터 만들어졌는지)
		if (parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - child로 변환 성공");
		} else {
			System.out.println("method1 - child로 변환되지 않음");			
		}
		
		// 자바 12부터 추가된 문법
		// instanceof 결과가 true일 경우 자동 타입 변환되어 변수에 대입
		if (parent instanceof Child child) {
			System.out.println("method1 - child로 변환 성공");
		} else {
			System.out.println("method1 - child로 변환되지 않음");			
		}
	}

	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - child로 변환 성공");
	}

}
