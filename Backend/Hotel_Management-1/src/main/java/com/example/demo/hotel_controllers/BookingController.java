package com.example.demo.hotel_controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.hotel_entities.AdminDetails;
import com.example.demo.hotel_entities.BookingDetails;
import com.example.demo.hotel_repositories.BookingRepository;
import com.example.demo.hotel_services.BookingService;
import com.example.demo.hotel_services.RoomService;

import java.time.*;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BookingController {
	
	@Autowired
	BookingService bookingService;
	
	@Autowired
	BookingRepository bookingRepository;
	
	@Autowired
	RoomService roomService;
	
	BookingDetails bd = new BookingDetails();
	
	/* @GetMapping("/xyz")
	 private String myMethod(){
		 return "this is xyz";
	 }      */
	 
	 @PostMapping("/checkin")
		private String checkin(@RequestBody BookingDetails bd) {
		 LocalDate curdate = LocalDate.now() ;
		 String indate=curdate.toString();
		 bd.setCid(indate);
		String str=	bookingService.checkin(bd);
			return str ;
		}
	 
	 @GetMapping("/view/{bookingId}")
	 private BookingDetails viewBooking(@PathVariable("bookingId") int bookingId) {
		 
		 BookingDetails bd= bookingService.viewBooking(bookingId);
		 return bd;
	 }

	 @PostMapping("/checkout/{bookingId}")
		private String checkout(@PathVariable("bookingId") int bookingId) {
		 LocalDate curdate = LocalDate.now() ;
		 String outdate=curdate.toString();
		 bd.setCod(outdate);
		String str=	bookingService.checkout(bookingId,bd.getCod());
			return str;
		}
	 
	 
	 @PutMapping("/payment")
	 private String payment(@RequestBody BookingDetails bd) {
		 System.out.println("inside payment controll");
		 String str=bookingService.payment(bd);
		 return str;
	 } 
	
	 
	 @PutMapping("/bookingextension")
	 private String bookingExtension(@RequestBody BookingDetails bd) {
		 String str=bookingService.bookingExtension(bd);
		 return str;
	 } 
	 
	 @PutMapping("/bookingreduction")
	 private String bookingReduction(@RequestBody BookingDetails bd) {
		 String str=bookingService.bookingReduction(bd);
		 return str;
	 } 
	 
	@GetMapping("/booking/getall")
	private List<BookingDetails> getall(){	
		List<BookingDetails> list = bookingService.getall();
		return list;
	}
		
	 
	
	
	

}
