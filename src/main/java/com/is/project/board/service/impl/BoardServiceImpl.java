package com.is.project.board.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.is.project.board.database.BoardMapper;
import com.is.project.board.model.Board;
import com.is.project.board.service.BoardService;

public class BoardServiceImpl implements BoardService{
	
	@Autowired
	BoardMapper boardMapper;
	
	@Override
	public ArrayList<Board> loadBoard(String userId){
		return boardMapper.getBoardList(userId);
	}
}
