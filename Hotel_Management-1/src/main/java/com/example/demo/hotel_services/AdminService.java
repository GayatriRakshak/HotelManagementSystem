package com.example.demo.hotel_services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.hotel_entities.AdminDetails;
import com.example.demo.hotel_repositories.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	AdminRepository adminRepository;
	

	public String addAdmin(AdminDetails ad) {
		adminRepository.save(ad);
		return "Admin Details Added Successfully"+"Your user id is "+ad.getAdminId();
	}
	
	public AdminDetails getAdminbyId(int adminId) {
		
		AdminDetails od = adminRepository.findById(adminId).get();
		return od;
	}
	
	public String updateAdmin(AdminDetails od) {
		String str="";
		List<AdminDetails> list=getall();
		for(AdminDetails e:list) {
			if(e.getAdminId()==od.getAdminId()) {
		        adminRepository.save(od);
		        str= "Admin Details updated Successfully";
		        break;
			}else {
				str= "Admin id is not present";
			}
		}
		return str;
	}
	
	public List<AdminDetails> getall(){
		List<AdminDetails> list =new ArrayList<AdminDetails>();
		adminRepository.findAll().forEach(e -> list.add(e));
		return list;
	}
	
	public String removeAdmin(int adminId) {
		String str="";
		List<AdminDetails> list=getall();
		for(AdminDetails e:list) {
			if(e.getAdminId()==adminId) {
				adminRepository.deleteById(adminId);
				str="Admin Details removed Successfully";   
		        break;
			}else {
				str= "Admin id is not present";
			}
		}
		return str;
	}
	
	
	public boolean loginAdmin(AdminDetails newad) {
		boolean bool= false;
		List<AdminDetails> list = getall();
		for(AdminDetails e: list) {
			if(e.getAdminId()==newad.getAdminId()&&e.getAdminPassword().equals(newad.getAdminPassword())) {
				bool= true;
				break;
			}
		}
		return bool;
		
	}

	

}
