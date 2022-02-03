package com.is.project.board.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.is.project.board.model.Board;
import com.is.project.board.model.CodeStatus;
import com.is.project.board.model.Response;
import com.is.project.board.model.UserInfo;
import com.is.project.board.service.BoardService;
import com.is.project.board.service.LoginService;

@RestController
@RequestMapping(value = {"/board"})
public class BoardController {

	public static Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	LoginService loginService;
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping(value = "/login", method = {RequestMethod.POST})
	public Object login(@RequestBody UserInfo userInfo) {
		Response responseBody =  new Response();
		
		if(!loginService.login(userInfo)) {
			logger.debug(CodeStatus.LGN001 + " === login information is wrong.");
			responseBody.setErrorCode(CodeStatus.LGN001);
		}
		else {
			HashMap<String,Object> map = new HashMap<>();
			map.put("id", userInfo.getId());
			map.put("password",userInfo.getPassword());
			responseBody.setData(responseBody);
		}
		
		return responseBody;
	}
	
	@RequestMapping(value = "/signup", method = {RequestMethod.POST})
	public Object signUp(@RequestBody UserInfo userInfo) {
		Response responseBody =  new Response();
		
		if(userInfo.getId()== null || userInfo.getPassword()==null) {
			logger.debug(CodeStatus.ERR001 + " === Id or Password is empty.");
			responseBody.setErrorCode(CodeStatus.ERR001);
		}
		
		if(loginService.isUser(userInfo.getId())) {
			logger.debug(CodeStatus.SGN001 + " === ID is duplicated.");
			responseBody.setErrorCode(CodeStatus.SGN001);
		}
		
		return responseBody;
	}
	
	@RequestMapping(value="/home", method = {RequestMethod.GET})
	public Object home(@RequestBody String userId) {
		Response responseBody =  new Response();
		List<Board> boardList = new ArrayList<Board>();
		boardList = boardService.loadBoard(userId);
		return responseBody;
	}
	
	@RequestMapping(value = "/writeBoard", method = {RequestMethod.POST})
	public Object writeBoard(Board board) {
		Response responseBody =  new Response();
		
		return responseBody;
	}
	
	@RequestMapping(value = "/writeBoard", method = {RequestMethod.DELETE})
	public Object deleteBoard(Board board) {
		Response responseBody =  new Response();
		
		return responseBody;
	}
}
