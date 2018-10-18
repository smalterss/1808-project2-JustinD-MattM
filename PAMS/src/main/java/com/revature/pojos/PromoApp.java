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

	public PromoApp(Integer id, String userId, String job, String justification) {
		super();
		this.id = id;
		this.userId = userId;
		this.job = job;
		this.justification = justification;
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
		return "PromoApp [id=" + id + ", userId=" + userId + ", job=" + job + ", justification=" + justification + "]";
	}
	
	

}
