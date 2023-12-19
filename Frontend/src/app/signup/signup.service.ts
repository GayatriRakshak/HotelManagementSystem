import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class SignupService {

  constructor(private http:HttpClient) { }

  createOwner(input:any){
   return  this.http.post('http://localhost:8080/owner',input,{responseType:'text'})
  }
}
