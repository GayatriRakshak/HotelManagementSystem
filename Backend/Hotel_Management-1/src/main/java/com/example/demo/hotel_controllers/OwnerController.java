package com.example.demo.hotel_controllers;

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

import com.example.demo.hotel_entities.OwnerDetails;
import com.example.demo.hotel_services.OwnerService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class OwnerController{
	@Autowired
	OwnerService ownerservice;
	
	@PostMapping("/owner")
	private String addOwner(@RequestBody OwnerDetails od) {
		//System.out.println("this before ownerservice");
	String str=	ownerservice.addOwner(od);
	//System.out.println("this after ownerservice");
		return str;
	}
	
	@GetMapping("/owner/get/{ownerId}")
	private OwnerDetails getOwnerbyId(@PathVariable("ownerId")int ownerId) {
		OwnerDetails od = ownerservice.getOwnerbyId(ownerId);
		return od;
	}
	
	@PutMapping("/owner/update")
	private String updateOwner(@RequestBody @Valid OwnerDetails od) {
		String str=ownerservice.updateOwner(od);
		return str;
	}
	
	/*@GetMapping("/owner/getall")
	private List<com.example.demo.hotel_entities.OwnerDetails> getall(){
		
		List<OwnerDetails> list = ownerservice.getall();
		return list;
	}*/
	
	@DeleteMapping("/owner/remove/{OwnerId}")
	private String removeOwner(@PathVariable("OwnerId") int OwnerId) {
		String str=ownerservice.removeOwner(OwnerId);
		return str;
		
	}
	
	@PostMapping("/owner/login")
	private boolean loginOwner(@RequestBody OwnerDetails od) {
		boolean bool = ownerservice.loginOwner(od);
		return bool;
	}
}