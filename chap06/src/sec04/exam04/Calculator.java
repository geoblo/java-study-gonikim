package sec04.exam04;

public class Calculator {
	// 메소드
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	double avg(int x, int y) {
		// 클래스 내부에서 메소드 호출 시 이름만 써주면 된다.
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}
	
	void excute() {
		double result = avg(7, 10);
		println("실행결과: " + result);
	}
	
	// 내부 호출 연습용
	void println(String message) {
		System.out.println(message);
	}
}
