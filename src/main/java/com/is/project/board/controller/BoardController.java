package com.is.project.board.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.is.project.board.model.Response;
import com.is.project.board.model.UserInfo;
import com.is.project.board.service.LoginService;

@RestController
@RequestMapping(value = {"/board"})
public class BoardController {

	public static Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value = "/login", method = {RequestMethod.POST})
	public Object login(UserInfo userInfo) {
		Response responseBody =  new Response();
		if(loginService.login(id, pwd))
		return responseBody;

	}
	
	@RequestMapping(value = "/signup", method = {RequestMethod.POST})
	public Object signUp(UserInfo userInfo) {
		Response responseBody =  new Response();
		
		return responseBody;
	}
}
