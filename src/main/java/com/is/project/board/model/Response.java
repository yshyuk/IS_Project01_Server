package com.is.project.board.model;

import com.fasterxml.jackson.annotation.JsonInclude;

public class Response {

	private String message;
	
	private boolean IsError;
	
	private CodeStatus ErrorCode;
	
	@JsonInclude(JsonInclude.Include.NON_DEFAULT)
	private Object data;
	
	public Response() {
		this.ErrorCode = CodeStatus.SUC001;
		this.message = CodeStatus.SUC001.getMessage();
		this.IsError = CodeStatus.SUC001.isIsError();
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isIsError() {
		return IsError;
	}

	public void setIsError(boolean isError) {
		IsError = isError;
	}

	public CodeStatus getErrorCode() {
		return ErrorCode;
	}

	public void setErrorCode(CodeStatus errorCode) {
		ErrorCode = errorCode;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
}
