package com.is.project.board.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.is.project.board.database.LoginMapper;
import com.is.project.board.model.UserInfo;
import com.is.project.board.service.LoginService;

public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginMapper loginMapper;
	
	@Override
	public boolean login(UserInfo userInfo) {
		if(loginMapper.Login(userInfo))
			return true;
		else
			return false;
	}        

}
