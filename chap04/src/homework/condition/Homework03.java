package homework.condition;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 정수: ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 정수: ");
        int num2 = sc.nextInt();

        System.out.print("세 번째 정수: ");
        int num3 = sc.nextInt();
        
        int min = num1;
        if (min > num2) min = num2; 
        if (min > num3) min = num3; 
        
        System.out.println("가장 작은 수: " + min);
	}

}
