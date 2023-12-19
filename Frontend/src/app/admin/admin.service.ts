import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  constructor(private http:HttpClient) { }

  updateAdmin(input:any){
    return this.http.put('http://localhost:8080/admin/update',input, { responseType: 'text' });
  }
}
