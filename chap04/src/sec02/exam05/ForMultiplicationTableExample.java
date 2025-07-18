package sec02.exam05;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		// 구구단 출력하기
		// 중첩 for문(여기서는 이중 for문 사용)
		for (int m = 2; m <= 9; m++) {
			System.out.println("*** " + m + "단 ***");
			for (int n = 1; n <= 9; n++) {
				System.out.println(m + " x " + n + " = " + (m * n));
			}
			System.out.println();
		}
		
		// 참고: for문 중첩 시 퍼포먼스가 떨어짐
		// 삼중을 넘어가면 잘 안씀
	}

}
