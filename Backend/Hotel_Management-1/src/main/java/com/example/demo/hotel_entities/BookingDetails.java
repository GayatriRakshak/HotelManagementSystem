package com.example.demo.hotel_entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="booking_table")
public class BookingDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="booking_id")
	private int bookingId;
	
	@Column(name="customer_name")
	//@NotNull(message="name is mandatory")
	private String custName;
	
	@Column(name="customer_contact")
	//@NotNull(message="Phone number is mandatory")
	private String custContact;
	
	@Column(name="no_of_days")
	//@NotNull(message="No of days is mandatory")
	private int noOfDays;
	
	@Column(name="no_of_persons")
	//@NotNull(message="No of days is mandatory")
	private String noOfPersons;
	
	
	@Column(name="checkout_date")
	//@NotNull(message="No of days is mandatory")
	private String cod;    // customer out date
	
	@Column(name="checkin_date")
	//@NotNull(message="No of days is mandatory")
	private String cid;   // customer check in date
	
	@Column(name="room_no")
	//@NotNull(message="No of days is mandatory")
	private int roomNo;
	
	@Column(name="advance")
	//@NotNull(message="No of days is mandatory")
	private double advance;
	
	@Column(name="total_amount")
	//@NotNull(message="No of days is mandatory")
	private double totalAmount;
	
	@Column(name="paid_amount")
	//@NotNull(message="No of days is mandatory")
	private double payment;
	
	@Column(name="balance")
	//@NotNull(message="No of days is mandatory")
	private double balance;

	public BookingDetails() {
		super();
	}

	

    public BookingDetails(int bookingId, String custName, String custContact, int noOfDays, String noOfPersons,
			String cod, String cid, int roomNo, double advance, double totalAmount, double payment, double balance) {
		super();
		this.bookingId = bookingId;
		this.custName = custName;
		this.custContact = custContact;
		this.noOfDays = noOfDays;
		this.noOfPersons = noOfPersons;
		this.cod = cod;
		this.cid = cid;
		this.roomNo = roomNo;
		this.advance = advance;
		this.totalAmount = totalAmount;
		this.payment = payment;
		this.balance = balance;
	}


	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustContact() {
		return custContact;
	}

	public void setCustContact(String custContact) {
		this.custContact = custContact;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public String getNoOfPersons() {
		return noOfPersons;
	}

	public void setNoOfPersons(String noOfPersons) {
		this.noOfPersons = noOfPersons;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public double getAdvance() {
		return advance;
	}

	public void setAdvance(double advance) {
		this.advance = advance;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}



	public double getPayment() {
		return payment;
	}



	public void setPayment(double payment) {
		this.payment = payment;
	}



	@Override
	public String toString() {
		return "BookingDetails [bookingId=" + bookingId + ", custName=" + custName + ", custContact=" + custContact
				+ ", noOfDays=" + noOfDays + ", noOfPersons=" + noOfPersons + ", cod=" + cod + ", cid=" + cid
				+ ", roomNo=" + roomNo + ", advance=" + advance + ", totalAmount=" + totalAmount + ", payment="
				+ payment + ", balance=" + balance + "]";
	}
 
	

    





    
	
	
	
	
	
	
	
	
	

}
