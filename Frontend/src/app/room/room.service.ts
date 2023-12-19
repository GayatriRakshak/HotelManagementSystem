import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class RoomService {

  constructor(private http:HttpClient) { }

  viewRoom(roomNo:any){
    let url1=`http://localhost:8080/room/get/${roomNo}`;
    return this.http.get(url1);
  }

  deleteRoom(input:any){
    let roomNo=input.roomNo;
    let url2=`http://localhost:8080/room/remove/${roomNo}`;
    return this.http.delete(url2,{responseType:'text'});
  }

  createRoom(input:any){
    return this.http.post('http://localhost:8080/room',input,{responseType:'text'});
  }

  viewAllRoom(){
   return this.http.get('http://localhost:8080/room/getall');
  }
}
