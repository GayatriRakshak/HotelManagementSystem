import { Component } from '@angular/core';
import { RoomService } from './room.service';

@Component({
  selector: 'app-room',
  templateUrl: './room.component.html',
  styleUrl: './room.component.css'
})
export class RoomComponent {
    roomMenu :String='';
    roomDetail:any;
    allRoom:any
    constructor(private roomservice:RoomService){

    }

    goto(input:String){
      this.roomMenu=input;
  }
  
  createRoom(input:any){
    console.warn(input);
    this.roomservice.createRoom(input).subscribe((result) =>{
      alert(result);
    });
  }

  deleteRoom(input:any){
    console.warn(input);
    this.roomservice.deleteRoom(input).subscribe((result)=>{
      alert(result);
    })
  }


  viewRoom(input:any){
     console.warn(input);
     let roomNo=input.RoomNo;
     this.roomservice.viewRoom(roomNo).subscribe((result) =>{
          console.log(result);
          return this.roomDetail=result;
     })
  }
  
  viewAllRoom(){
    this.roomservice.viewAllRoom().subscribe((result)=>{
      console.log(result);
      return this.allRoom=result;
    })
  }


}
