package com.cg.DTO;

public class User {

	public String type;
	private String loginId;
	private String password;
	private String name;
	private String phoneNo;
	private Address address;	
	
	
	public User(String type, String loginId, String password, String name, String phoneNo, Address address) {
		super();
		this.type = type;
		this.loginId = loginId;
		this.password = password;
		this.name = name;
		this.phoneNo = phoneNo;
		this.address = address;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
