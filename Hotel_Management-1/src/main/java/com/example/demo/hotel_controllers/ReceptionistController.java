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

import com.example.demo.hotel_entities.ReceptionistDetails;
import com.example.demo.hotel_services.ReceptionistService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ReceptionistController {
	@Autowired
	ReceptionistService receptionistService;
	
	@PostMapping("/receptionist")
	private String addReceptionist(@RequestBody ReceptionistDetails rd) {	
		System.out.println("......1......."+rd.toString());
	String str=	receptionistService.addReceptionist(rd);
		return str;
	}
	

	@GetMapping("/receptionist/get/{receptionistId}")
	private ReceptionistDetails getReceptionistbyId(@PathVariable("receptionistId")int receptionistId) {
		ReceptionistDetails ad = receptionistService.getReceptionistbyId(receptionistId);
		return ad;
	}
	
	@PutMapping("/receptionist/update")
	private String updateReceptionist(@RequestBody @Valid ReceptionistDetails rd) {
		String str=receptionistService.updateReceptionist(rd);
		return str;
	}
	
	@GetMapping("/receptionist/getall")
	private List<ReceptionistDetails> getall(){
		
		List<ReceptionistDetails> list = receptionistService.getall();
		return list;
	}
	
	@DeleteMapping("/receptionist/remove/{receptionistId}")
	private String removeReceptionist(@PathVariable("receptionistId") int receptionistId) {
		String str=receptionistService.removeReceptionist(receptionistId);
		return str;
		
	}
	
	@PostMapping("/receptionist/login")
	private boolean loginReceptionist(@RequestBody ReceptionistDetails rd) {
	boolean bool = receptionistService.loginReceptionist(rd);
	return bool;
	}
   
}
