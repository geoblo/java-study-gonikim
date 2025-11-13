package homework;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어: ");
		double korean = sc.nextDouble();
		
		System.out.print("영어: ");
		double english = sc.nextDouble();

		System.out.print("수학: ");
		double math = sc.nextDouble();
		
		int total = (int) (korean + english + math);
		int avg = total / 3;
		
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);
	}

}
