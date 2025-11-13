package homework;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몸무게(kg): ");
		double weight = sc.nextDouble();
		
		System.out.print("키(m): ");
		double height = sc.nextDouble();
		
		double bmi = weight / (height * height);
		System.out.println("BMI 지수: " + bmi);
		// 소수점 이하 첫째 자리까지 표현
		System.out.printf("BMI 지수: %.1f\n", bmi);
		System.out.println("BMI 지수: " + (int) (bmi * 10) / 10.0);
		System.out.println("BMI 지수: " + Math.floor(bmi * 10) / 10.0);
	}

}
