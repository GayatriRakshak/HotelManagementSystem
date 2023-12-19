package com.example.demo.hotel_services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.hotel_entities.AdminDetails;
import com.example.demo.hotel_entities.BookingDetails;
import com.example.demo.hotel_entities.RoomDetails;
import com.example.demo.hotel_repositories.BookingRepository;
import com.example.demo.hotel_repositories.RoomRepository;

@Service
public class BookingService {
	double balance1;
	@Autowired
	BookingRepository bookingRepository;
	
	@Autowired
	RoomService roomService;
	RoomDetails rd = new RoomDetails() ;
	
	BookingDetails bd = new BookingDetails();
	
	//balance calculation method
	public double totalAmountCal(int noOfDays, int roomNo) {
		rd=roomService.getRoombyId(roomNo);
		double ta=noOfDays*rd.getCostPerDay();
		return ta;
	}
	
	public double balanceCal(double totalAmount,double balance, double advance) {
		if(advance==0) {
			balance=totalAmount;
		}else {
			balance=totalAmount-advance;
		}
		return balance;
	}
	
	public String checkin(BookingDetails bd) {
		String str="";
		 double ta=totalAmountCal(bd.getNoOfDays(),bd.getRoomNo());
		 bd.setTotalAmount(ta);
		 double balance1=balanceCal(bd.getTotalAmount(),bd.getBalance(), bd.getAdvance());
		 bd.setBalance(balance1);
		 rd= roomService.getRoombyId(bd.getRoomNo());
		 System.out.println(rd.getRoomNo()+"is "+rd.getRoomStatus());
		 if(rd.getRoomStatus().equals("Booked")) {
			 str=rd.getRoomNo()+"Room no is already booked";
		 }else {
			 bookingRepository.save(bd);
		     roomService.assignStatusBooked(bd.getRoomNo());
			str="Your booking id is "+bd.getBookingId(); 
		 }
		 
		return str;
	}
	
	public BookingDetails viewBooking(int bookingId){
		BookingDetails bd=bookingRepository.findById(bookingId).get();
		return bd;
	}
	
	public String checkout(int bookingId,String cod) {
		BookingDetails bd=viewBooking(bookingId);
		if(bd.getBalance()==0) {
			bd.setCod(cod);
			 bookingRepository.save(bd);
			 System.out.println("....Inside booking service");
			 roomService.assignStatusAvailable(bd.getRoomNo());
		return "you have checked out succesfully";
		}else {
			return "Balace amount is"+bd.getBalance();
		}
	}
	
	
	public String payment(BookingDetails newbd) {
		System.out.println("inside payment sevice");
		BookingDetails bd=viewBooking(newbd.getBookingId());
		System.out.println("old bd " + bd);
		double oldbalance=bd.getBalance();
		if(oldbalance!=0) {
			bd.setBalance(oldbalance-newbd.getPayment());
			bd.setPayment(bd.getPayment()+newbd.getPayment()+bd.getAdvance());
			bookingRepository.save(bd);
			System.out.println("inside if new bd "+ bd);
			return "Remaining balance is "+bd.getBalance();
		}else {
			return "You have paid full amount already";
		}	
   }
	
	public String bookingExtension(BookingDetails newbd) {
	     bd=viewBooking(newbd.getBookingId());
	     bd.setNoOfDays(bd.getNoOfDays()+newbd.getNoOfDays());
		 double ta=totalAmountCal(bd.getNoOfDays(),bd.getRoomNo());
		 bd.setTotalAmount(ta);
		 double balance1=balanceCal(bd.getTotalAmount(),bd.getBalance(), bd.getAdvance());
		 bd.setBalance(balance1);
		 bookingRepository.save(bd);
		String str="you are booking "+bd.getNoOfDays()+" days \n your total amount is "+bd.getTotalAmount()+"\n your balance is "+bd.getBalance();	    
		return str;
	}
	
	
	public String bookingReduction(BookingDetails newbd) {
		 String str;
	     bd=viewBooking(newbd.getBookingId()); 
	     bd.setNoOfDays(bd.getNoOfDays()-newbd.getNoOfDays());
	     double ta=totalAmountCal(bd.getNoOfDays(),bd.getRoomNo());
		 bd.setTotalAmount(ta);
		 double balance1=balanceCal(bd.getTotalAmount(),bd.getBalance(), bd.getAdvance());
		 bd.setBalance(balance1);
		 bookingRepository.save(bd);
		 if(bd.getBalance()<=0) {
			 str="you are booking "+bd.getNoOfDays()+"days \n your total amount is "+bd.getTotalAmount()+"\n balance is "+bd.getBalance()+"Sorry! It will not be refunded ";	
		 }else {
		str="you are booking "+bd.getNoOfDays()+"days \n your total amount is "+bd.getTotalAmount()+"\n balance is "+bd.getBalance();	    
		 }
		return str;
	}
	
	public List<BookingDetails> getall(){
		List<BookingDetails> list =new ArrayList<BookingDetails>();
		bookingRepository.findAll().forEach(e -> list.add(e));
		return list;
	}

}
