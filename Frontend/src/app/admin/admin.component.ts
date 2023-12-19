import { Component } from '@angular/core';
import { AdminService } from './admin.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrl: './admin.component.css'
})
export class AdminComponent {
  adminMenu :String ='';
  

  constructor(private adminService:AdminService){

  }

  goto(input:String){
       this.adminMenu=input;
  }

  updateAdmin(input:any){
    console.warn(input);
    this.adminService.updateAdmin(input).subscribe((result) =>{
      alert(result);
    })
  }

  
}
