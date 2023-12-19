package com.example.demo.hotel_entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="room_table")
public class RoomDetails {
	
	@Id
	 @Column(name="room_no")
	@NotNull(message="Room number must be unique, use floor number as first digit")
	 private int roomNo;
	
	 @Column(name="room_status")
	 @NotNull(message="say room is available or not")
	 private String roomStatus;
	 
	 @Column(name="cost_per_day")
	 @NotNull(message="Cost per day is mandatory")
	 private double costPerDay;

	public RoomDetails() {
		super();
	}

	public RoomDetails(@NotNull(message = "Room number must be unique, use floor number as first digit") int roomNo,
			@NotNull(message = "say room is available or not") String roomStatus,
			@NotNull(message = "Cost per day is mandatory") double costPerDay) {
		super();
		this.roomNo = roomNo;
		this.roomStatus = roomStatus;
		this.costPerDay = costPerDay;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public String getRoomStatus() {
		return roomStatus;
	}

	public void setRoomStatus(String roomStatus) {
		this.roomStatus = roomStatus;
	}

	public double getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}

	@Override
	public String toString() {
		return "RoomDetails [roomNo=" + roomNo + ", roomStatus=" + roomStatus + ", costPerDay=" + costPerDay + "]";
	}
	 
	 
	 
	 
    

}
