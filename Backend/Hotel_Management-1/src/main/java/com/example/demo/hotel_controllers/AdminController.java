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

import com.example.demo.hotel_entities.AdminDetails;
import com.example.demo.hotel_entities.OwnerDetails;
import com.example.demo.hotel_services.AdminService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@PostMapping("/admin")
	private String addAdmin(@RequestBody AdminDetails ad) {	
	String str=	adminService.addAdmin(ad);
		return str;
	}
	

	@GetMapping("/admin/get/{adminId}")
	private AdminDetails getAdminbyId(@PathVariable("adminId")int adminId) {
		AdminDetails ad = adminService.getAdminbyId(adminId);
		return ad;
	}
	
	@PutMapping("/admin/update")
	private String updateAdmin(@RequestBody @Valid AdminDetails od) {
		String str=adminService.updateAdmin(od);
		return str;
	}
	
	@PostMapping("/admin/login")
	private boolean loginAdmin(@RequestBody AdminDetails ad) {
		boolean bool = adminService.loginAdmin(ad);
		return bool;
	}
	
	@GetMapping("/admin/getall")
	private List<AdminDetails> getall(){
		
		List<AdminDetails> list = adminService.getall();
		return list;
	}
	
	@DeleteMapping("/admin/remove/{adminId}")
	private String removeAdmin(@PathVariable("adminId") int adminId) {
		String str=adminService.removeAdmin(adminId);
		return str;
		
	}

}
