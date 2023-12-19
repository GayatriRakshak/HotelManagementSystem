import { Component } from '@angular/core';
import { LoginRecepService } from './login-recep.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login-recep',
  templateUrl: './login-recep.component.html',
  styleUrl: './login-recep.component.css'
})

export class LoginRecepComponent {

  data:any;

  constructor(private loginRecepService:LoginRecepService, private router:Router){}

  login(input:any){
    console.warn(input);
    this.loginRecepService.loginRecep(input).subscribe((result)=>{
      console.log(result);
        this.data=result;
    })

    if(this.data=='true'){
      alert("Successfully Logged in")
     this.router.navigateByUrl('/receptionist');
    }else{
      alert("Invalid Credentials");
    }
  
  }

}
