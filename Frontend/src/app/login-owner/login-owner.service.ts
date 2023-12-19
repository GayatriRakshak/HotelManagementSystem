import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginOwnerService {

  constructor(private http:HttpClient) { }

  loginOwner(input:any){
    return this.http.post('http://localhost:8080/owner/login',input,{responseType:'text'});
  }
}
