package homework;

import java.util.Scanner;

public class Homework06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("한 자리 숫자를 입력하세요: ");
	    char digitChar = sc.nextLine().charAt(0);
	    
	    int digit = digitChar - '0';
	    int square = digit * digit;
	    
	    System.out.println("입력한 숫자의 제곱은 " + square + "입니다.");
	}

}
