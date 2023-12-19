package com.example.demo.hotel_services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.hotel_entities.OwnerDetails;
import com.example.demo.hotel_repositories.OwnerRepository;

@Service
public class OwnerService {
	@Autowired 
	OwnerRepository ownerrepository;
	
	public String addOwner(OwnerDetails od) {
		String str;
		List<OwnerDetails> oldOd=getall();
			if(oldOd.isEmpty()) {
				ownerrepository.save(od);
				str= "Owner Details Added Successfully";
			}else
			{
				str= "Owner is already present. Go to login";
			}
		return str;
		
	}
	
	public OwnerDetails getOwnerbyId(int ownerId) {
		OwnerDetails od = ownerrepository.findById(ownerId).get();
		return od;
	}
	
	public String updateOwner(OwnerDetails od) {
		String str="";
		List<OwnerDetails> list=getall();
		for(OwnerDetails e:list) {
			if(e.getOwnerId()==od.getOwnerId()) {
		        ownerrepository.save(od);
		        str= "Owner Details updated Successfully";
		        break;
			}else {
				str= "Owner id is not present";
			}	
		}
		return str;
	}
	
	public List<OwnerDetails> getall(){
		List<OwnerDetails> list =new ArrayList<OwnerDetails>();
		ownerrepository.findAll().forEach(e -> list.add(e));
		return list;
	}
	
	public String removeOwner(int ownerId) {
		String str="";
		List<OwnerDetails> list=getall();
		for(OwnerDetails e:list) {
			if(e.getOwnerId()==ownerId) {
				ownerrepository.deleteById(ownerId);
				str= "Owner Details removed Successfully"; 
		        break;
			}else {
				str= "Invalid Owner Id";
			}	
		}
		return str;
	}
	
	public boolean loginOwner(OwnerDetails newod){
		boolean bool=false;
		List<OwnerDetails> list =getall();
		for(OwnerDetails e : list) {
			if(e.getOwnerId()== newod.getOwnerId()&&e.getOwnerPassword().equals(newod.getOwnerPassword())) {
				bool=true;
				break;
			}
		}
		return bool;
	}

}
