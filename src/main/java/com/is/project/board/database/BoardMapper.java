package com.is.project.board.database;

import java.util.ArrayList;
import java.util.List;

import com.is.project.board.model.Board;

public interface BoardMapper {

	public ArrayList<Board> getBoardList(String userId);
	
	public boolean writeBoard(Board board);
}
