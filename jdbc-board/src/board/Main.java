package board;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import board.dto.BoardDTO;
import board.service.BoardService;
import board.service.BoardServiceImpl;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	private static BoardService boardService = new BoardServiceImpl(); // 게시판 비즈니스 로직 객체
	
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
				case 1: list(); break;   // 게시글 목록
				case 2: select(); break; // 게시글 조회
				case 3: insert(); break; // 게시글 등록
				case 4: update(); break; // 게시글 수정
				case 5: delete(); break; // 게시글 삭제
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
	
	/**
	 * 게시글 목록
	 */
	public static void list() {
		System.out.println("========== 게시글 목록 ==========");
		
		// 게시글 목록 데이터 요청
		List<BoardDTO> boardList = boardService.list();
		printAll(boardList);
	}
	
	/**
	 * 글 목록 전체 출력
	 * @param boardList
	 */
	public static void printAll(List<BoardDTO> boardList) {
		// 글 목록이 존재하는 확인
		if (boardList == null || boardList.isEmpty()) {
			System.out.println("조회된 글이 없습니다.");
			return;
		}
		
		// 글 목록 출력
		for (BoardDTO board : boardList) {
			print(board);
		}
	}
	
	/**
	 * 게시글 출력
	 * @param board
	 */
	public static void print(BoardDTO board) {
		if (board == null) {
			System.out.println("조회할 수 없는 게시글입니다.");
			return;
		}
		
		// Quiz
		int no = board.getNo();
		String title = board.getTitle();
		String writer = board.getWriter();
		String content = board.getContent();
		LocalDateTime regDate = board.getRegDate();
		LocalDateTime updDate = board.getUpdDate();
		
		// 날짜 포맷
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		String reg = regDate.format(formatter);
		String upd = updDate.format(formatter);
		
		System.out.println("========================================");
		System.out.println("★ 글 번호: " + no);
		System.out.println("★ 제목: " + title);
		System.out.println("★ 작성자: " + writer);
		System.out.println("----------------------------------------");
		System.out.println(" " + content);
		System.out.println();
		System.out.println("★ 등록일: " + reg);
		System.out.println("★ 수정일: " + upd);
		System.out.println("========================================");
		System.out.println();
	}
	
	/**
	 * 게시글 조회
	 */
	public static void select() {
		System.out.println("========== 게시글 조회 ==========");
		System.out.print("글 번호: ");
		int no = sc.nextInt();
		sc.nextLine();
		
		// 글 번호(no)를 전달하여 게시글 정보 데이터 요청
		BoardDTO board = boardService.select(no);
		
		// 게시글 출력
		print(board);
	}
	
	/**
	 * 게시글 정보 입력
	 * @return
	 */
	public static BoardDTO input() {
		// 필수 입력값: 제목, 작성자, 내용
		System.out.print("제목: ");
		String title = sc.nextLine();
		System.out.print("작성자: ");
		String writer = sc.nextLine();
		System.out.print("내용: ");
		String content = sc.nextLine();
		
		BoardDTO board = new BoardDTO(title, writer, content);
		return board;
	}
	
	/**
	 * 게시글 등록
	 */
	public static void insert() {
		System.out.println("========== 게시글 등록 ==========");
		
		BoardDTO board = input();
		
		// 게시글 등록 요청
		int result = boardService.insert(board);
		if (result > 0) {
			System.out.println("★ 게시글이 등록되었습니다.");
		} else {
			System.out.println("★ 게시글이 등록에 실패하였습니다.");			
		}
	}
	
	/**
	 * 게시글 수정
	 */
	public static void update() {
		System.out.println("========== 게시글 수정 ==========");
		
		System.out.print("게시글 번호: ");
		int no = sc.nextInt();
		sc.nextLine();

		BoardDTO board = input();
		board.setNo(no);
		
		// 게시글 수정 요청
		int result = boardService.update(board);
		if (result > 0) {
			System.out.println("★ 게시글이 수정되었습니다.");
		} else {
			System.out.println("★ 게시글 수정에 실패하였습니다.");
		}
	}

	/**
	 * 게시글 삭제
	 */
	public static void delete() {
		System.out.println("========== 게시글 삭제 ==========");
		
		System.out.print("게시글 번호: ");
		int no = sc.nextInt();
		sc.nextLine();
		
		// 게시글 삭제 요청
		int result = boardService.delete(no);
		if (result > 0) {
			System.out.println("★ 게시글을 삭제하였습니다.");
		} else {
			System.out.println("★ 게시글 삭제에 실패하였습니다.");
		}
	}
	
}
