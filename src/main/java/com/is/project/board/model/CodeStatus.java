package com.is.project.board.model;

public enum CodeStatus {

	
	//Error
	ERR001(true,"program error."),

	//Success
	SUC001(false,"Success."),
	
	//Sign Up Error
	SGN001(true,"Duplicate ID."),
	SGN002(true,"ID's minimum length is 4."),
	SGN003(true,"ID's maximum length is 16."),
	SGN004(true,"Password's minimum length is 6."),
	SGN005(true,"Password's maximum length is 12."),
	
	//Login Error
	LGN001(true,"Wrong Information."),
	LGN002(true,"ID's minimum length is 4."),
	LGN003(true,"ID's maximum length is 16."),
	LGN004(true,"Password's minimum length is 6."),
	LGN005(true,"Password's maximum length is 12.");
	
	public boolean IsError;
	public String message;
	
	private CodeStatus(boolean IsError, String msg) {
		this.IsError = IsError;
		this.message = msg;
	}
	
	public boolean isIsError() {
		return IsError;
	}
	
	public String getMessage() {
		return message;
	}

}
