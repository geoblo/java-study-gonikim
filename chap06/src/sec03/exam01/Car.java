package sec03.exam01;

public class Car {
	// 아래와 같이 명시적으로 생성자를 선언하면 컴파일러는 기본 생성자를 자동으로 추가하지 않음
//	Car() {
//	}

	// 생성자
	Car(String color, int cc) {
		System.out.println(color + "색의 " + cc + "cc 자동차가 생성됨");
	}
}
