package sec02.exam06;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		// 2행 3열의 2차원 배열
		int[][] mathScores = new int[2][3];
		
		// 2차원 배열의 모든 요소에 접근하려면 중첩 for문이 필요
		// 바깥 for문 => 행을 반복
		for (int i = 0; i < mathScores.length; i++) { // mathScores.length => 2
			// 안쪽 for문 => 열을 반복
			for (int j = 0; j < mathScores[i].length; j++) { // mathScores[i].length => 3
				System.out.println("mathScores[" + i + "][" + j + "]=" + mathScores[i][j]);
			}
		}
		
		
	}

}
