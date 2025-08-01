package sec01.quiz;

import java.util.Scanner;

public class Quiz2 {
//	Quiz
//	원본 문자열과 삭제할 문자들을 입력 받아 실행 클래스의 deleteChar 메소드를 구현하시오
//	deleteChar(String 원본문자열, String 삭제문자열) 메소드는 원본 문자열에서 삭제 문자열에 속한 문자를 제거하고 
//	남는 문자열을 리턴하는 메소드입니다.
//	※ 참고: 정적(static) 메소드 안에서 인스턴스 메소드를 쓸 수 없습니다.
//	
//	[입력]
//	1) 1,2-3 ,-!
//	2) 1a2b3 12345
//
//	[출력]
//	1) 123
//	2) ab
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine(); // 원본 문자열
		String str2 = sc.nextLine(); // 삭제할 문자들
		System.out.println(deleteChar(str1, str2));
	}

	private static String deleteChar(String original, String toDelete) {
		String result = "";
		
		for (int i = 0; i < original.length(); i++) {
			char c = original.charAt(i);
			// 삭제할 문자열에 포함되어 있지 않은 경우에만 result에 추가
			if (toDelete.indexOf(c) == -1) {
				result += c; // 문자 하나씩 문자열에 붙이기
			}
		}
		
		return result;
	}
	
}
