package sec02.exam07;

public class WhileSumFrom1To100Example {

	public static void main(String[] args) {
		// 1부터 100까지 합
		int sum = 0;
		int i = 1;
		
		while (i <= 100) {
			sum += i;
			i++;
		}
		
		System.out.println("1~" + (i - 1) + " 합: " + sum);
		
		// (참고) 무한 루프
		int count = 1;
		while (true) {
			System.out.println("무한 반복" + count);
			
			// 실제 사용 예: 특정 조건을 만족하면 멈추도록
			if (count == 6) {
				break;
			}
			
			count++;
		}
		
		count = 1;
		boolean flag = true;
		while (flag) {
			System.out.println("무한 반복" + count);
			
			// 실제 사용 예: 특정 조건을 만족하면 멈추도록
			if (count == 6) {
				flag = false;
			}
			
			// 이 때는 뒤에 오는 코드 실행됨
			count++;
		}
		
		
		// do-while문으로 작성
		// 1부터 100까지 합
		sum = 0;
		i = 1;
		
		do { // 처음 한번은 무조건 실행!
			sum += i;
			i++;
//		} while (i <= 100);
		} while (i > 100);
		
		System.out.println("1~" + (i - 1) + " 합: " + sum);
		// 최소 한 번은 실행해야 하는 로직에 유용하지만, 실무에서는 거의 사용되지 않음
		
		
		// Quiz1: 1부터 100까지 홀수의 합
		
		
		// Quiz2:
//		화면에서 자연수를 입력받아서 각 자리수의 합을 출력하는 프로그램을 구현하시오.
//
//		[입력]    [출력]
//		 123   =>  6
//		 12345 =>  15
		
		
		
		
	}

}
