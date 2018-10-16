package com.revature.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="USER_LIST")
public class User {
	
	@Id
	@Column(name="password")
	
	private String password;
	
	@Column(name="emailAddress")
	private String emailAddress;
	
	@Column(name="userId")
	private int userId;
	
	
	public User(String password, String emailAddress, int userId) {
		super();
		this.password = password;
		this.emailAddress = emailAddress;
		this.userId = userId;
	}
	
	public User() {
		super();
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	@Override
	public String toString() {
		return "User [password=" + password + ", email Address=" + emailAddress + ", userId=" + userId + "]";
	}

}
