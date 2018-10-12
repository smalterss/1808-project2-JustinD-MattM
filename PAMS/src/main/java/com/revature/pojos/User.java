package com.revature.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="USER_LIST")
@Component
public class User {

	@Id
	@Column(name="userId")
//	@SequenceGenerator(name="userId_seq", sequenceName="userId_seq")
//	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="userId_seq")
	int userId;
	
	@Column(name="emailAddress")
	String emailAddress;
	
	@Column(name="password")
	String password;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User() {
		
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", emailAddress=" + emailAddress + ", password=" + password + "]";
	}
	
	
}
