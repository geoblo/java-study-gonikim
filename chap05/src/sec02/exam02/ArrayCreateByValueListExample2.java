package sec02.exam02;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		// 2. 배열 변수 선언 후 나중에 값 대입
		int[] scores;
//		scores = {83, 90, 87}; // 컴파일 에러(문법적으로 허용X)
		// 배열을 선언과 동시에 초기화할 때만 사용할 수 있음
		
		scores = new int[] {83, 90, 87};
		int sum1 = 0;
		for (int i = 0; i < scores.length; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합: " + sum1);
		
		// 메소드의 매개 변수(배열 변수)에 배열 객체를 전달하는 경우
//		int sum2 = add({83, 90, 87}); // 컴파일 에러
//		int sum2 = add(new int[] {83, 90, 87});
		int sum2 = add(scores); // 헷갈리면 배열 객체를 담은 변수를 넘기세요.
		System.out.println("총합: " + sum2);	
	}
	
	// 메소드 선언
	public static int add(int[] scores) { // 이미 선언된 매개 변수
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}
	
	
	
	
	
	
	
	
	
	
	

}
