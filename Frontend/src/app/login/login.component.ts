import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { OwnerFunctionsService } from '../owner-functions/owner-functions.service';
import { LoginService } from './login.service';



@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {

 constructor(private router:Router,private loginService:LoginService){}



  data:any;

  login(input:any){
    console.warn(input);
    this.loginService.adminlogin(input).subscribe((result)=>{
      console.log(result);
        this.data=result;
    })

    if(this.data=='true'){
      alert("Successfully Logged in")
     this.router.navigateByUrl('/admin');
    }else{
      alert("Invalid Credentials");
    }
  }

}
