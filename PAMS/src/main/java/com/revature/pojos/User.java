package com.revature.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="USER_LIST")
public class User {
	
	@Id
	@Column(name="userId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	
	@Column(name="emailAddress")
	private String emailAddress;
	
	@Column(name="password")
	private String password;
	
	@Column(name="employee")
	private boolean employee;

	@Column(name="supervisor")
	private boolean supervisor;
	
	@Column(name="manager")
	private boolean manager;
	
	@Column(name="storemanager")
	private boolean storeManager;
	
	
	public User(int userId, String emailAddress, String password, boolean employee, boolean supervisor, boolean manager,
			boolean storeManager) {
		super();
		this.userId = userId;
		this.emailAddress = emailAddress;
		this.password = password;
		this.employee = employee;
		this.supervisor = supervisor;
		this.manager = manager;
		this.storeManager = storeManager;
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
	
	public boolean isEmployee() {
		return employee;
	}

	public void setEmployee(boolean employee) {
		this.employee = employee;
	}

	public boolean isSupervisor() {
		return supervisor;
	}

	public void setSupervisor(boolean supervisor) {
		this.supervisor = supervisor;
	}

	public boolean isManager() {
		return manager;
	}

	public void setManager(boolean manager) {
		this.manager = manager;
	}

	public boolean isStoreManager() {
		return storeManager;
	}

	public void setStoreManager(boolean storeManager) {
		this.storeManager = storeManager;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", emailAddress=" + emailAddress + ", password=" + password + ", employee="
				+ employee + ", supervisor=" + supervisor + ", manager=" + manager + ", storeManager=" + storeManager
				+ "]";
	}

	
}
