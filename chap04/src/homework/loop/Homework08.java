package homework.loop;

import java.util.Scanner;

public class Homework08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			// 문자열 입력
			System.out.print("문자열: ");
			String str = sc.nextLine();
			// 문자 입력
			System.out.print("문자: ");
			char ch = sc.nextLine().charAt(0);
			
			// 문자 개수 세기
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ch) {
					count++;
				}
			}
			
			System.out.println("포함된 개수: " + count);
			
			// 반복 여부 묻기
			while (true) {
				System.out.print("다시 입력하시겠습니까?");
				String again = sc.nextLine();
				
				if ("n".equalsIgnoreCase(again)) { // 대소문자를 구분하지 않고 비교
					System.out.println("프로그램 종료");
					return;
				} else if ("y".equalsIgnoreCase(again)) {
					break; // 바깥 while문으로 다시 돌아감
				} else {
					System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
				}
			}
		}

	}

}
