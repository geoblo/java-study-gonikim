package homework;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("주민번호 입력(-): ");
        String ssn = sc.nextLine();

        // 인덱스 7번째 문자(실제 주민번호 형식 기준)
        char genderCode = ssn.charAt(7);
        
        // 삼항 연산자를 이용한 성별 판별
        String gender = (genderCode == '1' || genderCode == '3') 
        				? "남성" 
        				: (genderCode == '2' || genderCode == '4') 
        					? "여성" 
        					: "잘못된 값";
        
        System.out.println("입력하신 주민번호는 " + gender + "입니다.");
	}

}
