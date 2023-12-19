import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private http:HttpClient) { }

  adminlogin(input:any){
    return this.http.post('http://localhost:8080/admin/login',input,{responseType:"text"});
  }
}
