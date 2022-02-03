package com.is.project.board.model;

public class Board {

	private Integer idx;
	
	private String title;
	
	private String content;
	
	private String userId;

	public Integer getIdx() {
		return idx;
	}

	public void setIdx(Integer idx) {
		this.idx = idx;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setContent(String content) {
		this.content = content;
	}
		
}
