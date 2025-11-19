package homework;

import java.util.Arrays;

public class Homework04 {

	public static void main(String[] args) {
		// 공식화: (int) (Math.random() * (최대값 - 최소값 + 1)) + 최소값;
		
		int[] lottoArr = new int[6]; // {0, 0, 0, 0, 0, 0}
		int count = 0; // 로또 번호를 하나 넣을 때마다 1씩 증가
		
		while (count < lottoArr.length) {
			int num = (int) (Math.random() * 45) + 1; // 1~45
			
			// 중복 체크
			boolean duplicate = false;
			for (int i = 0; i < count; i++) { // 실제 로또 번호가 들어간 count까지만 체크
				if (lottoArr[i] == num) {
					duplicate = true;
					break; // 중복되는 값을 찾는 즉시 빠져나감
				}
			}
			
			// 중복이 아니면 배열에 저장
			if (!duplicate) {
				lottoArr[count] = num;
				count++;
			}
		}
		
		// 오름차순 정렬
		Arrays.sort(lottoArr);
		
		for (int num : lottoArr) {
            System.out.print(num + " ");
        }

	}

}
