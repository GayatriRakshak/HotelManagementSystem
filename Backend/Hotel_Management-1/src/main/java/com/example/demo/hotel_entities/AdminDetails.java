package com.example.demo.hotel_entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Admin_Table")
public class AdminDetails {
	
	@Id
	@Column(name="admin_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int adminId;
	
	@Column(name="admin_name")
	@NotNull(message="Name is mandatory")
	private String adminName;
	
	@Column(name="admin_password")
	@NotNull(message="password is mandatory")
	private String adminPassword;
	
	@Column(name="admin_contact")
	@NotNull(message="Phone number is mandatory")
	private long adminContact;

	public AdminDetails() {
		super();
	}

	public AdminDetails(int adminId, @NotNull(message = "Name is mandatory") String adminName,
			@NotNull(message = "password is mandatory") String adminPassword,
			@NotNull(message = "Phone number is mandatory") long adminContact) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminPassword = adminPassword;
		this.adminContact = adminContact;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public long getAdminContact() {
		return adminContact;
	}

	public void setAdminContact(long adminContact) {
		this.adminContact = adminContact;
	}

	@Override
	public String toString() {
		return "AdminDetails [adminId=" + adminId + ", adminName=" + adminName + ", adminPassword=" + adminPassword
				+ ", adminContact=" + adminContact + "]";
	}
	
	
	
	
	

}
