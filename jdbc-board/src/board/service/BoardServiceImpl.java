package board.service;

import java.util.List;

import board.dao.BoardDAO;
import board.dto.BoardDTO;

/**
 * 게시판 기능 구현
 * 실제 비즈니스 로직(핵심 로직)을 작성
 */
public class BoardServiceImpl implements BoardService {

	private BoardDAO boardDAO = new BoardDAO();
	
	@Override
	public List<BoardDTO> list() {
		// DAO로 게시글 목록을 요청하고 그 결과로 List<BoardDTO>를 받아옴
		List<BoardDTO> boardList = boardDAO.list();

		// 게시글 목록 데이터 반환
		return boardList;
	}

	@Override
	public BoardDTO select(int no) {
		// 게시글 번호(no)를 DB로 넘겨주고 게시글 정보 요청
		BoardDTO board = boardDAO.select(no);
		
		// 게시글 정보 반환
		return board;
	}

	@Override
	public int insert(BoardDTO board) {
		// 게시글 정보를 전달하여 DB에 데이터 등록 요청
		int result = boardDAO.insert(board);
		
		if (result > 0) {
			System.out.println("데이터 등록 성공!");
		} else {
			System.out.println("데이터 등록 실패!");
		}
		
		return result;
	}

	@Override
	public int update(BoardDTO board) {
		// 게시글 정보를 전달하여 DB에 데이터 수정 요청
		int result = boardDAO.update(board);
		// 적용된 데이터 개수를 반환
		// 0: 데이터 수정 실패
		// 1: 데이터 수정 성공
		
		if (result > 0) System.out.println("데이터 수정 성공!");
		else System.out.println("데이터 수정 실패!");
		
		return result;
	}

	@Override
	public int delete(int no) {
		// 게시글 번호(no)를 DB로 넘겨주고 게시글 삭제 요청
		int result = boardDAO.delete(no);
		// 적용된 데이터 개수를 반환
		// 0: 데이터 삭제 실패
		// 1: 데이터 삭제 성공
		
		if (result > 0) System.out.println("데이터 삭제 성공!");
		else System.out.println("데이터 삭제 실패!");
		
		return result;
	}
	
}
