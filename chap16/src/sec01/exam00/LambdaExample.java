package sec01.exam00;

public class LambdaExample {

	// 람다식 작성 연습
	// 람다식 작성 후 주석 처리
	
	// 메소드1
	int max(int a, int b) {
		return a > b ? a : b;
	}
	// 람다식1
//	(int a, int b) -> {
//		return a > b ? a : b;
//	}
//	(a, b) -> a > b ? a : b
	
	// 메소드2
	void printVar(String name, int i) {
		System.out.println(name + "=" + i);
	}
	
	// 메소드3
	int square(int x) {
		return x * x;
	}
	
	// 메소드4
	int roll() {
		return (int) (Math.random() * 6);
	}
	
	
	
	
	
	
	
}
