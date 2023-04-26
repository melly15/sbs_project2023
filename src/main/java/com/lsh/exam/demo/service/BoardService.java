package com.lsh.exam.demo.service;

import org.springframework.stereotype.Service;

import com.lsh.exam.demo.repository.BoardRepository;
import com.lsh.exam.demo.vo.Board;

@Service
public class BoardService {
<<<<<<< HEAD
=======
	
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
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
	
}
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
