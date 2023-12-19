package com.example.demo.hotel_services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.hotel_entities.RoomDetails;
import com.example.demo.hotel_repositories.RoomRepository;


@Service
public class RoomService {
	
	@Autowired
	RoomRepository roomRepository;
	
	
	public String addRoom(RoomDetails rd) {
		String str=" ";
		List<RoomDetails> list=getall();
		if(list.isEmpty()) {
			roomRepository.save(rd);
			str="Room Details Added Successfully";
		}else {
		for(RoomDetails e:list) {
			if(e.getRoomNo()==rd.getRoomNo()) {
				str= "Room no is already present";
				break;
			}else {
				roomRepository.save(rd);
				str="Room Details Added Successfully";
			}
		  }
		}
	  return str;		
	}
	
	public RoomDetails getRoombyId(int roomNo) {
		 System.out.println(".....passed room no to rs...." + roomNo);
		RoomDetails rd = roomRepository.findById(roomNo).get();
		 System.out.println(".....room details...."+toString());
		return rd;
	}
	
	public String updateRoom(RoomDetails rd) {
		String str=" ";
		List<RoomDetails> list=getall();
		for(RoomDetails e:list) {
			if(e.getRoomNo()==rd.getRoomNo()) {
				roomRepository.save(rd);
				str="Room Details updated Successfully";
				break;
			}else {
				str= "Room no is not present";
			}
		}
	  return str;
	}
	
	public List<RoomDetails> getall(){
		List<RoomDetails> list =new ArrayList<RoomDetails>();
		roomRepository.findAll().forEach(e -> list.add(e));
		return list;
	}
	
	public String removeRoom(int roomNo) {
		String str=" ";
		List<RoomDetails> list=getall();
		for(RoomDetails e:list) {
			if(e.getRoomNo()==roomNo) {
				roomRepository.deleteById(roomNo);
				str="Room Details deleted Successfully";
				break;
			}else {
				str= "Room no is not present";
			}
		}
	  return str;
	}
	
	
	
	// to assign status of room  is booked at the time of check out
	public RoomDetails assignStatusAvailable(int roomNo) {
		System.out.println("....Inside room service");
		System.out.println("....Inside booking service"+roomNo);
		RoomDetails rd = roomRepository.findById(roomNo).get();
		rd.setRoomStatus("Available");
		roomRepository.save(rd);
		return rd;
	}
		
		// to assign status of room  is booked at the time of booking
		public RoomDetails assignStatusBooked(int roomNo) {
			RoomDetails rd = roomRepository.findById(roomNo).get();
			rd.setRoomStatus("Booked");
			roomRepository.save(rd);
			return rd;
		}
		

}
