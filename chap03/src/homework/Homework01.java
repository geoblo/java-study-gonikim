package homework;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("말해보세요: ");
		String input = sc.nextLine();
//		String input = null;
		
		// 삼항(조건) 연산자 이용
		// 변수 쪽에 equals()를 호출하면, input이 null일 경우 예외(NPE)가 발생할 수 있음
//		String output = input.equals("간다") ? "온다" : "간다";
		// 리터럴이나 상수를 앞에 두면, input에 null이 와도 안전하게 비교할 수 있음(null-safe)
		String output = "간다".equals(input) ? "온다" : "간다";
		
		System.out.println("앵무새: " + output);
	}

}
