package com.is.project.board.service;

import com.is.project.board.model.UserInfo;

public interface LoginService {

	public boolean login(UserInfo userInfo);

	public boolean isUser(String user_id);
	
}
