package com.example.demo.hotel_repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.hotel_entities.ReceptionistDetails;

@Repository
public interface ReceptionistRepository extends CrudRepository<ReceptionistDetails,Integer>{

}
