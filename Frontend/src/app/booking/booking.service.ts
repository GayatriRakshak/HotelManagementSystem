import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { url } from 'inspector';

@Injectable({
  providedIn: 'root'
})
export class BookingService {
  

  constructor(private http:HttpClient) { }



    checkIn(data:any){
      console.log(data);
    // return this.http.post('http://localhost:8080/checkin',data);
    return this.http.post('http://localhost:8080/checkin',data,{ responseType: 'text' });
    }

    bookingExtension(input:any){
      let url1=`http://localhost:8080/bookingextension`;
        return this.http.put(url1,input,{responseType:'text'});
    }

    bookingReduction(input:any){
      return this.http.put('http://localhost:8080/bookingreduction',input, { responseType: 'text' });
    }

    checkOut(input:any){
      let bookingId = input.bookingId;
      let url2=`http://localhost:8080/checkout/${bookingId}`;
      return this.http.post(url2,input,{ responseType: 'text' });
    }

    payment(input:any){
      return this.http.put('http://localhost:8080/payment',input,{ responseType: 'text' });
    }

    viewBooking(input:any){
      let bookingId = input.bookingId;
      let url3=`http://localhost:8080/view/${bookingId}`;
      return this.http.get(url3);
    }

    viewAllbooking(){
      return this.http.get('http://localhost:8080/booking/getall');
    }


}




