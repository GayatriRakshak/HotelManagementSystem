package com.example.demo.hotel_entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="owner_table")
public class OwnerDetails {
    @Id
    @Column(name="owner_id")
	int ownerId;
    
    @Column(name="owner_name")
	String ownerName;
    
    @Column(name="owner_password")
	String ownerPassword;
    
    

	public OwnerDetails() {
		super();
	}

	public OwnerDetails(int ownerId, String ownerName, String ownerPassword) {
		super();
		this.ownerId = ownerId;
		this.ownerName = ownerName;
		this.ownerPassword = ownerPassword;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerPassword() {
		return ownerPassword;
	}

	public void setOwnerPassword(String ownerPassword) {
		this.ownerPassword = ownerPassword;
	}

	@Override
	public String toString() {
		return "OwnerDetails [ownerId=" + ownerId + ", ownerName=" + ownerName + ", ownerPassword=" + ownerPassword
				+ "]";
	}
    
    
    
}