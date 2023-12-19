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
@Table(name="receptionist_table")
public class ReceptionistDetails {
	
	 @Id
	   // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "receptionist_table")
	   // @SequenceGenerator(name = "receptionist_table", initialValue = 101)
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name="receptionist_id")
	 private int receptionistId;
	 
	 @Column(name="receptionist_name")
	 @NotNull(message="Name is mandatory")
	 private String receptionistName;
	 
	 @Column(name="receptionist_password")
	 @NotNull(message="Password  is mandatory")
	 private String receptionistPassword;
	 
	 @Column(name="receptionist_contact")
	 @NotNull(message="Phone number is mandatory")
	 private String receptionistContact;
	 
	 

	public ReceptionistDetails() {
		super();
	}


	public ReceptionistDetails(int receptionistId, @NotNull(message = "Name is mandatory") String receptionistName,
			@NotNull(message = "Password  is mandatory") String receptionistPassword,
			@NotNull(message = "Phone number is mandatory") String receptionistContact) {
		super();
		this.receptionistId = receptionistId;
		this.receptionistName = receptionistName;
		this.receptionistPassword = receptionistPassword;
		this.receptionistContact = receptionistContact;
	}


	public int getReceptionistId() {
		return receptionistId;
	}


	public void setReceptionistId(int receptionistId) {
		this.receptionistId = receptionistId;
	}


	public String getReceptionistName() {
		return receptionistName;
	}


	public void setReceptionistName(String receptionistName) {
		this.receptionistName = receptionistName;
	}


	public String getReceptionistPassword() {
		return receptionistPassword;
	}


	public void setReceptionistPassword(String receptionistPassword) {
		this.receptionistPassword = receptionistPassword;
	}


	public String getReceptionistContact() {
		return receptionistContact;
	}


	public void setReceptionistContact(String receptionistContact) {
		this.receptionistContact = receptionistContact;
	}


	@Override
	public String toString() {
		return "ReceptionistDetails [receptionistId=" + receptionistId + ", receptionistName=" + receptionistName
				+ ", receptionistPassword=" + receptionistPassword + ", receptionistContact=" + receptionistContact
				+ "]";
	}
	
	
	
	 
	 
	 
	 
	 

}
