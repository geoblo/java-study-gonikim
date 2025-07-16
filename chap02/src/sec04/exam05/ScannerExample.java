package sec04.exam05;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputData;
		
		while (true) {
			inputData = sc.nextLine(); // 스캐너에서 읽은 한 줄 전체(엔터키 이전까지)
			System.out.println("입력된 문자열: " + inputData);
			
			
			if (inputData == "q") { // (테스트)
//			if (inputData.equals("q")) {
				break;
			}
		}
		
		System.out.println("종료\n");
		
		// Quiz
//		2개의 int 값을 입력받아 입력받은 값을 화면에 ,로 연결하여 출력하시오.
//		[입력]    [출력]
//		10 20 => 10,20
	}

}
