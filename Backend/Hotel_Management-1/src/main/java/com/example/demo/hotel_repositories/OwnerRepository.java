package com.example.demo.hotel_repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.hotel_entities.OwnerDetails;

@Repository
public interface OwnerRepository extends CrudRepository<OwnerDetails, Integer>{

}
