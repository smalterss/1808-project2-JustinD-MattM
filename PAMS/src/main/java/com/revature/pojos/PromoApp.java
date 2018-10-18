package com.revature.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="promoapp")
public class PromoApp {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="userid")
	private String userId;
	
	@Column(name="job")
	private String job;
	
	@Column(name="justification")
	private String justification;
	
	@Column(name="supervisorapproval")
	private boolean supevisorApproval;
	
	@Column(name="managerapproval")
	private boolean managerApproval;

	@Column(name="storemanagerapproval")
	private boolean storeManagerApproval;
	
	public PromoApp(Integer id, String userId, String job, String justification, boolean supevisorApproval,
			boolean managerApproval, boolean storeManagerApproval) {
		super();
		this.id = id;
		this.userId = userId;
		this.job = job;
		this.justification = justification;
		this.supevisorApproval = supevisorApproval;
		this.managerApproval = managerApproval;
		this.storeManagerApproval = storeManagerApproval;
	}

	public boolean isSupevisorApproval() {
		return supevisorApproval;
	}

	public void setSupevisorApproval(boolean supevisorApproval) {
		this.supevisorApproval = supevisorApproval;
	}

	public boolean isManagerApproval() {
		return managerApproval;
	}

	public void setManagerApproval(boolean managerApproval) {
		this.managerApproval = managerApproval;
	}

	public boolean isStoreManagerApproval() {
		return storeManagerApproval;
	}

	public void setStoreManagerApproval(boolean storeManagerApproval) {
		this.storeManagerApproval = storeManagerApproval;
	}

	public PromoApp() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getJustification() {
		return justification;
	}

	public void setJustification(String justification) {
		this.justification = justification;
	}

	@Override
	public String toString() {
		return "PromoApp [id=" + id + ", userId=" + userId + ", job=" + job + ", justification=" + justification
				+ ", supevisorApproval=" + supevisorApproval + ", managerApproval=" + managerApproval
				+ ", storeManagerApproval=" + storeManagerApproval + "]";
	}

}
