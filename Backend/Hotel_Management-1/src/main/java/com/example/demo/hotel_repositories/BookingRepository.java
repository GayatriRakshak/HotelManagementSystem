package com.example.demo.hotel_repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.hotel_entities.BookingDetails;

@Repository
public interface BookingRepository extends CrudRepository<BookingDetails,Integer>{
	

}
