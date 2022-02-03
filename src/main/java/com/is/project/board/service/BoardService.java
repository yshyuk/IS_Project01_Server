package com.is.project.board.service;

import java.util.ArrayList;

import com.is.project.board.model.Board;

public interface BoardService {

	ArrayList<Board> loadBoard(String userId);

}
