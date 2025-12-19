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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(BoardDTO board) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(BoardDTO board) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int no) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
