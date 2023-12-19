package com.example.demo.hotel_controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.hotel_entities.RoomDetails;
import com.example.demo.hotel_services.RoomService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class RoomController {
	
	@Autowired
	RoomService roomService;
	
	@PostMapping("/room")
	private String addRoom(@RequestBody RoomDetails rd) {	
	String str=	roomService.addRoom(rd);
		return str;
	}
	

	@GetMapping("/room/get/{roomNo}")
	private RoomDetails getRoombyId(@PathVariable("roomNo")int roomNo) {
		RoomDetails ad = roomService.getRoombyId(roomNo);
		return ad;
	}
	
	@PutMapping("/room/update")
	private String updateRoom(@RequestBody @Valid RoomDetails rd) {
		String str=roomService.updateRoom(rd);
		return str;
	}
	
	@GetMapping("/room/getall")
	private List<RoomDetails> getall(){
		
		List<RoomDetails> list = roomService.getall();
		return list;
	}
	
	@DeleteMapping("/room/remove/{roomNo}")
	private String removeRoom(@PathVariable("roomNo") int roomNo) {
		String str=roomService.removeRoom(roomNo);
		return str;
		
	}
	
	@GetMapping("/room/availablerooms")
	private List<Integer> availablerooms(){
		String str="Available";
		List<RoomDetails> list = roomService.getall();
		List<Integer> roomColumn = new ArrayList<Integer>(); 
		for(int i=0;i<list.size();i++) {
			String status=list.get(i).getRoomStatus();
			System.out.println("status is "+ status);
			
			if(str.equals(status)) {
				System.out.println(list.get(i).getRoomNo());
				roomColumn.add(list.get(i).getRoomNo());
			}
			
		}
			
		return roomColumn;
	}
	
	
	

	

}
