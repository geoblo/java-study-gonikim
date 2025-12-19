package board;

import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int menuNo = 0;
		
		while (true) {
			// 메뉴판 출력
			menu();
			
			// 메뉴 번호 입력
			menuNo = sc.nextInt();
			sc.nextLine();
			
			// 0 -> 프로그램 종료
			if (menuNo == 0) break;
				
			// 메뉴 선택
			switch (menuNo) {
//				case 1: list(); break;   // 게시글 목록
//				case 2: select(); break; // 게시글 조회
//				case 3: insert(); break; // 게시글 등록
//				case 4: update(); break; // 게시글 수정
//				case 5: delete(); break; // 게시글 삭제
			}
		}
		System.out.println("프로그램을 종료합니다!");
	}
	
	/**
	 * 메뉴판
	 */
	public static void menu() {
		System.out.println("========== 게시판 ==========");
		System.out.println("1. 게시글 목록");
		System.out.println("2. 게시글 조회");
		System.out.println("3. 게시글 등록");
		System.out.println("4. 게시글 수정");
		System.out.println("5. 게시글 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("번호 입력: ");
	}

}
