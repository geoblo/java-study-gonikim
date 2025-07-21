package sec02.exam05;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		System.out.println(args.length);
		
		// 툴에서 직접 실행할 때 argument 주는 방법: Run Configurations > Arguments
		
		// main 메소드의 String[] 배열 매개변수 활용하기
		if (args.length != 2) {
			System.out.println("값의 수가 부족합니다.");
//			return; // 메소드 종료
			System.exit(0); // 프로그램(JVM) 강제 종료 코드
			// 여기서 0은 정상 종료를 의미
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		// Quiz: 문자열을 정수(int)로 변환해서 더한 결과를 출력
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}

}
