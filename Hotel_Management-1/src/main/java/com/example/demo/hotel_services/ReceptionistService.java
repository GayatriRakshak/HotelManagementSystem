package com.example.demo.hotel_services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.hotel_entities.ReceptionistDetails;
import com.example.demo.hotel_repositories.ReceptionistRepository;

@Service
public class ReceptionistService {
	
	@Autowired
	ReceptionistRepository receptionistRepository;
	
	public String addReceptionist(ReceptionistDetails rd) {
		System.out.println("......2......."+rd.toString());
		receptionistRepository.save(rd);
		System.out.println("......3......."+rd.toString());
		return "Receptionist Details Added Successfully! "+"Your user id is "+rd.getReceptionistId();
	}
	
	public ReceptionistDetails getReceptionistbyId(int receptionistId) {
		ReceptionistDetails od = receptionistRepository.findById(receptionistId).get();
		return od;
	}
	
	public String updateReceptionist(ReceptionistDetails rd) {
	     String str="";
		 List<ReceptionistDetails> list=getall();
		 for(ReceptionistDetails e:list) {
			 if(e.getReceptionistId()==rd.getReceptionistId()) {
		              receptionistRepository.save(rd);
		              str= "Receptionist Details updated Successfully";
                      break;
	          }else {
		          str= "Receptionist id is not present";
	           }
		 }
		return str;
	}
	
	public List<ReceptionistDetails> getall(){
		List<ReceptionistDetails> list =new ArrayList<ReceptionistDetails>();
		receptionistRepository.findAll().forEach(e -> list.add(e));
		return list;
	}
	
	public String removeReceptionist(int receptionistId) {
		String str="";
		 List<ReceptionistDetails> list=getall();
		 for(ReceptionistDetails e:list) {
			 if(e.getReceptionistId()==receptionistId) {
				 receptionistRepository.deleteById(receptionistId);
					str= "Receptionist Details removed Successfully";
                      break;
	          }else {
		          str= "Receptionist id is not present";
	           }
		 }
		return str;
		
	}
	
	
	public boolean loginReceptionist(ReceptionistDetails newrd) {
		boolean bool= false;
		List<ReceptionistDetails> list = getall();
		for(ReceptionistDetails e: list) {
			if(e.getReceptionistId()==newrd.getReceptionistId()&& e.getReceptionistPassword().equals(newrd.getReceptionistPassword())) {
				bool= true;
				break;
			}
		}
		
		return bool;
	}

}
