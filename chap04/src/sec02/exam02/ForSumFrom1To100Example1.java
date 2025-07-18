package sec02.exam02;

public class ForSumFrom1To100Example1 {

	public static void main(String[] args) {
		// 1부터 100까지의 합
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
//			sum = sum + i;
			sum += i;
		}
		
		System.out.println("1~100 합: " + sum);
//		System.out.println("1~" + i + " 합: " + sum); // i는 for문 내부에서만 사용 가능한 지역 변수
	}

}
