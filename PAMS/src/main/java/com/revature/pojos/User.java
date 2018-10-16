package com.revature.pojos;

public class User {
	
	private String password;
	@Override
	public String toString() {
		return "User [password=" + password + ", email=" + emailAddress + ", userId=" + userId + "]";
	}
	public User() {
		super();
	}
	public User(String password, String emailAddress, int userId) {
		super();
		this.password = password;
		this.emailAddress = emailAddress;
		this.userId = userId;
	}
	private String emailAddress;
	private int userId;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String email) {
		this.emailAddress = emailAddress;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

}
