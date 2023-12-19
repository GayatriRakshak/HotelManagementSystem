import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginRecepService {

  constructor(private http:HttpClient) { }

  loginRecep(input:any){
    return this.http.post('http://localhost:8080/receptionist/login',input,{responseType:'text'});
  }
}
