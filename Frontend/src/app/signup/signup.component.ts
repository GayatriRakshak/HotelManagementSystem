import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { SignupService } from './signup.service';
import { Route, Router } from '@angular/router';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrl: './signup.component.css'
})
export class SignupComponent {
  // registerForm!:FormGroup
  // title = 'formValidation';
  // submitted = false;

  // // menu:String='';

  // constructor(private formBuilder: FormBuilder){}

  // ngOnInit(){
  //   this.registerForm = this.formBuilder.group({
  //     Name:['',Validators.required]
  //   })
  // }

  // onSubmit(){
  //   this.submitted = true

  //   if(this.registerForm.invalid){
  //     return
  //   }
  //   alert  ("success")
  // }

  constructor(private signupService:SignupService, private router:Router){}

  createOwner(input:any){
    console.warn(input);
    this.signupService.createOwner(input).subscribe((result) =>{
      alert(result);
    })
  }
   
  onsubmit(){
    this.router.navigateByUrl('/login-owner');
  }


  
}

