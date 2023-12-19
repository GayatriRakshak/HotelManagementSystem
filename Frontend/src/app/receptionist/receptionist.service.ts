import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ReceptionistService {

  constructor(private http:HttpClient) { }

  updateRecep(input:any){
   return this.http.put('http://localhost:8080/receptionist/update',input,{ responseType: 'text' });
  }
}
