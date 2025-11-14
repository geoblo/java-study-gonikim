package sec02.exam05;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		System.out.println(args.length);
		
		// 이클립스에서 실행할 때 argument 주는 방법:
		// Run Configuration > Arguments
		
		if (args.length != 2) {
			System.out.println("값의 수가 올바르지 않습니다.");
//			return; // 메소드 종료
			System.exit(0); // JVM 강제 종료 코드
			// 여기서 0은 정상 종료를 의미
		}
		
		// Quiz: main 메소드 호출 시 전달된 인자값의 합계 구하기
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		// 문자열을 정수로 변환해서 더한 결과를 출력
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
	}

}
