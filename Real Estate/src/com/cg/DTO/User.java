package com.cg.DTO;

public class User {

	public String type;
	private String loginId;
	private String password;
	public User(String type, String loginId, String password) {
		super();
		this.type = type;
		this.loginId = loginId;
		this.password = password;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
