package com.lsh.exam.demo.service;

import org.springframework.stereotype.Service;

import com.lsh.exam.demo.repository.BoardRepository;
import com.lsh.exam.demo.vo.Board;

@Service
public class BoardService {
<<<<<<< HEAD
	
=======
<<<<<<< HEAD
=======
	
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
	private BoardRepository boardRepository;
	
	public BoardService(BoardRepository boardRepository) {
		this.boardRepository = boardRepository;
	}
	
	public Board getBoardById(int id) {
		return boardRepository.getBoardById(id);
	}
<<<<<<< HEAD

}
=======
<<<<<<< HEAD
}
=======
	
}
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
